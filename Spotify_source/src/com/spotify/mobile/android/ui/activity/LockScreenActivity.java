// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.mobile.android.util.LockScreenController;
import u;

public class LockScreenActivity extends u
{

    private ImageView d;
    private ViewGroup e;
    private ViewGroup f;

    public LockScreenActivity()
    {
    }

    private void f()
    {
        setContentView(0x7f030024);
        d = (ImageView)findViewById(0x7f1102b6);
        e = (ViewGroup)findViewById(0x7f1102b7);
        f = (ViewGroup)findViewById(0x7f1102b5);
        int i = getIntent().getIntExtra("logo_resource_id", -1);
        boolean flag = getIntent().getBooleanExtra("dismissible_lockscreen", false);
        if (i == -1)
        {
            d.setVisibility(8);
            f.setVisibility(8);
        } else
        {
            d.setImageResource(i);
            d.setVisibility(0);
            f.setVisibility(0);
        }
        if (flag)
        {
            e.setVisibility(0);
            return;
        } else
        {
            e.setVisibility(8);
            return;
        }
    }

    public void dismiss(View view)
    {
        LockScreenController.a(this, "lockscreen dismiss button");
    }

    public void onBackPressed()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        FontSupport.a(this);
        super.onCreate(bundle);
        f();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        f();
    }
}
