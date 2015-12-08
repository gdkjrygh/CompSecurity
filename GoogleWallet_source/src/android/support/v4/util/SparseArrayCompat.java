// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            ContainerHelpers

public final class SparseArrayCompat
    implements Cloneable
{

    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int mKeys[];
    private int mSize;
    private Object mValues[];

    public SparseArrayCompat()
    {
        this(10);
    }

    private SparseArrayCompat(int i)
    {
        mGarbage = false;
        if (i == 0)
        {
            mKeys = ContainerHelpers.EMPTY_INTS;
            mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else
        {
            i = ContainerHelpers.idealIntArraySize(i);
            mKeys = new int[i];
            mValues = new Object[i];
        }
        mSize = 0;
    }

    private SparseArrayCompat clone()
    {
        SparseArrayCompat sparsearraycompat = null;
        SparseArrayCompat sparsearraycompat1;
        try
        {
            sparsearraycompat1 = (SparseArrayCompat)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return sparsearraycompat;
        }
        sparsearraycompat = sparsearraycompat1;
        sparsearraycompat1.mKeys = (int[])mKeys.clone();
        sparsearraycompat = sparsearraycompat1;
        sparsearraycompat1.mValues = (Object[])((Object []) (mValues)).clone();
        return sparsearraycompat1;
    }

    private void delete(int i)
    {
        i = ContainerHelpers.binarySearch(mKeys, mSize, i);
        if (i >= 0 && mValues[i] != DELETED)
        {
            mValues[i] = DELETED;
            mGarbage = true;
        }
    }

    private void gc()
    {
        int l = mSize;
        int j = 0;
        int ai[] = mKeys;
        Object aobj[] = mValues;
        for (int i = 0; i < l;)
        {
            Object obj = aobj[i];
            int k = j;
            if (obj != DELETED)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
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

    private Object get(int i, Object obj)
    {
        i = ContainerHelpers.binarySearch(mKeys, mSize, i);
        if (i < 0 || mValues[i] == DELETED)
        {
            return obj;
        } else
        {
            return mValues[i];
        }
    }

    public final void clear()
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

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final Object get(int i)
    {
        return get(i, null);
    }

    public final int indexOfKey(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return ContainerHelpers.binarySearch(mKeys, mSize, i);
    }

    public final int keyAt(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return mKeys[i];
    }

    public final void put(int i, Object obj)
    {
        int j = ContainerHelpers.binarySearch(mKeys, mSize, i);
        if (j >= 0)
        {
            mValues[j] = obj;
            return;
        }
        int k = ~j;
        if (k < mSize && mValues[k] == DELETED)
        {
            mKeys[k] = i;
            mValues[k] = obj;
            return;
        }
        j = k;
        if (mGarbage)
        {
            j = k;
            if (mSize >= mKeys.length)
            {
                gc();
                j = ~ContainerHelpers.binarySearch(mKeys, mSize, i);
            }
        }
        if (mSize >= mKeys.length)
        {
            int l = ContainerHelpers.idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            Object aobj[] = new Object[l];
            System.arraycopy(mKeys, 0, ai, 0, mKeys.length);
            System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
            mKeys = ai;
            mValues = aobj;
        }
        if (mSize - j != 0)
        {
            System.arraycopy(mKeys, j, mKeys, j + 1, mSize - j);
            System.arraycopy(((Object) (mValues)), j, ((Object) (mValues)), j + 1, mSize - j);
        }
        mKeys[j] = i;
        mValues[j] = obj;
        mSize = mSize + 1;
    }

    public final void remove(int i)
    {
        delete(i);
    }

    public final void removeAt(int i)
    {
        if (mValues[i] != DELETED)
        {
            mValues[i] = DELETED;
            mGarbage = true;
        }
    }

    public final int size()
    {
        if (mGarbage)
        {
            gc();
        }
        return mSize;
    }

    public final String toString()
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

    public final Object valueAt(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return mValues[i];
    }

}
