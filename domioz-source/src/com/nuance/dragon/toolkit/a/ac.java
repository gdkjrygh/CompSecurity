// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;
import com.nuance.a.a.a.c.a.c.k;
import com.nuance.dragon.toolkit.d.e;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            f, x, ap, ad

final class ac
    implements k
{

    final f a;

    ac(f f1)
    {
        a = f1;
        super();
    }

    public final void a()
    {
        e.d(a, (new StringBuilder("Command Creation Failed [")).append(f.a(a)).append("]").toString());
        f.b(a).k().e();
    }

    public final void a(String s)
    {
        (new StringBuilder("Command Created [")).append(f.a(a)).append("] session id [").append(s).append("]");
        f.c(a).post(new ad(this, s));
    }
}
