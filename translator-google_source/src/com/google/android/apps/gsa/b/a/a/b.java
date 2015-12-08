// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.io.a;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.d;
import com.google.android.apps.gsa.shared.io.l;
import com.google.common.util.concurrent.u;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            p, q, a

final class b
    implements Runnable
{

    final p a;
    final l b;
    final d c;
    final c d;
    final q e;
    final com.google.android.apps.gsa.b.a.a.a f;

    b(com.google.android.apps.gsa.b.a.a.a a1, p p1, l l, d d1, c c1, q q1)
    {
        f = a1;
        a = p1;
        b = l;
        c = d1;
        d = c1;
        e = q1;
        super();
    }

    private void a(GsaIOException gsaioexception)
    {
        a.a.a(gsaioexception);
        e.a(new a(gsaioexception));
    }

    public final void run()
    {
        try
        {
            com.google.android.apps.gsa.b.a.a.a.a(f, a, b, c, d);
            return;
        }
        catch (GsaIOException gsaioexception)
        {
            a(gsaioexception);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            a(d.a(0x40027, interruptedexception));
            return;
        }
        catch (ExecutionException executionexception)
        {
            a(d.a(0x40028, executionexception));
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            a(d.a(0x40029, timeoutexception));
            return;
        }
        catch (IOException ioexception)
        {
            a(d.a(0x4002a, ioexception));
        }
    }
}
