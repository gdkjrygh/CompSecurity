// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;

public final class CharsToNameCanonicalizer
{

    protected static final int DEFAULT_TABLE_SIZE = 64;
    public static final int HASH_MULT = 33;
    static final int MAX_COLL_CHAIN_FOR_REUSE = 63;
    static final int MAX_COLL_CHAIN_LENGTH = 255;
    static final int MAX_ENTRIES_FOR_REUSE = 12000;
    protected static final int MAX_TABLE_SIZE = 0x10000;
    static final CharsToNameCanonicalizer sBootstrapSymbolTable = new CharsToNameCanonicalizer();
    protected Bucket _buckets[];
    protected final boolean _canonicalize;
    protected boolean _dirty;
    private final int _hashSeed;
    protected int _indexMask;
    protected final boolean _intern;
    protected int _longestCollisionList;
    protected CharsToNameCanonicalizer _parent;
    protected int _size;
    protected int _sizeThreshold;
    protected String _symbols[];

    private CharsToNameCanonicalizer()
    {
        _canonicalize = true;
        _intern = true;
        _dirty = true;
        _hashSeed = 0;
        _longestCollisionList = 0;
        initTables(64);
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charstonamecanonicalizer, boolean flag, boolean flag1, String as[], Bucket abucket[], int i, int j, 
            int k)
    {
        _parent = charstonamecanonicalizer;
        _canonicalize = flag;
        _intern = flag1;
        _symbols = as;
        _buckets = abucket;
        _size = i;
        _hashSeed = j;
        i = as.length;
        _sizeThreshold = _thresholdSize(i);
        _indexMask = i - 1;
        _longestCollisionList = k;
        _dirty = false;
    }

    private static final int _thresholdSize(int i)
    {
        return i - (i >> 2);
    }

    private void copyArrays()
    {
        Object aobj[] = _symbols;
        int i = aobj.length;
        _symbols = new String[i];
        System.arraycopy(((Object) (aobj)), 0, _symbols, 0, i);
        aobj = _buckets;
        i = aobj.length;
        _buckets = new Bucket[i];
        System.arraycopy(((Object) (aobj)), 0, _buckets, 0, i);
    }

    public static CharsToNameCanonicalizer createRoot()
    {
        long l = System.currentTimeMillis();
        int i = (int)l;
        return createRoot(((int)l >>> 32) + i | 1);
    }

    protected static CharsToNameCanonicalizer createRoot(int i)
    {
        return sBootstrapSymbolTable.makeOrphan(i);
    }

    private void initTables(int i)
    {
        _symbols = new String[i];
        _buckets = new Bucket[i >> 1];
        _indexMask = i - 1;
        _size = 0;
        _longestCollisionList = 0;
        _sizeThreshold = _thresholdSize(i);
    }

    private CharsToNameCanonicalizer makeOrphan(int i)
    {
        return new CharsToNameCanonicalizer(null, true, true, _symbols, _buckets, _size, i, _longestCollisionList);
    }

    private void mergeChild(CharsToNameCanonicalizer charstonamecanonicalizer)
    {
        this;
        JVM INSTR monitorenter ;
        if (charstonamecanonicalizer.size() <= 12000 && charstonamecanonicalizer._longestCollisionList <= 63) goto _L2; else goto _L1
_L1:
        initTables(64);
_L5:
        _dirty = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (charstonamecanonicalizer.size() <= size()) goto _L4; else goto _L3
_L3:
        _symbols = charstonamecanonicalizer._symbols;
        _buckets = charstonamecanonicalizer._buckets;
        _size = charstonamecanonicalizer._size;
        _sizeThreshold = charstonamecanonicalizer._sizeThreshold;
        _indexMask = charstonamecanonicalizer._indexMask;
        _longestCollisionList = charstonamecanonicalizer._longestCollisionList;
          goto _L5
        charstonamecanonicalizer;
        throw charstonamecanonicalizer;
    }

    private void rehash()
    {
        int l1 = _symbols.length;
        int i = l1 + l1;
        if (i > 0x10000)
        {
            _size = 0;
            Arrays.fill(_symbols, null);
            Arrays.fill(_buckets, null);
            _dirty = true;
        } else
        {
            String as[] = _symbols;
            Bucket abucket[] = _buckets;
            _symbols = new String[i];
            _buckets = new Bucket[i >> 1];
            _indexMask = i - 1;
            _sizeThreshold = _thresholdSize(i);
            int l = 0;
            i = 0;
            int j = 0;
            while (l < l1) 
            {
                Object obj = as[l];
                int i1 = i;
                int k1 = j;
                if (obj != null)
                {
                    k1 = j + 1;
                    j = _hashToIndex(calcHash(((String) (obj))));
                    if (_symbols[j] == null)
                    {
                        _symbols[j] = ((String) (obj));
                        i1 = i;
                    } else
                    {
                        j >>= 1;
                        obj = new Bucket(((String) (obj)), _buckets[j]);
                        _buckets[j] = ((Bucket) (obj));
                        i1 = Math.max(i, ((Bucket) (obj)).length());
                    }
                }
                l++;
                i = i1;
                j = k1;
            }
            boolean flag = false;
            l = j;
            for (int k = ((flag) ? 1 : 0); k < l1 >> 1; k++)
            {
                Bucket bucket = abucket[k];
                while (bucket != null) 
                {
                    l++;
                    Object obj1 = bucket.getSymbol();
                    int j1 = _hashToIndex(calcHash(((String) (obj1))));
                    if (_symbols[j1] == null)
                    {
                        _symbols[j1] = ((String) (obj1));
                    } else
                    {
                        j1 >>= 1;
                        obj1 = new Bucket(((String) (obj1)), _buckets[j1]);
                        _buckets[j1] = ((Bucket) (obj1));
                        i = Math.max(i, ((Bucket) (obj1)).length());
                    }
                    bucket = bucket.getNext();
                }
            }

            _longestCollisionList = i;
            if (l != _size)
            {
                throw new Error((new StringBuilder()).append("Internal error on SymbolTable.rehash(): had ").append(_size).append(" entries; now have ").append(l).append(".").toString());
            }
        }
    }

