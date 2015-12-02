// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.model;

import com.facebook.user.UserIdentifierKey;

public class b
{

    private final String a;
    private final UserIdentifierKey b;

    b(String s, UserIdentifierKey useridentifierkey)
    {
        a = s;
        b = useridentifierkey;
    }

    public static b a(UserIdentifierKey useridentifierkey)
    {
        return new b(null, useridentifierkey);
    }

    public String a()
    {
        return a;
    }

    public UserIdentifierKey b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (a == null ? ((b) (obj)).a != null : !a.equals(((b) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((b) (obj)).b != null : !b.equals(((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }
}
