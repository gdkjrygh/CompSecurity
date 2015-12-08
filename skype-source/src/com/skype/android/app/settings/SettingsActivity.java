// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Intent;
import android.os.Bundle;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.inject.LifecycleSupport;

public class SettingsActivity extends SkypeActivity
{

    ActionBarCustomizer actionBarCustomizer;

    public SettingsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        bundle = getIntent().getStringExtra("android.intent.extra.TITLE");
        if (bundle == null)
        {
            actionBarCustomizer.setTitleWithRecents(0x7f080272);
        } else
        {
            actionBarCustomizer.setTitleWithRecents(bundle);
        }
        bundle = getIntent().getExtras();
        if (bundle == null || bundle.get("fragmentClass") == null)
        {
            setContentView(0x7f030103);
        }
    }
}
