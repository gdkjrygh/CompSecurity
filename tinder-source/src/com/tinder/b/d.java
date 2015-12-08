// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import com.tinder.enums.SqlDataType;

// Referenced classes of package com.tinder.b:
//            b, c

public final class d extends b
{

    private final String a = "TS";
    private c b[];

    public d()
    {
        b = (new c[] {
            new c("TS", SqlDataType.INTEGER, true)
        });
    }

    protected final c[] a()
    {
        return b;
    }

    protected final String b()
    {
        return "CRASHES";
    }
}
