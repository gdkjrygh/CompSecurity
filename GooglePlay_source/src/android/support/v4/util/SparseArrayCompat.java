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
    public int mKeys[];
    public int mSize;
    public Object mValues[];

    public SparseArrayCompat()
    {
        this((byte)0);
    }

    private SparseArrayCompat(byte byte0)
    {
        mGarbage = false;
        byte0 = ContainerHelpers.idealIntArraySize(10);
        mKeys = new int[byte0];
        mValues = new Object[byte0];
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

    public final void clear()
    {
        mSize = 0;
        mGarbage = false;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final String toString()
    {
        return "{}";
    }

}
