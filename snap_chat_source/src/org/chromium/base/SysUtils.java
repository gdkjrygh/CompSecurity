// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.chromium.base:
//            CommandLine, ApplicationStatus

public class SysUtils
{

    private static Boolean a;
    private static boolean b;

    private SysUtils()
    {
    }

    private static int a()
    {
        android.os.StrictMode.ThreadPolicy threadpolicy;
        Pattern pattern;
        pattern = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        threadpolicy = StrictMode.allowThreadDiskReads();
        FileReader filereader = new FileReader("/proc/meminfo");
        BufferedReader bufferedreader = new BufferedReader(filereader);
_L4:
        Object obj = bufferedreader.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = pattern.matcher(((CharSequence) (obj)));
        if (!((Matcher) (obj)).find()) goto _L4; else goto _L3
_L3:
        int i = Integer.parseInt(((Matcher) (obj)).group(1));
        if (i > 1024) goto _L6; else goto _L5
_L5:
        (new StringBuilder("Invalid /proc/meminfo total size in kB: ")).append(((Matcher) (obj)).group(1));
_L2:
        bufferedreader.close();
        filereader.close();
        StrictMode.setThreadPolicy(threadpolicy);
_L8:
        return 0;
_L6:
        i /= 1024;
        bufferedreader.close();
        filereader.close();
        StrictMode.setThreadPolicy(threadpolicy);
        return i;
        Exception exception3;
        exception3;
        bufferedreader.close();
        throw exception3;
        Exception exception2;
        exception2;
        Exception exception1;
        try
        {
            filereader.close();
            throw exception2;
        }
        catch (Exception exception)
        {
            StrictMode.setThreadPolicy(threadpolicy);
        }
        finally
        {
            StrictMode.setThreadPolicy(threadpolicy);
        }
        if (true) goto _L8; else goto _L7
_L7:
        throw exception1;
    }

    public static boolean isLowEndDevice()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        if (!b && !CommandLine.c())
        {
            throw new AssertionError();
        }
        if (!CommandLine.d().a()) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        a = Boolean.valueOf(flag);
_L2:
        return a.booleanValue();
_L4:
        if (!CommandLine.d().a())
        {
            Context context = ApplicationStatus.b();
            if (android.os.Build.VERSION.SDK_INT >= 19 && context != null && ((ActivityManager)context.getSystemService("activity")).isLowRamDevice())
            {
                flag = true;
                continue; /* Loop/switch isn't completed */
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

    static 
    {
        boolean flag;
        if (!org/chromium/base/SysUtils.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
