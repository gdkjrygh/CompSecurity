// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import java.io.Serializable;

public abstract class TokenPair
    implements Serializable
{

    private static final long serialVersionUID = 0xff6833a71258b8e7L;
    public final String key;
    public final String secret;

    public TokenPair(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("'key' must be non-null");
        }
        if (s.contains("|"))
        {
            throw new IllegalArgumentException((new StringBuilder("'key' must not contain a \"|\" character: \"")).append(s).append("\"").toString());
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("'secret' must be non-null");
        } else
        {
            key = s;
            secret = s1;
            return;
        }
    }

    public boolean equals(TokenPair tokenpair)
    {
        return key.equals(tokenpair.key) && secret.equals(tokenpair.secret);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof TokenPair) && equals((TokenPair)obj);
    }

    public int hashCode()
    {
        return key.hashCode() ^ secret.hashCode() << 1;
    }

    public String toString()
    {
        return (new StringBuilder("{key=\"")).append(key).append("\", secret=\"").append(secret.charAt(0)).append("...\"}").toString();
    }
}
