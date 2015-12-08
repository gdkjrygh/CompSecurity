// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.d;

import java.io.Serializable;

public class f
    implements Serializable
{

    private final String a;
    private final String b;
    private final String c;

    public f(String s, String s1)
    {
        this(s, s1, null);
    }

    public f(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public String d()
    {
        return a;
    }

    public String e()
    {
        return b;
    }

    public String f()
    {
        if (c == null)
        {
            throw new IllegalStateException("This token object was not constructed by scribe and does not have a rawResponse");
        } else
        {
            return c;
        }
    }

    public String toString()
    {
        return String.format("Token[%s , %s]", new Object[] {
            a, b
        });
    }
}
