// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;

import java.lang.reflect.Array;

// Referenced classes of package android.support.v7.util:
//            TileList

public static class mItems
{

    public int mItemCount;
    public final Object mItems[];
    mStartPosition mNext;
    public int mStartPosition;

    boolean containsPosition(int i)
    {
        return mStartPosition <= i && i < mStartPosition + mItemCount;
    }

    Object getByPosition(int i)
    {
        return mItems[i - mStartPosition];
    }

    public (Class class1, int i)
    {
        mItems = (Object[])(Object[])Array.newInstance(class1, i);
    }
}
