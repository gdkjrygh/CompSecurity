// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.inject.ActivityModule;

// Referenced classes of package com.skype.android:
//            DaggerSkypeActivityComponent, SkypeApplicationComponent, SkypeActivityComponent

public static final class <init>
{

    private ActivityModule a;
    private SkypeApplicationComponent b;

    static ActivityModule a(<init> <init>1)
    {
        return <init>1.a;
    }

    static SkypeApplicationComponent b(a a1)
    {
        return a1.b;
    }

    public final b a(SkypeApplicationComponent skypeapplicationcomponent)
    {
        if (skypeapplicationcomponent == null)
        {
            throw new NullPointerException();
        } else
        {
            b = skypeapplicationcomponent;
            return this;
        }
    }

    public final b a(ActivityModule activitymodule)
    {
        a = activitymodule;
        return this;
    }

    public final SkypeActivityComponent a()
    {
        if (a == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/inject/ActivityModule.getCanonicalName()).append(" must be set").toString());
        }
        if (b == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
        } else
        {
            return new DaggerSkypeActivityComponent(this, null);
        }
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
