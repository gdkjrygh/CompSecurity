// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import com.facebook.AccessToken;
import com.facebook.b.al;
import com.facebook.s;
import java.io.Serializable;

class h
    implements Serializable
{

    private final String a;
    private final String b;

    h(AccessToken accesstoken)
    {
        this(accesstoken.b(), s.h());
    }

    h(String s1, String s2)
    {
        String s3 = s1;
        if (al.a(s1))
        {
            s3 = null;
        }
        a = s3;
        b = s2;
    }

    String a()
    {
        return a;
    }

    String b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof h)
        {
            if (al.a(((h) (obj = (h)obj)).a, a) && al.a(((h) (obj)).b, b))
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
}
