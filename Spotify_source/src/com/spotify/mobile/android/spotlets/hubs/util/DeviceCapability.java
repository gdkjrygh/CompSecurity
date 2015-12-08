// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.hubs.util;

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import ctw;
import dmz;
import gcl;
import gkj;
import java.util.HashSet;
import java.util.Set;

public abstract class DeviceCapability extends Enum
{

    private static DeviceCapability a;
    private static DeviceCapability b;
    private static final ctw c = ctw.a(',');
    private static final DeviceCapability d[];
    private final String mCapabilityString;

    private DeviceCapability(String s, int i, String s1)
    {
        super(s, i);
        mCapabilityString = s1;
    }

    DeviceCapability(String s, int i, String s1, byte byte0)
    {
        this(s, i, s1);
    }

    static gkj a()
    {
        return (gkj)dmz.a(com/spotify/mobile/android/spotlets/hubs/util/DeviceCapability, gkj);
    }

    public static String b(Flags flags)
    {
        ctw ctw1 = c;
        HashSet hashset = new HashSet();
        DeviceCapability adevicecapability[] = values();
        int j = adevicecapability.length;
        for (int i = 0; i < j; i++)
        {
            DeviceCapability devicecapability = adevicecapability[i];
            if (devicecapability.a(flags))
            {
                hashset.add(devicecapability);
            }
        }

        return ctw1.a(hashset);
    }

    public static DeviceCapability valueOf(String s)
    {
        return (DeviceCapability)Enum.valueOf(com/spotify/mobile/android/spotlets/hubs/util/DeviceCapability, s);
    }

    public static DeviceCapability[] values()
    {
        return (DeviceCapability[])d.clone();
    }

    abstract boolean a(Flags flags);

    public String toString()
    {
        return mCapabilityString;
    }

    static 
    {
        a = new DeviceCapability("VIDEO", "video") {

            final boolean a(Flags flags)
            {
                DeviceCapability.a();
                return gkj.a(flags);
            }

        };
        b = new DeviceCapability("VIDEO_DRM", "video-drm") {

            final boolean a(Flags flags)
            {
                DeviceCapability.a();
                return gkj.a(flags) && gcl.h;
            }

        };
        d = (new DeviceCapability[] {
            a, b
        });
        dmz.a(com/spotify/mobile/android/spotlets/hubs/util/DeviceCapability, gkj, new gkj());
    }
}
