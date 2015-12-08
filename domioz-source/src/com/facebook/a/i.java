// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import com.facebook.AccessToken;
import com.facebook.internal.aw;
import com.facebook.q;
import java.io.Serializable;

final class i
    implements Serializable
{

    private final String a;
    private final String b;

    i(AccessToken accesstoken)
    {
        this(accesstoken.b(), q.h());
    }

    i(String s, String s1)
    {
        String s2 = s;
        if (aw.a(s))
        {
            s2 = null;
        }
        a = s2;
        b = s1;
    }

    final String a()
    {
        return a;
    }

    final String b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof i)
        {
            if (aw.a(((i) (obj = (i)obj)).a, a) && aw.a(((i) (obj)).b, b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int k = 0;
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.hashCode();
        }
        if (b != null)
        {
            k = b.hashCode();
        }
        return j ^ k;
    }
}
