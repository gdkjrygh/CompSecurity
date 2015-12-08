// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.model.Friend;

public class wR
{

    private final boolean a = IP.c(((TelephonyManager)SnapchatApplication.get().getSystemService("phone")).getNetworkCountryIso(), "US");

    public wR()
    {
    }

    public String a(Friend friend)
    {
        return friend.c();
    }

    public String a(Friend friend, boolean flag)
    {
        if (friend.f())
        {
            return friend.g();
        } else
        {
            return "";
        }
    }

    protected final String b(Friend friend)
    {
        String s = friend.mPhoneNumber;
        friend = s;
        if (a)
        {
            friend = android.text.Editable.Factory.getInstance().newEditable(s);
            PhoneNumberUtils.formatNanpNumber(friend);
            friend = friend.toString();
        }
        return IC.a(null, 0x7f0800da, new Object[] {
            friend
        });
    }
}
