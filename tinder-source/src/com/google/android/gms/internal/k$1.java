// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            k, h, i, cc

final class a
    implements Runnable
{

    final View a;
    final k b;

    public final void run()
    {
        k k1;
        Object obj;
        k1 = b;
        obj = a;
        h h1;
        h1 = new h(k1.c, k1.d, k1.e, k1.f);
        obj = k1.a(((View) (obj)), h1);
        h1.c();
        if (((nit>) (obj)).a == 0 && ((a) (obj)).b == 0)
        {
            return;
        }
        i j;
        if (((b) (obj)).b == 0 && h1.b == 0 || ((b) (obj)).b == 0 && k1.a.a(h1))
        {
            break MISSING_BLOCK_LABEL_219;
        }
        j = k1.a;
        synchronized (j.a)
        {
            if (j.c.size() >= 10)
            {
                com.google.android.gms.ads.internal.util.client.b.a((new StringBuilder("Queue is full, current size = ")).append(j.c.size()).toString());
                j.c.remove(0);
            }
            int l = j.b;
            j.b = l + 1;
            h1.c = l;
            j.c.add(h1);
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (Exception exception1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Exception in fetchContentOnUIThread", exception1);
            k1.b.a(exception1, true);
        }
    }

    util.client.b(k k1, View view)
    {
        b = k1;
        a = view;
        super();
    }
}
