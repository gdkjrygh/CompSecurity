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

        public final String find(char ac[], int i, int j)
        {
            String s = _symbol;
            Bucket bucket = _next;
            do
            {
                if (s.length() == j)
                {
                    int k = 0;
                    int l;
                    do
                    {
                        l = k;
                        if (s.charAt(k) != ac[i + k])
                        {
                            break;
                        }
                        l = k + 1;
                        k = l;
                    } while (l < j);
                    if (l == j)
                    {
                        return s;
                    }
                }
                if (bucket != null)
                {
                    s = bucket.getSymbol();
                    bucket = bucket.getNext();
                } else
                {
                    return null;
                }
            } while (true);
        }

        public final Bucket getNext()
        {
            return _next;
        }

        public final String getSymbol()
        {
            return _symbol;
        }

        public final int length()
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
        int i = (int)l;
        return createRoot((int)(l >>> 32) + i | 1);
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
            int l = 0;
            i = 0;
            int k = 0;
            while (l < l1) 
            {
                Object obj = as[l];
                int i1 = i;
                int k1 = k;
                if (obj != null)
                {
                    k1 = k + 1;
                    k = _hashToIndex(calcHash(((String) (obj))));
                    if (_symbols[k] == null)
                    {
                        _symbols[k] = ((String) (obj));
                        i1 = i;
                    } else
                    {
                        k >>= 1;
                        obj = new Bucket(((String) (obj)), _buckets[k]);
                        _buckets[k] = ((Bucket) (obj));
                        i1 = Math.max(i, ((Bucket) (obj)).length());
                    }
                }
                l++;
                i = i1;
                k = k1;
            }
            l = 0;
            int j1 = k;
            k = l;
            l = i;
            while (k < l1 >> 1) 
            {
                Bucket bucket = abucket[k];
                int j = j1;
                while (bucket != null) 
                {
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
                        l = Math.max(l, ((Bucket) (obj1)).length());
                    }
                    bucket = bucket.getNext();
                    j++;
                }
                k++;
                j1 = j;
            }
            _longestCollisionList = l;
            if (j1 != _size)
            {
                throw new Error((new StringBuilder("Internal error on SymbolTable.rehash(): had ")).append(_size).append(" entries; now have ").append(j1).append(".").toString());
            }
        }
    }

    public final int _hashToIndex(int i)
    {
        return (i >>> 15) + i & _indexMask;
    }

    public final int calcHash(String s)
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

    public final int calcHash(char ac[], int i, int j)
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

    public final String findSymbol(char ac[], int i, int j, int k)
    {
        Object obj;
        if (j <= 0)
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
                    int i1;
                    do
                    {
                        i1 = k;
                        if (((String) (obj)).charAt(k) != ac[i + k])
                        {
                            break;
                        }
                        i1 = k + 1;
                        k = i1;
                    } while (i1 < j);
                    if (i1 == j)
                    {
                        return ((String) (obj));
                    }
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

    public final int hashSeed()
    {
        return _hashSeed;
    }

    public final CharsToNameCanonicalizer makeChild(boolean flag, boolean flag1)
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

    public final boolean maybeDirty()
    {
        return _dirty;
    }

    public final void release()
    {
        while (!maybeDirty() || _parent == null) 
        {
            return;
        }
        _parent.mergeChild(this);
        _dirty = false;
    }

    protected final void reportTooManyCollisions(int i)
    {
        throw new IllegalStateException((new StringBuilder("Longest collision chain in symbol table (of size ")).append(_size).append(") now exceeds maximum, ").append(i).append(" -- suspect a DoS attack based on hash collisions").toString());
    }

    public final int size()
    {
        return _size;
    }

}