    public final int _hashToIndex(int i)
    {
        return (i >>> 15) + i & _indexMask;
    }

    public int bucketCount()
    {
        return _symbols.length;
    }

    public int calcHash(String s)
    {
        int l = s.length();
        int i = _hashSeed;
        for (int j = 0; j < l;)
        {
            char c = s.charAt(j);
            j++;
            i = c + i * 33;
        }

        int k = i;
        if (i == 0)
        {
            k = 1;
        }
        return k;
    }

    public int calcHash(char ac[], int i, int j)
    {
        i = _hashSeed;
        for (int k = 0; k < j;)
        {
            char c = ac[k];
            k++;
            i = c + i * 33;
        }

        j = i;
        if (i == 0)
        {
            j = 1;
        }
        return j;
    }

    public int collisionCount()
    {
        int j = 0;
        Bucket abucket[] = _buckets;
        int l = abucket.length;
        for (int i = 0; i < l;)
        {
            Bucket bucket = abucket[i];
            int k = j;
            if (bucket != null)
            {
                k = j + bucket.length();
            }
            i++;
            j = k;
        }

        return j;
    }

    public String findSymbol(char ac[], int i, int j, int k)
    {
        Object obj;
        if (j < 1)
        {
            obj = "";
        } else
        {
            if (!_canonicalize)
            {
                return new String(ac, i, j);
            }
            int l = _hashToIndex(k);
            obj = _symbols[l];
            if (obj != null)
            {
                if (((String) (obj)).length() == j)
                {
                    k = 0;
                    do
                    {
                        if (((String) (obj)).charAt(k) == ac[i + k])
                        {
                            int i1 = k + 1;
                            k = i1;
                            if (i1 < j)
                            {
                                continue;
                            }
                            k = i1;
                        }
                        if (k == j)
                        {
                            return ((String) (obj));
                        }
                        break;
                    } while (true);
                }
                obj = _buckets[l >> 1];
                if (obj != null)
                {
                    obj = ((Bucket) (obj)).find(ac, i, j);
                    if (obj != null)
                    {
                        return ((String) (obj));
                    }
                }
            }
            if (!_dirty)
            {
                copyArrays();
                _dirty = true;
                k = l;
            } else
            if (_size >= _sizeThreshold)
            {
                rehash();
                k = _hashToIndex(calcHash(ac, i, j));
            } else
            {
                k = l;
            }
            obj = new String(ac, i, j);
            ac = ((char []) (obj));
            if (_intern)
            {
                ac = InternCache.instance.intern(((String) (obj)));
            }
            _size = _size + 1;
            if (_symbols[k] == null)
            {
                _symbols[k] = ac;
                return ac;
            }
            i = k >> 1;
            obj = new Bucket(ac, _buckets[i]);
            _buckets[i] = ((Bucket) (obj));
            _longestCollisionList = Math.max(((Bucket) (obj)).length(), _longestCollisionList);
            obj = ac;
            if (_longestCollisionList > 255)
            {
                reportTooManyCollisions(255);
                return ac;
            }
        }
        return ((String) (obj));
    }

    public int hashSeed()
    {
        return _hashSeed;
    }

    public CharsToNameCanonicalizer makeChild(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        CharsToNameCanonicalizer charstonamecanonicalizer = new CharsToNameCanonicalizer(this, flag, flag1, _symbols, _buckets, _size, _hashSeed, _longestCollisionList);
        this;
        JVM INSTR monitorexit ;
        return charstonamecanonicalizer;
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
        return _dirty;
    }

    public void release()
    {
        while (!maybeDirty() || _parent == null) 
        {
            return;
        }
        _parent.mergeChild(this);
        _dirty = false;
    }

    protected void reportTooManyCollisions(int i)
    {
        throw new IllegalStateException((new StringBuilder()).append("Longest collision chain in symbol table (of size ").append(_size).append(") now exceeds maximum, ").append(i).append(" -- suspect a DoS attack based on hash collisions").toString());
    }

    public int size()
    {
        return _size;
    }


    private class Bucket
    {

        private final int _length;
        private final Bucket _next;
        private final String _symbol;

        public String find(char ac[], int i, int j)
        {
            Bucket bucket;
            String s;
            s = _symbol;
            bucket = _next;
_L7:
            int k;
            if (s.length() != j)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            k = 0;
_L5:
            if (s.charAt(k) == ac[i + k]) goto _L2; else goto _L1
_L1:
            if (k == j)
            {
                return s;
            }
            break MISSING_BLOCK_LABEL_72;
_L2:
            int l = k + 1;
            k = l;
            if (l < j)
            {
                break; /* Loop/switch isn't completed */
            }
            k = l;
            if (true) goto _L1; else goto _L3
_L3:
            if (true) goto _L5; else goto _L4
_L4:
            if (bucket == null)
            {
                return null;
            }
            s = bucket.getSymbol();
            bucket = bucket.getNext();
            if (true) goto _L7; else goto _L6
_L6:
        }

        public Bucket getNext()
        {
            return _next;
        }

        public String getSymbol()
        {
            return _symbol;
        }

        public int length()
        {
            return _length;
        }

        public Bucket(String s, Bucket bucket)
        {
            _symbol = s;
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
