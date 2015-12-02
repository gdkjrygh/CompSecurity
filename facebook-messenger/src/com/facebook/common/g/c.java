// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.g;

import com.google.common.d.a.s;

// Referenced classes of package com.facebook.common.g:
//            b

public class c
{

    private final s a;
    private final b b;

    public c(s s1, b b1)
    {
        a = s1;
        b = b1;
    }

    public static c a(s s1, b b1)
    {
        return new c(s1, b1);
    }

    public void a(boolean flag)
    {
        b.a();
        a.cancel(flag);
    }
}
