// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.HashMap;

// Referenced classes of package com.taplytics:
//            shelduck, hi

public final class bo
{

    private static bo b;
    private HashMap a;

    public bo()
    {
        a = new HashMap();
    }

    public static bo a()
    {
        if (b != null)
        {
            return b;
        } else
        {
            bo bo1 = new bo();
            b = bo1;
            return bo1;
        }
    }

    public final void a(String s)
    {
        while (hi.a(shelduck.u) || !a.containsKey(s)) 
        {
            return;
        }
        a.get(s);
    }
}
