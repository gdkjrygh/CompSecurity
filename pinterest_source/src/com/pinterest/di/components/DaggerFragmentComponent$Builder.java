// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.di.components;


// Referenced classes of package com.pinterest.di.components:
//            DaggerFragmentComponent, ActivityComponent, FragmentComponent

public final class <init>
{

    private ActivityComponent a;

    static ActivityComponent a(<init> <init>1)
    {
        return <init>1.a;
    }

    public final a a(ActivityComponent activitycomponent)
    {
        if (activitycomponent == null)
        {
            throw new NullPointerException("activityComponent");
        } else
        {
            a = activitycomponent;
            return this;
        }
    }

    public final FragmentComponent a()
    {
        if (a == null)
        {
            throw new IllegalStateException("activityComponent must be set");
        } else
        {
            return new DaggerFragmentComponent(this, (byte)0);
        }
    }

    private A()
    {
    }

    A(byte byte0)
    {
        this();
    }
}
