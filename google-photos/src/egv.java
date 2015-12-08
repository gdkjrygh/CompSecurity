// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.apps.photos.videoplayer.view.VideoViewHolder;
import java.util.concurrent.TimeUnit;

public final class egv
    implements lyk, nug
{

    private static final long a;
    private static final oqe b;
    private static final msy c = new msy(0.24F, 1.0F, 0.32F, 1.0F);
    private static final msy d = new msy(0.4F, 0.0F, 1.0F, 1.0F);
    private jes e;
    private Context f;
    private gql g;
    private amh h;
    private fli i;
    private ehb j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private ViewSwitcher n;
    private VideoViewHolder o;
    private int p;
    private ekp q;
    private egt r;
    private noz s;
    private jgc t;
    private boolean u;
    private final Handler v = new Handler(Looper.getMainLooper());
    private final Runnable w = new egw(this);
    private int x;
    private final Runnable y = new egx(this);
    private final nug z = new egy(this);

    public egv()
    {
        p = eha.a;
        x = 0;
    }

    static int a(egv egv1, int i1)
    {
        egv1.x = 0;
        return 0;
    }

    static long a()
    {
        return a;
    }

    static noz a(egv egv1)
    {
        return egv1.s;
    }

    private void a(long l1)
    {
        b();
        l1 = Math.max(l1, Long.parseLong(b.a));
        v.postDelayed(w, l1);
    }

    static void a(egv egv1, long l1)
    {
        egv1.a(l1);
    }

    static egt b(egv egv1)
    {
        return egv1.r;
    }

    private void b()
    {
        v.removeCallbacks(w);
    }

    static ImageView c(egv egv1)
    {
        return egv1.k;
    }

    static int d(egv egv1)
    {
        int i1 = egv1.x;
        egv1.x = i1 + 1;
        return i1;
    }

    static int e(egv egv1)
    {
        return egv1.x;
    }

    static int f(egv egv1)
    {
        return egv1.p;
    }

    static Runnable g(egv egv1)
    {
        return egv1.y;
    }

    static Handler h(egv egv1)
    {
        return egv1.v;
    }

    public final void a(lyj lyj1)
    {
        lyj1.setContentView(b.ll);
        k = (ImageView)lyj1.findViewById(b.li);
        l = (ImageView)lyj1.findViewById(b.lj);
        m = (ImageView)lyj1.findViewById(b.lf);
        n = (ViewSwitcher)lyj1.findViewById(b.lk);
        f = k.getContext();
        h = (amh)olm.a(f, amh);
        i = (fli)olm.a(f, fli);
        g = (gql)olm.a(f, gql);
        e = (jes)olm.a(f, jes);
        r = (egt)olm.a(f, egp);
        t = (jgc)olm.a(f, jgc);
        s = noz.a(f, 3, "CastPresentation", new String[0]);
    }

    public final void b_(Object obj)
    {
        gqm gqm1 = g.b;
        if (gqm1.d && gqm1.a != null)
        {
            if (q != null || gqm1.a != null)
            {
                a(-1L);
                Object obj1;
                Object obj2;
                int i1;
                if (!c.c(q, gqm1.a))
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                q = gqm1.a;
                if (p == eha.a || i1 == 0)
                {
                    obj = (ViewGroup)n.getCurrentView();
                } else
                {
                    obj = (ViewGroup)n.getNextView();
                }
                if (o != null && i1 != 0)
                {
                    ((ViewGroup)n.getCurrentView()).removeView(o);
                    ((ViewGroup)n.getNextView()).removeView(o);
                    j.a(o, true);
                    e.a(null);
                    o = null;
                }
                obj1 = (ImageView)((ViewGroup) (obj)).findViewById(b.lh);
                obj2 = h.a(q).a(i.d());
                obj2.b = h.a(q).a(i.e());
                if (q.c().equals(euv.c))
                {
                    ((ame) (obj2)).a(((ImageView) (obj1)));
                } else
                {
                    obj3 = h.a(q).a(i.c());
                    obj3.b = ((ame) (obj2));
                    ((ame) (obj3)).a(((ImageView) (obj1)));
                }
                if (gqm1.a != null && gqm1.a.c() == euv.c && (i1 != 0 || !j.m))
                {
                    if (o == null)
                    {
                        obj1 = (FrameLayout)LayoutInflater.from(f).inflate(b.lm, null);
                        o = VideoViewHolder.a(((View) (obj1)));
                        ((FrameLayout) (obj1)).removeView(o);
                    }
                    if (i1 != 0)
                    {
                        ((ViewGroup) (obj)).addView(o, ((ViewGroup) (obj)).getChildCount(), new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
                    }
                    e.a(j);
                    obj1 = j;
                    ekp ekp1 = q;
                    int j1 = gqm1.b;
                    obj2 = o;
                    boolean flag = gqm1.f;
                    Object obj3 = (jdy)ekp1.b(jdy);
                    if (obj3 == null)
                    {
                        obj1.m = false;
                    } else
                    {
                        obj1.p = ekp1;
                        jgi jgi1 = (jgi)ekp1.b(jgi);
                        if (jgi1 != null)
                        {
                            ((ehb) (obj1)).d.a(jgi1);
                            ((ehb) (obj1)).c.a(((ehb) (obj1)).d.a());
                            ((ehb) (obj1)).c.d = true;
                        }
                        obj1.n = (jgl)ekp1.b(jgl);
                        obj1.o = (jdv)ekp1.b(jdv);
                        obj1.j = ((VideoViewHolder) (obj2));
                        obj1.k = j1;
                        ((ehb) (obj1)).g.a(((ehb) (obj1)).b, ((View) (obj2)), ((ehb) (obj1)).d, ((ehb) (obj1)).h);
                        if (!((jdy) (obj3)).a() && !((jdy) (obj3)).b())
                        {
                            if (jee.b.equals(((jdy) (obj3)).d))
                            {
                                obj = (TextView)((View) (obj)).findViewById(b.lg);
                                ((TextView) (obj)).setText(b.ln);
                                ((TextView) (obj)).setVisibility(0);
                            }
                            obj1.m = false;
                        } else
                        {
                            obj1.m = true;
                            obj = (new jed(((jdy) (obj3)), new egu(), (jdr)olm.a(((ehb) (obj1)).a, jdr))).a().a;
                            if (((jdy) (obj3)).c() && !nkj.a(((Uri) (obj)).toString()))
                            {
                                obj = String.valueOf(obj);
                                throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 58)).append("Security exception: video requires auth for non-fife Uri: ").append(((String) (obj))).toString());
                            }
                            if (((ehb) (obj1)).i != null)
                            {
                                ((ehb) (obj1)).a(((VideoViewHolder) (obj2)), true);
                            }
                            ((ehb) (obj1)).b.a.a(((ehb) (obj1)).q, false);
                            ((ehb) (obj1)).c.a.a(((ehb) (obj1)).r, false);
                            if (((ehb) (obj1)).i == null || ((ehb) (obj1)).i.i())
                            {
                                boolean flag1 = ((jdy) (obj3)).c();
                                obj = new jfq(((ehb) (obj1)).a, ((Uri) (obj)), flag1);
                                if (flag1)
                                {
                                    Uri uri = ((jfq) (obj)).c;
                                    if (b.e(uri) && !b.f(uri))
                                    {
                                        throw new IllegalStateException("Security exception: video urls must be proxied for streaming.");
                                    }
                                    ((ehb) (obj1)).a(((jfq) (obj)), false);
                                } else
                                {
                                    ((ehb) (obj1)).a(((jfq) (obj)), true);
                                }
                                obj1.i = ((jfq) (obj));
                                ((ehb) (obj1)).g.a = ((ehb) (obj1)).i;
                            }
                            obj = ((ehb) (obj1)).i;
                            obj.i = new ehh(((ehb) (obj1)), flag);
                            obj.j = new ehg(((ehb) (obj1)));
                            obj.l = new ehf(((ehb) (obj1)));
                            obj.k = new ehe(((ehb) (obj1)));
                            ((jfq) (obj)).a(((android.media.MediaPlayer.OnVideoSizeChangedListener) (obj2)));
                            ((VideoViewHolder) (obj2)).b();
                            ((VideoViewHolder) (obj2)).a(((ehb) (obj1)).i);
                            if (((ehb) (obj1)).i.e() && ((ehb) (obj1)).i.isPlaying())
                            {
                                ((VideoViewHolder) (obj2)).setKeepScreenOn(true);
                                ((VideoViewHolder) (obj2)).a(true);
                                ((ehb) (obj1)).f.a(jek.b);
                            }
                        }
                    }
                }
                if (i1 != 0 && p != eha.a)
                {
                    obj = n;
                    obj1 = f;
                    if (gqm1.c == gqo.b)
                    {
                        i1 = b.ld;
                    } else
                    {
                        i1 = b.le;
                    }
                    ((ViewSwitcher) (obj)).setOutAnimation(((Context) (obj1)), i1);
                    n.showNext();
                }
            }
            if (p == eha.a)
            {
                if (u)
                {
                    v.removeCallbacks(y);
                    n.setAlpha(0.0F);
                    n.animate().setListener(new due(n)).setDuration(300L).alpha(1.0F).start();
                } else
                {
                    n.setVisibility(0);
                }
                p = eha.b;
            }
        }
    }

    public final void onStart()
    {
        j = new ehb(f);
        g.a.a(this, true);
        if (g.b.e)
        {
            u = true;
            k.setRotation(-630F);
            l.setRotation(-630F);
            k.setScaleX(0.85F);
            k.setScaleY(0.85F);
            l.setScaleY(0.0F);
            l.setScaleX(0.0F);
            k.setAlpha(0.0F);
            m.setAlpha(0.0F);
            k.animate().setDuration(1550L).rotation(0.0F).scaleX(1.0F).scaleY(1.0F).setInterpolator(c).setListener(new egz(this)).start();
            k.animate().setDuration(350L).alpha(1.0F).setListener(new due(k)).setInterpolator(d).start();
            l.animate().rotation(0.0F).setDuration(1550L).setListener(new due(l)).setInterpolator(c).start();
            l.animate().setStartDelay(400L).setDuration(1150L).scaleX(1.0F).scaleY(1.0F).setInterpolator(c).start();
            m.animate().setDuration(350L).alpha(1.0F).setListener(new due(m)).start();
        } else
        {
            u = false;
        }
        a(-1L);
        t.a.a(z, true);
    }

    public final void onStop()
    {
        g.a.a(this);
        ehb ehb1 = j;
        ehb1.a(ehb1.j, true);
        if (ehb1.l != null)
        {
            ehb1.l.cancel(true);
        }
        e.a(null);
        b();
        v.removeCallbacks(y);
        t.a.a(z);
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(5L);
        b = new oqe("debug.cast.timeout", String.valueOf(a));
    }
}
