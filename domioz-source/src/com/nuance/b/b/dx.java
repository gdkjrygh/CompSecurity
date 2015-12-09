// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            a, aa, v

public final class dx extends a
{

    private final String b;
    private final aa c;

    public dx(String s, String s1)
    {
        super(s);
        b = s1;
        c = aa.a;
    }

    public dx(String s, String s1, aa aa1)
    {
        super(s);
        if (s1 == null || s1.length() == 0)
        {
            if (s1 == null)
            {
                s = "null";
            } else
            {
                s = "empty";
            }
            throw new IllegalArgumentException(String.format("SetValueCommand: %s value not allowed", new Object[] {
                s
            }));
        } else
        {
            b = s1;
            c = aa1;
            return;
        }
    }

    final JSONObject a()
    {
        return v.a(super.a, b, c);
    }
}
