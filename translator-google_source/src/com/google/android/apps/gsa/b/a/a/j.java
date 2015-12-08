// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.io.a;
import com.google.android.apps.gsa.shared.io.c;
import com.google.android.apps.gsa.shared.io.d;
import com.google.android.apps.gsa.shared.io.g;
import com.google.common.util.concurrent.t;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

final class j extends InputStream
{

    private final g a;
    private final d b;
    private final c c;
    private final byte d[] = new byte[1];
    private a e;
    private boolean f;

    j(g g1, d d1, c c1)
    {
        f = false;
        a = g1;
        b = d1;
        c = c1;
    }

    private a a()
    {
        if (e != null)
        {
            if (e.b != 1 || e.c() > 0)
            {
                return e;
            }
            e.a();
            e = null;
        }
        try
        {
            e = (a)b.a().get();
        }
        catch (InterruptedException interruptedexception)
        {
            throw c.a(0x40030, interruptedexception);
        }
        catch (ExecutionException executionexception)
        {
            throw c.a(0x40032, executionexception);
        }
        return e;
    }

    public final int available()
    {
        if (f)
        {
            throw c.a(0x4002f, null);
        }
        if (e == null)
        {
            return 0;
        } else
        {
            return e.c();
        }
    }

    public final void close()
    {
        if (f)
        {
            return;
        }
        if (e != null)
        {
            e.a();
            e = null;
        }
        f = true;
        a.a();
    }

    public final int read()
    {
        if (read(d, 0, 1) == 1)
        {
            return d[0] & 0xff;
        } else
        {
            return -1;
        }
    }

    public final int read(byte abyte0[], int i, int k)
    {
        if (f)
        {
            throw c.a(0x4002f, null);
        } else
        {
            return a().a(abyte0, i, k);
        }
    }
}
