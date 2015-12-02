// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.base.c;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.phonenumbers.NumberParseException;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Locale;
import javax.inject.a;

public class fl
    implements c
{

    private static final Class a = com/facebook/orca/app/fl;
    private static final l b = new l();
    private final a c;

    public fl(a a1)
    {
        c = a1;
    }

    public void a()
    {
        try
        {
            PhoneNumberUtil phonenumberutil = (PhoneNumberUtil)c.b();
            com.facebook.phonenumbers.Phonenumber.PhoneNumber phonenumber = phonenumberutil.parse("2125551212", Locale.US.getCountry());
            phonenumberutil.format(phonenumber, com.facebook.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
            phonenumberutil.formatInOriginalFormat(phonenumber, Locale.getDefault().getCountry());
            return;
        }
        catch (NumberParseException numberparseexception)
        {
            com.facebook.debug.log.b.d(a, "Failed to initialize lib phonenumber", numberparseexception);
            return;
        }
        catch (Exception exception)
        {
            com.facebook.debug.log.b.a(b, a, "Failed to parse phonenumber", exception);
        }
    }

}
