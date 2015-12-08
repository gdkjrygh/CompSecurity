// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.consumerphotoeditor.core.PipelineParams;
import com.google.android.apps.consumerphotoeditor.core.Renderer;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import com.google.android.apps.consumerphotoeditor.views.ActionBarView;
import com.google.android.apps.consumerphotoeditor.views.CropOverlayView;
import java.util.HashMap;

public final class bem extends omp
    implements bds, bhc
{

    private static final int g = ViewConfiguration.getDoubleTapTimeout();
    final Handler a = new Handler();
    private boolean aA;
    private noz ag;
    private noz ah;
    private volatile boolean ai;
    private FrameLayout aj;
    private Handler ak;
    private ScaleGestureDetector al;
    private boolean am;
    private bfa an;
    private PointF ao;
    private PointF ap;
    private long aq;
    private bez ar;
    private mwx as;
    private int at;
    private ActionBarView au;
    private MenuItem av;
    private int aw;
    private boolean ax;
    private boolean ay;
    private final Handler az = new Handler();
    public volatile boolean b;
    bdo c;
    public GLSurfaceView d;
    CropOverlayView e;
    public final RectF f = new RectF();
    private long h;

    public bem()
    {
        h = 0L;
        ai = false;
        b = false;
        am = false;
        an = bfa.a;
        ao = new PointF();
        ap = new PointF();
        aq = 0L;
        at = 0;
        aw = bey.a;
        ax = false;
        ay = false;
        new msh(af, (byte)0);
    }

    static olq A(bem bem1)
    {
        return bem1.ad;
    }

    static olq B(bem bem1)
    {
        return bem1.ad;
    }

    static PointF C(bem bem1)
    {
        return bem1.ao;
    }

    static void D(bem bem1)
    {
        if (b.t())
        {
            View view = ((am) (bem1)).R;
            if (view != null)
            {
                view.setBackgroundColor(0xff000000);
                bem1.O_().findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_content_overlay).setAlpha(1.0F);
                bem1.u();
                if (bem1.ay)
                {
                    ((ConsumerPhotoEditorActivity)bem1.O_()).k();
                    bem1.ay = false;
                }
            }
            return;
        } else
        {
            bem1.as.a(new bev(bem1));
            return;
        }
    }

    static boolean E(bem bem1)
    {
        return bem1.ai;
    }

    static boolean F(bem bem1)
    {
        return bem1.b;
    }

    static boolean G(bem bem1)
    {
        if (bem1.at != 0) goto _L2; else goto _L1
_L1:
        if (!bem1.ah.a());
_L4:
        return false;
_L2:
        if (bem1.c.r)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!bem1.ah.a());
        if (true) goto _L4; else goto _L3
