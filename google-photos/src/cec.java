// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.apps.moviemaker.MovieMakerActivity;
import com.google.android.apps.moviemaker.ui.VideoTrimView;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import java.io.IOException;
import java.util.Set;

public class cec extends omp
    implements android.view.TextureView.SurfaceTextureListener, bln, chf, chh, jih, jjg, orv, otz
{

    private static final String a = cec.getSimpleName();
    private static final blo b = (blo)ddz.a(blo);
    private VideoTrimView ag;
    private VideoWithPreviewView ah;
    private bza ai;
    private bzj aj;
    private orr ak;
    private ork al;
    private oty am;
    private jjc an;
    private blo ao;
    private blj ap;
    private final ovo c;
    private final osu d = new osu();
    private final ceg e = new ceg(this);
    private volatile boolean f;
    private volatile boolean g;
    private ViewGroup h;

    public cec()
    {
        c = new ovo(af);
        al = ork.a;
        ao = b;
        (new msi(pwp.U)).a(ae);
        new msh(af, (byte)0);
        c.i();
    }

    static VideoWithPreviewView a(cec cec1)
    {
        return cec1.ah;
    }

    private void a(SurfaceTexture surfacetexture, boolean flag)
    {
        if (am == null || an == null)
        {
            return;
        }
        Surface surface = null;
        if (surfacetexture != null)
        {
            surface = new Surface(surfacetexture);
        }
        f = false;
        if (flag)
        {
            am.b(an, 1, surface);
            return;
        } else
        {
            am.a(an, 1, surface);
            return;
        }
    }

    static void a(cec cec1, boolean flag)
    {
        if (cec1.am != null)
        {
            cec1.am.a(0, flag);
            cec1.am.a(1, flag);
            if (flag)
            {
                cec1.am.a(cec1.am.f());
            }
        }
    }

    private View b(int i)
    {
        View view = h.findViewById(i);
        String s1 = String.valueOf(g().getResourceName(i));
        return (View)c.a(view, (new StringBuilder(String.valueOf(s1).length() + 19)).append("View ").append(i).append(" / ").append(s1).toString(), null);
    }

    static ovo b(cec cec1)
    {
        return cec1.c;
    }

    static void c(cec cec1)
    {
        cec1.u();
    }

    static void d(cec cec1)
    {
        cec1.w();
    }

    static oty e(cec cec1)
    {
        return cec1.am;
    }

    static ceg f(cec cec1)
    {
        return cec1.e;
    }

    static osu g(cec cec1)
    {
        return cec1.d;
    }

    private void u()
    {
        am = new oty(4, 0, 0);
        g = false;
        am.a(this);
        am.a(aj);
        am.a(this);
        ai.a(am);
        ah.a(am, 0);
        x();
        w();
    }

    private void v()
    {
        ai.a(null);
        if (am != null)
        {
            am.d();
            am = null;
            g = false;
        }
        d.c(e);
        an = null;
    }

    private void w()
    {
        if (ak != null && am != null && d.a(e) && !g)
        {
            g = true;
            Object obj1 = new jil(ad, ak.a.a, null);
            an = new cef(this, ad, ((jjl) (obj1)));
            Object obj = an;
            obj1 = new jin(((jjl) (obj1)));
            bzc bzc1 = new bzc(ai);
            oua oua1 = new oua(ad, ah, c);
            am.a(new jig[] {
                obj, obj1, bzc1, oua1
            });
            obj = ah.a.getSurfaceTexture();
            if (obj != null)
            {
                a(((SurfaceTexture) (obj)), false);
            }
            if (android.os.Build.VERSION.SDK_INT < 21 && ak != null)
            {
                ah.b(ak.a.e);
                return;
            }
        }
    }

    private void x()
    {
        if (am != null)
        {
            int i = 0x80000000;
            if (am.b() || !f)
            {
                i = 0x7fffffff;
            }
            d.a(e, i);
        }
    }

    private rv y()
    {
        return ((rz)O_()).e().a();
    }

    public final void F_()
    {
        if (y() != null)
        {
            y().d();
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        y().d();
        h = (ViewGroup)layoutinflater.inflate(c.x, viewgroup, false);
        ag = (VideoTrimView)b(b.hp);
        layoutinflater = new ori(O_(), (View)ag.getParent());
        layoutinflater.c = g().getColor(b.dn);
        layoutinflater.d = g().getColor(b._flddo);
        viewgroup = ag;
        viewgroup.b = layoutinflater;
        if (((VideoTrimView) (viewgroup)).b != null)
        {
            ((VideoTrimView) (viewgroup)).b.b = ((VideoTrimView) (viewgroup)).a;
        }
        ai = new bza(ad);
        ah = (VideoWithPreviewView)b(b.hq);
        ah.c = this;
        ah.setOnClickListener(new msj(ai.b()));
        h.getViewTreeObserver().addOnGlobalLayoutListener(new ced(this));
        layoutinflater = (ImageView)b(b.gx);
        layoutinflater.setOnClickListener(new msj(ai.b()));
        ai.a(layoutinflater);
        viewgroup = y();
        viewgroup.c(c.ai);
        viewgroup.a(0.0F);
        aj = new bzj(ad, null, null, new View[] {
            layoutinflater
        });
        h.setOnClickListener(aj);
        return h;
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        c.a = activity;
    }

    public final void a(blo blo1)
    {
        if (blo1 == null)
        {
            ao = b;
            return;
        } else
        {
            ao = blo1;
            return;
        }
    }

    public final void a(jie jie)
    {
        if (d.a > 1)
        {
            int i = d.a;
            Log.e(a, "Unable to play video, retrying with fewer decoders.");
            v();
            d.b(i - 1);
            u();
            return;
        } else
        {
            Log.e(a, "Unable to play video", jie);
            ah.b();
            return;
        }
    }

    public final void a(orr orr1, Set set)
    {
    }

    public final void a(orr orr1, oru oru)
    {
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            ao.a();
        }
    }

    public final void a(boolean flag, int i)
    {
        x();
    }

    public final boolean a(cql cql1, Uri uri, long l, long l1)
    {
        if (ak != null)
        {
            if (c.c(ak.a.a, uri))
            {
                return true;
            }
            ak.b(this);
            ak = null;
        }
        if (am != null)
        {
            am.c();
            an = null;
        }
        try
        {
            otg otg1 = new otg();
            otg1.a = uri;
            otg1.b = cql1.j;
            otg1.f = cql1.f;
            otg1.c = cql1.c;
            otg1.d = cql1.d;
            otg1.e = cql1.a;
            otg1.g = cql1.h;
            otg1.h = cql1.i;
            cql1 = otg1.a();
        }
        // Misplaced declaration of an exception variable
        catch (cql cql1)
        {
            Log.e(a, "Failed to convert VideoMetadata: input data invalid.", cql1);
            return false;
        }
        uri = new ort();
        uri.a = cql1;
        uri.b = false;
        ak = uri.a();
        ak.a(l);
        ak.b(l1);
        ak.a(this);
        c.a(d);
        c.a(cql1);
        if (2 < d.a)
        {
            throw new IllegalStateException("Cannot lower MaxHardwareVideoDecoders.");
        } else
        {
            d.a(2);
            ak.a(this);
            ak.a(aj);
            ah.a(cql1.a());
            al = new ork(((ote) (cql1)).f);
            ag.a(ak, c, al);
            ag.setVisibility(0);
            ai.a(ak);
            w();
            return true;
        }
    }

    public final void aj_()
    {
        super.aj_();
        v();
        if (c != null)
        {
            c.i();
        }
    }

    public final void ak_()
    {
        ap.a.d(this);
        rv rv1 = y();
        rv1.e();
        rv1.a(null);
        super.ak_();
    }

    public final void b(orr orr1, Set set)
    {
        ao.a(orr1.e, orr1.f);
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ap = MovieMakerActivity.b(this).d.h;
        ap.a.c(this);
    }

    public final void e()
    {
        (new Handler(Looper.getMainLooper())).post(new cee(this));
    }

    public final void n()
    {
        super.n();
        ag.a(null, null, ork.a);
        ork.a.b(ag);
        ai.a(null);
        if (ak != null)
        {
            ak.b(this);
            ak.b(aj);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        a(surfacetexture, false);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        a(surfacetexture, true);
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public final void r()
    {
        x();
    }

    public final void s()
    {
        ao.a();
    }

    public final void s_()
    {
        super.s_();
        c.a = null;
    }

    public final void t()
    {
        f = true;
        x();
    }

    public final void z_()
    {
        x();
    }

}
