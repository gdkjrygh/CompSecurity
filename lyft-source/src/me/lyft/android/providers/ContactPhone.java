// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.telephony.PhoneNumberUtils;
import me.lyft.android.infrastructure.lyft.invite.InvitePhoneNumber;
import me.lyft.android.ui.splitfare.SearchHelper;

public class ContactPhone
    implements Comparable
{

    public static final String PHONE_LABEL_HOME = "home";
    public static final String PHONE_LABEL_MOBILE = "mobile";
    public static final String PHONE_LABEL_OTHER = "other";
    public static final String PHONE_LABEL_WORK = "work";
    final String phoneNumber;
    final int phoneType;

    public ContactPhone(String s)
    {
        this(s, 0);
    }

    public ContactPhone(String s, int i)
    {
        phoneNumber = PhoneNumberUtils.formatNumber(SearchHelper.normalizeNumber(s));
        phoneType = i;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ContactPhone)obj);
    }

    public int compareTo(ContactPhone contactphone)
    {
        if (contactphone == null)
        {
            return -1;
        } else
        {
            return phoneNumber.compareToIgnoreCase(contactphone.phoneNumber);
        }
    }

    public InvitePhoneNumber create()
    {
        String s1 = getPhoneNumber();
        getPhoneType();
        JVM INSTR tableswitch 1 3: default 36
    //                   1 49
    //                   2 55
    //                   3 61;
           goto _L1 _L2 _L3 _L4
_L1:
        String s = "other";
_L6:
        return new InvitePhoneNumber(s1, s);
_L2:
        s = "home";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "mobile";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "work";
        if (true) goto _L6; else goto _L5
_L5:
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public int getPhoneType()
    {
        return phoneType;
    }
}
