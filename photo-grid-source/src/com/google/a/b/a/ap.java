// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class ap extends am
{

    ap()
    {
    }

    public final Object a(a a1)
    {
        int j = 0;
        if (a1.f() == e.i)
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
            if (a1.f() == e.d)
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

    public final void a(f f1, Object obj)
    {
        obj = (Calendar)obj;
        if (obj == null)
        {
            f1.f();
            return;
        } else
        {
            f1.d();
            f1.a("year");
            f1.a(((Calendar) (obj)).get(1));
            f1.a("month");
            f1.a(((Calendar) (obj)).get(2));
            f1.a("dayOfMonth");
            f1.a(((Calendar) (obj)).get(5));
            f1.a("hourOfDay");
            f1.a(((Calendar) (obj)).get(11));
            f1.a("minute");
            f1.a(((Calendar) (obj)).get(12));
            f1.a("second");
            f1.a(((Calendar) (obj)).get(13));
            f1.e();
            return;
        }
    }
}
