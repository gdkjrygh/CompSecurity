// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import arp;
import java.io.Serializable;

// Referenced classes of package com.facebook:
//            Session

public class applicationId
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final String accessToken;
    final String applicationId;

    private Object writeReplace()
    {
        class SerializationProxyV1
            implements Serializable
        {

            private static final long serialVersionUID = 0xdd772aee317ab613L;
            private final String accessToken;
            private final String appId;

            private Object readResolve()
            {
                return new AppEventsLogger.AccessTokenAppIdPair(accessToken, appId);
            }

            private SerializationProxyV1(String s, String s1)
            {
                accessToken = s;
                appId = s1;
            }

            SerializationProxyV1(String s, String s1, byte byte0)
            {
                this(s, s1);
            }
        }

        return new SerializationProxyV1(accessToken, applicationId, (byte)0);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof applicationId)
        {
            if (arp.a(((applicationId) (obj = (applicationId)obj)).accessToken, accessToken) && arp.a(((accessToken) (obj)).applicationId, applicationId))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (accessToken == null)
        {
            i = 0;
        } else
        {
            i = accessToken.hashCode();
        }
        if (applicationId != null)
        {
            j = applicationId.hashCode();
        }
        return i ^ j;
    }

    SerializationProxyV1(Session session)
    {
        this(session.d(), session.applicationId);
    }

    <init>(String s, String s1)
    {
        String s2 = s;
        if (arp.a(s))
        {
            s2 = null;
        }
        accessToken = s2;
        applicationId = s1;
    }
}
