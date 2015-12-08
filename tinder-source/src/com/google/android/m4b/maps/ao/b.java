// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ao;

import android.os.Build;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.ao:
//            a

public final class b
{

    public static boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    private static final String e[];
    private static final String f[];
    private static final String g[];
    private static final String h[];
    private static final String i[];
    private static final String j[];
    private static final String k[];
    private static final String l[];
    private static final String m[];
    private static final String n[];
    private static boolean o;
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private static boolean s;
    private static volatile String t;
    private static boolean u;

    public static void a(String s1)
    {
        t = s1;
    }

    public static void a(boolean flag)
    {
        u = flag;
    }

    static 
    {
        boolean flag;
        boolean flag1 = true;
        e = (new String[] {
            "SOJU", "SOJUA", "SOJUK", "SOJU_L10N", "GT-I9000", "GT-I9000B", "GT-I9000M", "GT-I9000T", "SC-02B", "SGH-T959", 
            "SGH-T959D", "SGH-T959V", "VIBRANT T959", "SHW-M110S", "SCH-I400", "SGH-I897", "SGH-I896"
        });
        f = (new String[] {
            "RTGB", "SHADOW_VZW", "DAYTONA"
        });
        g = (new String[] {
            "SHADOW_VZW", "DAYTONA", "SPYDER_VZW"
        });
        h = (new String[] {
            "SHADOW", "DAYTONA", "SPYDER"
        });
        i = (new String[] {
            "HTC_VISION"
        });
        j = (new String[] {
            "HTC_MARVEL", "HTC_MARVELC", "MARVELC"
        });
        k = (new String[] {
            "PASSION", "PASSION_KT", "PASSION_VF"
        });
        l = (new String[] {
            "HTC_PYRAMID", "HTC_VIGOR"
        });
        m = (new String[] {
            "SONY ERICSSON"
        });
        n = (new String[] {
            "TG03", "F11EIF"
        });
        String s1;
        String s2;
        String s3;
        if (Build.PRODUCT == null)
        {
            s1 = "";
        } else
        {
            s1 = Build.PRODUCT.toUpperCase();
        }
        if (Build.BOARD == null)
        {
            s2 = "";
        } else
        {
            s2 = Build.BOARD.toUpperCase();
        }
        if (Build.MANUFACTURER == null)
        {
            s3 = "";
        } else
        {
            s3 = Build.MANUFACTURER.toUpperCase();
        }
        if (Arrays.asList(e).contains(s1) && !com.google.android.m4b.maps.ao.a.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        o = Arrays.asList(i).contains(s1);
        b = Arrays.asList(f).contains(s1);
        if (android.os.Build.VERSION.SDK_INT != 10) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (Arrays.asList(g).contains(s1)) goto _L4; else goto _L3
_L3:
        if (!Arrays.asList(h).contains(s2)) goto _L2; else goto _L5
_L5:
        flag = flag1;
_L4:
        p = flag;
        q = Arrays.asList(m).contains(s3);
        c = Arrays.asList(j).contains(s1);
        d = Arrays.asList(k).contains(s1);
        r = Arrays.asList(l).contains(s1);
        s = Arrays.asList(n).contains(s1);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }
}