_L3:
        bdo bdo1 = bem1.c;
        String s1 = bem1.a(com.google.android.apps.consumerphotoeditor.R.string.cpe_crop_banner);
        Paint paint = new Paint();
        paint.setColor(bem1.g().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_crop_banner_text));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTextSize(bem1.g().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_crop_rectangle_banner_text_size));
        paint.setAntiAlias(true);
        Paint paint1 = new Paint();
        paint1.setColor(bem1.g().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_crop_fixed_aspect_ratio));
        paint1.setStyle(android.graphics.Paint.Style.FILL);
        Rect rect = new Rect();
        paint.getTextBounds(s1, 0, s1.length(), rect);
        int j1 = bem1.g().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_crop_rectangle_border_width);
        rect.set(0, 0, rect.width() + bem1.g().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_crop_rectangle_banner_horizontal_padding) * 2, (rect.height() - j1) + bem1.g().getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_crop_rectangle_banner_vertical_padding) * 2);
        Bitmap bitmap = Bitmap.createBitmap(rect.width(), rect.height(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0);
        canvas.drawRect(rect, paint1);
        int i1 = rect.width() / 2;
        j1 = (int)((float)(rect.height() + j1) / 2.0F - (paint.descent() + paint.ascent()) / 2.0F);
        canvas.drawText(s1, i1, j1, paint);
        i1 = bem1.at;
        if (i1 != 0 && bdo1.k != null && Math.max(bdo1.k.getWidth(), bdo1.k.getHeight()) > i1)
        {
            Bitmap bitmap1 = bdo1.k;
            int k1 = Math.max(bitmap1.getWidth(), bitmap1.getHeight());
            float f1 = Math.min(1.0F, (float)i1 / (float)k1);
            bdo1.k = Bitmap.createScaledBitmap(bitmap1, Math.round((float)bitmap1.getWidth() * f1), Math.round(f1 * (float)bitmap1.getHeight()), false);
        }
        if (bdo1.b.setGPUInputImage(bdo1.k, bitmap, bdo1.m))
        {
            bem1.g(0);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    static boolean H(bem bem1)
    {
        return bem1.ax;
    }

    static boolean I(bem bem1)
    {
        return bem1.am;
    }

    static noz J(bem bem1)
    {
        return bem1.ah;
    }

    static Handler K(bem bem1)
    {
        return bem1.a;
    }

    static int a(bem bem1, int i1)
    {
        bem1.aw = i1;
        return i1;
    }

    static long a(bem bem1, long l1)
    {
        bem1.aq = l1;
        return l1;
    }

    static PointF a(bem bem1, PointF pointf)
    {
        bem1.ao = pointf;
        return pointf;
    }

    static bfa a(bem bem1, bfa bfa1)
    {
        bem1.an = bfa1;
        return bfa1;
    }

    private void a(int i1, int j1)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)aj.getLayoutParams();
        layoutparams.topMargin = i1;
        layoutparams.bottomMargin = j1;
        aj.setLayoutParams(layoutparams);
    }

    static void a(bem bem1)
    {
        bem1.u();
    }

    private void a(bp bp1, boolean flag)
    {
        bfk bfk1 = (bfk)super.B.a("StrengthToolbarFragment");
        if (bfk1 == null || ((am) (bfk1)).v)
        {
            bfk1 = bfk.a(flag);
            bp1.b(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar, bfk1, "StrengthToolbarFragment");
            bp1 = bfk1;
        } else
        {
            ((am) (bfk1)).q.putBoolean("hideCancelAndAccept", flag);
            bp1 = bfk1;
        }
        bp1.r();
    }

    private void a(bp bp1, boolean flag, boolean flag1)
    {
        bfo bfo1;
        bfo bfo2;
        if (ax)
        {
            ((ConsumerPhotoEditorActivity)O_()).k();
        } else
        {
            ay = true;
        }
        bfo2 = (bfo)super.B.a("ToolbarFragment");
        bfo1 = bfo2;
        if (bfo2 == null)
        {
            bfo1 = new bfo();
            bp1.b(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar, bfo1, "ToolbarFragment");
        }
        bfo1.r();
        if (flag != flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag1, flag);
    }

    private void a(msp msp)
    {
        mry.a(ad, 4, (new msn()).a(new msm(msp)).a(new msm(pwu.G)).a(new msm(pwu.F)).a(ad));
    }

    private void a(boolean flag)
    {
        bej bej1 = (bej)super.B.a("EditSessionFragment");
        bej1.c = true;
        bej1.d = flag;
        bej1.a("SavePhotoTag", false);
        if (bej1.a.a("LoadFullSizePhotoTask"))
        {
            bej1.u();
            return;
        }
        if (!bej1.b.v)
        {
            if (!bej1.b.s)
            {
                bej1.s();
                bej1.u();
                return;
            }
            if (!bej1.b.t)
            {
                bej1.t();
                return;
            } else
            {
                bej1.r();
                return;
            }
        } else
        {
            bej1.r();
            return;
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        View view = O_().findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar);
        if (view == null)
        {
            return;
        }
        Object obj = view.getBackground();
        if (obj instanceof bdu)
        {
            obj = (bdu)obj;
        } else
        {
            int i1 = g().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_toolbar_background);
            int j1 = g().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_toolbar_gradient_background);
            obj = new bdu(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
                i1, i1
            }, new int[] {
                0, j1
            });
            ((bdu) (obj)).a(true, bgb.b);
            ((bdu) (obj)).a(false, bgb.c);
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                view.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            } else
            {
                view.setBackground(((android.graphics.drawable.Drawable) (obj)));
            }
        }
        if (flag1)
        {
            long l1;
            if (flag)
            {
                l1 = 400L;
            } else
            {
                l1 = 150L;
            }
            obj.c = SystemClock.uptimeMillis();
            obj.d = l1 + ((bdu) (obj)).c;
            obj.e = flag;
            ((bdu) (obj)).invalidateSelf();
            obj.f = true;
            return;
        }
        obj.e = flag;
        int ai1[];
        if (flag)
        {
            ai1 = ((bdu) (obj)).a;
        } else
        {
            ai1 = ((bdu) (obj)).b;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            ((bdu) (obj)).setColors(ai1);
        }
        obj.f = false;
    }

    static boolean a(bem bem1, boolean flag)
    {
        bem1.ai = flag;
        return flag;
    }

    static int b(bem bem1, int i1)
    {
        bem1.at = i1;
        return i1;
    }

    static long b(bem bem1)
    {
        return bem1.h;
    }

    static PointF b(bem bem1, PointF pointf)
    {
        bem1.ap = pointf;
        return pointf;
    }

    static boolean b(bem bem1, boolean flag)
    {
        bem1.b = flag;
        return flag;
    }

    static GLSurfaceView c(bem bem1)
    {
        return bem1.d;
    }

    static boolean c(bem bem1, boolean flag)
    {
        bem1.ax = true;
        return true;
    }

    static void d(bem bem1)
    {
        if (!bem1.c.i())
        {
            bdo bdo1 = bem1.c;
            bdo1.h = bdo1.e;
            bdo1.e = new PipelineParams();
            bdo1.e.rotateAngle = bdo1.h.rotateAngle;
            bdo1.e.straightenAngle = bdo1.h.straightenAngle;
            bdo1.e.cropLeft = bdo1.h.cropLeft;
            bdo1.e.cropTop = bdo1.h.cropTop;
            bdo1.e.cropRight = bdo1.h.cropRight;
            bdo1.e.cropBottom = bdo1.h.cropBottom;
            bdo1.e.a(bdo1.h);
            bdo1.e();
            bem1 = bem1.O_().findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_original_label);
            if (bem1 != null)
            {
                bem1.animate().alpha(1.0F).setDuration(75L);
            }
        }
    }

    static boolean d(bem bem1, boolean flag)
    {
        bem1.am = false;
        return false;
    }

    static olq e(bem bem1)
    {
        return bem1.ad;
    }

    static olq f(bem bem1)
    {
        return bem1.ad;
    }

    static boolean g(bem bem1)
    {
        return bem1.aA;
    }

    static void h(bem bem1)
    {
        if (bem1.aA)
        {
            bem1.aA = false;
            bem1 = (ConsumerPhotoEditorActivity)bem1.O_();
            bem1.c(null);
            bem1.k();
        }
    }

    static void i(bem bem1)
    {
        if (!bem1.aA)
        {
            bem1.aA = true;
            bem1 = (ConsumerPhotoEditorActivity)bem1.O_();
            bem1.b(null);
            bem1.l();
        }
    }

    static olq j(bem bem1)
    {
        return bem1.ad;
    }

    static olq k(bem bem1)
    {
        return bem1.ad;
    }

    static void l(bem bem1)
    {
        bem1.w();
    }

    static bfa m(bem bem1)
    {
        return bem1.an;
    }

    static bdo n(bem bem1)
    {
        return bem1.c;
    }

    static int o(bem bem1)
    {
        return bem1.aw;
    }

    static olq p(bem bem1)
    {
        return bem1.ad;
    }

    static olq q(bem bem1)
    {
        return bem1.ad;
    }

    static olq r(bem bem1)
    {
        return bem1.ad;
    }

    static olq s(bem bem1)
    {
        return bem1.ad;
    }

    static int t()
    {
        return g;
    }

    static PointF t(bem bem1)
    {
        return bem1.ap;
    }

    static ScaleGestureDetector u(bem bem1)
    {
        return bem1.al;
    }

    private void u()
    {
        int i1 = 1;
        boolean flag = false;
        if (au != null)
        {
            boolean flag2 = c.c();
            boolean flag3 = c.a(guc.a);
            Object obj = au;
            boolean flag1;
            if (flag2 || flag3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ((ActionBarView) (obj)).a(flag1);
            obj = au;
            if (flag3 || !ax)
            {
                i1 = 0;
            }
            if (((ActionBarView) (obj)).a != null)
            {
                obj = ((ActionBarView) (obj)).a;
                if (i1 != 0)
                {
                    i1 = ((flag) ? 1 : 0);
                } else
                {
                    i1 = 4;
                }
                ((View) (obj)).setVisibility(i1);
            }
            if (av != null)
            {
                av.setVisible(flag2);
            }
        }
    }

    static Handler v(bem bem1)
    {
        return bem1.ak;
    }

    private void v()
    {
        boolean flag = false;
        Resources resources = g();
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (resources.getConfiguration().orientation == 2)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (au == null)
        {
            i1 = 0;
        } else
        {
            i1 = au.getHeight();
        }
        if (!b.a(ad, resources))
        {
            k1 = 0;
        } else
        {
            k1 = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        }
        if (!b.a(ad, resources) || !b.a(resources) || android.os.Build.VERSION.SDK_INT >= 21)
        {
            l1 = 0;
        } else
        {
            l1 = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        }
        if (j1 != 0)
        {
            i1 = 0;
        }
        i2 = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_lower_toolbar_height);
        if (j1 != 0)
        {
            j1 = ((flag) ? 1 : 0);
        } else
        {
            j1 = resources.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_straighten_slider_height);
        }
        a(i1 + k1, i2 + l1 + j1);
    }

    static long w(bem bem1)
    {
        return bem1.aq;
    }

    private void w()
    {
        if (c.i())
        {
            Object obj = c;
            if (((bdo) (obj)).i())
            {
                ((bdo) (obj)).h.a(((bdo) (obj)).e);
                obj.e = ((bdo) (obj)).h;
                ((bdo) (obj)).e();
                obj.h = null;
            }
            obj = O_().findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_original_label);
            if (obj != null)
            {
                msy msy1 = new msy(0.0F, 0.0F, 0.6F, 1.0F);
                ((View) (obj)).clearAnimation();
                ((View) (obj)).animate().alpha(0.0F).setDuration(150L).setInterpolator(msy1);
                return;
            }
        }
    }

    static Handler x(bem bem1)
    {
        return bem1.az;
    }

    static olq y(bem bem1)
    {
        return bem1.ad;
    }

    static olq z(bem bem1)
    {
        return bem1.ad;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = ((ConsumerPhotoEditorActivity)O_()).j();
        layoutinflater = layoutinflater.inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_editor_fragment, viewgroup, false);
        if (layoutinflater == null)
        {
            throw new IllegalStateException("Failed to inflate the editor fragment");
        }
        ((rz)O_()).e().a();
        au = ActionBarView.a((rz)O_());
        au.b = this;
        aj = (FrameLayout)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_image_container);
        d = (GLSurfaceView)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_image_preview);
        viewgroup = d.getHolder();
        if (viewgroup == null)
        {
            throw new IllegalStateException("Failed to get the surface holder");
        }
        viewgroup.setFormat(-3);
        d.setEGLContextClientVersion(2);
        d.setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        ar = new bez(this);
        d.setRenderer(ar);
        d.setRenderMode(0);
        e = (CropOverlayView)layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_crop_overlay);
        a(0, 0);
        c.d();
        beo.a[c.a.ordinal()];
        JVM INSTR tableswitch 1 9: default 280
    //                   1 372
    //                   2 372
    //                   3 380
    //                   4 388
    //                   5 388
    //                   6 388
    //                   7 388
    //                   8 388
    //                   9 396;
           goto _L1 _L2 _L2 _L3 _L4 _L4 _L4 _L4 _L4 _L5
