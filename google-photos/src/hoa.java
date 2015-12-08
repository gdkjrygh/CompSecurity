// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class hoa
    implements dhf, omb, opv
{

    Context a;
    String b;
    boolean c;
    dgk d;
    mmr e;
    private mtj f;
    private String g;
    private int h;

    public hoa()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        f = ((mtj)olm1.a(mtj)).a("remotemedia.tasks.LeaveEnvelopeTask", new hob(this));
        d = (dgk)olm1.a(dgk);
        e = (mmr)olm1.a(mmr);
        context = (mmv)olm1.a(mmv);
        h = e.d();
        g = context.a(h).b("gaia_id");
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(c);
        menuitem.setEnabled(c);
    }

    public final void b(MenuItem menuitem)
    {
        menuitem = new hlq(g, h, b);
        f.a(menuitem);
    }
}
