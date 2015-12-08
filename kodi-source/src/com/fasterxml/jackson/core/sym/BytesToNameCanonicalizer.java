// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.core.sym:
//            NameN, Name1, Name2, Name3, 
//            Name

public final class BytesToNameCanonicalizer
{
    private static final class Bucket
    {

        public final int hash;
        public final int length;
        public final Name name;
        public final Bucket next;

        public Name find(int i, int j, int k)
        {
            if (hash != i || !name.equals(j, k)) goto _L2; else goto _L1
_L1:
            Name name1 = name;
_L6:
            return name1;
_L2:
            Bucket bucket = next;
_L7:
            if (bucket == null) goto _L4; else goto _L3
_L3:
            Name name2;
            if (bucket.hash != i)
            {
                continue; /* Loop/switch isn't completed */
            }
            name2 = bucket.name;
            name1 = name2;
            if (name2.equals(j, k)) goto _L6; else goto _L5
_L5:
            bucket = bucket.next;
              goto _L7
_L4:
            return null;
        }

        public Name find(int i, int ai[], int j)
        {
            if (hash != i || !name.equals(ai, j)) goto _L2; else goto _L1
_L1:
            Name name1 = name;
_L6:
            return name1;
_L2:
            Bucket bucket = next;
_L7:
            if (bucket == null) goto _L4; else goto _L3
_L3:
            Name name2;
            if (bucket.hash != i)
            {
                continue; /* Loop/switch isn't completed */
            }
            name2 = bucket.name;
            name1 = name2;
            if (name2.equals(ai, j)) goto _L6; else goto _L5
_L5:
            bucket = bucket.next;
              goto _L7
_L4:
            return null;
        }

        Bucket(Name name1, Bucket bucket)
        {
            name = name1;
            next = bucket;
            int i;
            if (bucket == null)
            {
                i = 1;
            } else
            {
                i = bucket.length + 1;
            }
            length = i;
            hash = name1.hashCode();
        }
    }

    private static final class TableInfo
    {

        public final int collCount;
        public final int collEnd;
        public final Bucket collList[];
        public final int count;
        public final int longestCollisionList;
        public final int mainHash[];
        public final int mainHashMask;
        public final Name mainNames[];

        public TableInfo(int i, int j, int ai[], Name aname[], Bucket abucket[], int k, int l, 
                int i1)
        {
            count = i;
            mainHashMask = j;
            mainHash = ai;
            mainNames = aname;
            collList = abucket;
            collCount = k;
            collEnd = l;
            longestCollisionList = i1;
        }

        public TableInfo(BytesToNameCanonicalizer bytestonamecanonicalizer)
        {
            count = bytestonamecanonicalizer._count;
            mainHashMask = bytestonamecanonicalizer._hashMask;
            mainHash = bytestonamecanonicalizer._hash;
            mainNames = bytestonamecanonicalizer._mainNames;
            collList = bytestonamecanonicalizer._collList;
            collCount = bytestonamecanonicalizer._collCount;
            collEnd = bytestonamecanonicalizer._collEnd;
            longestCollisionList = bytestonamecanonicalizer._longestCollisionList;
        }
    }


    protected int _collCount;
    protected int _collEnd;
    protected Bucket _collList[];
    private boolean _collListShared;
    protected int _count;
    protected final boolean _failOnDoS;
    protected int _hash[];
    protected int _hashMask;
    private boolean _hashShared;
    protected boolean _intern;
    protected int _longestCollisionList;
    protected Name _mainNames[];
    private boolean _namesShared;
    private transient boolean _needRehash;
    protected BitSet _overflows;
    protected final BytesToNameCanonicalizer _parent;
    private final int _seed;
    protected final AtomicReference _tableInfo;

