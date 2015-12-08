// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public final class GoogleClientSecrets extends GenericJson
{
    public static final class Details extends GenericJson
    {

        private String authUri;
        private String clientId;
        private String clientSecret;
        private List redirectUris;
        private String tokenUri;

        public Details clone()
        {
            return (Details)super.clone();
        }

        public volatile GenericJson clone()
        {
            return clone();
        }

        public volatile GenericData clone()
        {
            return clone();
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public String getAuthUri()
        {
            return authUri;
        }

        public String getClientId()
        {
            return clientId;
        }

        public String getClientSecret()
        {
            return clientSecret;
        }

        public List getRedirectUris()
        {
            return redirectUris;
        }

        public String getTokenUri()
        {
            return tokenUri;
        }

        public Details set(String s, Object obj)
        {
            return (Details)super.set(s, obj);
        }

        public volatile GenericJson set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Details setAuthUri(String s)
        {
            authUri = s;
            return this;
        }

        public Details setClientId(String s)
        {
            clientId = s;
            return this;
        }

        public Details setClientSecret(String s)
        {
            clientSecret = s;
            return this;
        }

        public Details setRedirectUris(List list)
        {
            redirectUris = list;
            return this;
        }

        public Details setTokenUri(String s)
        {
            tokenUri = s;
            return this;
        }

        public Details()
        {
        }
    }


    private Details installed;
    private Details web;

    public GoogleClientSecrets()
    {
    }

    public static GoogleClientSecrets load(JsonFactory jsonfactory, Reader reader)
        throws IOException
    {
        return (GoogleClientSecrets)jsonfactory.fromReader(reader, com/google/api/client/googleapis/auth/oauth2/GoogleClientSecrets);
    }

    public GoogleClientSecrets clone()
    {
        return (GoogleClientSecrets)super.clone();
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Details getDetails()
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (web == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (installed == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
        if (web == null)
        {
            return installed;
        } else
        {
            return web;
        }
    }

    public Details getInstalled()
    {
        return installed;
    }

    public Details getWeb()
    {
        return web;
    }

    public GoogleClientSecrets set(String s, Object obj)
    {
        return (GoogleClientSecrets)super.set(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public GoogleClientSecrets setInstalled(Details details)
    {
        installed = details;
        return this;
    }

    public GoogleClientSecrets setWeb(Details details)
    {
        web = details;
        return this;
    }
}
