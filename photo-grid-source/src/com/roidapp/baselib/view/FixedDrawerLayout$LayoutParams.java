// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package com.roidapp.baselib.view:
//            FixedDrawerLayout

public class a extends android.view.ayoutParams
{

    public int a;
    float b;
    boolean c;
    boolean d;

    public ()
    {
        super(-1, -1);
        a = 0;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, FixedDrawerLayout.c());
        a = context.getInt(0, 0);
        context.recycle();
    }

    public a(android.view.ayoutParams ayoutparams)
    {
        super(ayoutparams);
        a = 0;
    }

    public a(android.view.ayoutParams ayoutparams)
    {
        super(ayoutparams);
        a = 0;
    }

    public a(a a1)
    {
        super(a1);
        a = 0;
        a = a1.a;
    }
}
