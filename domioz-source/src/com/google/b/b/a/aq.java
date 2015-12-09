// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class aq extends al
{

    aq()
    {
    }

    public final Object a(a a1)
    {
        int j = 0;
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        a1.c();
        int k = 0;
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        int k1 = 0;
        do
        {
            if (a1.f() == c.d)
            {
                break;
            }
            String s = a1.g();
            int i = a1.m();
            if ("year".equals(s))
            {
                k1 = i;
            } else
            if ("month".equals(s))
            {
                j1 = i;
            } else
            if ("dayOfMonth".equals(s))
            {
                i1 = i;
            } else
            if ("hourOfDay".equals(s))
            {
                l = i;
            } else
            if ("minute".equals(s))
            {
                k = i;
            } else
            if ("second".equals(s))
            {
                j = i;
            }
        } while (true);
        a1.d();
        return new GregorianCalendar(k1, j1, i1, l, k, j);
    }

    public final void a(d d1, Object obj)
    {
        obj = (Calendar)obj;
        if (obj == null)
        {
            d1.f();
            return;
        } else
        {
            d1.d();
            d1.a("year");
            d1.a(((Calendar) (obj)).get(1));
            d1.a("month");
            d1.a(((Calendar) (obj)).get(2));
            d1.a("dayOfMonth");
            d1.a(((Calendar) (obj)).get(5));
            d1.a("hourOfDay");
            d1.a(((Calendar) (obj)).get(11));
            d1.a("minute");
            d1.a(((Calendar) (obj)).get(12));
            d1.a("second");
            d1.a(((Calendar) (obj)).get(13));
            d1.e();
            return;
        }
    }
}
