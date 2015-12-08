// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.inject.ActivityModule;

// Referenced classes of package com.skype.android.app.contacts:
//            DaggerConversationLoaderComponent, ConversationLoaderComponent

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

    public final ConversationLoaderComponent build()
    {
        if (skypeApplicationComponent == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
        } else
        {
            return new DaggerConversationLoaderComponent(this, null);
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
