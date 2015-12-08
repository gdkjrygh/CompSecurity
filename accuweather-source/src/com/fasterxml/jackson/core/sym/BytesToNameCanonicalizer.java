// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.core.sym:
//            Name1, Name2, Name3, NameN, 
//            Name

public final class BytesToNameCanonicalizer
{
    static final class Bucket
    {

        private final int _length;
        protected final Name _name;
        protected final Bucket _next;

        public Name find(int i, int j, int k)
        {
            if (_name.hashCode() != i || !_name.equals(j, k)) goto _L2; else goto _L1
_L1:
            Name name = _name;
_L6:
            return name;
_L2:
            Bucket bucket = _next;
_L7:
            if (bucket == null) goto _L4; else goto _L3
_L3:
            Name name1;
            name1 = bucket._name;
            if (name1.hashCode() != i)
            {
                continue; /* Loop/switch isn't completed */
            }
            name = name1;
            if (name1.equals(j, k)) goto _L6; else goto _L5
_L5:
            bucket = bucket._next;
              goto _L7
_L4:
            return null;
        }

        public Name find(int i, int ai[], int j)
        {
            if (_name.hashCode() != i || !_name.equals(ai, j)) goto _L2; else goto _L1
_L1:
            Name name = _name;
_L6:
            return name;
_L2:
            Bucket bucket = _next;
_L7:
            if (bucket == null) goto _L4; else goto _L3
_L3:
            Name name1;
            name1 = bucket._name;
            if (name1.hashCode() != i)
            {
                continue; /* Loop/switch isn't completed */
            }
            name = name1;
            if (name1.equals(ai, j)) goto _L6; else goto _L5
_L5:
            bucket = bucket._next;
              goto _L7
_L4:
            return null;
        }

        public int length()
        {
            return _length;
        }

        Bucket(Name name, Bucket bucket)
        {
            _name = name;
            _next = bucket;
            int i;
            if (bucket == null)
            {
                i = 1;
            } else
            {
                i = bucket._length + 1;
            }
            _length = i;
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
            mainHashMask = bytestonamecanonicalizer._mainHashMask;
            mainHash = bytestonamecanonicalizer._mainHash;
            mainNames = bytestonamecanonicalizer._mainNames;
            collList = bytestonamecanonicalizer._collList;
            collCount = bytestonamecanonicalizer._collCount;
            collEnd = bytestonamecanonicalizer._collEnd;
            longestCollisionList = bytestonamecanonicalizer._longestCollisionList;
        }
    }


    protected static final int DEFAULT_TABLE_SIZE = 64;
    static final int INITIAL_COLLISION_LEN = 32;
    static final int LAST_VALID_BUCKET = 254;
    static final int MAX_COLL_CHAIN_FOR_REUSE = 63;
    static final int MAX_COLL_CHAIN_LENGTH = 255;
    static final int MAX_ENTRIES_FOR_REUSE = 6000;
    protected static final int MAX_TABLE_SIZE = 0x10000;
    static final int MIN_HASH_SIZE = 16;
    private static final int MULT = 33;
    private static final int MULT2 = 0x1003f;
    private static final int MULT3 = 31;
    protected int _collCount;
    protected int _collEnd;
    protected Bucket _collList[];
    private boolean _collListShared;
    protected int _count;
    private final int _hashSeed;
    protected final boolean _intern;
    protected int _longestCollisionList;
    protected int _mainHash[];
    protected int _mainHashMask;
    private boolean _mainHashShared;
    protected Name _mainNames[];
    private boolean _mainNamesShared;
    private transient boolean _needRehash;
    protected final BytesToNameCanonicalizer _parent;
    protected final AtomicReference _tableInfo;

