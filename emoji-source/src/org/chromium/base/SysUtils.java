// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.chromium.base:
//            CommandLine

public class SysUtils
{

    static final boolean $assertionsDisabled;
    private static final int ANDROID_LOW_MEMORY_ANDROID_SDK_THRESHOLD = 18;
    private static final long ANDROID_LOW_MEMORY_DEVICE_THRESHOLD_MB = 512L;
    private static final String TAG = "SysUtils";
    private static Boolean sLowEndDevice;

    private SysUtils()
    {
    }

    private static int amountOfPhysicalMemoryKB()
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
            break MISSING_BLOCK_LABEL_161;
        }
        Log.w("SysUtils", (new StringBuilder()).append("Invalid /proc/meminfo total size in kB: ").append(((Matcher) (obj2)).group(1)).toString());
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
        ((BufferedReader) (obj1)).close();
        ((FileReader) (obj)).close();
        StrictMode.setThreadPolicy(threadpolicy);
        return i;
        throw exception;
          goto _L5
    }

    private static boolean detectLowEndDevice()
    {
        if (!$assertionsDisabled && !CommandLine.isInitialized())
        {
            throw new AssertionError();
        }
        if (!CommandLine.getInstance().hasSwitch("low-end-device-mode")) goto _L2; else goto _L1
_L1:
        int i = Integer.parseInt(CommandLine.getInstance().getSwitchValue("low-end-device-mode"));
        if (i != 1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if (i == 0)
        {
            return false;
        }
_L2:
        if (android.os.Build.VERSION.SDK_INT <= 18)
        {
            return false;
        }
        int j = amountOfPhysicalMemoryKB();
        if (j <= 0 || (long)(j / 1024) >= 512L)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static boolean isLowEndDevice()
    {
        if (sLowEndDevice == null)
        {
            sLowEndDevice = Boolean.valueOf(detectLowEndDevice());
        }
        return sLowEndDevice.booleanValue();
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
        $assertionsDisabled = flag;
    }
}
