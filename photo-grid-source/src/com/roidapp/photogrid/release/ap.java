// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.roidapp.photogrid.common.ae;
import java.io.File;
import java.io.IOException;

public class ap
{

    public ap()
    {
    }

    public static String a()
    {
        return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/roidapp/.Workspace").toString();
    }

    public static String a(Context context)
    {
        String s = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(context.getString(0x7f07002e)).toString();
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        File file = new File(sharedpreferences.getString("SAVEPATH", s));
        if (!file.exists())
        {
            boolean flag = file.mkdirs();
            if (android.os.Build.VERSION.SDK_INT == 19 && !flag)
            {
                context = new ae(context.getContentResolver(), file);
                try
                {
                    context.a();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                }
            }
        }
        return sharedpreferences.getString("SAVEPATH", s);
    }

    public static void a(Context context, String s)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putString("SAVEPATH", s);
        context.apply();
    }

    public static String b(Context context)
    {
        String s = PreferenceManager.getDefaultSharedPreferences(context).getString("SAVEPATH", "");
        if (s == null || s.equals(""))
        {
            return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(context.getString(0x7f07002e)).append("/.hdtest").toString();
        } else
        {
            return (new StringBuilder()).append(s).append("/.hdtest").toString();
        }
    }
}
