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
        byte byte0;
        byte0 = 16;
        super();
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
            j = byte0;
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
        if (_overflows != null) goto _L2; else goto _L1
_L1:
        _overflows = new BitSet();
_L6:
        _overflows.set(i);
_L4:
        _collList[i] = null;
        _count = _count - bucket.length;
        _longestCollisionList = -1;
        return;
_L2:
        if (!_overflows.get(i))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (_failOnDoS)
        {
            reportTooManyCollisions(100);
        }
        _intern = false;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
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
        int i = (int)l;
        return createRoot((int)(l >>> 32) + i | 1);
    }

    protected static BytesToNameCanonicalizer createRoot(int i)
    {
        return new BytesToNameCanonicalizer(64, true, i, true);
    }

    private void expandCollision()
    {
        Bucket abucket[] = _collList;
        _collList = (Bucket[])Arrays.copyOf(abucket, abucket.length << 1);
    }

    private int findBestBucket()
    {
        Bucket abucket[];
        int i;
        int j;
        int k;
        int i1;
        abucket = _collList;
        j = 0x7fffffff;
        k = -1;
        i = 0;
        i1 = _collEnd;
_L6:
        if (i >= i1) goto _L2; else goto _L1
_L1:
        Bucket bucket = abucket[i];
        if (bucket != null) goto _L4; else goto _L3
_L3:
        return i;
_L4:
        int l;
        l = bucket.length;
        if (l >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l == 1) goto _L3; else goto _L5
_L5:
        k = i;
        j = l;
        i++;
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
        return 0. new TableInfo(i - 1, new int[i], new Name[i], null, 0, 0, 0);
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
        int j1 = 0;
        _needRehash = false;
        _namesShared = false;
        int k1 = _hash.length;
        int i = k1 + k1;
        if (i > 0x10000)
        {
            nukeSymbols();
        } else
        {
            _hash = new int[i];
            _hashMask = i - 1;
            Name aname[] = _mainNames;
            _mainNames = new Name[i];
            int k = 0;
            int l;
            for (i = 0; k < k1; i = l)
            {
                Name name = aname[k];
                l = i;
                if (name != null)
                {
                    l = i + 1;
                    i = name.hashCode();
                    int i2 = _hashMask & i;
                    _mainNames[i2] = name;
                    _hash[i2] = i << 8;
                }
                k++;
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
            Bucket abucket[] = _collList;
            _collList = new Bucket[abucket.length];
            int i1 = 0;
            k = i;
            while (i1 < j2) 
            {
                Bucket bucket = abucket[i1];
                int j = j1;
                while (bucket != null) 
                {
                    j1 = k + 1;
                    Object obj = bucket.name;
                    k = ((Name) (obj)).hashCode();
                    int k2 = _hashMask & k;
                    int l2 = _hash[k2];
                    if (_mainNames[k2] == null)
                    {
                        _hash[k2] = k << 8;
                        _mainNames[k2] = ((Name) (obj));
                    } else
                    {
                        _collCount = _collCount + 1;
                        k = l2 & 0xff;
                        if (k == 0)
                        {
                            if (_collEnd <= 254)
                            {
                                int l1 = _collEnd;
                                _collEnd = _collEnd + 1;
                                k = l1;
                                if (l1 >= _collList.length)
                                {
                                    expandCollision();
                                    k = l1;
                                }
                            } else
                            {
                                k = findBestBucket();
                            }
                            _hash[k2] = l2 & 0xffffff00 | k + 1;
                        } else
                        {
                            k--;
                        }
                        obj = new Bucket(((Name) (obj)), _collList[k]);
                        _collList[k] = ((Bucket) (obj));
                        j = Math.max(j, ((Bucket) (obj)).length);
                    }
                    bucket = bucket.next;
                    k = j1;
                }
                i1++;
                j1 = j;
            }
            _longestCollisionList = j1;
            if (k != _count)
            {
                throw new RuntimeException((new StringBuilder("Internal error: count after rehash ")).append(k).append("; should be ").append(_count).toString());
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

    public final Name addName(String s, int ai[], int i)
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

    public final int calcHash(int i)
    {
        i = _seed ^ i;
        i += i >>> 15;
        return i ^ i >>> 9;
    }

    public final int calcHash(int i, int j)
    {
        i = (i >>> 15 ^ i) + j * 33 ^ _seed;
        return i + (i >>> 7);
    }

    public final int calcHash(int ai[], int i)
    {
        int j = 3;
        if (i < 3)
        {
            throw new IllegalArgumentException();
        }
        int k = ai[0] ^ _seed;
        k = ((k + (k >>> 9)) * 33 + ai[1]) * 0x1003f;
        k = k + (k >>> 15) ^ ai[2];
        k += k >>> 17;
        for (; j < i; j++)
        {
            k = k * 31 ^ ai[j];
            k += k >>> 3;
            k ^= k << 7;
        }

        i = (k >>> 15) + k;
        return i ^ i << 9;
    }

    public final Name findName(int i)
    {
        int j;
        int k;
        int i1;
        j = calcHash(i);
        k = _hashMask & j;
        i1 = _hash[k];
        if ((i1 >> 8 ^ j) << 8 != 0) goto _L2; else goto _L1
_L1:
        Name name = _mainNames[k];
        if (name != null) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        if (name.equals(i))
        {
            return name;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i1 == 0) goto _L3; else goto _L5
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
        if (true) goto _L3; else goto _L6
_L6:
    }

    public final Name findName(int i, int j)
    {
        int k;
        int l;
        int i1;
        if (j == 0)
        {
            k = calcHash(i);
        } else
        {
            k = calcHash(i, j);
        }
        l = _hashMask & k;
        i1 = _hash[l];
        if ((i1 >> 8 ^ k) << 8 == 0)
        {
            Name name = _mainNames[l];
            if (name == null)
            {
                return null;
            }
            if (name.equals(i, j))
            {
                return name;
            }
        } else
        if (i1 == 0)
        {
            return null;
        }
        l = i1 & 0xff;
        if (l > 0)
        {
            Bucket bucket = _collList[l - 1];
            if (bucket != null)
            {
                return bucket.find(k, i, j);
            }
        }
        return null;
    }

    public final Name findName(int ai[], int i)
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
        l = _hashMask & j;
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

    public final BytesToNameCanonicalizer makeChild(int i)
    {
        return new BytesToNameCanonicalizer(this, com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), _seed, com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), (TableInfo)_tableInfo.get());
    }

    public final boolean maybeDirty()
    {
        return !_hashShared;
    }

    public final void release()
    {
        if (_parent != null && maybeDirty())
        {
            _parent.mergeChild(new TableInfo());
            _hashShared = true;
            _namesShared = true;
            _collListShared = true;
        }
    }

    protected final void reportTooManyCollisions(int i)
    {
        throw new IllegalStateException((new StringBuilder("Longest collision chain in symbol table (of size ")).append(_count).append(") now exceeds maximum, ").append(i).append(" -- suspect a DoS attack based on hash collisions").toString());
    }

    private class TableInfo
    {

        public final int collCount;
        public final int collEnd;
        public final Bucket collList[];
        public final int count;
        public final int longestCollisionList;
        public final int mainHash[];
        public final int mainHashMask;
        public final Name mainNames[];

        public TableInfo(int j, int ai[], Name aname[], Bucket abucket[], int k, int l, 
                int i1)
        {
            count = I.this;
            mainHashMask = j;
            mainHash = ai;
            mainNames = aname;
            collList = abucket;
            collCount = k;
            collEnd = l;
            longestCollisionList = i1;
        }

        public TableInfo()
        {
            count = _count;
            mainHashMask = _hashMask;
            mainHash = _hash;
            mainNames = _mainNames;
            collList = _collList;
            collCount = _collCount;
            collEnd = _collEnd;
            longestCollisionList = _longestCollisionList;
        }
    }


    private class Bucket
    {

        public final int hash;
        public final int length;
        public final Name name;
        public final Bucket next;

        public final Name find(int i, int j, int k)
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

        public final Name find(int i, int ai[], int j)
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

}
