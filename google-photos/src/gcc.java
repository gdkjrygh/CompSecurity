// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import java.util.List;

public class gcc
    implements flh, gdm, mnb
{

    public final Context a;
    public final erj b;
    public final gcj c;
    public final mmv d;
    public final noz e;
    private final hdr f;
    private final noz g;

    public gcc(Context context, erj erj1, gcj gcj1)
    {
        a = context;
        b = erj1;
        c = gcj1;
        d = (mmv)olm.a(context, mmv);
        f = (hdr)olm.a(context, hdr);
        g = noz.a(context, 3, "AllSyncManager", new String[] {
            "sync"
        });
        e = noz.a(context, "AllSyncManager", new String[] {
            "sync"
        });
    }

    private void a()
    {
        f.a(false);
    }

    public final gcy a(int i, gct gct, get get)
    {
        long l = noy.a();
        if (g.a())
        {
            noy.a("sync source", get);
            noy.a(i);
        }
        gct = c.a(i, gct, get);
        if (g.a())
        {
            long l1 = ((eto)olm.a(a, eto)).b(i);
            noy.a("reason", ((gcy) (gct)).a);
            noy.a("total synced", Long.valueOf(l1));
            noy.a(i);
            noy.a("duration", l);
        }
        return gct;
    }

    public final gcy a(int i, get get)
    {
        a();
        return a(i, null, get);
    }

    public final void a(int i)
    {
        b.v();
        if (g.a())
        {
            noy.a(i);
        }
        nlm.a(a);
        a();
    }

    public final void a(List list)
    {
        list.add(new gcd(this));
    }

    public final void b(int i)
    {
        b.v();
        if (g.a())
        {
            noy.a(i);
        }
        a();
    }

    public final void c(int i)
    {
        String s = d.a(i).b("account_name");
        ((gcb)olm.a(a, gcb)).a(new Account(s, "com.google"));
        if (e.a())
        {
            noy.a(i);
        }
        gcj gcj1 = c;
        synchronized (gcj1.a(i))
        {
            gcj1.a.a(gdn.a(i));
        }
_L2:
        b.a(i, "clear and reset", null);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (mvr mvr1) { }
        if (e.a())
        {
            noy.a(i);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
