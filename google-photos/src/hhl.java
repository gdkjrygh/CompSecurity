// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public final class hhl
    implements ftx, geb, mti, omb, opl, opp, opr, ops, opv
{

    public ftd a;
    private noz b;
    private mtj c;
    private gdw d;
    private mmr e;
    private gcp f;
    private boolean g;

    public hhl(opd opd1)
    {
        a = new hhm(this);
        opd1.a(this);
    }

    private void a(RecyclerView recyclerview)
    {
        int i;
        if (f == gcp.c && !g && !recyclerview.canScrollVertically(1))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            g = true;
            i = e.d();
            c.a(new gco(get.i, i));
        }
    }

    static void a(hhl hhl1, RecyclerView recyclerview)
    {
        hhl1.a(recyclerview);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mtj)olm1.a(mtj);
        c.a(this);
        e = (mmr)olm1.a(mmr);
        d = (gdw)olm1.a(gdw);
        b = noz.a(context, "SyncAtBottomMixin", new String[] {
            "sync"
        });
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            g = bundle.getBoolean("pending_task");
        }
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        a(recyclerview);
    }

    public final void a(gcp gcp1)
    {
        f = gcp1;
    }

    public final void a(gcp gcp1, long l)
    {
        f = gcp1;
    }

    public final void a(Long long1, long l)
    {
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if ("com.google.android.apps.photos.metasync.async.GetAllPhotosTask".equals(s) && g)
        {
            if (mue1 != null && mue1.c() && b.a())
            {
                s = mue1.c;
            }
            g = false;
        }
    }

    public final void al_()
    {
        d.a(this);
    }

    public final void am_()
    {
        d.b(this);
    }

    public final void b(RecyclerView recyclerview, int i)
    {
    }

    public final void b(gcp gcp1, long l)
    {
        f = gcp1;
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("pending_task", g);
    }
}
