// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class bsr
{

    final bss a = new bss(this);
    final Set b = new HashSet();
    int c;
    boolean d;
    IBinder e;
    final bsq f;
    ComponentName g;
    final bsp h;

    public bsr(bsp bsp1, bsq bsq1)
    {
        h = bsp1;
        super();
        f = bsq1;
        c = 2;
    }

    public final void a()
    {
        c = 3;
        bsp.c(h);
        d = bto.a(bsp.b(h), f.a(), a, 129);
        if (d)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        c = 2;
        bsp.c(h);
        bto.a(bsp.b(h), a);
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
    }

    public final void a(ServiceConnection serviceconnection)
    {
        bsp.c(h);
        bsp.b(h);
        f.a();
        bto.a(serviceconnection);
        b.add(serviceconnection);
    }

    public final boolean b()
    {
        return b.isEmpty();
    }

    public final boolean b(ServiceConnection serviceconnection)
    {
        return b.contains(serviceconnection);
    }
}
