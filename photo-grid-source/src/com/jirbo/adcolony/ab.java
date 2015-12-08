// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.jirbo.adcolony:
//            AdColony, a, l, ai, 
//            d, ADCStorage

class ab
{

    static byte a[] = new byte[1024];
    static StringBuilder b = new StringBuilder();

    ab()
    {
    }

    static String a()
    {
        String s;
        try
        {
            s = AdColony.activity().getPackageManager().getPackageInfo(AdColony.activity().getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            com.jirbo.adcolony.a.e("Failed to retrieve package info.");
            return "1.0";
        }
        return s;
    }

    static String a(double d1, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(d1, i, stringbuilder);
        return stringbuilder.toString();
    }

    static String a(String s, String s1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        FileInputStream fileinputstream;
        l.a.a("Loading ").b(s);
        fileinputstream = new FileInputStream(s);
        byte abyte0[] = a;
        abyte0;
        JVM INSTR monitorenter ;
        int i;
        b.setLength(0);
        b.append(s1);
        i = fileinputstream.read(a, 0, a.length);
          goto _L3
_L7:
        int j;
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        b.append((char)a[j]);
        j++;
        continue; /* Loop/switch isn't completed */
        i = fileinputstream.read(a, 0, a.length);
          goto _L3
_L5:
        fileinputstream.close();
        s1 = b.toString();
        abyte0;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        abyte0;
        JVM INSTR monitorexit ;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            l.d.a("Unable to load ").b(s);
        }
        return "";
_L2:
        return "";
_L3:
        if (i == -1) goto _L5; else goto _L4
_L4:
        j = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void a(double d1, int i, StringBuilder stringbuilder)
    {
        if (!Double.isNaN(d1) && !Double.isInfinite(d1)) goto _L2; else goto _L1
_L1:
        stringbuilder.append(d1);
_L4:
        return;
_L2:
        long l3;
        long l4;
        double d2 = d1;
        if (d1 < 0.0D)
        {
            d2 = -d1;
            stringbuilder.append('-');
        }
        if (i == 0)
        {
            stringbuilder.append(Math.round(d2));
            return;
        }
        l3 = (long)Math.pow(10D, i);
        long l1 = Math.round((double)l3 * d2);
        stringbuilder.append(l1 / l3);
        stringbuilder.append('.');
        l4 = l1 % l3;
        if (l4 != 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = 0;
        while (j < i) 
        {
            stringbuilder.append('0');
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        for (long l2 = l4 * 10L; l2 < l3; l2 *= 10L)
        {
            stringbuilder.append('0');
        }

        stringbuilder.append(l4);
        return;
    }

    static boolean a(String s)
    {
        try
        {
            AdColony.activity().getApplication().getPackageManager().getApplicationInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    static String b()
    {
        return UUID.randomUUID().toString();
    }

    static String b(String s)
    {
        try
        {
            s = ai.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    static double c()
    {
        return (double)System.currentTimeMillis() / 1000D;
    }

    static String c(String s)
    {
        return a(s, "");
    }

    static boolean d()
    {
        return (new File((new StringBuilder()).append(a.l.f.c()).append("/../lib/libImmEndpointWarpJ.so").toString())).exists();
    }

    static boolean e()
    {
        return com.jirbo.adcolony.a.b().checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
    }

    static String f()
    {
        return com.jirbo.adcolony.a.b().getPackageName();
    }

}
