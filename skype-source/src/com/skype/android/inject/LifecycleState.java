// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;


public final class LifecycleState extends Enum
{

    private static final LifecycleState $VALUES[];
    public static final LifecycleState CREATED;
    public static final LifecycleState RESUMED;
    public static final LifecycleState STARTED;

    private LifecycleState(String s, int i)
    {
        super(s, i);
    }

    public static LifecycleState valueOf(String s)
    {
        return (LifecycleState)Enum.valueOf(com/skype/android/inject/LifecycleState, s);
    }

    public static LifecycleState[] values()
    {
        return (LifecycleState[])$VALUES.clone();
    }

    static 
    {
        RESUMED = new LifecycleState("RESUMED", 0);
        STARTED = new LifecycleState("STARTED", 1);
        CREATED = new LifecycleState("CREATED", 2);
        $VALUES = (new LifecycleState[] {
            RESUMED, STARTED, CREATED
        });
    }
}
