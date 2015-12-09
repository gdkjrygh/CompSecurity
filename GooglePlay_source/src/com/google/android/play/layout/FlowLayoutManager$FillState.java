// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;


// Referenced classes of package com.google.android.play.layout:
//            FlowLayoutManager

private static final class <init>
{

    int mHeightFilled;
    int mNextAnchorPosition;
    mNextItemChildIndex mNextItem;
    int mNextItemChildIndex;
    ms mNextItemLayoutParams;
    int mNextItemPosition;

    public final <init> takeNextItem()
    {
        <init> <init>1 = mNextItem;
        mNextItem = null;
        return <init>1;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("FillState{mHeightFilled=")).append(mHeightFilled).append(",mNextAnchorPosition=").append(mNextAnchorPosition).append(",mNextItem=");
        String s;
        if (mNextItem == null)
        {
            s = "null";
        } else
        {
            s = "notnull";
        }
        return stringbuilder.append(s).append(",mNextItemPosition=").append(mNextItemPosition).append(",mNextItemChildIndex=").append(mNextItemChildIndex).toString();
    }

    private ms()
    {
    }

    ms(byte byte0)
    {
        this();
    }
}
