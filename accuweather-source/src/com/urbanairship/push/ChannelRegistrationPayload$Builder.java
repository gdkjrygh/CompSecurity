// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import java.util.Set;

// Referenced classes of package com.urbanairship.push:
//            ChannelRegistrationPayload

static class 
{

    private String alias;
    private String apid;
    private boolean backgroundEnabled;
    private String deviceId;
    private String deviceType;
    private boolean optIn;
    private String pushAddress;
    private boolean setTags;
    private Set tags;
    private String userId;

    ChannelRegistrationPayload build()
    {
        return new ChannelRegistrationPayload(this, null);
    }

     setAlias(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s.trim();
        }
        alias = s1;
        return this;
    }

    alias setApid(String s)
    {
        apid = s;
        return this;
    }

    apid setBackgroundEnabled(boolean flag)
    {
        backgroundEnabled = flag;
        return this;
    }

    backgroundEnabled setDeviceId(String s)
    {
        deviceId = s;
        return this;
    }

    deviceId setDeviceType(String s)
    {
        deviceType = s;
        return this;
    }

    deviceType setOptIn(boolean flag)
    {
        optIn = flag;
        return this;
    }

    optIn setPushAddress(String s)
    {
        pushAddress = s;
        return this;
    }

    pushAddress setTags(boolean flag, Set set)
    {
        setTags = flag;
        tags = set;
        return this;
    }

    tags setUserId(String s)
    {
        userId = s;
        return this;
    }











    ()
    {
    }
}
