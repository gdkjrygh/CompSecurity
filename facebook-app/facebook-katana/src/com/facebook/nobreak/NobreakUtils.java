// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.content.Context;
import com.facebook.prefs.shared.android.AndroidSharedPreferencesHelper;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class NobreakUtils
{

    private static final Class a = com/facebook/nobreak/NobreakUtils;

    private NobreakUtils()
    {
    }

    public static File a(Context context)
    {
        context = (new AndroidSharedPreferencesHelper(context)).a("none");
        if (context != null)
        {
            return context.getParentFile();
        } else
        {
            return null;
        }
    }

    static String a(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }

    public static void a(Context context, List list)
    {
        a(context.getFilesDir().getParentFile(), list);
        a(context.getExternalFilesDir(null), list);
    }

    private static void a(File file, List list)
    {
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                File file1 = afile[i];
                if (file1.isDirectory())
                {
                    a(file1, list);
                }
                file1.delete();
            }

        }
        file.delete();
    }

}
