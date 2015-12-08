// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.inject.ApplicationModule;

// Referenced classes of package com.skype.android:
//            DaggerSkypeApplicationComponent, SkypeModule, SkypeApplicationComponent

public static final class <init>
{

    private ApplicationModule a;
    private SkypeModule b;

    static ApplicationModule a(<init> <init>1)
    {
        return <init>1.a;
    }

    static SkypeModule b(a a1)
    {
        return a1.b;
    }

    public final b a(SkypeModule skypemodule)
    {
        b = skypemodule;
        return this;
    }

    public final b a(ApplicationModule applicationmodule)
    {
        a = applicationmodule;
        return this;
    }

    public final SkypeApplicationComponent a()
    {
        if (a == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/inject/ApplicationModule.getCanonicalName()).append(" must be set").toString());
        }
        if (b == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeModule.getCanonicalName()).append(" must be set").toString());
        } else
        {
            return new DaggerSkypeApplicationComponent(this, null);
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
