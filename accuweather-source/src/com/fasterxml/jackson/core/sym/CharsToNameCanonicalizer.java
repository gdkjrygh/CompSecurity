// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;

public final class CharsToNameCanonicalizer
{
    static final class Bucket
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

    private static int _thresholdSize(int i)
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
        return createRoot((int)l + (int)(l >>> 32) | 1);
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
        if (charstonamecanonicalizer.size() <= 12000 && charstonamecanonicalizer._longestCollisionList <= 63)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        this;
        JVM INSTR monitorenter ;
        initTables(64);
        _dirty = false;
        this;
        JVM INSTR monitorexit ;
        return;
        charstonamecanonicalizer;
        this;
        JVM INSTR monitorexit ;
        throw charstonamecanonicalizer;
        if (charstonamecanonicalizer.size() <= size())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        this;
        JVM INSTR monitorenter ;
        _symbols = charstonamecanonicalizer._symbols;
        _buckets = charstonamecanonicalizer._buckets;
        _size = charstonamecanonicalizer._size;
        _sizeThreshold = charstonamecanonicalizer._sizeThreshold;
        _indexMask = charstonamecanonicalizer._indexMask;
        _longestCollisionList = charstonamecanonicalizer._longestCollisionList;
        _dirty = false;
        this;
        JVM INSTR monitorexit ;
        return;
        charstonamecanonicalizer;
        this;
        JVM INSTR monitorexit ;
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
            int j = 0;
            i = 0;
            int l = 0;
            while (l < l1) 
            {
                Object obj = as[l];
                int i1 = j;
                int k1 = i;
                if (obj != null)
                {
                    i1 = j + 1;
                    j = _hashToIndex(calcHash(((String) (obj))));
                    if (_symbols[j] == null)
                    {
                        _symbols[j] = ((String) (obj));
                        k1 = i;
                    } else
                    {
                        j >>= 1;
                        obj = new Bucket(((String) (obj)), _buckets[j]);
                        _buckets[j] = ((Bucket) (obj));
                        k1 = Math.max(i, ((Bucket) (obj)).length());
                    }
                }
                l++;
                j = i1;
                i = k1;
            }
            l = 0;
            int j1 = i;
            i = l;
            l = j;
            while (i < l1 >> 1) 
            {
                Bucket bucket = abucket[i];
                int k = j1;
                while (bucket != null) 
                {
                    l++;
                    Object obj1 = bucket.getSymbol();
                    j1 = _hashToIndex(calcHash(((String) (obj1))));
                    if (_symbols[j1] == null)
                    {
                        _symbols[j1] = ((String) (obj1));
                    } else
                    {
                        j1 >>= 1;
                        obj1 = new Bucket(((String) (obj1)), _buckets[j1]);
                        _buckets[j1] = ((Bucket) (obj1));
                        k = Math.max(k, ((Bucket) (obj1)).length());
                    }
                    bucket = bucket.getNext();
                }
                i++;
                j1 = k;
            }
            _longestCollisionList = j1;
            if (l != _size)
            {
                throw new Error((new StringBuilder()).append("Internal error on SymbolTable.rehash(): had ").append(_size).append(" entries; now have ").append(l).append(".").toString());
            }
        }
    }

    public int _hashToIndex(int i)
    {
        return _indexMask & i + (i >>> 15);
    }

    public int bucketCount()
    {
        return _symbols.length;
    }

    public int calcHash(String s)
    {
        int l = s.length();
        int i = _hashSeed;
        for (int j = 0; j < l; j++)
        {
            i = i * 33 + s.charAt(j);
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
        for (int k = 0; k < j; k++)
        {
            i = i * 33 + ac[k];
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
        if (j >= 1) goto _L2; else goto _L1
_L1:
        Object obj = "";
_L6:
        return ((String) (obj));
_L2:
        int i1;
        if (!_canonicalize)
        {
            return new String(ac, i, j);
        }
        i1 = _hashToIndex(k);
        obj = _symbols[i1];
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String) (obj)).length() != j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = 0;
_L9:
        if (((String) (obj)).charAt(k) == ac[i + k]) goto _L4; else goto _L3
_L3:
        if (k == j) goto _L6; else goto _L5
_L5:
        String s1;
        obj = _buckets[i1 >> 1];
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ((Bucket) (obj)).find(ac, i, j);
        obj = s1;
        if (s1 != null) goto _L6; else goto _L7
_L7:
        String s;
        int l;
        if (!_dirty)
        {
            copyArrays();
            _dirty = true;
            k = i1;
        } else
        {
            k = i1;
            if (_size >= _sizeThreshold)
            {
                rehash();
                k = _hashToIndex(calcHash(ac, i, j));
            }
        }
        s = new String(ac, i, j);
        ac = s;
        if (_intern)
        {
            ac = InternCache.instance.intern(s);
        }
        _size = _size + 1;
        if (_symbols[k] == null)
        {
            _symbols[k] = ac;
        } else
        {
            i = k >> 1;
            Bucket bucket = new Bucket(ac, _buckets[i]);
            _buckets[i] = bucket;
            _longestCollisionList = Math.max(bucket.length(), _longestCollisionList);
            if (_longestCollisionList > 255)
            {
                reportTooManyCollisions(255);
            }
        }
        return ac;
_L4:
        l = k + 1;
        k = l;
        if (l < j) goto _L9; else goto _L8
_L8:
        k = l;
          goto _L3
    }

    public int hashSeed()
    {
        return _hashSeed;
    }

    public CharsToNameCanonicalizer makeChild(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        String as[];
        Bucket abucket[];
        int i;
        int j;
        int k;
        as = _symbols;
        abucket = _buckets;
        i = _size;
        j = _hashSeed;
        k = _longestCollisionList;
        this;
        JVM INSTR monitorexit ;
        return new CharsToNameCanonicalizer(this, flag, flag1, as, abucket, i, j, k);
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
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

}
