// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.apps.consumerphotoeditor.video.EditorVideoControllerView;
import com.google.android.apps.consumerphotoeditor.views.ActionBarView;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import java.util.Set;

public final class bgv extends omp
    implements android.view.TextureView.SurfaceTextureListener, bgp, bhc, iuv, jih, jjg, mti, orv, otz
{

    public mtj a;
    private volatile boolean ag;
    private volatile boolean ah;
    private noz ai;
    private rv aj;
    private VideoWithPreviewView ak;
    private EditorVideoControllerView al;
    private VideoTrimView am;
    private ActionBarView an;
    private ovo ao;
    private fbj ap;
    private bgs aq;
    private ork ar;
    private long as;
    public Uri b;
    public orr c;
    public oty d;
    public jjc e;
    private final osu f = new osu();
    private final bgz g = new bgz(this);
    private final bgo h;

    public bgv()
    {
        h = new bgo(this, af, this, f);
        ar = ork.a;
        as = -1L;
    }

    static long a(bgv bgv1, long l)
    {
        bgv1.as = -1L;
        return -1L;
    }

    static VideoWithPreviewView a(bgv bgv1)
    {
        return bgv1.ak;
    }

    private void a(SurfaceTexture surfacetexture, boolean flag)
    {
        if (d == null || e == null)
        {
            return;
        }
        Surface surface = null;
        if (surfacetexture != null)
        {
            surface = new Surface(surfacetexture);
        }
        ag = false;
        if (flag)
        {
            d.b(e, 1, surface);
            return;
        } else
        {
            d.a(e, 1, surface);
            return;
        }
    }

    private void a(Uri uri, orr orr1)
    {
        if (c != null)
        {
            c.b(this);
        }
        if (d != null)
        {
            d.c();
            e = null;
        }
        c = orr1;
        b = uri;
        if (c != null)
        {
            uri = c.a;
        } else
        {
            uri = null;
        }
        orr1 = w();
        ((bgr) (orr1)).a.a(uri);
        ao = ((bgr) (orr1)).a;
        if (c != null)
        {
            orr1 = c;
            int i = fbj.a(orr1.a.c, orr1.a.d);
            if (i < f.a)
            {
                throw new IllegalStateException("Cannot lower MaxHardwareVideoDecoders.");
            }
            f.a(i);
            c.a(this);
            c.a(aq);
            ak.a(uri.a());
            if (as == -1L)
            {
                as = c.c();
            }
            ar = new ork(((ote) (uri)).f);
            am.a(c, ao, ar);
            am.setVisibility(0);
            uri = an;
            boolean flag;
            if (!c.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            uri.a(flag);
        } else
        {
            am.a(null, null, ork.a);
            am.setVisibility(8);
        }
        al.a(c);
        x();
    }

    static void a(bgv bgv1, boolean flag)
    {
        if (bgv1.d != null)
        {
            bgv1.d.a(0, flag);
            bgv1.d.a(1, flag);
            if (flag)
            {
                bgv1.d.a(bgv1.d.f());
            }
        }
    }

    private void a(boolean flag)
    {
        an.setEnabled(flag);
        al.setEnabled(flag);
        am.setEnabled(flag);
        ak.setEnabled(flag);
    }

    static oty b(bgv bgv1)
    {
        return bgv1.d;
    }

    static long c(bgv bgv1)
    {
        return bgv1.as;
    }

    static void d(bgv bgv1)
    {
        bgv1.x();
    }

    static bgz e(bgv bgv1)
    {
        return bgv1.g;
    }

    static osu f(bgv bgv1)
    {
        return bgv1.f;
    }

    private void u()
    {
        d = new oty(4, 0, 0);
        ah = false;
        d.a(this);
        d.a(aq);
        d.a(this);
        al.a(d);
        ak.a(d, 0);
        y();
        x();
        if (ao != null)
        {
            ao.h();
        }
    }

    private void v()
    {
        al.a(null);
        if (d != null)
        {
            if (d.a() != 1)
            {
                as = d.f();
            }
            d.d();
            d = null;
            ah = false;
        }
        f.c(g);
        e = null;
        if (ao != null)
        {
            ao.i();
        }
    }

    private bgr w()
    {
        Object obj = super.B.a("ThumbnailProducerFragment");
        if (obj == null)
        {
            throw new IllegalStateException("No ThumbnailProducerFragment was bound!");
        }
        if (!(obj instanceof bgr))
        {
            obj = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 44)).append("Unexpected ThumbnailProducerFragment bound! ").append(((String) (obj))).toString());
        } else
        {
            obj = (bgr)obj;
            osu osu1 = f;
            ((bgr) (obj)).a.a(osu1);
            return ((bgr) (obj));
        }
    }

    private void x()
    {
        if (b != null && c != null && d != null && f.a(g) && !ah)
        {
            ah = true;
            Object obj1 = new jil(ad, b, null);
            e = new bgy(this, ad, ((jjl) (obj1)));
            Object obj = e;
            obj1 = new jin(((jjl) (obj1)));
            otw otw1 = new otw(al);
            oua oua1 = new oua(ad, ak, w().a);
            d.a(new jig[] {
                obj, obj1, otw1, oua1
            });
            obj = ak.a.getSurfaceTexture();
            if (obj != null)
            {
                a(((SurfaceTexture) (obj)), false);
            }
            if (android.os.Build.VERSION.SDK_INT < 21 && c != null)
            {
                ak.b(c.a.e);
                return;
            }
        }
    }

    private void y()
    {
        if (d != null)
        {
            int i = 0x80000000;
            if (d.b() || !ag)
            {
                i = 0x7fffffff;
            }
            f.a(g, i);
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = ad.getResources();
        layoutinflater = layoutinflater.inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_video_editor_fragment, viewgroup, false);
        layoutinflater.setWillNotDraw(false);
        layoutinflater.setBackgroundColor(0xff000000);
        al = (EditorVideoControllerView)O_().findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_player_controls);
        ak = (VideoWithPreviewView)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_video_view);
        ak.c = this;
        viewgroup = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.photos_videoplayer_list_empty_progress);
        Object obj = ak;
        obj.b = viewgroup;
        ((VideoWithPreviewView) (obj)).c();
        layoutinflater.getViewTreeObserver().addOnGlobalLayoutListener(new bgw(this));
        am = (VideoTrimView)O_().findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_video_trim);
        viewgroup = new ori(O_(), (View)am.getParent());
        viewgroup.c = bundle.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_video_trim_fg_color);
        viewgroup.d = 0xff000000;
        bundle = am;
        bundle.c = viewgroup;
        if (((VideoTrimView) (bundle)).c != null)
        {
            ((VideoTrimView) (bundle)).c.b = ((VideoTrimView) (bundle)).b;
        }
        am.a = new orf(O_());
        viewgroup = (ImageView)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_play_pause_view);
        b.a(viewgroup, new msm(pwu.M));
        viewgroup.setOnClickListener(new msj(new otx(al)));
        al.a(viewgroup);
        aj = ((rz)O_()).e().a();
        an = ActionBarView.a((rz)O_());
        an.b = this;
        an.a(false);
        bundle = O_().findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_video_toolbar_gradient);
        obj = (bec)O_();
        aq = new bgs(ad, ((bec) (obj)), aj, am, new View[] {
            al, viewgroup, bundle
        });
        ak.setOnClickListener(aq);
        layoutinflater.setOnClickListener(aq);
        return layoutinflater;
    }

    public final void a(Uri uri)
    {
        boolean flag = true;
        if (b.c(uri))
        {
            a(true);
            u();
            return;
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, "video/mp4");
        intent.addFlags(1);
        if (guc.c.name().equals(O_().getIntent().getStringExtra("com.google.android.apps.photos.photoeditor.contract.external_action")))
        {
            flag = false;
        }
        intent.putExtra("com.google.android.apps.photos.photoeditor.contract.save_as_copy", flag);
        intent.putExtra("com.google.android.apps.photos.photoeditor.contract.edit_list", new byte[0]);
        O_().setResult(-1, intent);
        O_().finish();
        O_().overridePendingTransition(0, 0);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        if (bundle != null)
        {
            a((Uri)bundle.getParcelable("video_uri"), (orr)bundle.getParcelable("editable_video"));
            as = bundle.getLong("playback_position", -1L);
            return;
        } else
        {
            a(((Uri) (null)), ((orr) (null)));
            return;
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        mua = null;
        if ("LoadVideoTask".equals(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (b.a(mue1, "LoadVideoTask", ai))
        {
            s = (Uri)mue1.a().getParcelable("result_video_uri");
            mue1 = (orr)mue1.a().getParcelable("result_video");
        } else
        {
            s = null;
            mue1 = mua;
        }
        if (s != null && !s.equals(b)) goto _L1; else goto _L3
_L3:
        if (mue1 != null && ((orr) (mue1)).b) goto _L5; else goto _L4
_L4:
        if (mue1 != null) goto _L7; else goto _L6
_L6:
        Toast.makeText(ad, com.google.android.apps.consumerphotoeditor.R.string.cpe_load_video_error, 1).show();
_L8:
        O_().finish();
        O_().overridePendingTransition(0, 0);
        return;
_L7:
        if (!((orr) (mue1)).b)
        {
            Toast.makeText(ad, com.google.android.apps.consumerphotoeditor.R.string.cpe_video_duration_error_msg, 1).show();
        }
        if (true) goto _L8; else goto _L5
_L5:
        a(((Uri) (s)), ((orr) (mue1)));
        return;
    }

    public final void a(jie jie)
    {
        if (f.a > 1)
        {
            int i = f.a - 1;
            if (ai.a())
            {
                noy.a("newMax", Integer.valueOf(i));
            }
            v();
            f.b(i);
            u();
            return;
        } else
        {
            ak.b();
            return;
        }
    }

    public final void a(orr orr1, Set set)
    {
    }

    public final void a(orr orr1, oru oru)
    {
    }

    public final void a(boolean flag, int i)
    {
        super.R.post(new bgx(this, i));
        y();
    }

    public final void a_(Bundle bundle)
    {
        if ("LoadVideoTask".equals(bundle.getString("arg_task_tag")))
        {
            O_().finish();
        }
    }

    public final void aj_()
    {
        super.aj_();
        v();
    }

    public final void au_()
    {
        super.au_();
        if (!h.e)
        {
            u();
        }
    }

    public final void b(orr orr1, Set set)
    {
        if (an != null)
        {
            set = an;
            boolean flag;
            if (!orr1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            set.a(flag);
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ai = noz.a(ad, "VideoEditorFragment", new String[0]);
        ap = (fbj)super.ae.a(fbj);
        a = (mtj)ae.a(mtj);
        a.a(this);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("video_uri", b);
        bundle.putParcelable("editable_video", c);
        if (d != null && d.a() != 1)
        {
            bundle.putLong("playback_position", d.f());
        } else
        if (as != -1L)
        {
            bundle.putLong("playback_position", as);
            return;
        }
    }

    public final void n()
    {
        super.n();
        am.a(null, null, ork.a);
        al.a(null);
        if (c != null)
        {
            c.b(this);
            c.b(aq);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        a(surfacetexture, false);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        a(surfacetexture, true);
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public final void r()
    {
        y();
    }

    public final void t()
    {
        ag = true;
        y();
    }

    public final void w_()
    {
        boolean flag1 = false;
        bgo bgo1;
        Object obj;
        Object obj1;
        Uri uri;
        boolean flag;
        if (!c.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Saving identity edit.");
        a(false);
        v();
        bgo1 = h;
        obj = c;
        obj1 = b;
        uri = (Uri)O_().getIntent().getParcelableExtra("com.google.android.apps.photos.photoeditor.contract.output_uri");
        if (!bgo1.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Save already in progress!");
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "No video provided.");
        flag = flag1;
        if (!b.c(((Uri) (obj1))))
        {
            flag = true;
        }
        p.a(flag, "No video URI provided.");
        bgo1.b = ((orr) (obj));
        bgo1.c = ((Uri) (obj1));
        bgo1.d = uri;
        bgo1.e = true;
        obj = bgo1.a;
        obj1 = (new imo()).a(bgo1.c);
        obj1.a = true;
        obj1.b = true;
        ((mtj) (obj)).a(((imo) (obj1)).a());
        bgo1.b();
    }

    public final void z_()
    {
        y();
    }
}
