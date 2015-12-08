// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.content.Context;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// Referenced classes of package com.aviary.android.feather.common.utils:
//            d

public class l
{

    private static HashMap a;
    private static int b = 0;
    private static double c = -1D;

    public l()
    {
    }

    public static float a()
    {
        float f1 = -1F;
        if (a == null)
        {
            g();
        }
        String s = b("BogoMIPS");
        if (s != null)
        {
            double d1;
            try
            {
                d1 = Double.parseDouble(s);
            }
            catch (NumberFormatException numberformatexception)
            {
                return -1F;
            }
            f1 = (float)d1;
        }
        return f1;
    }

    public static final void a(long l1)
    {
        try
        {
            Thread.sleep(l1);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    private static void a(String s)
    {
        s = new StringTokenizer(s, ":");
        do
        {
            if (!s.hasMoreTokens())
            {
                break;
            }
            String s1 = s.nextToken().trim();
            if (s.hasMoreTokens())
            {
                String s2 = s.nextToken().trim();
                a.put(s1, s2);
            }
        } while (true);
    }

    public static void a(double ad[])
    {
        double d1 = Double.valueOf(Runtime.getRuntime().totalMemory()).doubleValue() / 1048576D;
        double d2 = Double.valueOf(Runtime.getRuntime().maxMemory()).doubleValue() / 1048576D;
        ad[0] = d2 - d1;
        ad[1] = d1;
        ad[2] = d2;
    }

    public static boolean a(Context context)
    {
        return Thread.currentThread() == context.getMainLooper().getThread();
    }

    private static String b(String s)
    {
        return (String)a.get(s);
    }

    public static void b(Context context)
    {
        if (a(context))
        {
            throw new IllegalThreadStateException("Called from wrong thread!");
        } else
        {
            return;
        }
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT < 14;
    }

    public static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && android.os.Build.VERSION.SDK_INT < 16;
    }

    public static int d()
        throws Exception
    {
        if (b == 0)
        {
            b = com.aviary.android.feather.common.utils.d.a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
        }
        return b;
    }

    public static int e()
    {
        int i = 0;
        int j;
        try
        {
            j = d();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return 0;
        }
        if (j > 0)
        {
            i = j / 1000;
        }
        return i;
    }

    public static double f()
    {
        if (c < 0.0D)
        {
            double ad[] = new double[3];
            a(ad);
            c = ad[2];
        }
        return c;
    }

    private static void g()
    {
        a = new HashMap();
        Object obj;
        java.io.InputStream inputstream;
        BufferedReader bufferedreader;
        obj = (new ProcessBuilder(new String[] {
            "/system/bin/cat", "/proc/cpuinfo"
        })).start();
        inputstream = ((Process) (obj)).getInputStream();
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
_L1:
        String s = bufferedreader.readLine();
label0:
        {
            if (s == null)
            {
                break label0;
            }
            try
            {
                a(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                return;
            }
        }
          goto _L1
        ((Process) (obj)).destroy();
        com.aviary.android.feather.common.utils.d.a(inputstream);
        return;
    }

}
