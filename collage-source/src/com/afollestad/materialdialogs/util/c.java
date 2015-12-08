// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.util.SimpleArrayMap;

public class c
{

    private static final SimpleArrayMap a = new SimpleArrayMap();

    public c()
    {
    }

    public static Typeface a(Context context, String s)
    {
        SimpleArrayMap simplearraymap = a;
        simplearraymap;
        JVM INSTR monitorenter ;
        boolean flag = a.containsKey(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        context = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", new Object[] {
            s
        }));
        a.put(s, context);
        simplearraymap;
        JVM INSTR monitorexit ;
        return context;
        context;
        simplearraymap;
        JVM INSTR monitorexit ;
        return null;
        context;
        simplearraymap;
        JVM INSTR monitorexit ;
        throw context;
        context = (Typeface)a.get(s);
        simplearraymap;
        JVM INSTR monitorexit ;
        return context;
    }

}
