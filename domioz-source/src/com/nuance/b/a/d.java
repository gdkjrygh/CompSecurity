// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


// Referenced classes of package com.nuance.b.a:
//            b, e

public final class d
{

    private final String a;

    private d()
    {
        throw new IllegalArgumentException("default AgentName ctor disallowed");
    }

    public d(String s)
    {
        if (s.trim().length() == 0)
        {
            throw new IllegalArgumentException(String.format("invalid AgentName:[%s]", new Object[] {
                s
            }));
        } else
        {
            a = s;
            return;
        }
    }

    public final b a(String s)
    {
        return new b(e.f, this, s);
    }

    public final String toString()
    {
        return a;
    }
}
