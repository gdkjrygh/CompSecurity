// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import java.io.Serializable;

// Referenced classes of package com.facebook.appevents:
//            FacebookTimeSpentData

private static class e
    implements Serializable
{

    private static final long serialVersionUID = 6L;
    private final long a;
    private final long b;
    private final long c;
    private final int d;
    private final String e;

    private Object readResolve()
    {
        return new FacebookTimeSpentData(a, b, c, d, e, (byte)0);
    }

    (long l, long l1, long l2, int i, 
            String s)
    {
        a = l;
        b = l1;
        c = l2;
        d = i;
        e = s;
    }
}
