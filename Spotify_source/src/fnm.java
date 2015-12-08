// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.Assertion;
import java.lang.reflect.Field;

public final class fnm
{

    public Player A;
    public final fmd B;
    final fmk C;
    private final fni D;
    private final fmm E;
    private final fmy F;
    private final fml G;
    final fmp a;
    final fnp b;
    public final fng c = new fng("Playback");
    public final fno d = new fno("Sync");
    public final fmw e = new fmw();
    final fni f;
    final fmj g;
    final fni h;
    final fnb i;
    final fnn j;
    public final fnf k;
    public final fna l;
    public final fmn m;
    public final fnq n = new fnq();
    public final fnh o = new fnh("RemotePlayback");
    public final fmh p = new fmh("AdsVideoPlayer");
    public final fmi q = new fmi("AudioAd");
    final fme r;
    final fmt s;
    final fmv t;
    final fnr u;
    public final fmx v = new fmx();
    public final fms w = new fms("DiscoveredDeviceConnection");
    public final fnd x;
    public final fmg y;
    public final fmr z;

    public fnm(fnj fnj)
    {
        i = new fnb(fnj);
        B = new fmd(o);
        x = new fnd(c);
        r = new fme(c, o);
        G = new fml(fnj);
        F = new fmy(fnj);
        E = new fmm(fnj);
        l = new fna(F, E);
        s = new fmt(G, l);
        m = new fmn(fnj);
        h = new fmz(d, e, s, r, v, m, w);
        k = new fnf(this, n, c, p, e, d);
        f = new fns(fnj, k, d);
        j = new fnn(k, d);
        a = new fmp(s, e, r);
        t = new fmv(fnj);
        g = new fmj(fnj);
        b = new fnp(fnj, l);
        u = new fnr(c, d);
        D = new fmo(c, p, e);
        y = new fmg(q);
        C = new fmk(r);
        z = new fmr(C);
        b();
    }

    public final void a()
    {
        i.a();
        r.a();
        G.a();
        F.a();
        E.a();
        l.a();
        s.a();
        e.a();
        h.a();
        k.a();
        f.a();
        j.a();
        a.a();
        t.a();
        g.a();
        b.a();
        u.a();
        D.a();
        m.a();
        n.a();
    }

    final void b()
    {
        Field afield[] = getClass().getDeclaredFields();
        int j1 = afield.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            Object obj = afield[i1];
            if (fni.isAssignableFrom(((Field) (obj)).getType()))
            {
                try
                {
                    obj = (fni)((Field) (obj)).get(this);
                    Assertion.a(((fni) (obj)).d(), (new StringBuilder()).append(((fni) (obj)).toString()).append(" should be disabled").toString());
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    throw new RuntimeException(illegalaccessexception);
                }
            }
            i1++;
        }
    }
}
