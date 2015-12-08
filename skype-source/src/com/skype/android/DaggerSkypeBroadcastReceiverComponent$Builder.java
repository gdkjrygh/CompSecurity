// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;


// Referenced classes of package com.skype.android:
//            DaggerSkypeBroadcastReceiverComponent, SkypeApplicationComponent, SkypeBroadcastReceiverComponent

public static final class <init>
{

    private SkypeApplicationComponent a;

    static SkypeApplicationComponent a(<init> <init>1)
    {
        return <init>1.a;
    }

    public final a a(SkypeApplicationComponent skypeapplicationcomponent)
    {
        if (skypeapplicationcomponent == null)
        {
            throw new NullPointerException();
        } else
        {
            a = skypeapplicationcomponent;
            return this;
        }
    }

    public final SkypeBroadcastReceiverComponent a()
    {
        if (a == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
        } else
        {
            return new DaggerSkypeBroadcastReceiverComponent(this, null);
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
