// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.a;

import android.telephony.TelephonyManager;

public class a
    implements javax.inject.a
{

    private final TelephonyManager a;

    public a(TelephonyManager telephonymanager)
    {
        a = telephonymanager;
    }

    public String a()
    {
        return a.getLine1Number();
    }

    public Object b()
    {
        return a();
    }
}
