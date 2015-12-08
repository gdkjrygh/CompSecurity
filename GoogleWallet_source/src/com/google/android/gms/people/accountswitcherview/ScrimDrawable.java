// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.graphics.drawable.ColorDrawable;

public final class ScrimDrawable extends ColorDrawable
{

    public static final int DEFAULT_COLOR = 0x33000000;
    private int mIntrinsicHeight;

    public ScrimDrawable()
    {
        this(0x33000000);
    }

    private ScrimDrawable(int i)
    {
        super(i);
    }

    public final int getIntrinsicHeight()
    {
        return mIntrinsicHeight;
    }

    public final void setIntrinsicHeight(int i)
    {
        mIntrinsicHeight = i;
    }
}
