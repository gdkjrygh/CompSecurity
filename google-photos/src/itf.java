// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.photos.stories.StoryEditText;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;

public final class itf extends omp
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener, android.view.View.OnTouchListener, android.widget.TextView.OnEditorActionListener, gnc, gni, iqe
{

    Rect a;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private final ilm aD;
    private final emq aE;
    private azh aF;
    private azh aG;
    private final android.view.View.OnClickListener aH = new msj(new its(this));
    private ekq ag;
    private gap ah;
    private qgg ai;
    private ekp aj;
    private euv ak;
    private Drawable al;
    private ImageView am;
    private ImageView an;
    private ImageView ao;
    private StoryEditText ap;
    private int aq;
    private ViewPropertyAnimator ar;
    private float as;
    private float at;
    private float au;
    private int av;
    private String aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public boolean b;
    private GestureDetector c;
    private ScaleGestureDetector d;
    private iwc e;
    private mmr f;
    private gnh g;
    private gnb h;

    public itf()
    {
        aq = iua.a;
        aD = new ilm(af);
        aE = new emq(this, af, aD, b.Aa);
        aF = new itg(this);
        aG = new itr(this);
        (new msi(pxa.h)).a(ae);
        new nuu(af, new iuc(this));
        new nuu(af, new iud(this));
    }

    static ImageView A(itf itf1)
    {
        return itf1.an;
    }

    static ImageView B(itf itf1)
    {
        return itf1.ao;
    }

    static int a(itf itf1, int i1)
    {
        itf1.aq = i1;
        return i1;
    }

    private Intent a(boolean flag, boolean flag1)
    {
        Intent intent = new Intent();
        if (!flag) goto _L2; else goto _L1
_L1:
        intent.putExtra("hide_moment", true);
_L4:
        if (!ap.getText().toString().equals(aw))
        {
            intent.putExtra("changed_narrative", ap.getText().toString());
        }
        intent.putExtra("passthrough_data", super.q.getBundle("passthrough_data"));
        return intent;
_L2:
        if (flag1)
        {
            intent.putExtra("set_cover_photo", true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private PointF a(PointF pointf)
    {
        float f3 = am.getWidth();
        float f4 = am.getScaleX();
        float f1 = am.getHeight();
        float f2 = am.getScaleY();
        int ai1[] = new int[2];
        am.getLocationOnScreen(ai1);
        f3 = ((float)(-ai1[0]) + pointf.x) / (f3 * f4);
        f1 = ((float)(-ai1[1]) + pointf.y) / (f1 * f2);
        return new PointF(Math.round(f3 * (float)am.getWidth()), Math.round(f1 * (float)am.getHeight()));
    }

    static ViewPropertyAnimator a(itf itf1, ViewPropertyAnimator viewpropertyanimator)
    {
        itf1.ar = viewpropertyanimator;
        return viewpropertyanimator;
    }

    static ImageView a(itf itf1)
    {
        return itf1.am;
    }

    private void a(View view, msp msp)
    {
        view.setOnClickListener(aH);
        view.setClickable(true);
        b.a(view, new msm(msp));
    }

    static void a(itf itf1, Drawable drawable)
    {
        drawable.setVisible(true, false);
        if (drawable instanceof Animatable)
        {
            ((Animatable)drawable).start();
        }
    }

    static void a(itf itf1, ekp ekp1)
    {
        itf1.aj = ekp1;
        if (itf1.ak == null)
        {
            itf1.ak = ekp1.c();
        }
    }

    static void a(itf itf1, ekq ekq1)
    {
        itf1.ag = ekq1;
    }

    static void a(itf itf1, euv euv1)
    {
        itf1.ak = euv1;
    }

    static void a(itf itf1, gap gap1)
    {
        itf1.ah = gap1;
    }

    static void a(itf itf1, qgg qgg1)
    {
        itf1.ai = qgg1;
    }

    static boolean a(itf itf1, boolean flag)
    {
        itf1.b = true;
        return true;
    }

    static Drawable b(itf itf1, Drawable drawable)
    {
        itf1.al = drawable;
        return drawable;
    }

    private void b(Intent intent)
    {
        if (ar != null)
        {
            ar.cancel();
        }
        b = false;
        aq = iua.d;
        View view = super.R.findViewById(s.cb);
        am.post(new itj(this, intent));
        view.animate().alpha(0.0F).setDuration(250L).start();
        w();
        if (super.R.findViewById(s.ch).getVisibility() == 0)
        {
            y();
        }
    }

    static void b(itf itf1)
    {
        switch (itq.a[itf1.aq - 1])
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            return;

        case 1: // '\001'
            itf1.a(true);
            return;

        case 4: // '\004'
            ((am) (itf1)).r.a(((am) (itf1)).t, -1, null);
            break;
        }
    }

    static void b(itf itf1, boolean flag)
    {
        itf1.ay = flag;
    }

    static int c(itf itf1)
    {
        return itf1.aq;
    }

    static void c(itf itf1, boolean flag)
    {
        itf1.aA = flag;
    }

    static void d(itf itf1)
    {
        if (!b.w(itf1.ad))
        {
            itf1 = itf1.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.A;
            nuq1.c = "OfflineRetryTagRemoveStoryPhoto";
            nuq1.e = true;
            nuo.a(itf1, nuq1);
            return;
        } else
        {
            itf1.b(itf1.a(true, false));
            return;
        }
    }

    static void d(itf itf1, boolean flag)
    {
        itf1.az = flag;
    }

    static void e(itf itf1)
    {
        if (!b.w(itf1.ad))
        {
            itf1 = itf1.h();
            nuq nuq1 = new nuq();
            nuq1.a = nup.C;
            nuq1.c = "OfflineRetryTagSetStoryCoverPhoto";
            nuq1.e = true;
            nuo.a(itf1, nuq1);
            return;
        } else
        {
            itf1.b(itf1.a(false, true));
            return;
        }
    }

    static void e(itf itf1, boolean flag)
    {
        itf1.aB = flag;
    }

    static void f(itf itf1)
    {
        itf1.y();
    }

    static olq g(itf itf1)
    {
        return itf1.ad;
    }

    static Rect h(itf itf1)
    {
        return itf1.a;
    }

    static void i(itf itf1)
    {
        itf1.u();
    }

    static boolean j(itf itf1)
    {
        return itf1.b;
    }

    static void k(itf itf1)
    {
        itf1.s();
    }

    static ekp l(itf itf1)
    {
        return itf1.aj;
    }

    static ekq m(itf itf1)
    {
        return itf1.ag;
    }

    static mmr n(itf itf1)
    {
        return itf1.f;
    }

    static ilm o(itf itf1)
    {
        return itf1.aD;
    }

    static Drawable p(itf itf1)
    {
        return itf1.al;
    }

    static void q(itf itf1)
    {
        if (itf1.ak == euv.c)
        {
            itf1.an.setVisibility(0);
        } else
        if (itf1.aB)
        {
            itf1.ao.setVisibility(0);
            return;
        }
    }

    static boolean r(itf itf1)
    {
        return itf1.aA;
    }

    static StoryEditText s(itf itf1)
    {
        return itf1.ap;
    }

    static ViewPropertyAnimator t(itf itf1)
    {
        return itf1.v();
    }

    static ViewPropertyAnimator u(itf itf1)
    {
        return itf1.ar;
    }

    private ViewPropertyAnimator v()
    {
        Object obj = x();
        ViewPropertyAnimator viewpropertyanimator = am.animate().scaleX(as).scaleY(as).x(((PointF) (obj)).x).y(((PointF) (obj)).y).setDuration(250L);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            obj = AnimationUtils.loadInterpolator(O_(), 0x10c000d);
        } else
        {
            obj = new AccelerateDecelerateInterpolator();
        }
        return viewpropertyanimator.setInterpolator(((android.animation.TimeInterpolator) (obj)));
    }

    static boolean v(itf itf1)
    {
        return itf1.ay;
    }

    private void w()
    {
        if (ak == euv.c)
        {
            an.setVisibility(8);
        } else
        if (aB)
        {
            ao.setVisibility(8);
            return;
        }
    }

    static void w(itf itf1)
    {
        View view = ((am) (itf1)).R.findViewById(s.cc);
        Animation animation = AnimationUtils.loadAnimation(itf1.O_(), s.aI);
        animation.setInterpolator(itf1.O_(), s.aE);
        animation.setDuration(250L);
        view.setVisibility(0);
        view.startAnimation(animation);
    }

    private PointF x()
    {
        float f2 = a.height();
        float f1 = a.width();
        int i1 = android.os.Build.VERSION.SDK_INT;
        f2 = (au - f2) / 2.0F;
        return new PointF(f1 * ((at / f1 - 1.0F) / 2.0F), f2);
    }

    static PointF x(itf itf1)
    {
        return itf1.x();
    }

    static float y(itf itf1)
    {
        return itf1.as;
    }

    private void y()
    {
        View view = super.R.findViewById(s.ch);
        View view1 = super.R.findViewById(s.cg);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            1.0F, 0.0F
        });
        objectanimator.setDuration(150L);
        objectanimator.addListener(new itm(this, view, view1));
        objectanimator.start();
    }

    static void z(itf itf1)
    {
        View view = ((am) (itf1)).R.findViewById(s.cc);
        Animation animation = AnimationUtils.loadAnimation(itf1.O_(), s.aL);
        animation.setInterpolator(itf1.O_(), s.aE);
        animation.setDuration(250L);
        view.startAnimation(animation);
        view.setVisibility(8);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (FrameLayout)layoutinflater.inflate(b.AT, null);
        am = (ImageView)viewgroup.findViewById(s.cd);
        c = new GestureDetector(O_(), this);
        c.setOnDoubleTapListener(this);
        d = new ScaleGestureDetector(O_(), this);
        g = new gnh(this, g(), 180F);
        h = new gnb(am, viewgroup.findViewById(s.cb), as, g().getColor(af.Q), Math.round(221.85F), 1.0F, g(), this);
        viewgroup.setOnTouchListener(this);
        viewgroup.findViewById(s.cg).setOnTouchListener(new itt(this));
        Object obj;
        boolean flag;
        if (bundle != null)
        {
            aq = iua.c;
            a = (Rect)bundle.getParcelable("media_rect");
            av = bundle.getInt("edit_text_height");
            ah = (gap)bundle.getParcelable("media_model");
            aj = (ekp)bundle.getParcelable("media");
            ag = (ekq)bundle.getParcelable("media_collection");
            layoutinflater = bundle.getByteArray("media_item");
            euv euv1;
            qgg qgg1;
            emq emq1;
            if (layoutinflater != null && layoutinflater.length > 0)
            {
                try
                {
                    ai = (qgg)qlw.a(new qgg(), layoutinflater);
                }
                // Misplaced declaration of an exception variable
                catch (LayoutInflater layoutinflater)
                {
                    layoutinflater = String.valueOf(layoutinflater.getMessage());
                    if (layoutinflater.length() != 0)
                    {
                        layoutinflater = "Error when deserializing media item nano proto: ".concat(layoutinflater);
                    } else
                    {
                        layoutinflater = new String("Error when deserializing media item nano proto: ");
                    }
                    Log.e("StoryWhiteboxFragment", layoutinflater);
                }
            }
            ak = euv.values()[bundle.getInt("av_type")];
            ax = bundle.getInt("override_size");
            ay = bundle.getBoolean("is_owner");
            az = bundle.getBoolean("coverable");
            aB = bundle.getBoolean("is_photosphere");
            layoutinflater = viewgroup.findViewById(s.cb);
            obj = viewgroup.findViewById(s.cc);
            layoutinflater.setVisibility(0);
            ((View) (obj)).setVisibility(0);
        } else
        {
            layoutinflater = O_().getWindow().getDecorView();
            ax = Math.max(Math.round(layoutinflater.getWidth()), Math.round(layoutinflater.getHeight()));
        }
        if (ak == euv.c)
        {
            an = (ImageView)viewgroup.findViewById(s.cj);
            an.setOnClickListener(new itw(this));
        } else
        if (aB)
        {
            ao = (ImageView)viewgroup.findViewById(s.ci);
            ao.setOnClickListener(new itx(this));
        }
        if (ai != null)
        {
            layoutinflater = aD;
            obj = O_();
            euv1 = ak;
            qgg1 = ai;
            emq1 = aE;
            layoutinflater.b = (ar)p.a(obj);
            layoutinflater.e = noz.a(((android.content.Context) (obj)), 3, "MediaItemViewingMixin", new String[0]);
            layoutinflater.d = (qgg)p.a(qgg1);
            layoutinflater.c = (euv)p.a(euv1);
            layoutinflater.a = emq1;
        }
        aw = super.q.getString("initial_narrative_text", "");
        ap = (StoryEditText)viewgroup.findViewById(s.ce);
        b.a(ap, new msm(pxa.a));
        if (aw != null)
        {
            ap.setText(aw);
        }
        if (ay)
        {
            if (bundle != null && bundle.getBoolean("editing_narrative"))
            {
                b = true;
            }
            if (!b)
            {
                viewgroup.requestFocus();
            } else
            {
                ap.requestFocus();
            }
            ap.a = this;
            ap.setOnFocusChangeListener(new itu(this, viewgroup));
            ap.setOnEditorActionListener(new itv(this));
        } else
        if (TextUtils.isEmpty(aw))
        {
            ap.setVisibility(8);
        } else
        {
            ap.setFocusable(false);
        }
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((View) (viewgroup)));
        if (flag)
        {
            am.setVisibility(4);
        }
        obj = (fli)olm.a(O_(), fli);
        layoutinflater = (amh)olm.a(O_(), amh);
        if (!flag)
        {
            if (ak == euv.e || ak == euv.c)
            {
                layoutinflater.a(ah).a(((fli) (obj)).c()).a(aF);
            } else
            {
                layoutinflater.a(ah).a(((fli) (obj)).d()).a(aF);
            }
        }
        if (ak == euv.e || ak == euv.c)
        {
            layoutinflater.a(ah).a(((fli) (obj)).c().a(ax, ax)).a(aG);
        } else
        {
            layoutinflater = layoutinflater.a(ah);
            bundle = ((fli) (obj)).c();
            obj = ((fli) (obj)).a();
            mjw mjw1 = new mjw();
            mjw1.b = true;
            mjw1.a(4);
            layoutinflater.a(((ayt)((ayt)bundle.a(((anf) (obj)), mjw1)).a(ax, ax)).b(O_())).a(aG);
        }
        a(viewgroup.findViewById(s.cf), pwr.n);
        a(viewgroup.findViewById(s.ck), pxa.k);
        if (az)
        {
            a(viewgroup.findViewById(s.cl), pxa.m);
            return viewgroup;
        } else
        {
            viewgroup.findViewById(s.cl).setVisibility(8);
            return viewgroup;
        }
    }

    public final void a()
    {
        aC = false;
        t();
    }

    public final void a(float f1)
    {
    }

    public final void a(PointF pointf, float f1, float f2)
    {
        aC = true;
        if (an == null) goto _L2; else goto _L1
_L1:
        an.animate().alpha(0.0F).setDuration(200L).setListener(null).start();
_L4:
        h.a(pointf, f1, f2);
        return;
_L2:
        if (ao != null)
        {
            ao.animate().alpha(0.0F).setDuration(200L).setListener(null).start();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(View view)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)am.getLayoutParams();
        layoutparams.width = a.width();
        layoutparams.height = a.height();
        layoutparams.leftMargin = a.left;
        layoutparams.topMargin = a.top;
        view = (android.widget.FrameLayout.LayoutParams)view.findViewById(s.cm).getLayoutParams();
        view.width = a.width();
        view.height = a.height();
        view.leftMargin = a.left;
        view.topMargin = a.top;
        view = O_().getWindow().getDecorView();
        at = view.getWidth();
        au = view.getHeight();
    }

    void a(boolean flag)
    {
        float f1 = a.height();
        float f2 = a.width();
        float f3 = f1 / f2;
        if (au / at > f3)
        {
            as = at / f2;
        } else
        {
            as = au / f1;
        }
        h.a = as;
        h.b = 1.0F / as;
        f1 = g().getDimension(b.Ap);
        am.post(new ity(this, flag, f1));
    }

    public final boolean a(MotionEvent motionevent)
    {
        h.onTouch(super.R, motionevent);
        return true;
    }

    public final boolean ay_()
    {
        return false;
    }

    public final boolean az_()
    {
        return aq == iua.c && !b;
    }

    public final void b()
    {
        s();
    }

    public final void c()
    {
        aC = false;
        if (b)
        {
            u();
            return;
        } else
        {
            v().setListener(new itp(this)).start();
            return;
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        e = (iwc)ae.a(iwc);
        f = (mmr)ae.a(mmr);
    }

    public final boolean d()
    {
        return aC;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("media_rect", a);
        bundle.putBoolean("editing_narrative", b);
        bundle.putInt("edit_text_height", ap.getHeight());
        bundle.putParcelable("media_model", ah);
        bundle.putParcelable("media", aj);
        bundle.putParcelable("media_collection", ag);
        if (ai != null)
        {
            bundle.putByteArray("media_item", qlw.a(ai));
        }
        bundle.putInt("av_type", ak.ordinal());
        bundle.putInt("override_size", ax);
        bundle.putBoolean("is_owner", ay);
        bundle.putBoolean("coverable", az);
        bundle.putBoolean("is_photosphere", aB);
    }

    public final void l()
    {
        super.l();
        r();
        e.a().a(g);
    }

    public final void m()
    {
        super.m();
        e.a().b(g);
    }

    public final void n()
    {
        if (al != null)
        {
            al = null;
        }
        super.n();
    }

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (ak != euv.c)
        {
            float f1 = motionevent.getX();
            float f3 = motionevent.getY();
            int ai1[] = new int[2];
            am.getLocationOnScreen(ai1);
            boolean flag;
            if (f1 >= (float)ai1[0] && f1 <= (float)ai1[0] + (float)am.getWidth() * am.getScaleX() && f3 >= (float)ai1[1] && f3 <= (float)ai1[1] + (float)am.getHeight() * am.getScaleY())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (flag)
            {
                motionevent = a(new PointF(motionevent.getX(), motionevent.getY()));
                float f2 = ((PointF) (motionevent)).x;
                float f4 = ((PointF) (motionevent)).y;
                if (Math.abs(am.getScaleX() - as) < 0.05F)
                {
                    float f5 = am.getScaleX();
                    float f6 = am.getScaleY();
                    float f7 = am.getTranslationX();
                    float f8 = am.getPivotX();
                    float f9 = am.getScaleX();
                    float f10 = am.getTranslationY();
                    float f11 = am.getPivotY();
                    float f12 = am.getScaleY();
                    motionevent = ObjectAnimator.ofFloat(am, "pivotX", new float[] {
                        f2
                    });
                    ObjectAnimator objectanimator = ObjectAnimator.ofFloat(am, "pivotY", new float[] {
                        f4
                    });
                    ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(am, "translationX", new float[] {
                        f7 + (f8 - f2) * (1.0F - f9)
                    });
                    ObjectAnimator objectanimator4 = ObjectAnimator.ofFloat(am, "translationY", new float[] {
                        f10 + (f11 - f4) * (1.0F - f12)
                    });
                    ObjectAnimator objectanimator6 = ObjectAnimator.ofFloat(am, "scaleX", new float[] {
                        f5 * 2.5F
                    });
                    ObjectAnimator objectanimator8 = ObjectAnimator.ofFloat(am, "scaleY", new float[] {
                        f6 * 2.5F
                    });
                    AnimatorSet animatorset = new AnimatorSet();
                    animatorset.playTogether(new Animator[] {
                        motionevent, objectanimator, objectanimator2, objectanimator4, objectanimator6, objectanimator8
                    });
                    animatorset.setDuration(250L);
                    if (android.os.Build.VERSION.SDK_INT >= 21)
                    {
                        motionevent = AnimationUtils.loadInterpolator(O_(), 0x10c000d);
                    } else
                    {
                        motionevent = new AccelerateDecelerateInterpolator();
                    }
                    animatorset.setInterpolator(motionevent);
                    animatorset.addListener(new itn(this));
                    animatorset.start();
                } else
                {
                    Object obj = x();
                    motionevent = ObjectAnimator.ofFloat(am, "pivotX", new float[] {
                        (float)(a.width() / 2)
                    });
                    ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(am, "pivotY", new float[] {
                        (float)(a.height() / 2)
                    });
                    ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(am, "x", new float[] {
                        ((PointF) (obj)).x
                    });
                    ObjectAnimator objectanimator5 = ObjectAnimator.ofFloat(am, "y", new float[] {
                        ((PointF) (obj)).y
                    });
                    ObjectAnimator objectanimator7 = ObjectAnimator.ofFloat(am, "scaleX", new float[] {
                        as
                    });
                    ObjectAnimator objectanimator9 = ObjectAnimator.ofFloat(am, "scaleY", new float[] {
                        as
                    });
                    obj = new AnimatorSet();
                    ((AnimatorSet) (obj)).playTogether(new Animator[] {
                        motionevent, objectanimator1, objectanimator3, objectanimator5, objectanimator7, objectanimator9
                    });
                    ((AnimatorSet) (obj)).setDuration(250L);
                    if (android.os.Build.VERSION.SDK_INT >= 21)
                    {
                        motionevent = AnimationUtils.loadInterpolator(O_(), 0x10c000d);
                    } else
                    {
                        motionevent = new AccelerateDecelerateInterpolator();
                    }
                    ((AnimatorSet) (obj)).setInterpolator(motionevent);
                    ((AnimatorSet) (obj)).addListener(new ito(this));
                    ((AnimatorSet) (obj)).start();
                }
                flag1 = true;
            }
        }
        return flag1;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return false;
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        return i1 == 6;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
    }

    public final boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (aq != iua.e)
        {
            return false;
        } else
        {
            PointF pointf = a(new PointF(scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY()));
            float f1 = scalegesturedetector.getCurrentSpan() / scalegesturedetector.getPreviousSpan();
            float f3 = am.getScaleX();
            float f2 = am.getScaleY();
            f3 = Math.max(Math.min(f3 * f1, as * 4F), as * 0.8F);
            f1 = Math.max(Math.min(f1 * f2, as * 4F), as * 0.8F);
            am.setScaleX(f3);
            am.setScaleY(f1);
            am.setTranslationX(am.getTranslationX() + (am.getPivotX() - pointf.x) * (1.0F - am.getScaleX()));
            am.setTranslationY(am.getTranslationY() + (am.getPivotY() - pointf.y) * (1.0F - am.getScaleY()));
            am.setPivotX(pointf.x);
            am.setPivotY(pointf.y);
            return true;
        }
    }

    public final boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        if (ak != euv.c && !aB)
        {
            aq = iua.e;
            return true;
        } else
        {
            return false;
        }
    }

    public final void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        float f3 = 0.0F;
        if (aq != iua.e) goto _L2; else goto _L1
