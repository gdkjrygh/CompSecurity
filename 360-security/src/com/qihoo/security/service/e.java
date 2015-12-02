// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.Context;
import com.qihoo.security.malware.db.a;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Calendar;
import java.util.List;

public class e
{

    private static boolean a = false;
    private static String b;
    private static long c = 0L;
    private static boolean d = false;
    private static boolean e = false;

    public static void a()
    {
        e = true;
    }

    public static void a(Context context, long l)
    {
        SharedPref.a(context, "sp_key_last_scan_time", l);
    }

    public static void a(Context context, String s)
    {
        boolean flag1 = true;
        context = com.qihoo.security.malware.db.a.a(context, s);
        boolean flag;
        if (context != null && context.size() > 0)
        {
            if (((MaliciousInfo)context.get(0)).riskClass <= 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        } else
        {
            a = false;
        }
        d = false;
        if (s.equals(b))
        {
            if (System.currentTimeMillis() - c < 3000L)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            d = flag;
        }
        b = null;
    }

    public static boolean a(Context context)
    {
        long l = SharedPref.b(context, "sp_key_last_scan_time", 0L);
        context = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        while (calendar.get(1) != context.get(1) || calendar.get(6) != context.get(6)) 
        {
            return true;
        }
        return false;
    }

    public static void b(Context context, String s)
    {
        b = s;
        c = System.currentTimeMillis();
    }

    public static boolean b()
    {
        if ((d || e) && a)
        {
            return false;
        } else
        {
            d = false;
            e = false;
            return true;
        }
    }

}
