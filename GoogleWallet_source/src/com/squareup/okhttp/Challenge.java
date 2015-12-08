// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;

public final class Challenge
{

    private final String realm;
    private final String scheme;

    public Challenge(String s, String s1)
    {
        scheme = s;
        realm = s1;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof Challenge) && Util.equal(scheme, ((Challenge)obj).scheme) && Util.equal(realm, ((Challenge)obj).realm);
    }

    public final String getRealm()
    {
        return realm;
    }

    public final String getScheme()
    {
        return scheme;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (realm != null)
        {
            i = realm.hashCode();
        } else
        {
            i = 0;
        }
        if (scheme != null)
        {
            j = scheme.hashCode();
        }
        return (i + 899) * 31 + j;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(scheme).append(" realm=\"").append(realm).append("\"").toString();
    }
}
