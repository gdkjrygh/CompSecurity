// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.l;
import android.util.AttributeSet;

public class a extends android.view.arams
{

    public int a;

    public ()
    {
        super(-2, -2);
        a = 0;
        a = 0x800013;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, l.b);
        a = context.getInt(l.c, 0);
        context.recycle();
    }

    public a(a a1)
    {
        super(a1);
        a = 0;
        a = a1.a;
    }

    public a(android.view.outParams outparams)
    {
        super(outparams);
        a = 0;
    }
}
