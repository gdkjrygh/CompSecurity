// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            ContainerHelpers

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
        if (i == 0)
        {
            mKeys = ContainerHelpers.EMPTY_LONGS;
            mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else
        {
            i = ContainerHelpers.idealLongArraySize(i);
            mKeys = new long[i];
            mValues = new Object[i];
        }
        mSize = 0;
    }

    private void gc()
    {
        int l = mSize;
        long al[] = mKeys;
        Object aobj[] = mValues;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            Object obj = aobj[i];
            k = j;
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
        }

        mGarbage = false;
        mSize = j;
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
            int j = ContainerHelpers.idealLongArraySize(i + 1);
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
        Object obj;
        try
        {
            obj = (LongSparseArray)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        try
        {
            obj.mKeys = (long[])mKeys.clone();
            obj.mValues = (Object[])((Object []) (mValues)).clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return ((LongSparseArray) (obj));
        }
        return ((LongSparseArray) (obj));
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public void delete(long l)
    {
        int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
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
        int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
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
        return ContainerHelpers.binarySearch(mKeys, mSize, l);
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
        int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
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
                i = ~ContainerHelpers.binarySearch(mKeys, mSize, l);
            }
        }
        if (mSize >= mKeys.length)
        {
            int k = ContainerHelpers.idealLongArraySize(mSize + 1);
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

    public String toString()
    {
        if (size() <= 0)
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
            stringbuilder.append(keyAt(i));
            stringbuilder.append('=');
            Object obj = valueAt(i);
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
        if (mGarbage)
        {
            gc();
        }
        return mValues[i];
    }

}
