// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;


// Referenced classes of package com.google.protobuf.nano:
//            FieldData

final class FieldArray
    implements Cloneable
{

    private static final FieldData DELETED = new FieldData();
    private FieldData mData[];
    private int mFieldNumbers[];
    private boolean mGarbage;
    private int mSize;

    public FieldArray()
    {
        this(10);
    }

    private FieldArray(int i)
    {
        mGarbage = false;
        i = idealIntArraySize(i);
        mFieldNumbers = new int[i];
        mData = new FieldData[i];
        mSize = 0;
    }

    private static boolean arrayEquals(int ai[], int ai1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (ai[j] != ai1[j])
            {
                return false;
            }
        }

        return true;
    }

    private static boolean arrayEquals(FieldData afielddata[], FieldData afielddata1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!afielddata[j].equals(afielddata1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private int binarySearch(int i)
    {
        int k;
label0:
        {
            int j = 0;
            for (k = mSize - 1; j <= k;)
            {
                int l = j + k >>> 1;
                int i1 = mFieldNumbers[l];
                if (i1 < i)
                {
                    j = l + 1;
                } else
                {
                    k = l;
                    if (i1 <= i)
                    {
                        break label0;
                    }
                    k = l - 1;
                }
            }

            k = ~j;
        }
        return k;
    }

    private void gc()
    {
        int l = mSize;
        int j = 0;
        int ai[] = mFieldNumbers;
        FieldData afielddata[] = mData;
        for (int i = 0; i < l;)
        {
            FieldData fielddata = afielddata[i];
            int k = j;
            if (fielddata != DELETED)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    afielddata[j] = fielddata;
                    afielddata[i] = null;
                }
                k = j + 1;
            }
            i++;
            j = k;
        }

        mGarbage = false;
        mSize = j;
    }

    private static int idealByteArraySize(int i)
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

    private int idealIntArraySize(int i)
    {
        return idealByteArraySize(i << 2) / 4;
    }

    public final FieldArray clone()
    {
        int j = size();
        FieldArray fieldarray = new FieldArray(j);
        System.arraycopy(mFieldNumbers, 0, fieldarray.mFieldNumbers, 0, j);
        for (int i = 0; i < j; i++)
        {
            if (mData[i] != null)
            {
                fieldarray.mData[i] = mData[i].clone();
            }
        }

        fieldarray.mSize = j;
        return fieldarray;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final FieldData dataAt(int i)
    {
        if (mGarbage)
        {
            gc();
        }
        return mData[i];
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof FieldArray))
            {
                return false;
            }
            obj = (FieldArray)obj;
            if (size() != ((FieldArray) (obj)).size())
            {
                return false;
            }
            if (!arrayEquals(mFieldNumbers, ((FieldArray) (obj)).mFieldNumbers, mSize) || !arrayEquals(mData, ((FieldArray) (obj)).mData, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public final FieldData get(int i)
    {
        i = binarySearch(i);
        if (i < 0 || mData[i] == DELETED)
        {
            return null;
        } else
        {
            return mData[i];
        }
    }

    public final int hashCode()
    {
        if (mGarbage)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + mFieldNumbers[i]) * 31 + mData[i].hashCode();
        }

        return j;
    }

    public final void put(int i, FieldData fielddata)
    {
        int j = binarySearch(i);
        if (j >= 0)
        {
            mData[j] = fielddata;
            return;
        }
        int k = ~j;
        if (k < mSize && mData[k] == DELETED)
        {
            mFieldNumbers[k] = i;
            mData[k] = fielddata;
            return;
        }
        j = k;
        if (mGarbage)
        {
            j = k;
            if (mSize >= mFieldNumbers.length)
            {
                gc();
                j = ~binarySearch(i);
            }
        }
        if (mSize >= mFieldNumbers.length)
        {
            int l = idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            FieldData afielddata[] = new FieldData[l];
            System.arraycopy(mFieldNumbers, 0, ai, 0, mFieldNumbers.length);
            System.arraycopy(mData, 0, afielddata, 0, mData.length);
            mFieldNumbers = ai;
            mData = afielddata;
        }
        if (mSize - j != 0)
        {
            System.arraycopy(mFieldNumbers, j, mFieldNumbers, j + 1, mSize - j);
            System.arraycopy(mData, j, mData, j + 1, mSize - j);
        }
        mFieldNumbers[j] = i;
        mData[j] = fielddata;
        mSize = mSize + 1;
    }

    public final int size()
    {
        if (mGarbage)
        {
            gc();
        }
        return mSize;
    }

}
