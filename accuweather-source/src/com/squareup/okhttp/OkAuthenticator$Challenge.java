// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            OkAuthenticator

public static final class realm
{

    private final String realm;
    private final String scheme;

    public boolean equals(Object obj)
    {
        return (obj instanceof realm) && ((realm)obj).scheme.equals(scheme) && ((scheme)obj).realm.equals(realm);
    }

    public String getRealm()
    {
        return realm;
    }

    public String getScheme()
    {
        return scheme;
    }

    public int hashCode()
    {
        return scheme.hashCode() + realm.hashCode() * 31;
    }

    public String toString()
    {
        return (new StringBuilder()).append(scheme).append(" realm=\"").append(realm).append("\"").toString();
    }

    public (String s, String s1)
    {
        scheme = s;
        realm = s1;
    }
}
