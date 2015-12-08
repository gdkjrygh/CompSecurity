// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ads;

import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.ads:
//            NbcAuditudeConfiguration

public final class NbcAuditudeConfiguration_Factory extends Enum
    implements Factory
{

    private static final NbcAuditudeConfiguration_Factory $VALUES[];
    public static final NbcAuditudeConfiguration_Factory INSTANCE;

    private NbcAuditudeConfiguration_Factory(String s, int i)
    {
        super(s, i);
    }

    public static Factory create()
    {
        return INSTANCE;
    }

    public static NbcAuditudeConfiguration_Factory valueOf(String s)
    {
        return (NbcAuditudeConfiguration_Factory)Enum.valueOf(com/nbcsports/liveextra/ads/NbcAuditudeConfiguration_Factory, s);
    }

    public static NbcAuditudeConfiguration_Factory[] values()
    {
        return (NbcAuditudeConfiguration_Factory[])$VALUES.clone();
    }

    public NbcAuditudeConfiguration get()
    {
        return new NbcAuditudeConfiguration();
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new NbcAuditudeConfiguration_Factory("INSTANCE", 0);
        $VALUES = (new NbcAuditudeConfiguration_Factory[] {
            INSTANCE
        });
    }
}
