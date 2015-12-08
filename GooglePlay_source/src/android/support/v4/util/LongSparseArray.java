// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//            ContainerHelpers

public final class LongSparseArray
    implements Cloneable
{

    private static final Object DELETED = new Object();
    private boolean mGarbage;
    public long mKeys[];
    public int mSize;
    public Object mValues[];

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

    private LongSparseArray clone()
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

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final Object get(long l)
    {
        int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
        if (i < 0 || mValues[i] == DELETED)
        {
            return null;
        } else
        {
            return mValues[i];
        }
    }

    public final void put(long l, Object obj)
    {
        int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
        if (i >= 0)
        {
            mValues[i] = obj;
            return;
        }
        i = ~i;
        if (i < mSize && mValues[i] == DELETED)
        {
            mKeys[i] = l;
            mValues[i] = obj;
            return;
        }
        if (mSize >= mKeys.length)
        {
            int j = ContainerHelpers.idealLongArraySize(mSize + 1);
            long al[] = new long[j];
            Object aobj[] = new Object[j];
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

    public final String toString()
    {
        if (mSize <= 0)
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
            stringbuilder.append(mKeys[i]);
            stringbuilder.append('=');
            Object obj = mValues[i];
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

}
