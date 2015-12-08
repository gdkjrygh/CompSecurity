// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.os.Bundle;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.inject.LifecycleSupport;

public class PickerActivity extends SkypeActivity
{

    ActionBarCustomizer actionBarCustomizer;

    public PickerActivity()
    {
    }

    public ActionBarCustomizer getActionBarCustomizer()
    {
        return actionBarCustomizer;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
    }
}
