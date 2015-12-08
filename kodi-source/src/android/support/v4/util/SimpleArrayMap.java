// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//            ContainerHelpers, ArrayMap

public class SimpleArrayMap
{

    static Object mBaseCache[];
    static int mBaseCacheSize;
    static Object mTwiceBaseCache[];
    static int mTwiceBaseCacheSize;
    Object mArray[];
    int mHashes[];
    int mSize;

    public SimpleArrayMap()
    {
        mHashes = ContainerHelpers.EMPTY_INTS;
        mArray = ContainerHelpers.EMPTY_OBJECTS;
        mSize = 0;
    }

    private void allocArrays(int i)
    {
        if (i != 8) goto _L2; else goto _L1
_L1:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (mTwiceBaseCache == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        aobj = mTwiceBaseCache;
        mArray = aobj;
        mTwiceBaseCache = (Object[])(Object[])aobj[0];
        mHashes = (int[])(int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        mTwiceBaseCacheSize--;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        return;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
_L4:
        mHashes = new int[i];
        mArray = new Object[i << 1];
        return;
        Exception exception;
        exception;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (i != 4) goto _L4; else goto _L3
_L3:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        if (mBaseCache == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        exception = ((Exception) (mBaseCache));
        mArray = exception;
        mBaseCache = (Object[])(Object[])exception[0];
        mHashes = (int[])(int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        mBaseCacheSize--;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        return;
        exception;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw exception;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
          goto _L4
    }

    private static void freeArrays(int ai[], Object aobj[], int i)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        if (mTwiceBaseCacheSize < 10)
        {
            aobj[0] = ((Object) (mTwiceBaseCache));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        mTwiceBaseCache = aobj;
        mTwiceBaseCacheSize++;
_L3:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        return;
        ai;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorenter ;
        if (mBaseCacheSize >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (mBaseCache));
        aobj[1] = ai;
        i = (i << 1) - 1;
        break MISSING_BLOCK_LABEL_134;
_L9:
        mBaseCache = aobj;
        mBaseCacheSize++;
_L7:
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        return;
        ai;
        android/support/v4/util/ArrayMap;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        i = (i << 1) - 1;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L8
_L5:
        return;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L9
    }

    public void clear()
    {
        if (mSize != 0)
        {
            freeArrays(mHashes, mArray, mSize);
            mHashes = ContainerHelpers.EMPTY_INTS;
            mArray = ContainerHelpers.EMPTY_OBJECTS;
            mSize = 0;
        }
    }

    public boolean containsKey(Object obj)
    {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj)
    {
        return indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i)
    {
        if (mHashes.length < i)
        {
            int ai[] = mHashes;
            Object aobj[] = mArray;
            allocArrays(i);
            if (mSize > 0)
            {
                System.arraycopy(ai, 0, mHashes, 0, mSize);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize << 1);
            }
            freeArrays(ai, aobj, mSize);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int i;
        if (!(obj instanceof Map))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (Map)obj;
        if (size() != ((Map) (obj)).size())
        {
            return false;
        }
        i = 0;
_L4:
        Object obj1;
        Object obj2;
        Object obj3;
        if (i >= mSize)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = keyAt(i);
        obj2 = valueAt(i);
        obj3 = ((Map) (obj)).get(obj1);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (!((Map) (obj)).containsKey(obj1))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        break MISSING_BLOCK_LABEL_106;
        boolean flag;
        try
        {
            flag = obj2.equals(obj3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag)
        {
            return false;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        return false;
        return false;
    }

    public Object get(Object obj)
    {
        int i = indexOfKey(obj);
        if (i >= 0)
        {
            return mArray[(i << 1) + 1];
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        int ai[] = mHashes;
        Object aobj[] = mArray;
        int k = 0;
        int j = 0;
        int i = 1;
        int i1 = mSize;
        while (j < i1) 
        {
            Object obj = aobj[i];
            int j1 = ai[j];
            int l;
            if (obj == null)
            {
                l = 0;
            } else
            {
                l = obj.hashCode();
            }
            k += l ^ j1;
            j++;
            i += 2;
        }
        return k;
    }

    int indexOf(Object obj, int i)
    {
        int i1 = mSize;
        int j;
        if (i1 == 0)
        {
            j = -1;
        } else
        {
            int l = ContainerHelpers.binarySearch(mHashes, i1, i);
            j = l;
            if (l >= 0)
            {
                j = l;
                if (!obj.equals(mArray[l << 1]))
                {
                    int k;
                    for (k = l + 1; k < i1 && mHashes[k] == i; k++)
                    {
                        if (obj.equals(mArray[k << 1]))
                        {
                            return k;
                        }
                    }

                    for (l--; l >= 0 && mHashes[l] == i; l--)
                    {
                        if (obj.equals(mArray[l << 1]))
                        {
                            return l;
                        }
                    }

                    return ~k;
                }
            }
        }
        return j;
    }

    public int indexOfKey(Object obj)
    {
        if (obj == null)
        {
            return indexOfNull();
        } else
        {
            return indexOf(obj, obj.hashCode());
        }
    }

    int indexOfNull()
    {
        int l = mSize;
        int i;
        if (l == 0)
        {
            i = -1;
        } else
        {
            int k = ContainerHelpers.binarySearch(mHashes, l, 0);
            i = k;
            if (k >= 0)
            {
                i = k;
                if (mArray[k << 1] != null)
                {
                    int j;
                    for (j = k + 1; j < l && mHashes[j] == 0; j++)
                    {
                        if (mArray[j << 1] == null)
                        {
                            return j;
                        }
                    }

                    for (k--; k >= 0 && mHashes[k] == 0; k--)
                    {
                        if (mArray[k << 1] == null)
                        {
                            return k;
                        }
                    }

                    return ~j;
                }
            }
        }
        return i;
    }

    int indexOfValue(Object obj)
    {
        int k = mSize * 2;
        Object aobj[] = mArray;
        if (obj == null)
        {
            for (int i = 1; i < k; i += 2)
            {
                if (aobj[i] == null)
                {
                    return i >> 1;
                }
            }

        } else
        {
            for (int j = 1; j < k; j += 2)
            {
                if (obj.equals(aobj[j]))
                {
                    return j >> 1;
                }
            }

        }
        return -1;
    }

    public boolean isEmpty()
    {
        return mSize <= 0;
    }

    public Object keyAt(int i)
    {
        return mArray[i << 1];
    }

    public Object put(Object obj, Object obj1)
    {
        int k;
        byte byte0;
        int l;
        byte0 = 8;
        int i;
        if (obj == null)
        {
            k = 0;
            i = indexOfNull();
        } else
        {
            k = obj.hashCode();
            i = indexOf(obj, k);
        }
        if (i >= 0)
        {
            i = (i << 1) + 1;
            obj = mArray[i];
            mArray[i] = obj1;
            return obj;
        }
        l = ~i;
        if (mSize < mHashes.length) goto _L2; else goto _L1
_L1:
        if (mSize < 8) goto _L4; else goto _L3
_L3:
        int j = mSize + (mSize >> 1);
_L6:
        int ai[] = mHashes;
        Object aobj[] = mArray;
        allocArrays(j);
        if (mHashes.length > 0)
        {
            System.arraycopy(ai, 0, mHashes, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
        }
        freeArrays(ai, aobj, mSize);
_L2:
        if (l < mSize)
        {
            System.arraycopy(mHashes, l, mHashes, l + 1, mSize - l);
            System.arraycopy(((Object) (mArray)), l << 1, ((Object) (mArray)), l + 1 << 1, mSize - l << 1);
        }
        mHashes[l] = k;
        mArray[l << 1] = obj;
        mArray[(l << 1) + 1] = obj1;
        mSize = mSize + 1;
        return null;
_L4:
        j = byte0;
        if (mSize < 4)
        {
            j = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object remove(Object obj)
    {
        int i = indexOfKey(obj);
        if (i >= 0)
        {
            return removeAt(i);
        } else
        {
            return null;
        }
    }

    public Object removeAt(int i)
    {
        int j = 8;
        Object obj = mArray[(i << 1) + 1];
        if (mSize <= 1)
        {
            freeArrays(mHashes, mArray, mSize);
            mHashes = ContainerHelpers.EMPTY_INTS;
            mArray = ContainerHelpers.EMPTY_OBJECTS;
            mSize = 0;
        } else
        if (mHashes.length > 8 && mSize < mHashes.length / 3)
        {
            if (mSize > 8)
            {
                j = mSize + (mSize >> 1);
            }
            int ai[] = mHashes;
            Object aobj[] = mArray;
            allocArrays(j);
            mSize = mSize - 1;
            if (i > 0)
            {
                System.arraycopy(ai, 0, mHashes, 0, i);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i << 1);
            }
            if (i < mSize)
            {
                System.arraycopy(ai, i + 1, mHashes, i, mSize - i);
                System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
                return obj;
            }
        } else
        {
            mSize = mSize - 1;
            if (i < mSize)
            {
                System.arraycopy(mHashes, i + 1, mHashes, i, mSize - i);
                System.arraycopy(((Object) (mArray)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
            }
            mArray[mSize << 1] = null;
            mArray[(mSize << 1) + 1] = null;
            return obj;
        }
        return obj;
    }

    public Object setValueAt(int i, Object obj)
    {
        i = (i << 1) + 1;
        Object obj1 = mArray[i];
        mArray[i] = obj;
        return obj1;
    }

    public int size()
    {
        return mSize;
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(mSize * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < mSize) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = keyAt(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            stringbuilder.append('=');
            obj = valueAt(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public Object valueAt(int i)
    {
        return mArray[(i << 1) + 1];
    }
}
