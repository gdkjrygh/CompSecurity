// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.connect;

import com.spotify.mobile.android.service.ConnectDevice;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public final class Tech extends Enum
{

    public static final Tech a;
    public static final Tech b;
    private static final Tech c[];

    private Tech(String s, int i)
    {
        super(s, i);
    }

    public static Tech a(ConnectDevice connectdevice)
    {
        if (connectdevice == null)
        {
            return a;
        }
        boolean flag;
        if (connectdevice.l == com.spotify.mobile.android.service.ConnectDevice.DeviceType.k || connectdevice.l == com.spotify.mobile.android.service.ConnectDevice.DeviceType.l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return b;
        } else
        {
            return a;
        }
    }

    public static EnumSet a(List list)
    {
        EnumSet enumset = EnumSet.noneOf(com/spotify/mobile/android/spotlets/connect/Tech);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ConnectDevice connectdevice = (ConnectDevice)list.next();
            if (!connectdevice.f)
            {
                enumset.add(a(connectdevice));
            }
        } while (true);
        return enumset;
    }

    public static Tech valueOf(String s)
    {
        return (Tech)Enum.valueOf(com/spotify/mobile/android/spotlets/connect/Tech, s);
    }

    public static Tech[] values()
    {
        return (Tech[])c.clone();
    }

    static 
    {
        a = new Tech("CONNECT", 0);
        b = new Tech("CAST", 1);
        c = (new Tech[] {
            a, b
        });
    }
}
