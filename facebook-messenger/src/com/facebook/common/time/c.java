// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.time;


// Referenced classes of package com.facebook.common.time:
//            a

public class c
    implements a
{

    private static final c a = new c();

    private c()
    {
    }

    public static c b()
    {
        return a;
    }

    public long a()
    {
        return System.currentTimeMillis();
    }

}