_L1:
        ak = new beq(this);
        al = new ScaleGestureDetector(O_(), new ber(this));
        viewgroup = (WindowManager)layoutinflater.getContext().getSystemService("window");
        bundle = new DisplayMetrics();
        viewgroup.getDefaultDisplay().getMetrics(bundle);
        float f1 = ((DisplayMetrics) (bundle)).density;
        d.setOnTouchListener(new bes(this, f1));
        return layoutinflater;
_L2:
        c(0);
        continue; /* Loop/switch isn't completed */
_L3:
        d(0);
        continue; /* Loop/switch isn't completed */
_L4:
        f(0);
        continue; /* Loop/switch isn't completed */
_L5:
        b(0);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        d(true);
    }

    public final void a(Menu menu)
    {
        menu.clear();
        O_().getMenuInflater().inflate(com.google.android.apps.consumerphotoeditor.R.menu.cpe_main_activity_actions, menu);
        super.a(menu);
        if (c.a == bdp.c)
        {
            v();
        }
        if (!c.j)
        {
            boolean flag = c.a(guc.b);
            menu.findItem(com.google.android.apps.consumerphotoeditor.R.id.cpe_save_copy).setVisible(flag);
        }
        av = menu.findItem(com.google.android.apps.consumerphotoeditor.R.id.cpe_back_to_original);
        u();
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(com.google.android.apps.consumerphotoeditor.R.menu.cpe_main_activity_actions, menu);
        super.a(menu, menuinflater);
    }

    public final boolean a_(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.consumerphotoeditor.R.id.cpe_back_to_original)
        {
            a(pwu.a);
            menuitem = new PipelineParams();
            c.j();
            c.y.clear();
            c.a(menuitem);
            b(9);
            return true;
        }
        if (menuitem.getItemId() == com.google.android.apps.consumerphotoeditor.R.id.cpe_save_copy)
        {
            a(pwu.J);
            a(true);
            return true;
        } else
        {
            return super.a_(menuitem);
        }
    }

    public final void b(int i1)
    {
        boolean flag1 = true;
        Object obj = super.B;
        bp bp1;
        boolean flag;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e.setVisibility(4);
        a(0, 0);
        bp1 = ((ay) (obj)).a();
        if (flag && b.e())
        {
            am am1;
            int j1;
            int k1;
            if ((i1 & 0x20) != 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            k1 = com.google.android.apps.consumerphotoeditor.R.anim.fade_in;
            if (j1 != 0)
            {
                j1 = com.google.android.apps.consumerphotoeditor.R.anim.fade_out;
            } else
            {
                j1 = com.google.android.apps.consumerphotoeditor.R.anim.slide_out_down;
            }
            bp1.a(k1, j1);
        }
        am1 = ((ay) (obj)).a(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar);
        if (am1 != null)
        {
            bp1.a(am1);
        }
        bp1.b();
        obj = ((ay) (obj)).a();
        if (flag && b.e())
        {
            ((bp) (obj)).a(com.google.android.apps.consumerphotoeditor.R.anim.slide_in_up, com.google.android.apps.consumerphotoeditor.R.anim.slide_out_up);
        }
        c.a(bdp.a);
        if (am1 == null)
        {
            flag1 = false;
        }
        a(((bp) (obj)), flag1, false);
        ((bp) (obj)).b();
        if ((i1 & 4) != 0)
        {
            c.h();
        } else
        if ((i1 & 8) != 0)
        {
            c.g = null;
            return;
        }
    }

    public final void c(int i1)
    {
        if ((i1 & 2) != 0)
        {
            c.g();
        }
        Object obj = c.a;
        if (obj != bdp.c && obj != bdp.d)
        {
            c.a(bdp.c);
        }
        v();
        w();
        Object obj1 = super.B;
        obj = ((ay) (obj1)).a();
        obj1 = ((ay) (obj1)).a(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar);
        if (obj1 != null)
        {
            ((bp) (obj)).a(((am) (obj1)));
        }
        bee bee1;
        int j1;
        if (g().getConfiguration().orientation == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        bee1 = new bee();
        if (i1 != 0)
        {
            j1 = com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar;
        } else
        {
            j1 = com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar;
        }
        ((bp) (obj)).b(j1, bee1, "CropToolbarFragment");
        if (i1 != 0)
        {
            ((ConsumerPhotoEditorActivity)O_()).l();
        } else
        if (c.a == bdp.c)
        {
            boolean flag;
            if (obj1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(((bp) (obj)), flag, true);
        } else
        {
            a(((bp) (obj)), false);
            ((ConsumerPhotoEditorActivity)O_()).l();
        }
        ((bp) (obj)).b();
        e.a(c);
        e.setVisibility(0);
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        as = (mwx)ae.a(mwx);
        ag = noz.a(ad, 3, "EditorFragment", new String[] {
            "perf"
        });
        ah = noz.a(ad, "EditorFragment", new String[0]);
    }

    void d(int i1)
    {
        boolean flag1 = false;
        c.a(bdp.b);
        e.setVisibility(4);
        bb bb;
        bp bp1;
        bfd bfd1;
        boolean flag;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(0, 0);
        bb = super.B;
        bp1 = bb.a();
        bfd1 = (bfd)bb.a("LooksToolbarFragment");
        if (bfd1 == null || ((am) (bfd1)).v)
        {
            bfd bfd2 = new bfd();
            bp1.b(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar, bfd2, "LooksToolbarFragment");
        }
        bp1.b();
        bp1 = bb.a();
        if (flag && b.e())
        {
            bp1.a(com.google.android.apps.consumerphotoeditor.R.anim.slide_in_down, com.google.android.apps.consumerphotoeditor.R.anim.slide_out_down);
        }
        if (c.f().look == 0)
        {
            if (bb.a(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar) != null)
            {
                flag1 = true;
            }
            a(bp1, flag1, true);
        } else
        {
            a(true, true);
            a(bp1, false);
            ((ConsumerPhotoEditorActivity)O_()).l();
        }
        bp1.b();
        if ((i1 & 2) != 0)
        {
            c.g();
        }
    }

    public final void e(int i1)
    {
        boolean flag1 = true;
        bp bp1;
        boolean flag;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bp1 = super.B.a();
        if (flag && b.e())
        {
            bp1.a(com.google.android.apps.consumerphotoeditor.R.anim.slide_in_down, com.google.android.apps.consumerphotoeditor.R.anim.slide_out_down);
        }
        if ((i1 & 0x10) == 0)
        {
            flag1 = false;
        }
        a(bp1, flag1);
        ((ConsumerPhotoEditorActivity)O_()).l();
        bp1.b();
    }

    public final void f(int i1)
    {
        Object obj = c.a;
        if (obj != bdp.e && obj != bdp.f && obj != bdp.g && obj != bdp.h && obj != bdp.i)
        {
            c.a(bdp.e);
        }
        e.setVisibility(4);
        obj = super.B;
        a(0, 0);
        bp bp1 = ((ay) (obj)).a();
        bdx bdx1 = (bdx)((ay) (obj)).a("AdjustmentsToolbarFragment");
        if (bdx1 == null || ((am) (bdx1)).v)
        {
            bdx bdx2 = new bdx();
            bp1.b(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar, bdx2, "AdjustmentsToolbarFragment");
        }
        if (c.a == bdp.e)
        {
            boolean flag;
            if (((ay) (obj)).a(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(bp1, flag, true);
        } else
        {
            a(bp1, false);
            ((ConsumerPhotoEditorActivity)O_()).l();
        }
        bp1.b();
        a(true, true);
        if ((i1 & 2) != 0)
        {
            c.g();
        }
    }

    public final void g(int i1)
    {
        if (b.t())
        {
            PipelineParams pipelineparams = c.f();
            f.set(Renderer.getImageScreenRect(pipelineparams));
            if (e != null && e.getVisibility() == 0)
            {
                CropOverlayView cropoverlayview = e;
                RectF rectf = f;
                if (!rectf.isEmpty())
                {
                    cropoverlayview.b.set(rectf);
                    cropoverlayview.d();
                    if (cropoverlayview.r != null)
                    {
                        cropoverlayview.r.a(-1);
                        cropoverlayview.invalidate();
                    }
                }
                if (i1 == 1)
                {
                    e.a(c);
                }
            }
            return;
        } else
        {
            as.a(new bew(this, i1));
            return;
        }
    }

    public final void n()
    {
        a.removeCallbacksAndMessages(null);
        if (ak != null)
        {
            ak.removeCallbacksAndMessages(null);
        }
        az.removeCallbacksAndMessages(null);
        super.n();
    }

    public final void r()
    {
        bb bb = super.B;
        if (!(bb.a(com.google.android.apps.consumerphotoeditor.R.id.cpe_lower_toolbar) instanceof bfk))
        {
            return;
        }
        bp bp1 = bb.a();
        if (b.e())
        {
            bp1.a(com.google.android.apps.consumerphotoeditor.R.anim.slide_in_up, com.google.android.apps.consumerphotoeditor.R.anim.slide_out_up);
        }
        bb.a(com.google.android.apps.consumerphotoeditor.R.id.cpe_upper_toolbar);
        a(bp1, true, true);
        bp1.b();
    }

    public final void v_()
    {
        g(0);
        if (b.t())
        {
            u();
        } else
        {
            as.a(new ben(this));
        }
        if (d != null)
        {
            h = h + 1L;
            long l1 = h;
            d.queueEvent(new bep(this, l1));
        }
    }

    public final void w_()
    {
        a(false);
    }

}
