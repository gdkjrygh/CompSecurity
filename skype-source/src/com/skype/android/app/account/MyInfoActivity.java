// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.os.Bundle;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.inject.LifecycleSupport;

public class MyInfoActivity extends SkypeActivity
{

    ActionBarCustomizer actionBarCustomizer;

    public MyInfoActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        if (getSupportActionBar() != null)
        {
            actionBarCustomizer.setTitleWithRecents(0x7f0802d5);
        }
        setTitle(0x7f080089);
    }
}
