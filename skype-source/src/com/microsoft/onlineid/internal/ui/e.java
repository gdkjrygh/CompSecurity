// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.content.Context;
import android.graphics.Typeface;

public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    private static final e i[];
    private String d;
    private String e;
    private int f;
    private Typeface g;
    private boolean h;

    private e(String s, int j, String s1, String s2, int k)
    {
        super(s, j);
        g = null;
        h = false;
        d = s1;
        e = s2;
        f = k;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/microsoft/onlineid/internal/ui/e, s);
    }

    public static e[] values()
    {
        return (e[])i.clone();
    }

    public final Typeface a(Context context)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (g != null || h) goto _L2; else goto _L1
_L1:
        context = context.getAssets();
        g = Typeface.createFromAsset(context, String.format("fonts/%s.ttf", new Object[] {
            d
        }));
_L3:
        if (g != null)
        {
            flag = false;
        }
        h = flag;
_L2:
        context = g;
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        g = Typeface.create(e, f);
          goto _L3
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }

    static 
    {
        a = new e("SegoeUI", 0, "segoeui", null, 0);
        b = new e("SegoeUILight", 1, "segoeuil", "sans-serif-thin", 0);
        c = new e("SegoeUISemiBold", 2, "seguisb", null, 1);
        i = (new e[] {
            a, b, c
        });
    }
}
