// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

public final class dqv
    implements ds, geb, omb, opl, opp, opr, ops, opv
{

    final Runnable a = new dqw(this);
    dsj b;
    mmr c;
    boolean d;
    aen e;
    boolean f;
    int g;
    int h;
    private gdw i;
    private hgq j;

    public dqv(opd opd1)
    {
        g = -1;
        opd1.a(this);
        new ghb(opd1, this, null);
    }

    private void b(gcp gcp1)
    {
        boolean flag = f;
        f = gcp.d.equals(gcp1);
        if (f != flag && j != null)
        {
            j.a("Library initialization complete");
        }
    }

    public final boolean W_()
    {
        return c.e() && (!f || d);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mmr)olm1.a(mmr);
        i = (gdw)olm1.a(gdw);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            d = bundle.getBoolean("is_pending_removal");
            f = bundle.getBoolean("is_init_complete");
            h = bundle.getInt("remote_sync_progress");
            return;
        } else
        {
            f = true;
            return;
        }
    }

    public final void a(gcp gcp1)
    {
        b(gcp1);
    }

    public final void a(gcp gcp1, long l)
    {
        b(gcp1);
    }

    public final void a(Long long1, long l)
    {
        if (b != null && long1 != null && long1.longValue() > 0L)
        {
            h = (int)(((double)l / (double)long1.longValue()) * 100D);
            b.c(h);
            if (e != null)
            {
                e.c(g);
            }
        }
    }

    public final void al_()
    {
        i.a(this);
    }

    public final void am_()
    {
        Runnable runnable = a;
        b.w().removeCallbacks(runnable);
        i.b(this);
    }

    public final void b(gcp gcp1, long l)
    {
        b(gcp1);
    }

    public final void b_(Object obj)
    {
        j = (hgq)((nwm)obj).ai_().b(hgq);
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("is_pending_removal", d);
        bundle.putBoolean("is_init_complete", f);
        bundle.putInt("remote_sync_progress", h);
    }
}
