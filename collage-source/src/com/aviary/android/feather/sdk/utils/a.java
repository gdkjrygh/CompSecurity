// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import android.content.Context;
import java.util.HashMap;

public class a
{

    static HashMap a = new HashMap();

    public a()
    {
    }

    public static String a(Context context, com.aviary.android.feather.cds.b b)
    {
        int i;
        if (a.containsKey(b))
        {
            return (String)a.get(b);
        }
        i = -1;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.aviary.android.feather.cds.b.values().length];
                try
                {
                    a[com.aviary.android.feather.cds.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.aviary.android.feather.cds.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.aviary.android.feather.cds.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[b.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 77
    //                   2 84
    //                   3 91;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_91;
_L5:
        if (i > 0)
        {
            context = context.getString(i);
            a.put(b, context);
            return context;
        } else
        {
            return "";
        }
_L2:
        i = com.aviary.android.feather.sdk.R.string.feather_borders;
          goto _L5
_L3:
        i = com.aviary.android.feather.sdk.R.string.feather_effects;
          goto _L5
        i = com.aviary.android.feather.sdk.R.string.feather_stickers;
          goto _L5
    }

}
