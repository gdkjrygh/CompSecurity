// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

public interface OkAuthenticator
{
    public static final class Challenge
    {

        private final String realm;
        private final String scheme;

        public boolean equals(Object obj)
        {
            return (obj instanceof Challenge) && ((Challenge)obj).scheme.equals(scheme) && ((Challenge)obj).realm.equals(realm);
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

        public Challenge(String s, String s1)
        {
            scheme = s;
            realm = s1;
        }
    }

    public static final class Credential
    {

        private final String headerValue;

        public static Credential basic(String s, String s1)
        {
            try
            {
                s = Base64.encode((new StringBuilder()).append(s).append(":").append(s1).toString().getBytes("ISO-8859-1"));
                s = new Credential((new StringBuilder()).append("Basic ").append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError();
            }
            return s;
        }

        public boolean equals(Object obj)
        {
            return (obj instanceof Credential) && ((Credential)obj).headerValue.equals(headerValue);
        }

        public String getHeaderValue()
        {
            return headerValue;
        }

        public int hashCode()
        {
            return headerValue.hashCode();
        }

        public String toString()
        {
            return headerValue;
        }

        private Credential(String s)
        {
            headerValue = s;
        }
    }


    public abstract Credential authenticate(Proxy proxy, URL url, List list)
        throws IOException;

    public abstract Credential authenticateProxy(Proxy proxy, URL url, List list)
        throws IOException;
}
