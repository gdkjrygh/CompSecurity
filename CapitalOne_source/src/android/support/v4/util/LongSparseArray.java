// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


public class LongSparseArray
    implements Cloneable
{

    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private long mKeys[];
    private int mSize;
    private Object mValues[];

    public LongSparseArray()
    {
        this(10);
    }

    public LongSparseArray(int i)
    {
        mGarbage = false;
        i = idealLongArraySize(i);
        mKeys = new long[i];
        mValues = new Object[i];
        mSize = 0;
    }

    private static int binarySearch(long al[], int i, int j, long l)
    {
        int k = i + j;
        for (int i1 = i - 1; k - i1 > 1;)
        {
            int j1 = (k + i1) / 2;
            if (al[j1] < l)
            {
                i1 = j1;
            } else
            {
                k = j1;
            }
        }

        if (k == i + j)
        {
            i = ~(i + j);
        } else
        {
            i = k;
            if (al[k] != l)
            {
                return ~k;
            }
        }
        return i;
    }

    private void gc()
    {
        int l = mSize;
        int j = 0;
        long al[] = mKeys;
        Object aobj[] = mValues;
        for (int i = 0; i < l;)
        {
            Object obj = aobj[i];
            int k = j;
            if (obj != DELETED)
            {
                if (i != j)
                {
                    al[j] = al[i];
                    aobj[j] = obj;
                    aobj[i] = null;
                }
                k = j + 1;
            }
            i++;
            j = k;
        }

        mGarbage = false;
        mSize = j;
    }

    public static int idealByteArraySize(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while (true);
    }

    public static int idealLongArraySize(int i)
    {
        return idealByteArraySize(i * 8) / 8;
    }

    public void append(long l, Object obj)
    {
        if (mSize != 0 && l <= mKeys[mSize - 1])
        {
            put(l, obj);
            return;
        }
        if (mGarbage && mSize >= mKeys.length)
        {
            gc();
        }
        int i = mSize;
        if (i >= mKeys.length)
        {
            int j = idealLongArraySize(i + 1);
            long al[] = new long[j];
            Object aobj[] = new Object[j];
            System.arraycopy(mKeys, 0, al, 0, mKeys.length);
            System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
            mKeys = al;
            mValues = aobj;
        }
        mKeys[i] = l;
        mValues[i] = obj;
        mSize = i + 1;
    }

    public void clear()
    {
        int j = mSize;
        Object aobj[] = mValues;
        for (int i = 0; i < j; i++)
        {
            aobj[i] = null;
        }

        mSize = 0;
        mGarbage = false;
    }

    public LongSparseArray clone()
    {
        LongSparseArray longsparsearray = null;
        LongSparseArray longsparsearray1;
        try
        {
            longsparsearray1 = (LongSparseArray)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return longsparsearray;
        }
        longsparsearray = longsparsearray1;
        longsparsearray1.mKeys = (long[])mKeys.clone();
        longsparsearray = longsparsearray1;
        longsparsearray1.mValues = (Object[])((Object []) (mValues)).clone();
        return longsparsearray1;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public void delete(long l)
    {
        int i = binarySearch(mKeys, 0, mSize, l);
        if (i >= 0 && mValues[i] != DELETED)
        {
            mValues[i] = DELETED;
            mGarbage = true;
        }
    }

    public Object get(long l)
    {
        return get(l, null);
    }

    public Object get(long l, Object obj)
    {
        int i = binarySearch(mKeys, 0, mSize, l);
        if (i < 0 || mValues[i] == DELETED)
        {
            return obj;
        } else
        {
            return mValues[i];
        }
    }

    public int indexOfKey(long l)
    {
        if (mGarbage)
        {
            gc();
        }
        return binarySearch(mKeys, 0, mSize, l);
    }

    public int indexOfValue(Object obj)
    {
        if (mGarbage)
        {
            gc();
        }
        for (int i = 0; i < mSize; i++)
        {
            if (mValues[i] == obj)
            {
                return i;
            }
        }

        return -1;
    }

    public long keyAt(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return mKeys[i];
    }

    public void put(long l, Object obj)
    {
        int i = binarySearch(mKeys, 0, mSize, l);
        if (i >= 0)
        {
            mValues[i] = obj;
            return;
        }
        int j = ~i;
        if (j < mSize && mValues[j] == DELETED)
        {
            mKeys[j] = l;
            mValues[j] = obj;
            return;
        }
        i = j;
        if (mGarbage)
        {
            i = j;
            if (mSize >= mKeys.length)
            {
                gc();
                i = ~binarySearch(mKeys, 0, mSize, l);
            }
        }
        if (mSize >= mKeys.length)
        {
            int k = idealLongArraySize(mSize + 1);
            long al[] = new long[k];
            Object aobj[] = new Object[k];
            System.arraycopy(mKeys, 0, al, 0, mKeys.length);
            System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
            mKeys = al;
            mValues = aobj;
        }
        if (mSize - i != 0)
        {
            System.arraycopy(mKeys, i, mKeys, i + 1, mSize - i);
            System.arraycopy(((Object) (mValues)), i, ((Object) (mValues)), i + 1, mSize - i);
        }
        mKeys[i] = l;
        mValues[i] = obj;
        mSize = mSize + 1;
    }

    public void remove(long l)
    {
        delete(l);
    }

    public void removeAt(int i)
    {
        if (mValues[i] != DELETED)
        {
            mValues[i] = DELETED;
            mGarbage = true;
        }
    }

    public void setValueAt(int i, Object obj)
    {
        if (mGarbage)
        {
            gc();
        }
        mValues[i] = obj;
    }

    public int size()
    {
        if (mGarbage)
        {
            gc();
        }
        return mSize;
    }

    public Object valueAt(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return mValues[i];
    }

}
