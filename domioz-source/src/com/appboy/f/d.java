// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import a.a.fm;
import a.a.fn;
import com.appboy.f;

// Referenced classes of package com.appboy.f:
//            a

public final class d
{

    public static final fm a = (new fn()).c("appboy").a();
    public static final fm b = (new fn()).c("first_name").c("last_name").c("email").c("bio").c("gender").c("dob").c("country").c("home_city").c("email_subscribe").c("push_subscribe").c("phone").c("facebook").c("twitter").c("image_url").a();
    private static final String c;
    private static String d = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    private static String e = "^[0-9 .\\(\\)\\+\\-]+$";

    public d()
    {
    }

    public static boolean a(String s)
    {
        return s != null && s.toLowerCase().matches(d);
    }

    public static String b(String s)
    {
        String s1 = s.trim();
        s = s1;
        if (s1.length() > 255)
        {
            com.appboy.f.a.c(c, String.format("Provided string field is too long [%d]. The max length is %d, truncating provided field.", new Object[] {
                Integer.valueOf(s1.length()), Integer.valueOf(255)
            }));
            s = s1.substring(0, 255);
        }
        return s;
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            f.a, com/appboy/f/d.getName()
        });
    }
}
