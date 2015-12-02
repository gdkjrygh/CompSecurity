// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.i.a;

import android.os.HandlerThread;
import com.facebook.auth.c.b;
import com.facebook.base.broadcast.j;
import com.facebook.common.e.h;
import com.facebook.common.process.d;
import javax.inject.a;

// Referenced classes of package com.facebook.i.a:
//            d, b

public class c
{

    private final a a;
    private final d b;
    private final h c;
    private final HandlerThread d;
    private final a e;
    private final b f;

    public c(a a1, d d1, h h, HandlerThread handlerthread, a a2, b b1)
    {
        a = a1;
        b = d1;
        c = h;
        d = handlerthread;
        e = a2;
        f = b1;
    }

    public com.facebook.i.a.b a(String s, j j, boolean flag)
    {
        return new com.facebook.i.a.d(s, j, a, b, c, f, d, e, flag);
    }
}