_L1:
        float f4;
        motionevent = new int[2];
        am.getLocationOnScreen(motionevent);
        float f6 = motionevent[0];
        f4 = motionevent[1];
        float f7 = (float)motionevent[0] + (float)am.getWidth() * am.getScaleX();
        float f5 = (float)motionevent[1] + (float)am.getHeight() * am.getScaleY();
        if (f1 > 0.0F)
        {
            if (f7 > at)
            {
                f1 = Math.min(f1, f7 - at);
            } else
            {
                f1 = 0.0F;
            }
        } else
        if (f6 < 0.0F)
        {
            f1 = Math.max(f1, f6);
        } else
        {
            f1 = 0.0F;
        }
        if (f2 <= 0.0F) goto _L4; else goto _L3
_L3:
        if (f5 > au)
        {
            f3 = Math.min(f2, f5 - au);
        }
_L5:
        am.setTranslationX(am.getTranslationX() - f1);
        am.setTranslationY(am.getTranslationY() - f3);
        return true;
_L4:
        if (f4 < 0.0F)
        {
            f3 = Math.max(f2, f4);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return false;
    }

    public final void onShowPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (aq != iua.g)
        {
            t();
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (b)
        {
            s();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (aq != iua.d && aq != iua.g) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 6: default 68
    //                   0 68
    //                   1 94
    //                   2 68
    //                   3 68
    //                   4 68
    //                   5 68
    //                   6 94;
           goto _L3 _L3 _L4 _L3 _L3 _L3 _L3 _L4
_L3:
        boolean flag = c.onTouchEvent(motionevent);
        if (!d.onTouchEvent(motionevent) && !flag)
        {
            return false;
        }
          goto _L5
_L4:
        if (motionevent.getPointerCount() == 1 && am.getScaleX() < as)
        {
            t();
            return true;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void r()
    {
        Object obj = O_();
        if (obj != null)
        {
            if ((obj = ((Activity) (obj)).getWindow()) != null && (obj = ((Window) (obj)).getDecorView()) != null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    ((View) (obj)).setSystemUiVisibility(3846);
                    return;
                } else
                {
                    ((View) (obj)).setSystemUiVisibility(1);
                    return;
                }
            }
        }
    }

    public void s()
    {
        b = false;
        aq = iua.g;
        ap.clearFocus();
        ((InputMethodManager)O_().getSystemService("input_method")).hideSoftInputFromWindow(ap.getWindowToken(), 0);
        super.R.postDelayed(new ith(this), 350L);
    }

    public void t()
    {
        b(a(false, false));
    }

    void u()
    {
        float f1 = x().x;
        float f2;
        float f3;
        float f4;
        float f5;
        Object obj;
        AnimatorSet animatorset;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator1;
        ObjectAnimator objectanimator2;
        ObjectAnimator objectanimator3;
        ObjectAnimator objectanimator4;
        int i1;
        if (ap.getHeight() > 0)
        {
            i1 = ap.getHeight();
        } else
        {
            i1 = av;
        }
        f2 = au;
        f3 = a.height();
        f4 = (as + 1.0F) / 2.0F;
        f5 = i1;
        obj = ObjectAnimator.ofFloat(am, "pivotX", new float[] {
            (float)(a.width() / 2)
        });
        objectanimator = ObjectAnimator.ofFloat(am, "pivotY", new float[] {
            (float)(a.height() / 2)
        });
        objectanimator1 = ObjectAnimator.ofFloat(am, "x", new float[] {
            f1
        });
        objectanimator2 = ObjectAnimator.ofFloat(am, "y", new float[] {
            f2 - (f5 + f3 * f4)
        });
        objectanimator3 = ObjectAnimator.ofFloat(am, "scaleX", new float[] {
            as
        });
        objectanimator4 = ObjectAnimator.ofFloat(am, "scaleY", new float[] {
            as
        });
        animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            obj, objectanimator, objectanimator1, objectanimator2, objectanimator3, objectanimator4
        });
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            obj = AnimationUtils.loadInterpolator(O_(), 0x10c000d);
        } else
        {
            obj = new AccelerateDecelerateInterpolator();
        }
        animatorset.setInterpolator(((android.animation.TimeInterpolator) (obj)));
        animatorset.addListener(new itl(this));
        animatorset.start();
        w();
    }
}
