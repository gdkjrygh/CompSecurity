// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.io.a;
import com.google.common.util.concurrent.u;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            l, q

public final class p extends l
{

    final u a;
    final q d;
    final u e = u.a();

    public p(u u1, q q1)
    {
        super(u1, q1);
        a = u1;
        d = q1;
    }

    public final void a()
    {
        d.c();
        GsaIOException gsaioexception = new GsaIOException(0x4002e);
        e.a(new a(gsaioexception));
        a.a(gsaioexception);
    }
}
