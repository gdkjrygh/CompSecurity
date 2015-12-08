// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.oauth;

import com.googlecode.flickrjandroid.FlickrException;

public class OAuthException extends FlickrException
{

    private static final long serialVersionUID = 1L;

    public OAuthException(String s)
    {
        super(s);
    }

    public OAuthException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public OAuthException(Throwable throwable)
    {
        super(throwable);
    }
}
