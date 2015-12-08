// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.inject.ActivityModule;

// Referenced classes of package com.skype.android.app.chat.picker:
//            DaggerMojiPreviewContentViewComponent, MojiPreviewContentViewComponent

public static final class <init>
{

    private SkypeApplicationComponent skypeApplicationComponent;

    public final <init> activityModule(ActivityModule activitymodule)
    {
        if (activitymodule == null)
        {
            throw new NullPointerException();
        } else
        {
            return this;
        }
    }

    public final MojiPreviewContentViewComponent build()
    {
        if (skypeApplicationComponent == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
        } else
        {
            return new DaggerMojiPreviewContentViewComponent(this, null);
        }
    }

    public final skypeApplicationComponent skypeApplicationComponent(SkypeApplicationComponent skypeapplicationcomponent)
    {
        if (skypeapplicationcomponent == null)
        {
            throw new NullPointerException();
        } else
        {
            skypeApplicationComponent = skypeapplicationcomponent;
            return this;
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
