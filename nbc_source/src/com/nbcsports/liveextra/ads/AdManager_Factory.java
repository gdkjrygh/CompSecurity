// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ads;

import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.ads:
//            AdManager

public final class AdManager_Factory extends Enum
    implements Factory
{

    private static final AdManager_Factory $VALUES[];
    public static final AdManager_Factory INSTANCE;

    private AdManager_Factory(String s, int i)
    {
        super(s, i);
    }

    public static Factory create()
    {
        return INSTANCE;
    }

    public static AdManager_Factory valueOf(String s)
    {
        return (AdManager_Factory)Enum.valueOf(com/nbcsports/liveextra/ads/AdManager_Factory, s);
    }

    public static AdManager_Factory[] values()
    {
        return (AdManager_Factory[])$VALUES.clone();
    }

    public AdManager get()
    {
        return new AdManager();
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new AdManager_Factory("INSTANCE", 0);
        $VALUES = (new AdManager_Factory[] {
            INSTANCE
        });
    }
}
