// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.func.process;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.picksinit.PicksMob;
import java.lang.reflect.Method;

// Referenced classes of package com.cleanmaster.func.process:
//            IPhoneMemoryInfo, PhoneMemoryInfo, c

public class b
{

    private static long a = -1L;
    private static Method b = null;
    private static Method c = null;
    private static boolean d = false;

    public static long a()
    {
        if (a > 1L)
        {
            return a;
        } else
        {
            long l = b().a();
            a = l;
            return l;
        }
    }

    public static Intent a(String s)
    {
        PackageManager packagemanager = PicksMob.getInstance().getContext().getPackageManager();
        try
        {
            s = packagemanager.getLaunchIntentForPackage(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static IPhoneMemoryInfo b()
    {
        PhoneMemoryInfo phonememoryinfo = new PhoneMemoryInfo(com.cleanmaster.func.process.c.a(), com.cleanmaster.func.process.c.b());
        if (a < phonememoryinfo.a() && 0L < phonememoryinfo.a())
        {
            a = phonememoryinfo.a();
        }
        return phonememoryinfo;
    }

}
