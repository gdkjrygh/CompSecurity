// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.activities;

import android.app.Activity;
import com.appboy.ui.inappmessage.a;

public class AppboyBaseActivity extends Activity
{

    public AppboyBaseActivity()
    {
    }

    public void onPause()
    {
        super.onPause();
        a.a().b(this);
    }

    public void onResume()
    {
        super.onResume();
        a.a().a(this);
    }

    public void onStart()
    {
        super.onStart();
        com.appboy.a.a(this).a(this);
    }

    public void onStop()
    {
        super.onStop();
        com.appboy.a.a(this).b(this);
    }
}
