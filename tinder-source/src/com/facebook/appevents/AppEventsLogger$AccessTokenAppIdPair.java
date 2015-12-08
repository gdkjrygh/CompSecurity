// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.g;
import com.facebook.internal.m;
import java.io.Serializable;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

private static class b
    implements Serializable
{
    private static class SerializationProxyV1
        implements Serializable
    {

        private static final long serialVersionUID = 0xdd772aee317ab613L;
        private final String a;
        private final String b;

        private Object readResolve()
        {
            return new AppEventsLogger.AccessTokenAppIdPair(a, b);
        }

        private SerializationProxyV1(String s, String s1)
        {
            a = s;
            b = s1;
        }

        SerializationProxyV1(String s, String s1, byte byte0)
        {
            this(s, s1);
        }
    }


    private static final long serialVersionUID = 1L;
    final String a;
    final String b;

    private Object writeReplace()
    {
        return new SerializationProxyV1(a, b, (byte)0);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (m.a(((b) (obj = (b)obj)).a, a) && m.a(((a) (obj)).b, b))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i ^ j;
    }

    SerializationProxyV1(AccessToken accesstoken)
    {
        this(accesstoken.d, g.j());
    }

    <init>(String s, String s1)
    {
        String s2 = s;
        if (m.a(s))
        {
            s2 = null;
        }
        a = s2;
        b = s1;
    }
}
