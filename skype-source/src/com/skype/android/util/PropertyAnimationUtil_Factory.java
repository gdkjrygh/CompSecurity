// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import dagger.internal.Factory;

// Referenced classes of package com.skype.android.util:
//            PropertyAnimationUtil

public final class PropertyAnimationUtil_Factory extends Enum
    implements Factory
{

    private static final PropertyAnimationUtil_Factory $VALUES[];
    public static final PropertyAnimationUtil_Factory INSTANCE;

    private PropertyAnimationUtil_Factory(String s, int i)
    {
        super(s, i);
    }

    public static Factory create()
    {
        return INSTANCE;
    }

    public static PropertyAnimationUtil_Factory valueOf(String s)
    {
        return (PropertyAnimationUtil_Factory)Enum.valueOf(com/skype/android/util/PropertyAnimationUtil_Factory, s);
    }

    public static PropertyAnimationUtil_Factory[] values()
    {
        return (PropertyAnimationUtil_Factory[])$VALUES.clone();
    }

    public final PropertyAnimationUtil get()
    {
        return new PropertyAnimationUtil();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new PropertyAnimationUtil_Factory("INSTANCE", 0);
        $VALUES = (new PropertyAnimationUtil_Factory[] {
            INSTANCE
        });
    }
}
