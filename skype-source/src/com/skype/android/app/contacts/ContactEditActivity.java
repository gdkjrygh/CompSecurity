// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.os.Bundle;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.inject.LifecycleSupport;

public class ContactEditActivity extends SkypeActivity
{

    ActionBarCustomizer actionBarCustomizer;
    LayoutExperience layoutExperience;

    public ContactEditActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        getIntent().putExtra("editMode", true);
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        if (layoutExperience.isMultipane())
        {
            actionBarCustomizer.setTitle(0x7f080245);
            return;
        } else
        {
            actionBarCustomizer.setTitleWithRecents(0x7f080245);
            return;
        }
    }
}
