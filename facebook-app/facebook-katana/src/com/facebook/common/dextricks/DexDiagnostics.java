// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.Log;
import com.facebook.dalvik.DalvikInternals;
import com.facebook.debug.logcat.raw.RawLogcatDumper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

public class DexDiagnostics
{

    private final String a;

    public DexDiagnostics(Context context)
    {
        Object obj = null;
        try
        {
            context = a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("DexDiagnostics", "unable to find app data directory", context);
            context = obj;
        }
        a = context;
    }

    private static String a(Context context)
    {
        return context.getApplicationInfo().dataDir;
    }

    public static String a(String s, String s1)
    {
        Object obj = null;
        s = new FileInputStream(s);
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(s));
        obj = new StringBuilder();
_L5:
        String s2 = bufferedreader.readLine();
        if (s2 == null) goto _L2; else goto _L1
_L1:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        if (!s2.contains(s1)) goto _L5; else goto _L4
_L4:
        ((StringBuilder) (obj)).append(s2).append("\t");
          goto _L5
        Exception exception1;
        exception1;
        obj = s;
        s1 = bufferedreader;
        s = exception1;
_L7:
        if (obj != null)
        {
            ((FileInputStream) (obj)).close();
        }
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
_L2:
        s1 = ((StringBuilder) (obj)).toString();
        s.close();
        bufferedreader.close();
        return s1;
        s;
        s1 = null;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        s1 = null;
        obj = s;
        s = exception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static StringBuilder a(File file, StringBuilder stringbuilder)
    {
        stringbuilder.append(file.getAbsolutePath());
        if (file.exists()) goto _L2; else goto _L1
_L1:
        stringbuilder.append(" (deleted)\n");
_L4:
        return stringbuilder;
_L2:
        if (!file.isDirectory())
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append("\n");
        file = file.listFiles();
        if (file != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                a(file[i], stringbuilder);
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        stringbuilder.append(" s:").append(file.length()).append(" m:").append(file.lastModified()).append("\n");
        return stringbuilder;
    }

    public static String d()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        List list = (new RawLogcatDumper()).a();
        int i = 0;
_L1:
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        stringbuilder.append("\n");
        stringbuilder.append((String)list.get(i));
        i++;
          goto _L1
        RuntimeException runtimeexception;
        runtimeexception;
        stringbuilder.setLength(0);
        stringbuilder.append("Exception during logcat dump: ");
        stringbuilder.append(runtimeexception.toString());
        return stringbuilder.toString();
    }

    public final int a()
    {
        if (a == null)
        {
            return -2;
        }
        int i;
        try
        {
            i = DalvikInternals.getOwnerUid(a);
        }
        catch (Throwable throwable)
        {
            Log.e(com/facebook/common/dextricks/DexDiagnostics.getSimpleName(), "Unable to read directory owner uid", throwable);
            return -2;
        }
        return i;
    }

    public final boolean b()
    {
        int i = a();
        return i == Process.myUid() || i == -2;
    }

    public final String c()
    {
        if (a == null)
        {
            return "n/a";
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            a(new File(a), stringbuilder);
            return stringbuilder.toString();
        }
    }
}
