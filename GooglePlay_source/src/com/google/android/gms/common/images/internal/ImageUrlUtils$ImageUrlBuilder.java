// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;


// Referenced classes of package com.google.android.gms.common.images.internal:
//            ImageUrlUtils

public static abstract class mUrl
{

    protected boolean mIsBlackAndWhite;
    protected int mSize;
    protected String mUrl;

    public abstract String build();

    public final mUrl setBlackAndWhite(boolean flag)
    {
        mIsBlackAndWhite = false;
        return this;
    }

    public final mIsBlackAndWhite setSize(int i)
    {
        mSize = i;
        return this;
    }

    protected Q(String s)
    {
        mSize = -1;
        mIsBlackAndWhite = false;
        mUrl = s;
    }
}
