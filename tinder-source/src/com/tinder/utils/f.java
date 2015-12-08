// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.widget.OverScroller;

public final class f extends OverScroller
{

    public int a;

    public f(Context context)
    {
        super(context);
        a = 250;
    }

    public final void startScroll(int i, int j, int k, int l)
    {
        super.startScroll(i, j, k, l, a);
    }

    public final void startScroll(int i, int j, int k, int l, int i1)
    {
        super.startScroll(i, j, k, l, a);
    }
}
