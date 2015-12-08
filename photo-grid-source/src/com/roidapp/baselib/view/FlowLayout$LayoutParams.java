// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.roidapp.baselib.i;

public class a extends android.view.rams
{

    public int a;

    public ()
    {
        super(-1, -1);
        a = -1;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        context = context.obtainStyledAttributes(attributeset, i.l);
        a = context.getInt(i.m, -1);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public a(android.view.ayoutParams ayoutparams)
    {
        super(ayoutparams);
        a = -1;
    }
}
