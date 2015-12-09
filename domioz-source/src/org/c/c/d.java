// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import org.c.d.b;

// Referenced classes of package org.c.c:
//            c

public final class d extends c
{

    private final String a;
    private final String b;

    public d(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final String getHeaderValue()
    {
        return String.format("Basic %s", new Object[] {
            org.c.d.b.encodeToString(String.format("%s:%s", new Object[] {
                a, b
            }).getBytes())
        });
    }

    public final String toString()
    {
        String s;
        try
        {
            s = String.format("Authorization: %s", new Object[] {
                getHeaderValue()
            });
        }
        catch (RuntimeException runtimeexception)
        {
            return null;
        }
        return s;
    }
}
