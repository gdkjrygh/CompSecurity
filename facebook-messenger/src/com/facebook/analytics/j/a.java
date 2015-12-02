// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.j;

import com.facebook.analytics.ak;
import com.facebook.analytics.al;
import com.facebook.analytics.b.c;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class a extends com.facebook.analytics.a
{

    private final String a = "total_request";
    private final String b = "unique_request";
    private final String c = "total_succeed";
    private final String d = "succeed_on_first_try";
    private final String e = "succeed_on_second_try";
    private final String f = "succeed_on_third_try";
    private final String g = "succeed_on_fourth_onward_try";
    private final String h = "ignored_request_due_to_cache_failure";
    private Map i;
    private final ak j;

    public a(ak ak1, c c1)
    {
        super(c1);
        j = ak1;
        i = Collections.synchronizedMap(new WeakHashMap());
    }

    private boolean f()
    {
        return j.a() == al.CORE_AND_SAMPLED;
    }

    protected String a()
    {
        return "web_request_counters";
    }

    public void b(String s)
    {
        if (!f())
        {
            return;
        }
        a("total_request", 1L);
        Integer integer = (Integer)i.get(s);
        if (integer != null)
        {
            i.put(s, Integer.valueOf(integer.intValue() + 1));
            return;
        } else
        {
            i.put(s, Integer.valueOf(1));
            a("unique_request", 1L);
            return;
        }
    }

    public void c(String s)
    {
        if (f())
        {
            a("total_succeed", 1L);
            s = (Integer)i.remove(s);
            if (s != null)
            {
                switch (s.intValue())
                {
                default:
                    a("succeed_on_fourth_onward_try", 1L);
                    return;

                case 1: // '\001'
                    a("succeed_on_first_try", 1L);
                    return;

                case 2: // '\002'
                    a("succeed_on_second_try", 1L);
                    return;

                case 3: // '\003'
                    a("succeed_on_third_try", 1L);
                    break;
                }
                return;
            }
        }
    }

    public void e()
    {
        if (!f())
        {
            return;
        } else
        {
            a("ignored_request_due_to_cache_failure", 1L);
            return;
        }
    }
}
