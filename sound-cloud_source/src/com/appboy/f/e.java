// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import bo.app.gr;
import bo.app.gs;
import com.appboy.d;
import java.util.Iterator;
import java.util.Set;

public final class e
{

    public static final gr a = (new gs()).c("appboy").a();
    public static final gr b = (new gs()).c("first_name").c("last_name").c("email").c("gender").c("dob").c("country").c("home_city").c("email_subscribe").c("push_subscribe").c("phone").c("facebook").c("twitter").c("image_url").a();
    private static final String c;
    private static String d = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    private static String e = "^[0-9 .\\(\\)\\+\\-]+$";

    public e()
    {
    }

    public static boolean a(String s)
    {
        return s != null && s.toLowerCase().matches(d);
    }

    public static boolean a(String s, Set set)
    {
        if (set.contains(s))
        {
            String.format("Custom attribute key cannot be blacklisted attribute: %s.", new Object[] {
                s
            });
            return true;
        } else
        {
            return false;
        }
    }

    public static String[] a(String as[])
    {
        if (as != null && as.length > 0)
        {
            for (int i = 0; i < as.length; i++)
            {
                as[i] = e(as[i]);
            }

        }
        return as;
    }

    public static boolean b(String s)
    {
        return s != null && s.matches(e);
    }

    public static boolean c(String s)
    {
        boolean flag;
        if (s == null)
        {
            return false;
        }
        String s1 = s.trim();
        bo.app.hw hw = a.a();
        String s2;
        do
        {
            if (!hw.hasNext())
            {
                break MISSING_BLOCK_LABEL_109;
            }
            s2 = (String)hw.next();
        } while (!s1.toLowerCase().startsWith(s2));
        String.format("'%s' contains a reserved prefix. Cannot use the given key.", new Object[] {
            s1
        });
        flag = true;
_L1:
        if (!flag)
        {
            s = s.trim();
            if (b.contains(s))
            {
                String.format("'%s' is a reserved attribute key. Cannot use the given key.", new Object[] {
                    s
                });
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return true;
            }
        }
        break MISSING_BLOCK_LABEL_121;
        flag = false;
          goto _L1
        return false;
    }

    public static boolean d(String s)
    {
        return s != null;
    }

    public static String e(String s)
    {
        String s1 = s.trim();
        s = s1;
        if (s1.length() > 255)
        {
            String.format("Provided string field is too long [%d]. The max length is %d, truncating provided field.", new Object[] {
                Integer.valueOf(s1.length()), Integer.valueOf(255)
            });
            s = s1.substring(0, 255);
        }
        return s;
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            d.a, com/appboy/f/e.getName()
        });
    }
}
