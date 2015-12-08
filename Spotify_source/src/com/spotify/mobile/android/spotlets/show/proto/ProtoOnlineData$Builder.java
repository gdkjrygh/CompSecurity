// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoOnlineData

public final class owers extends gxc
{

    public Integer num_followers;

    public final ProtoOnlineData build()
    {
        return new ProtoOnlineData(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build num_followers(Integer integer)
    {
        num_followers = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoOnlineData protoonlinedata)
    {
        super(protoonlinedata);
        if (protoonlinedata == null)
        {
            return;
        } else
        {
            num_followers = protoonlinedata.num_followers;
            return;
        }
    }
}
