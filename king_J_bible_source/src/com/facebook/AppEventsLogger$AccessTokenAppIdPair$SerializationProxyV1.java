// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;

// Referenced classes of package com.facebook:
//            AppEventsLogger

private static class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0xdd772aee317ab613L;
    private final String accessToken;
    private final String appId;

    private Object readResolve()
    {
        return new <init>(accessToken, appId);
    }

    private (String s, String s1)
    {
        accessToken = s;
        appId = s1;
    }

    appId(String s, String s1, appId appid)
    {
        this(s, s1);
    }
}
