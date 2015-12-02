// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtil;
import javax.inject.a;

// Referenced classes of package com.facebook.user:
//            i, UserPhoneNumber, UserKey, n

public class j
{

    final i a;
    private final String b;
    private final com.facebook.phonenumbers.Phonenumber.PhoneNumber c;

    public j(i k, String s)
    {
        a = k;
        super();
        b = s;
        c = a(s);
    }

    private com.facebook.phonenumbers.Phonenumber.PhoneNumber a(String s)
    {
        String s1 = (String)i.c(a).b();
        if (s != null)
        {
            try
            {
                s = com.facebook.user.i.a(a).parse(s, s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        } else
        {
            return null;
        }
    }

    public UserPhoneNumber a(int k)
    {
        return new UserPhoneNumber(c(), b(), k);
    }

    public boolean a()
    {
        return c != null;
    }

    public String b()
    {
        if (c == null)
        {
            return b;
        }
        if (!com.facebook.user.i.a(a).isValidNumber(c))
        {
            return b;
        } else
        {
            return com.facebook.user.i.a(a).format(c, com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
        }
    }

    public String c()
    {
        if (c == null)
        {
            return b;
        }
        Object obj = a((String)i.b(a).b());
        if (obj == null || ((com.facebook.phonenumbers.Phonenumber.PhoneNumber) (obj)).getCountryCode() != c.getCountryCode())
        {
            obj = com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;
        } else
        {
            obj = com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL;
        }
        return com.facebook.user.i.a(a).format(c, ((com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat) (obj))).replace(' ', '\240').replace('-', '\u2011');
    }

    public UserKey d()
    {
        return new UserKey(n.PHONE_NUMBER, b());
    }
}
