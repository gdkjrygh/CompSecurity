// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.sym:
//            Name1, Name2, Name3, NameN, 
//            Name

public final class BytesToNameCanonicalizer
{

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
    private int _collCount;
    private int _collEnd;
    private Bucket _collList[];
    private boolean _collListShared;
    private int _count;
    private final int _hashSeed;
    private final boolean _intern;
    protected int _longestCollisionList;
    private int _mainHash[];
    private int _mainHashMask;
    private boolean _mainHashShared;
    private Name _mainNames[];
    private boolean _mainNamesShared;
    private transient boolean _needRehash;
    protected final BytesToNameCanonicalizer _parent;

    private BytesToNameCanonicalizer(int i, boolean flag, int j)
    {
        byte byte0;
        byte0 = 16;
        super();
        _parent = null;
        _hashSeed = j;
        _intern = flag;
        if (i >= 16) goto _L2; else goto _L1
_L1:
        j = 16;
_L4:
        initTables(j);
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

    private BytesToNameCanonicalizer(BytesToNameCanonicalizer bytestonamecanonicalizer, boolean flag, int i)
    {
        _parent = bytestonamecanonicalizer;
        _hashSeed = i;
        _intern = flag;
        _count = bytestonamecanonicalizer._count;
        _mainHashMask = bytestonamecanonicalizer._mainHashMask;
        _mainHash = bytestonamecanonicalizer._mainHash;
        _mainNames = bytestonamecanonicalizer._mainNames;
        _collList = bytestonamecanonicalizer._collList;
        _collCount = bytestonamecanonicalizer._collCount;
        _collEnd = bytestonamecanonicalizer._collEnd;
        _longestCollisionList = bytestonamecanonicalizer._longestCollisionList;
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
            i = k;
            j = l;
            if (l < i1)
            {
                k = k << 8 | abyte0[l] & 0xff;
                l++;
                i = k;
                j = l;
                if (l < i1)
                {
                    k = k << 8 | abyte0[l] & 0xff;
                    l++;
                    i = k;
                    j = l;
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
        int i = (int)l;
        return createRoot(((int)l >>> 32) + i | 1);
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
        for (int i1 = _collEnd; i < i1; i++)
        {
            int l = abucket[i].length();
            if (l >= j)
            {
                continue;
            }
            if (l == 1)
            {
                return i;
            }
            k = i;
            j = l;
        }

        return k;
    }

    public static Name getEmptyName()
    {
        return Name1.getEmptyName();
    }

    private void initTables(int i)
    {
        _count = 0;
        _longestCollisionList = 0;
        _mainHash = new int[i];
        _mainNames = new Name[i];
        _mainHashShared = false;
        _mainNamesShared = false;
        _mainHashMask = i - 1;
        _collListShared = true;
        _collList = null;
        _collEnd = 0;
        _needRehash = false;
    }

    private void markAsShared()
    {
        _mainHashShared = true;
        _mainNamesShared = true;
        _collListShared = true;
    }

    private void mergeChild(BytesToNameCanonicalizer bytestonamecanonicalizer)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = bytestonamecanonicalizer._count;
        j = _count;
        if (i > j) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (bytestonamecanonicalizer.size() <= 6000 && bytestonamecanonicalizer._longestCollisionList <= 63)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        initTables(64);
          goto _L1
        bytestonamecanonicalizer;
        throw bytestonamecanonicalizer;
        _count = bytestonamecanonicalizer._count;
        _longestCollisionList = bytestonamecanonicalizer._longestCollisionList;
        _mainHash = bytestonamecanonicalizer._mainHash;
        _mainNames = bytestonamecanonicalizer._mainNames;
        _mainHashShared = true;
        _mainNamesShared = true;
        _mainHashMask = bytestonamecanonicalizer._mainHashMask;
        _collList = bytestonamecanonicalizer._collList;
        _collCount = bytestonamecanonicalizer._collCount;
        _collEnd = bytestonamecanonicalizer._collEnd;
          goto _L1
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
        boolean flag = false;
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
            int j = 0;
            int k;
            for (i = 0; j < j1; i = k)
            {
                Name name = aname[j];
                k = i;
                if (name != null)
                {
                    k = i + 1;
                    i = name.hashCode();
                    int l1 = _mainHashMask & i;
                    _mainNames[l1] = name;
                    _mainHash[l1] = i << 8;
                }
                j++;
            }

            int i2 = _collEnd;
            if (i2 == 0)
            {
                _longestCollisionList = 0;
                return;
            }
            _collCount = 0;
            _collEnd = 0;
            _collListShared = false;
            Bucket abucket[] = _collList;
            _collList = new Bucket[abucket.length];
            j1 = 0;
            j = ((flag) ? 1 : 0);
            for (; j1 < i2; j1++)
            {
                Bucket bucket = abucket[j1];
                while (bucket != null) 
                {
                    Object obj = bucket._name;
                    int l = ((Name) (obj)).hashCode();
                    int j2 = _mainHashMask & l;
                    int k2 = _mainHash[j2];
                    if (_mainNames[j2] == null)
                    {
                        _mainHash[j2] = l << 8;
                        _mainNames[j2] = ((Name) (obj));
                    } else
                    {
                        _collCount = _collCount + 1;
                        int i1 = k2 & 0xff;
                        if (i1 == 0)
                        {
                            if (_collEnd <= 254)
                            {
                                int k1 = _collEnd;
                                _collEnd = _collEnd + 1;
                                i1 = k1;
                                if (k1 >= _collList.length)
                                {
                                    expandCollision();
                                    i1 = k1;
                                }
                            } else
                            {
                                i1 = findBestBucket();
                            }
                            _mainHash[j2] = k2 & 0xffffff00 | i1 + 1;
                        } else
                        {
                            i1--;
                        }
                        obj = new Bucket(((Name) (obj)), _collList[i1]);
                        _collList[i1] = ((Bucket) (obj));
                        j = Math.max(j, ((Bucket) (obj)).length());
                    }
                    bucket = bucket._next;
                    i++;
                }
            }

            _longestCollisionList = j;
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

    public final int calcHash(int i)
    {
        i = _hashSeed ^ i;
        i += i >>> 15;
        return i ^ i >>> 9;
    }

    public final int calcHash(int i, int j)
    {
        i = (i >>> 15 ^ i) + j * 33 ^ _hashSeed;
        return i + (i >>> 7);
    }

    public final int calcHash(int ai[], int i)
    {
        int j = 3;
        if (i < 3)
        {
            throw new IllegalArgumentException();
        }
        int k = ai[0] ^ _hashSeed;
        int l = ai[1];
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
        k = _mainHashMask & j;
        i1 = _mainHash[k];
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

    public Name findName(int i, int j)
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
        l = _mainHashMask & k;
        i1 = _mainHash[l];
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
        l = _mainHashMask & j;
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
        this;
        JVM INSTR monitorenter ;
        BytesToNameCanonicalizer bytestonamecanonicalizer = new BytesToNameCanonicalizer(this, flag1, _hashSeed);
        this;
        JVM INSTR monitorexit ;
        return bytestonamecanonicalizer;
        Exception exception;
        exception;
        throw exception;
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
        if (maybeDirty() && _parent != null)
        {
            _parent.mergeChild(this);
            markAsShared();
        }
    }

    protected void reportTooManyCollisions(int i)
    {
        throw new IllegalStateException((new StringBuilder()).append("Longest collision chain in symbol table (of size ").append(_count).append(") now exceeds maximum, ").append(i).append(" -- suspect a DoS attack based on hash collisions").toString());
    }

    public int size()
    {
        return _count;
    }

    private class Bucket
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

}
