// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.io.Serializable;

class applicationId
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final String accessTokenString;
    private final String applicationId;

    private Object writeReplace()
    {
        class SerializationProxyV1
            implements Serializable
        {

            private static final long serialVersionUID = 0xdd772aee317ab613L;
            private final String accessTokenString;
            private final String appId;

            private Object readResolve()
            {
                return new AppEventsLogger.AccessTokenAppIdPair(accessTokenString, appId);
            }

            private SerializationProxyV1(String s, String s1)
            {
                accessTokenString = s;
                appId = s1;
            }

            SerializationProxyV1(String s, String s1, AppEventsLogger._cls1 _pcls1)
            {
                this(s, s1);
            }
        }

        return new SerializationProxyV1(accessTokenString, applicationId, null);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof applicationId)
        {
            if (Utility.areObjectsEqual(((applicationId) (obj = (applicationId)obj)).accessTokenString, accessTokenString) && Utility.areObjectsEqual(((accessTokenString) (obj)).applicationId, applicationId))
            {
                return true;
            }
        }
        return false;
    }

    String getAccessTokenString()
    {
        return accessTokenString;
    }

    String getApplicationId()
    {
        return applicationId;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (accessTokenString == null)
        {
            i = 0;
        } else
        {
            i = accessTokenString.hashCode();
        }
        if (applicationId != null)
        {
            j = applicationId.hashCode();
        }
        return i ^ j;
    }

    SerializationProxyV1(AccessToken accesstoken)
    {
        this(accesstoken.getToken(), FacebookSdk.getApplicationId());
    }

    <init>(String s, String s1)
    {
        String s2 = s;
        if (Utility.isNullOrEmpty(s))
        {
            s2 = null;
        }
        accessTokenString = s2;
        applicationId = s1;
    }
}
