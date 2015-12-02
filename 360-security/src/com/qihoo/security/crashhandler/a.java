// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.os.Handler;
import com.qihoo360.common.utils.FileUtil;
import java.io.File;
import java.util.ArrayList;

public class a
{

    public static void a(File file)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("logcat");
        arraylist.add("-d");
        arraylist.add("-v");
        arraylist.add("time");
        arraylist.add("-f");
        arraylist.add("logcat.txt");
        try
        {
            file = Runtime.getRuntime().exec((String[])arraylist.toArray(new String[arraylist.size()]), null, new File(file, "crash"));
            (new Handler()).postDelayed(new Runnable(file) {

                final Process a;

                public void run()
                {
                    a.destroy();
                }

            
            {
                a = process;
                super();
            }
            }, 1000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return;
        }
    }

    public static void b(File file)
    {
        FileUtil.copyFile(new File("/system/build.prop"), new File((new StringBuilder()).append(file.getAbsolutePath()).append("/").append("crash").toString(), "prop.txt"));
    }
}
