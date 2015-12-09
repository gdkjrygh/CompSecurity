// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import dxh;
import dxm;

public class LoginActivity extends dxh
{

    public LoginActivity()
    {
    }

    public static Intent a(Context context, Intent intent)
    {
        Intent intent1 = new Intent("com.spotify.mobile.android.service.action.session.LOGIN");
        intent1.setClass(context, com/spotify/mobile/android/service/LoginActivity);
        intent1.putExtra("intent", intent);
        return intent1;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030021);
        if (bundle == null)
        {
            bundle = dxm.H();
            getIntent();
            a(bundle);
        } else
        {
            bundle.setClassLoader(getClassLoader());
        }
        setVisible(false);
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
