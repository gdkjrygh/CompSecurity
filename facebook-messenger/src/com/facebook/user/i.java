// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import com.facebook.phonenumbers.PhoneNumberUtil;
import javax.inject.a;

// Referenced classes of package com.facebook.user:
//            j, UserPhoneNumber, UserKey

public class i
{

    private final PhoneNumberUtil a;
    private final a b;
    private final a c;

    public i(PhoneNumberUtil phonenumberutil, a a1, a a2)
    {
        a = phonenumberutil;
        b = a1;
        c = a2;
    }

    static PhoneNumberUtil a(i k)
    {
        return k.a;
    }

    static a b(i k)
    {
        return k.c;
    }

    static a c(i k)
    {
        return k.b;
    }

    public static String e(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.replaceAll("\\d", "X");
        }
    }

    public UserPhoneNumber a(String s, int k)
    {
        return (new j(this, s)).a(k);
    }

    public j a(String s)
    {
        return new j(this, s);
    }

    public String b(String s)
    {
        return (new j(this, s)).b();
    }

    public String c(String s)
    {
        return (new j(this, s)).c();
    }

    public UserKey d(String s)
    {
        return (new j(this, s)).d();
    }
}
