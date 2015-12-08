// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.authenticator;

import android.os.Bundle;
import android.view.View;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.ui.ProgressView;
import com.microsoft.onlineid.ui.MsaSdkActivity;

public class AccountAddPendingActivity extends MsaSdkActivity
{

    public AccountAddPendingActivity()
    {
    }

    public void onBackPressed()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        setContentView(com.microsoft.onlineid.c.a.b.static_page);
        super.onCreate(bundle);
        bundle = (ProgressView)findViewById(com.microsoft.onlineid.c.a.a.progressView);
        bundle.setVisibility(0);
        bundle.a();
        findViewById(com.microsoft.onlineid.c.a.a.static_page_header).setVisibility(8);
        findViewById(com.microsoft.onlineid.c.a.a.static_page_body_first).setVisibility(8);
        findViewById(com.microsoft.onlineid.c.a.a.static_page_body_second).setVisibility(8);
    }

    protected void onStart()
    {
        super.onStart();
        a.a().a("Account add pending screen");
    }
}
