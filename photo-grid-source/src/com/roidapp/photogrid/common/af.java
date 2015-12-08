// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import com.google.android.gms.analytics.f;
import com.google.android.gms.analytics.h;
import com.google.android.gms.analytics.j;
import com.google.android.gms.analytics.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class af
{

    private static af c = null;
    private l a;
    private f b;

    private af()
    {
    }

    public static void a(Context context, String s)
    {
        a("UA-39415669-1", context, s);
        if (s.equalsIgnoreCase("OpenPG"))
        {
            a("UA-39415669-17", context, s);
        }
    }

    public static void a(Context context, String s, String s1, String s2, Long long1)
    {
        a("UA-39415669-4", context, s, s1, s2, long1);
    }

    public static void a(Context context, String s, String s1, String s2, Long long1, Map map)
    {
        a("UA-39415669-24", context, s, s1, s2, long1, map);
    }

    private static void a(String s, Context context, String s1)
    {
        af af1;
        af1 = b();
        if (af1 == null || !a())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        context = af1.e(context, s);
        context.a(s1);
        context.a((new j()).a());
        (new StringBuilder("trackid=")).append(s).append(",view=").append(s1);
        return;
        s;
        s.printStackTrace();
        return;
        s;
        s.printStackTrace();
        return;
        s;
        s.printStackTrace();
        return;
    }

    private static void a(String s, Context context, String s1, String s2, String s3, Long long1)
    {
        a(s, context, s1, s2, s3, long1, null);
    }

    private static void a(String s, Context context, String s1, String s2, String s3, Long long1, Map map)
    {
        Object obj = b();
        if (obj == null || !a()) goto _L2; else goto _L1
_L1:
        context = ((af) (obj)).e(context, s);
        obj = new h(s1, s2);
        ((h) (obj)).a("&el", s3);
        ((h) (obj)).a("&ev", Long.toString(long1.longValue()));
        if (map == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ((h) (obj)).a(((Integer)obj1).intValue(), String.valueOf(obj2)))
        {
            obj2 = (java.util.Map.Entry)iterator.next();
            obj1 = ((java.util.Map.Entry) (obj2)).getKey();
            obj2 = ((java.util.Map.Entry) (obj2)).getValue();
        }

          goto _L4
_L2:
        return;
_L4:
        context.a(((h) (obj)).a());
        if (map == null) goto _L6; else goto _L5
_L5:
        try
        {
            (new StringBuilder("trackid=")).append(s).append(",category =").append(s1).append(",action=").append(s2).append(",label=").append(s3).append(",value=").append(long1).append(",params=").append(map.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
        (new StringBuilder("trackid=")).append(s).append(",category=").append(s1).append(",action=").append(s2).append(",label=").append(s3).append(",value=").append(long1);
        return;
    }

    private static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 5;
    }

    private static af b()
    {
        if (c == null)
        {
            c = new af();
        }
        return c;
    }

    public static void b(Context context, String s)
    {
        a("UA-39415669-4", context, s);
    }

    public static void b(Context context, String s, String s1, String s2, Long long1)
    {
        a("UA-39415669-24", context, s, s1, s2, long1);
    }

    public static void c(Context context, String s)
    {
        a("UA-39415669-13", context, s);
    }

    public static void d(Context context, String s)
    {
        a("UA-39415669-24", context, s);
    }

    private l e(Context context, String s)
    {
        b = f.a(context);
        a = b.a(s);
        if (!s.equals("UA-39415669-4") && !s.equals("UA-39415669-17") && !s.equals("UA-39415669-24")) goto _L2; else goto _L1
_L1:
        a.a(5D);
_L4:
        return a;
_L2:
        if (s.equals("UA-39415669-13"))
        {
            a.a(1.0D);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
