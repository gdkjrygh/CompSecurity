// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.view.View;
import com.kik.g.r;

// Referenced classes of package com.kik.sdkutils:
//            n, r, q, o, 
//            p

final class m extends r
{

    final View a;
    final r b;

    m(View view, r r1)
    {
        a = view;
        b = r1;
        super();
    }

    public final void a()
    {
        a.post(new n(this));
    }

    public final void a(Object obj)
    {
        a.post(new com.kik.sdkutils.r(this, obj));
    }

    public final void a(Throwable throwable)
    {
        a.post(new q(this, throwable));
    }

    public final void b()
    {
        a.post(new o(this));
    }

    public final void b(Throwable throwable)
    {
        a.post(new p(this, throwable));
    }
}