    private BytesToNameCanonicalizer(int i, boolean flag, int j, boolean flag1)
    {
        _parent = null;
        _seed = j;
        _intern = flag;
        _failOnDoS = flag1;
        if (i >= 16) goto _L2; else goto _L1
_L1:
        j = 16;
_L4:
        _tableInfo = new AtomicReference(initTableInfo(j));
        return;
_L2:
        j = i;
        if ((i - 1 & i) != 0)
        {
            j = 16;
            while (j < i) 
            {
                j += j;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private BytesToNameCanonicalizer(BytesToNameCanonicalizer bytestonamecanonicalizer, boolean flag, int i, boolean flag1, TableInfo tableinfo)
    {
        _parent = bytestonamecanonicalizer;
        _seed = i;
        _intern = flag;
        _failOnDoS = flag1;
        _tableInfo = null;
        _count = tableinfo.count;
        _hashMask = tableinfo.mainHashMask;
        _hash = tableinfo.mainHash;
        _mainNames = tableinfo.mainNames;
        _collList = tableinfo.collList;
        _collCount = tableinfo.collCount;
        _collEnd = tableinfo.collEnd;
        _longestCollisionList = tableinfo.longestCollisionList;
        _needRehash = false;
        _hashShared = true;
        _namesShared = true;
        _collListShared = true;
    }

    private void _addSymbol(int i, Name name)
    {
        if (_hashShared)
        {
            unshareMain();
        }
        if (_needRehash)
        {
            rehash();
        }
        _count = _count + 1;
        int k = i & _hashMask;
        if (_mainNames[k] == null)
        {
            _hash[k] = i << 8;
            if (_namesShared)
            {
                unshareNames();
            }
            _mainNames[k] = name;
        } else
        {
            if (_collListShared)
            {
                unshareCollision();
            }
            _collCount = _collCount + 1;
            int l = _hash[k];
            i = l & 0xff;
            if (i == 0)
            {
                if (_collEnd <= 254)
                {
                    j = _collEnd;
                    _collEnd = _collEnd + 1;
                    i = j;
                    if (j >= _collList.length)
                    {
                        expandCollision();
                        i = j;
                    }
                } else
                {
                    i = findBestBucket();
                }
                _hash[k] = l & 0xffffff00 | i + 1;
            } else
            {
                i--;
            }
            name = new Bucket(name, _collList[i]);
            if (((Bucket) (name)).length > 100)
            {
                _handleSpillOverflow(i, name);
            } else
            {
                _collList[i] = name;
                _longestCollisionList = Math.max(((Bucket) (name)).length, _longestCollisionList);
            }
        }
        i = _hash.length;
        if (_count > i >> 1)
        {
            int j = i >> 2;
            if (_count > i - j)
            {
                _needRehash = true;
            } else
            if (_collCount >= j)
            {
                _needRehash = true;
                return;
            }
        }
    }

    private void _handleSpillOverflow(int i, Bucket bucket)
    {
        if (_overflows == null)
        {
            _overflows = new BitSet();
            _overflows.set(i);
        } else
        if (_overflows.get(i))
        {
            if (_failOnDoS)
            {
                reportTooManyCollisions(100);
            }
            _intern = false;
        } else
        {
            _overflows.set(i);
        }
        _collList[i] = null;
        _count = _count - bucket.length;
        _longestCollisionList = -1;
    }

    private static Name constructName(int i, String s, int ai[], int j)
    {
        if (j >= 4) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 40
    //                   2 53
    //                   3 69;
           goto _L2 _L3 _L4 _L5
_L2:
        return NameN.construct(s, i, ai, j);
_L3:
        return new Name1(s, i, ai[0]);
_L4:
        return new Name2(s, i, ai[0], ai[1]);
_L5:
        return new Name3(s, i, ai[0], ai[1], ai[2]);
    }

    public static BytesToNameCanonicalizer createRoot()
    {
        long l = System.currentTimeMillis();
        return createRoot((int)l + (int)(l >>> 32) | 1);
    }

    protected static BytesToNameCanonicalizer createRoot(int i)
    {
        return new BytesToNameCanonicalizer(64, true, i, true);
    }

    private void expandCollision()
    {
        Bucket abucket[] = _collList;
        _collList = (Bucket[])Arrays.copyOf(abucket, abucket.length * 2);
    }

    private int findBestBucket()
    {
        Bucket abucket[];
        int i;
        int j;
        int k;
        int j1;
        abucket = _collList;
        j = 0x7fffffff;
        k = -1;
        i = 0;
        j1 = _collEnd;
_L6:
        if (i >= j1) goto _L2; else goto _L1
_L1:
        Bucket bucket = abucket[i];
        if (bucket != null) goto _L4; else goto _L3
_L3:
        return i;
_L4:
        int l;
        int i1 = bucket.length;
        l = j;
        if (i1 >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = i1;
        k = i;
        break; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L5
_L5:
        i++;
        j = l;
          goto _L6
_L2:
        return k;
    }

    public static Name getEmptyName()
    {
        return Name1.getEmptyName();
    }

    private TableInfo initTableInfo(int i)
    {
        return new TableInfo(0, i - 1, new int[i], new Name[i], null, 0, 0, 0);
    }

    private void mergeChild(TableInfo tableinfo)
    {
        int i = tableinfo.count;
        TableInfo tableinfo1 = (TableInfo)_tableInfo.get();
        if (i == tableinfo1.count)
        {
            return;
        }
        if (i > 6000)
        {
            tableinfo = initTableInfo(64);
        }
        _tableInfo.compareAndSet(tableinfo1, tableinfo);
    }

    private void nukeSymbols()
    {
        _count = 0;
        _longestCollisionList = 0;
        Arrays.fill(_hash, 0);
        Arrays.fill(_mainNames, null);
        Arrays.fill(_collList, null);
        _collCount = 0;
        _collEnd = 0;
    }

    private void rehash()
    {
        _needRehash = false;
        _namesShared = false;
        int j1 = _hash.length;
        int i = j1 + j1;
        if (i > 0x10000)
        {
            nukeSymbols();
        } else
        {
            _hash = new int[i];
            _hashMask = i - 1;
            Name aname[] = _mainNames;
            _mainNames = new Name[i];
            i = 0;
            for (int j = 0; j < j1;)
            {
                Name name = aname[j];
                int l = i;
                if (name != null)
                {
                    l = i + 1;
                    i = name.hashCode();
                    int l1 = i & _hashMask;
                    _mainNames[l1] = name;
                    _hash[l1] = i << 8;
                }
                j++;
                i = l;
            }

            int j2 = _collEnd;
            if (j2 == 0)
            {
                _longestCollisionList = 0;
                return;
            }
            _collCount = 0;
            _collEnd = 0;
            _collListShared = false;
            int i1 = 0;
            Bucket abucket[] = _collList;
            _collList = new Bucket[abucket.length];
            for (int k = 0; k < j2; k++)
            {
                Bucket bucket = abucket[k];
                while (bucket != null) 
                {
                    int k1 = i + 1;
                    Object obj = bucket.name;
                    i = ((Name) (obj)).hashCode();
                    int k2 = i & _hashMask;
                    int l2 = _hash[k2];
                    if (_mainNames[k2] == null)
                    {
                        _hash[k2] = i << 8;
                        _mainNames[k2] = ((Name) (obj));
                    } else
                    {
                        _collCount = _collCount + 1;
                        i = l2 & 0xff;
                        if (i == 0)
                        {
                            if (_collEnd <= 254)
                            {
                                int i2 = _collEnd;
                                _collEnd = _collEnd + 1;
                                i = i2;
                                if (i2 >= _collList.length)
                                {
                                    expandCollision();
                                    i = i2;
                                }
                            } else
                            {
                                i = findBestBucket();
                            }
                            _hash[k2] = l2 & 0xffffff00 | i + 1;
                        } else
                        {
                            i--;
                        }
                        obj = new Bucket(((Name) (obj)), _collList[i]);
                        _collList[i] = ((Bucket) (obj));
                        i1 = Math.max(i1, ((Bucket) (obj)).length);
                    }
                    bucket = bucket.next;
                    i = k1;
                }
            }

            _longestCollisionList = i1;
            if (i != _count)
            {
                throw new RuntimeException((new StringBuilder()).append("Internal error: count after rehash ").append(i).append("; should be ").append(_count).toString());
            }
        }
    }

    private void unshareCollision()
    {
        Bucket abucket[] = _collList;
        if (abucket == null)
        {
            _collList = new Bucket[32];
        } else
        {
            _collList = (Bucket[])Arrays.copyOf(abucket, abucket.length);
        }
        _collListShared = false;
    }

    private void unshareMain()
    {
        int ai[] = _hash;
        _hash = Arrays.copyOf(ai, ai.length);
        _hashShared = false;
    }

    private void unshareNames()
    {
        Name aname[] = _mainNames;
        _mainNames = (Name[])Arrays.copyOf(aname, aname.length);
        _namesShared = false;
    }

    public Name addName(String s, int ai[], int i)
    {
        String s1 = s;
        if (_intern)
        {
            s1 = InternCache.instance.intern(s);
        }
        int j;
        if (i < 3)
        {
            if (i == 1)
            {
                j = calcHash(ai[0]);
            } else
            {
                j = calcHash(ai[0], ai[1]);
            }
        } else
        {
            j = calcHash(ai, i);
        }
        s = constructName(j, s1, ai, i);
        _addSymbol(j, s);
        return s;
    }

    public int calcHash(int i)
    {
        i ^= _seed;
        i += i >>> 15;
        return i ^ i >>> 9;
    }

    public int calcHash(int i, int j)
    {
        i = (i ^ i >>> 15) + j * 33 ^ _seed;
        return i + (i >>> 7);
    }

    public int calcHash(int ai[], int i)
    {
        if (i < 3)
        {
            throw new IllegalArgumentException();
        }
        int j = ai[0] ^ _seed;
        j = ((j + (j >>> 9)) * 33 + ai[1]) * 0x1003f;
        j = j + (j >>> 15) ^ ai[2];
        int l = j + (j >>> 17);
        for (int k = 3; k < i; k++)
        {
            l = l * 31 ^ ai[k];
            l += l >>> 3;
            l ^= l << 7;
        }

        i = l + (l >>> 15);
        return i ^ i << 9;
    }

    public Name findName(int i)
    {
        int j;
        int k;
        int i1;
        j = calcHash(i);
        k = j & _hashMask;
        i1 = _hash[k];
        if ((i1 >> 8 ^ j) << 8 != 0) goto _L2; else goto _L1
_L1:
        Name name1 = _mainNames[k];
        if (name1 != null) goto _L4; else goto _L3
_L3:
        Name name = null;
_L6:
        return name;
_L4:
        name = name1;
        if (name1.equals(i)) goto _L6; else goto _L5
_L5:
        int l = i1 & 0xff;
        if (l > 0)
        {
            Bucket bucket = _collList[l - 1];
            if (bucket != null)
            {
                return bucket.find(j, i, 0);
            }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i1 == 0)
        {
            return null;
        }
        if (true) goto _L5; else goto _L7
_L7:
        return null;
    }

    public Name findName(int i, int j)
    {
        Name name;
        Name name1;
        int k;
        int j1;
        int l;
        if (j == 0)
        {
            k = calcHash(i);
        } else
        {
            k = calcHash(i, j);
        }
        l = k & _hashMask;
        j1 = _hash[l];
        if ((j1 >> 8 ^ k) << 8 != 0) goto _L2; else goto _L1
_L1:
        name1 = _mainNames[l];
        if (name1 != null) goto _L4; else goto _L3
_L3:
        name = null;
_L6:
        return name;
_L4:
        name = name1;
        if (name1.equals(i, j)) goto _L6; else goto _L5
_L5:
        int i1 = j1 & 0xff;
        if (i1 > 0)
        {
            Bucket bucket = _collList[i1 - 1];
            if (bucket != null)
            {
                return bucket.find(k, i, j);
            }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (j1 == 0)
        {
            return null;
        }
        if (true) goto _L5; else goto _L7
_L7:
        return null;
    }

    public Name findName(int ai[], int i)
    {
        int j = 0;
        if (i >= 3) goto _L2; else goto _L1
_L1:
        Name name;
        int k = ai[0];
        if (i < 2)
        {
            i = j;
        } else
        {
            i = ai[1];
        }
        name = findName(k, i);
_L6:
        return name;
_L2:
        int l;
        int j1;
        j = calcHash(ai, i);
        l = j & _hashMask;
        j1 = _hash[l];
        if ((j1 >> 8 ^ j) << 8 != 0) goto _L4; else goto _L3
_L3:
        Name name1;
        name1 = _mainNames[l];
        name = name1;
        if (name1 == null) goto _L6; else goto _L5
_L5:
        name = name1;
        if (name1.equals(ai, i)) goto _L6; else goto _L7
_L7:
        int i1 = j1 & 0xff;
        if (i1 > 0)
        {
            Bucket bucket = _collList[i1 - 1];
            if (bucket != null)
            {
                return bucket.find(j, ai, i);
            }
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (j1 == 0)
        {
            return null;
        }
        if (true) goto _L7; else goto _L8
_L8:
        return null;
    }

    public BytesToNameCanonicalizer makeChild(int i)
    {
        return new BytesToNameCanonicalizer(this, com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), _seed, com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), (TableInfo)_tableInfo.get());
    }

    public boolean maybeDirty()
    {
        return !_hashShared;
    }

    public void release()
    {
        if (_parent != null && maybeDirty())
        {
            _parent.mergeChild(new TableInfo(this));
            _hashShared = true;
            _namesShared = true;
            _collListShared = true;
        }
    }

    protected void reportTooManyCollisions(int i)
    {
        throw new IllegalStateException((new StringBuilder()).append("Longest collision chain in symbol table (of size ").append(_count).append(") now exceeds maximum, ").append(i).append(" -- suspect a DoS attack based on hash collisions").toString());
    }
}
