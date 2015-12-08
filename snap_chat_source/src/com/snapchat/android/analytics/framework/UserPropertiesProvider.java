// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import AS;
import Bt;
import Cl;
import Pj;
import android.net.NetworkInfo;
import com.snapchat.android.model.FriendManager;
import gr;

public class UserPropertiesProvider
    implements BlizzardEventLogger.UserPropertiesInterface
{

    public UserPropertiesProvider()
    {
    }

    public final String a()
    {
        if (Bt.t())
        {
            return Bt.q();
        } else
        {
            return null;
        }
    }

    public final String b()
    {
        return Pj.a();
    }

    public final Long c()
    {
        FriendManager friendmanager = FriendManager.e();
        if (friendmanager.f())
        {
            return Long.valueOf(friendmanager.o());
        } else
        {
            return null;
        }
    }

    public final boolean d()
    {
        return AS.a().mTravelModeEnabled;
    }

    public final gr e()
    {
        NetworkInfo networkinfo = Cl.a().b();
        if (networkinfo == null || !networkinfo.isConnectedOrConnecting())
        {
            return gr.UNREACHABLE;
        }
        switch (networkinfo.getType())
        {
        default:
            return null;

        case 1: // '\001'
            return gr.WIFI;

        case 0: // '\0'
            return gr.MOBILE;
        }
    }
}
