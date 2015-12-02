// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.config.a.d;
import javax.inject.a;

public class i
    implements a
{

    private final com.facebook.config.a.a a;
    private final Context b;

    public i(com.facebook.config.a.a a1, Context context)
    {
        a = a1;
        b = context;
    }

    private boolean a(String s)
    {
        return b.checkCallingOrSelfPermission(s) == 0;
    }

    public Boolean a()
    {
        boolean flag;
        if (a.i() == d.MESSENGER && a("android.permission.RECEIVE_SMS") && a("android.permission.READ_SMS") && a("android.permission.WRITE_SMS") && a("android.permission.SEND_SMS") && a("android.permission.RECEIVE_MMS") && a("android.permission.CHANGE_NETWORK_STATE") && b.getPackageManager().hasSystemFeature("android.hardware.telephony"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }
}
