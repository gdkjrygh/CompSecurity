// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class LogoutActivity extends FragmentActivity
{

    public LogoutActivity()
    {
    }

    public static void start(Context context)
    {
        Intent intent = new Intent(context, com/soundcloud/android/accounts/LogoutActivity);
        intent.addFlags(0x40000000);
        intent.addFlags(0x800000);
        intent.addFlags(0x10000000);
        intent.addFlags(32768);
        context.startActivity(intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030076);
    }
}
