// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;

public class AuthorizationCodeResponseUrl extends GenericUrl
{

    private String code;
    private String error;
    private String errorDescription;
    private String errorUri;
    private String state;

    public AuthorizationCodeResponseUrl(String s)
    {
        boolean flag2 = true;
        super(s);
        boolean flag;
        boolean flag1;
        if (code == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (error == null)
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
    }

    public AuthorizationCodeResponseUrl clone()
    {
        return (AuthorizationCodeResponseUrl)super.clone();
    }

    public volatile GenericUrl clone()
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

    public final String getCode()
    {
        return code;
    }

    public final String getError()
    {
        return error;
    }

    public final String getErrorDescription()
    {
        return errorDescription;
    }

    public final String getErrorUri()
    {
        return errorUri;
    }

    public final String getState()
    {
        return state;
    }

    public AuthorizationCodeResponseUrl set(String s, Object obj)
    {
        return (AuthorizationCodeResponseUrl)super.set(s, obj);
    }

    public volatile GenericUrl set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public AuthorizationCodeResponseUrl setCode(String s)
    {
        code = s;
        return this;
    }

    public AuthorizationCodeResponseUrl setError(String s)
    {
        error = s;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorDescription(String s)
    {
        errorDescription = s;
        return this;
    }

    public AuthorizationCodeResponseUrl setErrorUri(String s)
    {
        errorUri = s;
        return this;
    }

    public AuthorizationCodeResponseUrl setState(String s)
    {
        state = s;
        return this;
    }
}
