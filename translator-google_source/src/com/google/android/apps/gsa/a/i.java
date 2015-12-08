// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a;

import com.google.android.apps.gsa.shared.b.h;
import com.google.android.apps.gsa.shared.speech.exception.NetworkRecognizeException;
import com.google.f.e.m;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.gsa.a:
//            c, k, j

public final class i
    implements c
{

    final AtomicBoolean a = new AtomicBoolean(false);
    private final c b;
    private final k c;
    private final j d;

    i(c c1, k k1, j j)
    {
        b = c1;
        c = k1;
        d = j;
    }

    public final void a(NetworkRecognizeException networkrecognizeexception)
    {
        if (a.get())
        {
            return;
        } else
        {
            b.a(networkrecognizeexception);
            return;
        }
    }

    public final void a(m m)
    {
        if (a.get())
        {
            return;
        }
        NetworkRecognizeException networkrecognizeexception = c.a(m);
        if (networkrecognizeexception != null)
        {
            b(networkrecognizeexception);
            return;
        } else
        {
            b.a(m);
            return;
        }
    }

    public final void b(NetworkRecognizeException networkrecognizeexception)
    {
        if (a.getAndSet(true))
        {
            return;
        } else
        {
            h.b(9);
            b.b(networkrecognizeexception);
            return;
        }
    }
}
