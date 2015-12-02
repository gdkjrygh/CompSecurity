// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

public class ae
{

    public static String a(Context context, String s)
    {
        context = context.getFilesDir();
        if (context != null)
        {
            context = context.getParentFile();
            if (context != null)
            {
                context = new File((new StringBuilder(String.valueOf(context.getAbsolutePath()))).append("/lib/lib").append(s).append(".so").toString());
                if (context.exists())
                {
                    return context.getAbsolutePath();
                }
            }
        }
        return null;
    }

    public static boolean b(Context context, String s)
    {
        context = a(context, s);
        if (!TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        System.loadLibrary(s);
        return true;
        Runtime.getRuntime().load(context);
        return true;
        context;
_L2:
        return false;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
