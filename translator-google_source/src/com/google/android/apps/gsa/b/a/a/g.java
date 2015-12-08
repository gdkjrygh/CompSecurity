// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.io.HttpException;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.l;
import com.google.android.apps.gsa.shared.io.n;
import com.google.android.apps.gsa.shared.io.o;
import com.google.common.util.concurrent.d;
import com.google.common.util.concurrent.u;

final class g
    implements d
{

    private final l a;
    private final com.google.android.apps.gsa.shared.io.d b;
    private final u c;
    private final c d;

    g(l l1, com.google.android.apps.gsa.shared.io.d d1, u u1, c c1)
    {
        a = l1;
        b = d1;
        c = u1;
        d = c1;
    }

    public final void a(Object obj)
    {
        obj = (o)obj;
        try
        {
            ((o) (obj)).a(a.s);
            com.google.android.apps.gsa.shared.io.d d1 = b;
            c.a(new n(null, ((o) (obj)), null, d1));
            d.a(((o) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
        }
    }

    public final void a(Throwable throwable)
    {
        if (throwable instanceof GsaIOException)
        {
            throwable = (GsaIOException)throwable;
            c.a(new n(throwable, null, null, null));
            return;
        }
        if (throwable instanceof HttpException)
        {
            throwable = (HttpException)throwable;
            o o1 = throwable.getResponseData();
            c.a(new n(null, o1, throwable, null));
            return;
        } else
        {
            c.a(throwable);
            return;
        }
    }
}
