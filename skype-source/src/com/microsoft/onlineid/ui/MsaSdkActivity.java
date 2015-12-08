// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import com.microsoft.onlineid.internal.a.f;
import com.microsoft.onlineid.internal.c.h;
import com.microsoft.onlineid.internal.ui.a;

public abstract class MsaSdkActivity extends Activity
{

    protected h a;

    public MsaSdkActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        com.microsoft.onlineid.internal.ui.a.a(this, getResources().getString(com.microsoft.onlineid.c.a.c.webflow_header));
        super.onCreate(bundle);
        a = new h(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        f.a();
        return super.onKeyDown(i, keyevent);
    }

    protected void onPause()
    {
        if (isFinishing() && (getIntent().getIntExtra("com.microsoft.msa.authenticator.authenticatorFlags", 0) & 1) == 1)
        {
            overridePendingTransition(0, 0);
        }
        super.onPause();
    }
}
