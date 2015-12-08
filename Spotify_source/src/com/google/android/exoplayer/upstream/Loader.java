// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.os.Looper;
import bdj;
import bdk;
import bdl;
import bds;
import bej;
import java.util.concurrent.ExecutorService;

public final class Loader
{

    public bdk a;
    public boolean b;
    private final ExecutorService c;

    public Loader(String s)
    {
        c = bej.a(s);
    }

    public final void a()
    {
        bds.b(b);
        bdk bdk1 = a;
        bdk1.a.d();
        if (bdk1.b != null)
        {
            bdk1.b.interrupt();
        }
    }

    public final void a(Looper looper, bdl bdl1, bdj bdj)
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        b = true;
        a = new bdk(this, looper, bdl1, bdj);
        c.submit(a);
    }

    public final void a(bdl bdl1, bdj bdj)
    {
        Looper looper = Looper.myLooper();
        boolean flag;
        if (looper != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        a(looper, bdl1, bdj);
    }

    public final void b()
    {
        if (b)
        {
            a();
        }
        c.shutdown();
    }
}
