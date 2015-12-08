// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid.internal:
//            o

public final class h
{

    public static int a(String s)
    {
        o.a(s, "hexHr");
        long l = Long.decode(s).longValue();
        if (l < 0L || l > 0xffffffffL)
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Hex string does not fit in integer: %s", new Object[] {
                s
            }));
        } else
        {
            return (int)l;
        }
    }
}
