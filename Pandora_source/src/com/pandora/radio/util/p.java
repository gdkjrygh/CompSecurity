// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import p.cw.c;

// Referenced classes of package com.pandora.radio.util:
//            b, o

public class p extends b
{

    private static volatile o a;

    public static o a()
    {
        if (a == null)
        {
            a = new o(c.z.o());
        }
        return a;
    }
}
