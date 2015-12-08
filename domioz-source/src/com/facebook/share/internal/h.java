// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.GraphRequest;
import com.facebook.ag;

// Referenced classes of package com.facebook.share.internal:
//            s, p, a, n, 
//            i

final class h
    implements s
{

    final a a;

    h(a a1)
    {
        a = a1;
        super();
    }

    public final void a()
    {
        p p1 = new p(a, com.facebook.share.internal.a.g(a), com.facebook.share.internal.a.h(a));
        n n1 = new n(a, com.facebook.share.internal.a.g(a), com.facebook.share.internal.a.h(a));
        ag ag1 = new ag();
        p1.a(ag1);
        n1.a(ag1);
        ag1.a(new i(this, p1, n1));
        GraphRequest.b(ag1);
    }
}
