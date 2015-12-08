// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.android.id;

import android.content.Context;
import android.os.Build;

public class API9
{

    public API9()
    {
    }

    public static String getAndroidSerial(Context context)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() < 9)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        context = Build.SERIAL;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        boolean flag;
        if (context.length() <= 0 || context.equals("unknown") || context.length() <= 3 || context.substring(0, 3).equals("***"))
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = context.substring(0, 3).equals("000");
        if (!flag)
        {
            return context;
        }
        break MISSING_BLOCK_LABEL_79;
        context;
        return null;
    }
}
