// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;

public class TokenErrorResponse extends GenericJson
{

    private String error;
    private String errorDescription;
    private String errorUri;

    public TokenErrorResponse()
    {
    }

    public TokenErrorResponse clone()
    {
        return (TokenErrorResponse)super.clone();
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

    public TokenErrorResponse set(String s, Object obj)
    {
        return (TokenErrorResponse)super.set(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public TokenErrorResponse setError(String s)
    {
        error = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public TokenErrorResponse setErrorDescription(String s)
    {
        errorDescription = s;
        return this;
    }

    public TokenErrorResponse setErrorUri(String s)
    {
        errorUri = s;
        return this;
    }
}
