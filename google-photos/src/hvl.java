// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class hvl
    implements fqz, omb, opv
{

    private static final oni a = new oni("debug.photos.dh_expansion");
    private ekq b;
    private mtj c;
    private fqy d;
    private nwm e;
    private mmr f;
    private am g;
    private String h;

    hvl(am am1, opd opd1, String s)
    {
        g = am1;
        h = s;
        opd1.a(this);
    }

    static fqy a(hvl hvl1)
    {
        return hvl1.d;
    }

    public final void a(long l)
    {
        Object obj = e.ai_();
        if (obj != null)
        {
            if ((obj = (hao)((olm) (obj)).b(hao)) != null)
            {
                obj = ((hao) (obj)).b(l);
                ekq ekq1 = b.a(f.d(), null);
                p.b(b, "Search query not initialized yet");
                dnq dnq1 = (dnq)b.a(dnq);
                c.a(new hvp(l, ekq1, ((ekw) (obj)), dnq1));
                return;
            }
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = (fqy)olm1.a(fqy);
        c = ((mtj)olm1.a(mtj)).a("ExpandSearchHeaders", new hvn(this)).a("CollapseSearchHeaders", new hvm(this));
        e = (nwm)olm1.a(nwm);
        f = (mmr)olm1.a(mmr);
        b = (ekq)g.q.getParcelable(h);
    }

    public final void b(long l)
    {
        p.b(b, "Search query not initialized yet");
        dnq dnq1 = (dnq)b.a(dnq);
        c.a(new hvo(l, dnq1));
    }

}
