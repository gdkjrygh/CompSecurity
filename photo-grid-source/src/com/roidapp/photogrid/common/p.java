// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import java.io.File;
import java.text.DecimalFormat;

public final class p
{

    public static String a(Context context)
    {
        String s = "";
        if (!Environment.getExternalStorageState().equals("mounted")) goto _L2; else goto _L1
_L1:
        File file = new File(PreferenceManager.getDefaultSharedPreferences(context).getString("SAVEPATH", Environment.getExternalStorageDirectory().getPath()));
        if (!file.exists() && !file.mkdirs()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        Object obj = s;
        if (flag)
        {
            context = PreferenceManager.getDefaultSharedPreferences(context);
            obj = s;
            if (context.getInt("get_memory_error", 0) != 1)
            {
                String s1 = context.getString("SAVEPATH", Environment.getExternalStorageDirectory().getPath());
                obj = s;
                if (s1 != null)
                {
                    obj = s;
                    if (!s1.equals(""))
                    {
                        obj = s;
                        if ((new File(s1)).exists())
                        {
                            context.edit().putInt("get_memory_error", 1).apply();
                            obj = new StatFs(s1);
                            long l = ((StatFs) (obj)).getBlockSize();
                            long l1 = ((StatFs) (obj)).getAvailableBlocks();
                            long l2 = ((StatFs) (obj)).getBlockCount();
                            float f = l1 * l;
                            float f1 = l * l2;
                            obj = new DecimalFormat("0.0");
                            obj = (new StringBuilder()).append(((DecimalFormat) (obj)).format(f / 1048576F)).append("/").append(((DecimalFormat) (obj)).format(f1 / 1048576F)).append("MB").toString();
                            context.edit().putInt("get_memory_error", 2).apply();
                        }
                    }
                }
            }
        }
        return ((String) (obj));
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
