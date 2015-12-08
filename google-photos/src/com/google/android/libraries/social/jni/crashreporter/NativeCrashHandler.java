// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.jni.crashreporter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import ndw;

// Referenced classes of package com.google.android.libraries.social.jni.crashreporter:
//            NativeCrashReporterActivity

public final class NativeCrashHandler
{

    private static Context a;
    private static Intent b;
    private static Runnable c;
    private static String d;
    private static HashMap e;
    private static final String f[] = {
        "android.graphics"
    };
    private static boolean g;

    private static void a()
    {
        com/google/android/libraries/social/jni/crashreporter/NativeCrashHandler;
        JVM INSTR monitorenter ;
        System.loadLibrary("crashreporterer");
_L1:
        if (!g)
        {
            setup();
        }
        g = true;
        com/google/android/libraries/social/jni/crashreporter/NativeCrashHandler;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        if (!Build.CPU_ABI.equals("armeabi-v7a"))
        {
            break MISSING_BLOCK_LABEL_51;
        }
        System.loadLibrary("crashreporterer-armeabi-v7a");
          goto _L1
        obj;
        throw obj;
label0:
        {
            if (!Build.CPU_ABI.equals("arm64-v8a"))
            {
                break label0;
            }
            System.loadLibrary("crashreporterer-arm64-v8a");
        }
          goto _L1
label1:
        {
            if (!Build.CPU_ABI.equals("x86"))
            {
                break label1;
            }
            System.loadLibrary("crashreporterer-x86");
        }
          goto _L1
label2:
        {
            if (!Build.CPU_ABI.equals("mips"))
            {
                break label2;
            }
            System.loadLibrary("crashreporterer-mips");
        }
          goto _L1
        throw obj;
    }

    public static void a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            a();
            a = context.getApplicationContext();
            context = new Intent(a, com/google/android/libraries/social/jni/crashreporter/NativeCrashReporterActivity);
            b = context;
            context.setFlags(0x10000000);
            c = null;
            e = null;
        }
    }

    private static boolean a(ndw ndw1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        ndw1 = ndw1.getStackTrace();
        flag = flag1;
        if (ndw1 == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L10:
        flag = flag1;
        if (i >= ndw1.length) goto _L2; else goto _L3
_L3:
        String s = ndw1[i].getClassName();
        if (s == null) goto _L5; else goto _L4
_L4:
        int j = 0;
_L8:
        if (j >= f.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s.contains(f[j])) goto _L7; else goto _L6
_L6:
        flag = true;
_L2:
        return flag;
_L7:
        j++;
        if (true) goto _L8; else goto _L5
_L5:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private static void reportCrash(int i, int j, long l)
    {
        String s = String.valueOf(Long.toHexString(l));
        s = (new StringBuilder(String.valueOf(s).length() + 62)).append("Native crash signal: ").append(i).append(" code: ").append(j).append(" address: 0x").append(s).toString();
        ndw ndw1 = new ndw(s);
        Log.e("NativeCrashHandler", s, ndw1);
        if (a(ndw1))
        {
            b.putExtra("knownCrash", true);
        }
        if (c != null)
        {
            c.run();
        }
        if (d != null)
        {
            b.putExtra("runnableName", d);
        }
        if (e != null)
        {
            b.putExtra("runnableArgs", e);
        }
        b.putExtra("description", s);
        a.startActivity(b);
    }

    private static native void setup();

}
