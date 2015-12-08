// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.Utility;
import java.io.Serializable;

// Referenced classes of package com.facebook:
//            AppEventsLogger, Session

private static class applicationId
    implements Serializable
{
    private static class SerializationProxyV1
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

        SerializationProxyV1(String s, String s1, SerializationProxyV1 serializationproxyv1)
        {
            this(s, s1);
        }
    }


    private static final long serialVersionUID = 1L;
    private final String accessToken;
    private final String applicationId;

    private Object writeReplace()
    {
        return new SerializationProxyV1(accessToken, applicationId, null);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof SerializationProxyV1)
        {
            if (Utility.areObjectsEqual(((SerializationProxyV1) (obj = (SerializationProxyV1)obj)).accessToken, accessToken) && Utility.areObjectsEqual(((accessToken) (obj)).applicationId, applicationId))
            {
                return true;
            }
        }
        return false;
    }

    String getAccessToken()
    {
        return accessToken;
    }

    String getApplicationId()
    {
        return applicationId;
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
        this(session.getAccessToken(), session.getApplicationId());
    }

    <init>(String s, String s1)
    {
        String s2 = s;
        if (Utility.isNullOrEmpty(s))
        {
            s2 = null;
        }
        accessToken = s2;
        applicationId = s1;
    }
}
