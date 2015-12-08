// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.D;

final class q
    implements com.facebook.GraphRequest.b
{

    final c.a a;

    q(c.a a1)
    {
        a = a1;
        super();
    }

    public final void a(D d)
    {
        a.c = d.b;
        if (a.c != null)
        {
            a.a(a.c);
            return;
        } else
        {
            a.a(d);
            return;
        }
    }
}
