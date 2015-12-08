// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.chromium.base:
//            CommandLine, ApplicationStatus

public class SysUtils
{

    private static Boolean a;

    private SysUtils()
    {
    }

    private static int a()
    {
        android.os.StrictMode.ThreadPolicy threadpolicy;
        Pattern pattern;
        pattern = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        threadpolicy = StrictMode.allowThreadDiskReads();
        Object obj = new FileReader("/proc/meminfo");
        Object obj1 = new BufferedReader(((java.io.Reader) (obj)));
_L4:
        Object obj2 = ((BufferedReader) (obj1)).readLine();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        Log.w("SysUtils", "/proc/meminfo lacks a MemTotal entry?");
_L5:
        ((BufferedReader) (obj1)).close();
        ((FileReader) (obj)).close();
        StrictMode.setThreadPolicy(threadpolicy);
_L6:
        return 0;
_L2:
        obj2 = pattern.matcher(((CharSequence) (obj2)));
        if (!((Matcher) (obj2)).find()) goto _L4; else goto _L3
_L3:
        int i = Integer.parseInt(((Matcher) (obj2)).group(1));
        if (i > 1024)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        Log.w("SysUtils", (new StringBuilder("Invalid /proc/meminfo total size in kB: ")).append(((Matcher) (obj2)).group(1)).toString());
          goto _L5
        Exception exception1;
        exception1;
        ((BufferedReader) (obj1)).close();
        throw exception1;
        obj1;
        Exception exception;
        try
        {
            ((FileReader) (obj)).close();
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            StrictMode.setThreadPolicy(threadpolicy);
        }
        Log.w("SysUtils", "Cannot get total physical size from /proc/meminfo", ((Throwable) (obj)));
        StrictMode.setThreadPolicy(threadpolicy);
          goto _L6
        i /= 1024;
        ((BufferedReader) (obj1)).close();
        ((FileReader) (obj)).close();
        StrictMode.setThreadPolicy(threadpolicy);
        return i;
        throw exception;
          goto _L5
    }

    public static boolean isLowEndDevice()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        if (!CommandLine.c().a()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        a = Boolean.valueOf(flag);
_L2:
        return a.booleanValue();
_L4:
        if (!CommandLine.c().a())
        {
            Context context = ApplicationStatus.b();
            if (android.os.Build.VERSION.SDK_INT >= 19 && context != null)
            {
                if (((ActivityManager)context.getSystemService("activity")).isLowRamDevice())
                {
                    flag = true;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                Log.e("SysUtils", "ApplicationContext is null in ApplicationStatus");
            }
            int i = a();
            if (i > 0 && i <= 512)
            {
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
