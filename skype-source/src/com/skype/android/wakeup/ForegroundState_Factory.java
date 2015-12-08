// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import dagger.internal.Factory;

// Referenced classes of package com.skype.android.wakeup:
//            ForegroundState

public final class ForegroundState_Factory extends Enum
    implements Factory
{

    private static final ForegroundState_Factory $VALUES[];
    public static final ForegroundState_Factory INSTANCE;

    private ForegroundState_Factory(String s, int i)
    {
        super(s, i);
    }

    public static Factory create()
    {
        return INSTANCE;
    }

    public static ForegroundState_Factory valueOf(String s)
    {
        return (ForegroundState_Factory)Enum.valueOf(com/skype/android/wakeup/ForegroundState_Factory, s);
    }

    public static ForegroundState_Factory[] values()
    {
        return (ForegroundState_Factory[])$VALUES.clone();
    }

    public final ForegroundState get()
    {
        return new ForegroundState();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new ForegroundState_Factory("INSTANCE", 0);
        $VALUES = (new ForegroundState_Factory[] {
            INSTANCE
        });
    }
}