    private BytesToNameCanonicalizer(int i, boolean flag, int j)
    {
        _parent = null;
        _hashSeed = j;
        _intern = flag;
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

    private BytesToNameCanonicalizer(BytesToNameCanonicalizer bytestonamecanonicalizer, boolean flag, int i, TableInfo tableinfo)
    {
        _parent = bytestonamecanonicalizer;
        _hashSeed = i;
        _intern = flag;
        _tableInfo = null;
        _count = tableinfo.count;
        _mainHashMask = tableinfo.mainHashMask;
        _mainHash = tableinfo.mainHash;
        _mainNames = tableinfo.mainNames;
        _collList = tableinfo.collList;
        _collCount = tableinfo.collCount;
        _collEnd = tableinfo.collEnd;
        _longestCollisionList = tableinfo.longestCollisionList;
        _needRehash = false;
        _mainHashShared = true;
        _mainNamesShared = true;
        _collListShared = true;
    }

    private void _addSymbol(int i, Name name)
    {
        int k;
        if (_mainHashShared)
        {
            unshareMain();
        }
        if (_needRehash)
        {
            rehash();
        }
        _count = _count + 1;
        k = i & _mainHashMask;
        if (_mainNames[k] != null) goto _L2; else goto _L1
_L1:
        _mainHash[k] = i << 8;
        if (_mainNamesShared)
        {
            unshareNames();
        }
        _mainNames[k] = name;
_L9:
        i = _mainHash.length;
        if (_count <= i >> 1) goto _L4; else goto _L3
_L3:
        int j = i >> 2;
        if (_count <= i - j) goto _L6; else goto _L5
_L5:
        _needRehash = true;
_L4:
        return;
_L2:
        if (_collListShared)
        {
            unshareCollision();
        }
        _collCount = _collCount + 1;
        int l = _mainHash[k];
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
            _mainHash[k] = l & 0xffffff00 | i + 1;
        } else
        {
            i--;
        }
        name = new Bucket(name, _collList[i]);
        _collList[i] = name;
        _longestCollisionList = Math.max(name.length(), _longestCollisionList);
        if (_longestCollisionList > 255)
        {
            reportTooManyCollisions(255);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (_collCount < j) goto _L4; else goto _L7
_L7:
        _needRehash = true;
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected static int[] calcQuads(byte abyte0[])
    {
        int i1 = abyte0.length;
        int ai[] = new int[(i1 + 3) / 4];
        int j;
        for (int i = 0; i < i1; i = j + 1)
        {
            int k = abyte0[i] & 0xff;
            int l = i + 1;
            j = l;
            i = k;
            if (l < i1)
            {
                k = k << 8 | abyte0[l] & 0xff;
                l++;
                j = l;
                i = k;
                if (l < i1)
                {
                    k = k << 8 | abyte0[l] & 0xff;
                    l++;
                    j = l;
                    i = k;
                    if (l < i1)
                    {
                        i = k << 8 | abyte0[l] & 0xff;
                        j = l;
                    }
                }
            }
            ai[j >> 2] = i;
        }

        return ai;
    }

    private static Name constructName(int i, String s, int j, int k)
    {
        if (k == 0)
        {
            return new Name1(s, i, j);
        } else
        {
            return new Name2(s, i, j, k);
        }
    }

    private static Name constructName(int i, String s, int ai[], int j)
    {
        if (j >= 4) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 64
    //                   2 77
    //                   3 93;
           goto _L2 _L3 _L4 _L5
_L2:
        int ai1[];
        ai1 = new int[j];
        for (int k = 0; k < j; k++)
        {
            ai1[k] = ai[k];
        }

        break; /* Loop/switch isn't completed */
_L3:
        return new Name1(s, i, ai[0]);
_L4:
        return new Name2(s, i, ai[0], ai[1]);
_L5:
        return new Name3(s, i, ai[0], ai[1], ai[2]);
        return new NameN(s, i, ai1, j);
    }

    public static BytesToNameCanonicalizer createRoot()
    {
        long l = System.currentTimeMillis();
        return createRoot((int)l + (int)(l >>> 32) | 1);
    }

    protected static BytesToNameCanonicalizer createRoot(int i)
    {
        return new BytesToNameCanonicalizer(64, true, i);
    }

    private void expandCollision()
    {
        Bucket abucket[] = _collList;
        int i = abucket.length;
        _collList = new Bucket[i + i];
        System.arraycopy(abucket, 0, _collList, 0, i);
    }

    private int findBestBucket()
    {
        Bucket abucket[] = _collList;
        int j = 0x7fffffff;
        int k = -1;
        int i = 0;
        for (int j1 = _collEnd; i < j1;)
        {
            int i1 = abucket[i].length();
            int l = j;
            if (i1 < j)
            {
                if (i1 == 1)
                {
                    return i;
                }
                l = i1;
                k = i;
            }
            i++;
            j = l;
        }

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
        TableInfo tableinfo1;
        TableInfo tableinfo2;
label0:
        {
            int i = tableinfo.count;
            tableinfo2 = (TableInfo)_tableInfo.get();
            if (i <= tableinfo2.count)
            {
                return;
            }
            if (i <= 6000)
            {
                tableinfo1 = tableinfo;
                if (tableinfo.longestCollisionList <= 63)
                {
                    break label0;
                }
            }
            tableinfo1 = initTableInfo(64);
        }
        _tableInfo.compareAndSet(tableinfo2, tableinfo1);
    }

    private void nukeSymbols()
    {
        _count = 0;
        _longestCollisionList = 0;
        Arrays.fill(_mainHash, 0);
        Arrays.fill(_mainNames, null);
        Arrays.fill(_collList, null);
        _collCount = 0;
        _collEnd = 0;
    }

    private void rehash()
    {
        _needRehash = false;
        _mainNamesShared = false;
        int j1 = _mainHash.length;
        int i = j1 + j1;
        if (i > 0x10000)
        {
            nukeSymbols();
        } else
        {
            _mainHash = new int[i];
            _mainHashMask = i - 1;
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
                    int l1 = i & _mainHashMask;
                    _mainNames[l1] = name;
                    _mainHash[l1] = i << 8;
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
                    Object obj = bucket._name;
                    i = ((Name) (obj)).hashCode();
                    int k2 = i & _mainHashMask;
                    int l2 = _mainHash[k2];
                    if (_mainNames[k2] == null)
                    {
                        _mainHash[k2] = i << 8;
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
                            _mainHash[k2] = l2 & 0xffffff00 | i + 1;
                        } else
                        {
                            i--;
                        }
                        obj = new Bucket(((Name) (obj)), _collList[i]);
                        _collList[i] = ((Bucket) (obj));
                        i1 = Math.max(i1, ((Bucket) (obj)).length());
                    }
                    bucket = bucket._next;
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
            int i = abucket.length;
            _collList = new Bucket[i];
            System.arraycopy(abucket, 0, _collList, 0, i);
        }
        _collListShared = false;
    }

    private void unshareMain()
    {
        int ai[] = _mainHash;
        int i = _mainHash.length;
        _mainHash = new int[i];
        System.arraycopy(ai, 0, _mainHash, 0, i);
        _mainHashShared = false;
    }

    private void unshareNames()
    {
        Name aname[] = _mainNames;
        int i = aname.length;
        _mainNames = new Name[i];
        System.arraycopy(aname, 0, _mainNames, 0, i);
        _mainNamesShared = false;
    }

    public Name addName(String s, int i, int j)
    {
        String s1 = s;
        if (_intern)
        {
            s1 = InternCache.instance.intern(s);
        }
        int k;
        if (j == 0)
        {
            k = calcHash(i);
        } else
        {
            k = calcHash(i, j);
        }
        s = constructName(k, s1, i, j);
        _addSymbol(k, s);
        return s;
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

    public int bucketCount()
    {
        return _mainHash.length;
    }

    public int calcHash(int i)
    {
        i ^= _hashSeed;
        i += i >>> 15;
        return i ^ i >>> 9;
    }

    public int calcHash(int i, int j)
    {
        i = (i ^ i >>> 15) + j * 33 ^ _hashSeed;
        return i + (i >>> 7);
    }

    public int calcHash(int ai[], int i)
    {
        if (i < 3)
        {
            throw new IllegalArgumentException();
        }
        int j = ai[0] ^ _hashSeed;
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

    public int collisionCount()
    {
        return _collCount;
    }

    public Name findName(int i)
    {
        int j;
        int k;
        int i1;
        j = calcHash(i);
        k = j & _mainHashMask;
        i1 = _mainHash[k];
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
        l = k & _mainHashMask;
        j1 = _mainHash[l];
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
        l = j & _mainHashMask;
        j1 = _mainHash[l];
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

    public int hashSeed()
    {
        return _hashSeed;
    }

    public BytesToNameCanonicalizer makeChild(boolean flag, boolean flag1)
    {
        return new BytesToNameCanonicalizer(this, flag1, _hashSeed, (TableInfo)_tableInfo.get());
    }

    public int maxCollisionLength()
    {
        return _longestCollisionList;
    }

    public boolean maybeDirty()
    {
        return !_mainHashShared;
    }

    public void release()
    {
        if (_parent != null && maybeDirty())
        {
            _parent.mergeChild(new TableInfo(this));
            _mainHashShared = true;
            _mainNamesShared = true;
            _collListShared = true;
        }
    }

    protected void reportTooManyCollisions(int i)
    {
        throw new IllegalStateException((new StringBuilder()).append("Longest collision chain in symbol table (of size ").append(_count).append(") now exceeds maximum, ").append(i).append(" -- suspect a DoS attack based on hash collisions").toString());
    }

    public int size()
    {
        if (_tableInfo != null)
        {
            return ((TableInfo)_tableInfo.get()).count;
        } else
        {
            return _count;
        }
    }
}
