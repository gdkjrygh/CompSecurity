// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import android.os.Build;
import android.util.Log;

// Referenced classes of package com.a.c:
//            b

public final class d
{

    private static boolean a = false;
    private static boolean b = true;

    public static int a(int i)
    {
        switch (i)
        {
        case 0: // '\0'
        default:
            return 2;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 4;
        }
    }

    public static void a(String s, String s1)
    {
        if (b)
        {
            Log.e(s, s1);
        }
    }

    public static boolean a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 16 && (a("SM-G900H") || a("MI 3W") || a("HTC One") || a("H30-U10") || a("SD4930UR") || a("Nexus 5") || a("SM-N900") || a("GT-I9300") || a("MI 2S") || a("Nexus 10") || a("White list, ^_^")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String s)
    {
        String s1 = Build.MODEL;
        String s2 = Build.DEVICE;
        return s1.compareToIgnoreCase(s) == 0 || s2.compareToIgnoreCase(s) == 0;
    }

    public static int b(int i)
    {
        boolean flag = true;
        int j = 1;
        switch (i)
        {
        case 20: // '\024'
        default:
            j = 0;
            // fall through

        case 19: // '\023'
            return j;

        case 21: // '\025'
            break;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && a("HUAWEI U9508"))
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        return i == 0 ? 3 : 2;
    }

    public static int[] b()
    {
        return com.a.c.b.a();
    }

}
