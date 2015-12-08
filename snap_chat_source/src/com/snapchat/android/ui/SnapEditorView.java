// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import AA;
import AJ;
import Al;
import Be;
import Bw;
import DA;
import FB;
import Fh;
import Fn;
import Fo;
import Fp;
import Fq;
import GP;
import GT;
import GU;
import GW;
import HA;
import HF;
import HJ;
import HR;
import Ho;
import Hu;
import Hw;
import Hz;
import Ic;
import In;
import Jo;
import LB;
import MD;
import Mf;
import PG;
import Wi;
import aP;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.transcoding.TranscodingTaskMetrics;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.ui.caption.CaptionTypeEnums;
import com.snapchat.android.ui.caption.FatCaptionView;
import com.snapchat.android.ui.caption.FatCenterCaptionView;
import com.snapchat.android.ui.caption.SnapCaptionView;
import com.snapchat.android.ui.caption.VanillaCaptionView;
import com.snapchat.android.ui.emojipicker.EmojiDeletionHandler;
import com.snapchat.android.ui.emojipicker.EmojiMovableImageView;
import com.snapchat.android.ui.snapeditormotion.SwipeHandlerType;
import com.snapchat.android.ui.swipefilters.FilterPageType;
import com.snapchat.android.util.SnapMediaUtils;
import com.snapchat.photoeffect.LibPhotoEffect;
import com.squareup.otto.Bus;
import dz;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import lV;
import lf;
import lg;
import lv;
import rz;

// Referenced classes of package com.snapchat.android.ui:
//            SnapVideoView, CanvasViewBase, SwipeImageView, SwipeViewState, 
//            FitWidthViewGroup, LegacyCanvasView, VideoFilterView, MovableImageView

public class SnapEditorView extends FrameLayout
    implements FB, Fn.a, Fo, VideoFilterView.c
{
    public final class a
    {

        public int a;
        public int b;
        public Mediabryo c;
        public int d;

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract boolean m();

        public abstract int o();

        public abstract boolean p();
    }


    private ImageView A;
    private SwipeViewState B;
    private FrameLayout C;
    private EmojiMovableImageView D;
    private Fn E;
    private HR F;
    private GT G;
    private boolean H;
    private b I;
    private Set J;
    public final Bus a;
    public final rz b;
    public final LB c;
    public final TranscodingPreferencesWrapper d;
    public final Fh e;
    public FitWidthViewGroup f;
    public ImageView g;
    public SnapCaptionView h;
    public CanvasViewBase i;
    public SwipeImageView j;
    public SnapVideoView k;
    public VideoFilterView l;
    public View m;
    public Hw n;
    public Fp o;
    public Fq p;
    public FrameLayout q;
    public Bitmap r;
    public Bitmap s;
    public Mediabryo t;
    public HA u;
    public CaptionTypeEnums v;
    private final lv w;
    private MediaPlayer x;
    private DisplayMetrics y;
    private lV z;

    public SnapEditorView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, Mf.a(), rz.a(), new LB(), TranscodingPreferencesWrapper.a(), Fh.a(), lv.a());
    }

    protected SnapEditorView(Context context, AttributeSet attributeset, Bus bus, rz rz1, LB lb, TranscodingPreferencesWrapper transcodingpreferenceswrapper, Fh fh, 
            lv lv1)
    {
        super(context, attributeset);
        H = true;
        v = CaptionTypeEnums.NON_FAT_VANILLA_CAPTION_TYPE;
        J = new CopyOnWriteArraySet();
        a = bus;
        b = rz1;
        c = lb;
        d = transcodingpreferenceswrapper;
        e = fh;
        w = lv1;
    }

    static MediaPlayer a(SnapEditorView snapeditorview, MediaPlayer mediaplayer)
    {
        snapeditorview.x = mediaplayer;
        return mediaplayer;
    }

    static lv a(SnapEditorView snapeditorview)
    {
        return snapeditorview.w;
    }

    private void a(int i1)
    {
        u.a(i1);
    }

    public static void a(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        if (flag)
        {
            layoutinflater.inflate(0x7f04010b, viewgroup);
            return;
        } else
        {
            layoutinflater.inflate(0x7f04010d, viewgroup);
            return;
        }
    }

    static void a(SnapEditorView snapeditorview, Mediabryo mediabryo, int i1)
    {
        snapeditorview.a(mediabryo, i1);
    }

    static void a(SnapEditorView snapeditorview, Mediabryo mediabryo, TranscodingPreferencesWrapper transcodingpreferenceswrapper, String s1)
    {
        snapeditorview.a(mediabryo, transcodingpreferenceswrapper, s1);
    }

    static Fq b(SnapEditorView snapeditorview)
    {
        return snapeditorview.p;
    }

    static void b(SnapEditorView snapeditorview, MediaPlayer mediaplayer)
    {
        float f1 = (float)mediaplayer.getVideoHeight() / (float)mediaplayer.getVideoWidth();
        int i1 = snapeditorview.getResources().getDisplayMetrics().widthPixels;
        int j1 = (int)(f1 * (float)i1);
        Timber.c("SnapEditorView", (new StringBuilder("Setting Aspect Ratio = ")).append(i1).append(" x ").append(j1).toString(), new Object[0]);
        snapeditorview.k.setVideoAspect(i1, j1);
    }

    static SnapVideoView c(SnapEditorView snapeditorview)
    {
        return snapeditorview.k;
    }

    private void c(boolean flag)
    {
        if (x == null)
        {
            return;
        }
        if (flag)
        {
            try
            {
                x.setVolume(1.0F, 1.0F);
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                x = null;
            }
            return;
        }
        x.setVolume(0.0F, 0.0F);
        return;
    }

    static boolean d(SnapEditorView snapeditorview)
    {
        return snapeditorview.H;
    }

    static SnapCaptionView e(SnapEditorView snapeditorview)
    {
        return snapeditorview.h;
    }

    static FrameLayout f(SnapEditorView snapeditorview)
    {
        return snapeditorview.C;
    }

    static Mediabryo g(SnapEditorView snapeditorview)
    {
        return snapeditorview.t;
    }

    static TranscodingPreferencesWrapper h(SnapEditorView snapeditorview)
    {
        return snapeditorview.d;
    }

    private int l()
    {
        int j1 = u.b();
        int i1 = j1;
        if (j1 > 0)
        {
            i1 = j1;
            if (u.a(0) instanceof HJ)
            {
                i1 = j1 - 1;
            }
        }
        return i1;
    }

    public final Bitmap a(Context context)
    {
        i.destroyDrawingCache();
        PG.a();
        if (s != null || i.e() > 0 || !h.m() || q.getChildCount() > 0 || g != null) goto _L2; else goto _L1
_L1:
        Object obj = j;
        if (((SwipeImageView) (obj)).c.a != 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (((SwipeImageView) (obj)).c.f != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L5; else goto _L4
_L4:
        flag = true;
_L9:
        if (flag) goto _L2; else goto _L6
_L6:
        return null;
_L5:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        j.setVisibilityOfPreviewOnlyContent(4);
        obj = In.a(getWidth(), getHeight(), new View[] {
            g, q, j, h
        });
        j.setVisibilityOfPreviewOnlyContent(0);
        if (obj == null) goto _L6; else goto _L7
_L7:
        return SnapMediaUtils.a(((Bitmap) (obj)), t.a(context));
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final a a()
    {
        a a1 = new a();
        a1.a = o.b.c;
        a1.b = o.b.a;
        a1.c = t;
        a1.d = v.ordinal();
        return a1;
    }

    public final void a(float f1)
    {
        Fn fn = E;
        fn.c.h = f1;
        if (fn.c.c())
        {
            fn.a.a(false);
        }
        fn.c.i = SwipeViewState.MotionState.NOT_MOVING;
    }

    public final void a(int i1, boolean flag)
    {
        Object obj = u.a(i1);
        if (obj != null)
        {
            ((Ho) (obj)).g();
            if ((obj instanceof HF) && (t instanceof AA))
            {
                obj = (HF)obj;
                AA aa = (AA)t;
                int j1 = l();
                String s1 = ((HF) (obj)).b.mFilterId;
                boolean flag1 = ((HF) (obj)).b.mIsSponsored;
                lf lf1 = aa.mGeofilterSwipeMetaData;
                lg lg1 = (lg)lf1.mData.get(s1);
                obj = lg1;
                if (lg1 == null)
                {
                    Map map = lf1.mData;
                    obj = new lg(s1, flag1);
                    map.put(s1, obj);
                }
                obj.filterIndexCount = j1;
                obj.filterIndexPos = i1;
                if (flag)
                {
                    obj.filterCount = ((lg) (obj)).filterCount + 1L;
                }
                if (!((lg) (obj)).viewTimeStopwatch.a)
                {
                    ((lg) (obj)).viewTimeStopwatch.a();
                }
                obj = aa.mGeofilterSwipeMetaData;
                obj.mGeofilterIndexPos = i1;
                obj.mGeofilterIndexCount = j1;
            }
        }
    }

    public final void a(Context context, Al al, HR hr)
    {
        a.c(this);
        m = e.a(0x7f0400d2, null);
        addView(m);
        h = new VanillaCaptionView(context);
        h.setInterface(this);
        h.setCaptionEditTextOnTouchListener(null);
        C = (FrameLayout)m.findViewById(0x7f0d0486);
        C.removeAllViews();
        C.addView(h);
        y = context.getResources().getDisplayMetrics();
        B = new SwipeViewState();
        u = new HA();
        o = new Fp(u, B);
        j = (SwipeImageView)m.findViewById(0x7f0d0485);
        SwipeImageView swipeimageview = j;
        FrameLayout framelayout = new FrameLayout(context);
        swipeimageview.removeAllViews();
        swipeimageview.d = null;
        swipeimageview.e = false;
        swipeimageview.g = false;
        swipeimageview.f = framelayout;
        swipeimageview.addView(swipeimageview.f);
        E = new Fn(o, j, B);
        E.a(this);
        j.setFilterPageProvider(u);
        j.setSwipeState(B);
        F = hr;
        n = new Hw(context, j, u, al, F, new LibPhotoEffect());
        E.a(n);
        a.c(n);
        p = new Fq(u, B);
        E.a(p);
        f = (FitWidthViewGroup)m.findViewById(0x7f0d0484);
        f.removeAllViews();
        A = new ImageView(context);
        A.setVisibility(8);
        j.addView(A);
        q = new FrameLayout(context);
        al = new android.view.ViewGroup.LayoutParams(-1, -1);
        q.setLayoutParams(al);
        j.addView(q);
        i = new LegacyCanvasView(context);
        j.addView(i);
        G = new GT(ViewConfiguration.get(context).getScaledTouchSlop(), this, new GW());
    }

    public final void a(MotionEvent motionevent)
    {
        Ho ho = j.c();
        boolean flag;
        if (ho == null)
        {
            flag = false;
        } else
        {
            flag = ho.a(motionevent);
        }
        if (flag)
        {
            j.dispatchTouchEvent(motionevent);
            return;
        }
        if (h.i())
        {
            h.a(true);
            return;
        } else
        {
            h.a(motionevent);
            return;
        }
    }

    public final void a(Mediabryo mediabryo, int i1)
    {
        if (l != null)
        {
            l.setVisibility(4);
        }
        if (k != null)
        {
            k.setVisibility(0);
            k.setVideoURI(mediabryo.mVideoUri);
            k.setMediaController(null);
            if (Ic.SUPPORTS_MEDIA_INFO_VIDEO_RENDERING_START)
            {
                k.setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() {

                    private SnapEditorView a;

                    public final boolean onInfo(MediaPlayer mediaplayer, int j1, int k1)
                    {
                        if (j1 == 3)
                        {
                            SnapEditorView.a(a).b();
                        }
                        return false;
                    }

            
            {
                a = SnapEditorView.this;
                super();
            }
                });
            }
            k.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

                private SnapEditorView a;

                public final void onPrepared(MediaPlayer mediaplayer)
                {
                    SnapEditorView.a(a, mediaplayer);
                    mediaplayer.setLooping(true);
                    mediaplayer.setOnSeekCompleteListener(new android.media.MediaPlayer.OnSeekCompleteListener() {

                        public final void onSeekComplete(MediaPlayer mediaplayer)
                        {
                        }

                    });
                    SnapEditorView.b(a, mediaplayer);
                    SnapEditorView.c(a).requestLayout();
                    a.setAudible(SnapEditorView.d(a));
                }

            
            {
                a = SnapEditorView.this;
                super();
            }
            });
            k.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener(i1, mediabryo) {

                final int a;
                final Mediabryo b;
                final SnapEditorView c;

                public final boolean onError(MediaPlayer mediaplayer, int j1, int k1)
                {
                    Timber.e("SnapEditorView", "Media player onError what=%s extra=%d retryCount=%d", new Object[] {
                        DA.a(j1), Integer.valueOf(k1), Integer.valueOf(a)
                    });
                    if (a > 0)
                    {
                        Timber.c("SnapEditorView", "Retrying video playback following error", new Object[0]);
                        SnapEditorView.c(c).a();
                        SnapEditorView.c(c).postDelayed(new Runnable(this) {

                            private _cls5 a;

                            public final void run()
                            {
                                SnapEditorView.a(a.c, a.b, a.a - 1);
                            }

            
            {
                a = _pcls5;
                super();
            }
                        }, 500L);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                c = SnapEditorView.this;
                a = i1;
                b = mediabryo;
                super();
            }
            });
            k.start();
        }
    }

    public final void a(Mediabryo mediabryo, TranscodingPreferencesWrapper transcodingpreferenceswrapper, String s1)
    {
        transcodingpreferenceswrapper.a(mediabryo.mClientId, false, (new StringBuilder("Failed transcoding on preview: ")).append(s1).toString());
        if (mediabryo instanceof Bw)
        {
            (new TranscodingTaskMetrics(com.snapchat.android.analytics.transcoding.TranscodingTaskMetrics.TranscodingType.PREVIEW)).a((Bw)mediabryo, null, Wv.c.e, s1);
        }
        f.removeAllViews();
        a((LayoutInflater)getContext().getSystemService("layout_inflater"), ((ViewGroup) (f)), false);
        k = b();
        l = null;
        a(mediabryo, 2);
    }

    public final void a(SwipeImageView swipeimageview)
    {
        if (o.a())
        {
            a(o.b.c);
            a(o.b.d);
            return;
        } else
        {
            a(o.b.a);
            a(o.b.b);
            return;
        }
    }

    public final void a(SwipeImageView swipeimageview, boolean flag)
    {
        if (flag)
        {
            if (z != null)
            {
                flag = B.l;
                swipeimageview = u.a(o.b.a);
                Ho ho = u.a(o.b.c);
                lV lv1 = z;
                if (flag)
                {
                    lv1.c = lv1.c + 1;
                } else
                {
                    lv1.b = lv1.b + 1;
                }
                if (swipeimageview != null)
                {
                    lv1.a(swipeimageview, lv1.e);
                }
                if (ho != null)
                {
                    lv1.a(ho, lv1.f);
                }
            }
            b(true);
        }
    }

    public final void a(Throwable throwable)
    {
        PG.a(new Runnable(throwable) {

            private Throwable a;
            private SnapEditorView b;

            public final void run()
            {
                SnapEditorView.a(b, SnapEditorView.g(b), SnapEditorView.h(b), a.toString());
            }

            
            {
                b = SnapEditorView.this;
                a = throwable;
                super();
            }
        });
    }

    public final void a(boolean flag)
    {
        Object obj;
        Bundle bundle;
        SnapCaptionView snapcaptionview;
        Context context;
        bundle = h.a();
        snapcaptionview = h;
        if (flag)
        {
            a.b(h);
            v = CaptionTypeEnums.values()[(v.ordinal() + 1) % CaptionTypeEnums.values().length];
        }
        obj = v;
        context = getContext();
        FA._cls1.a[((CaptionTypeEnums) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 96
    //                   1 118
    //                   2 231
    //                   3 244;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException(String.format("[%s] Caption Type is not valid", new Object[] {
            obj
        }));
_L2:
        obj = new VanillaCaptionView(context);
_L6:
        h = ((SnapCaptionView) (obj));
        h.setCaptionEditTextOnTouchListener(null);
        if (flag)
        {
            h.n();
            obj = t.mPreviewConfiguration;
            if (obj != null && ((Be) (obj)).mShouldHideSystemUi)
            {
                h.g();
            }
        }
        a.c(h);
        h.setInterface(this);
        obj = getViewTreeObserver();
        ((ViewTreeObserver) (obj)).addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(bundle, flag, ((ViewTreeObserver) (obj)), snapcaptionview) {

            private Bundle a;
            private boolean b;
            private ViewTreeObserver c;
            private View d;
            private SnapEditorView e;

            public final boolean onPreDraw()
            {
                SnapEditorView.e(e).a(a, b);
                if (c.isAlive())
                {
                    c.removeOnPreDrawListener(this);
                }
                SnapEditorView.f(e).removeView(d);
                return false;
            }

            
            {
                e = SnapEditorView.this;
                a = bundle;
                b = flag;
                c = viewtreeobserver;
                d = view;
                super();
            }
        });
        C.addView(h);
        return;
_L3:
        obj = new FatCaptionView(context);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new FatCenterCaptionView(context);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(boolean flag, float f1)
    {
        Fn fn = E;
        int l1 = y.widthPixels;
        fn.c.g = f1;
        if (!fn.c.c())
        {
            Object obj = fn.a;
            ((Fp) (obj)).b.m = flag;
            if (((Fp) (obj)).b.l && !flag)
            {
                ((Fp) (obj)).b.d = 0;
                ((Fp) (obj)).b.b = 0;
            } else
            if (flag)
            {
                int i1 = ((Fp) (obj)).a(((Fp) (obj)).b.c, ((Fp) (obj)).b.a());
                ((Fp) (obj)).b.d = i1;
            } else
            {
                int j1 = ((Fp) (obj)).a(((Fp) (obj)).b.a, ((Fp) (obj)).b.a());
                ((Fp) (obj)).b.b = j1;
            }
            for (obj = fn.d.iterator(); ((Iterator) (obj)).hasNext(); ((Fn.a)((Iterator) (obj)).next()).q()) { }
            obj = fn.c;
            int k1;
            if (((SwipeViewState) (obj)).a())
            {
                obj.j = SwipeViewState.SwipeDirection.LEFT;
            } else
            {
                obj.j = SwipeViewState.SwipeDirection.RIGHT;
            }
            obj = fn.c;
            if (fn.c.a())
            {
                k1 = l1;
            } else
            {
                k1 = 0;
            }
            obj.e = k1;
        }
        fn.c.i = SwipeViewState.MotionState.SWIPING;
        fn.c.b();
        fn.c.n = 0.5F;
        fn.b.invalidate();
        fn.a(l1);
    }

    public final SnapVideoView b()
    {
        return (SnapVideoView)findViewById(0x7f0d0551);
    }

    public final void b(boolean flag)
    {
        a(o.b.a, flag);
        a(o.b.c, flag);
    }

    public final void c()
    {
        if (l != null)
        {
            Timber.c("SnapEditorView", "Stopping playback!", new Object[0]);
            l.a();
        }
        if (k != null)
        {
            k.a();
        }
    }

    public final WP.b d()
    {
        Fq fq = p;
        if ((double)fq.e > 0.5D)
        {
            return fq.b;
        } else
        {
            return fq.c;
        }
    }

    public final int e()
    {
        return I.o();
    }

    public final FilterPageType f()
    {
        return j.a(j.c.a);
    }

    public final boolean g()
    {
        Fp fp = o;
        return fp.a.b(fp.b.a) == FilterPageType.UNFILTERED;
    }

    public final void h()
    {
        Fn fn = E;
        int i1 = y.widthPixels;
        fn.c.i = SwipeViewState.MotionState.AUTO_SCROLLING;
        SwipeViewState swipeviewstate = fn.c;
        boolean flag;
        if (swipeviewstate.g < (float)swipeviewstate.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            fn.c.g = (float)i1 * -0.05F;
        } else
        {
            fn.c.g = (float)i1 * 1.05F;
        }
        fn.c.n = 0.2F;
        fn.b.invalidate();
        fn.a(i1);
    }

    public final boolean i()
    {
        return h.i();
    }

    public final void j()
    {
        if (D != null)
        {
            EmojiMovableImageView emojimovableimageview = D;
            emojimovableimageview.f = false;
            emojimovableimageview.e = false;
            emojimovableimageview.g.a();
            D = null;
        }
    }

    public final void k()
    {
        Object obj1;
        int i1;
        int j1;
label0:
        {
            Object obj;
            if (o.a())
            {
                obj = u.a(o.b.c);
            } else
            {
                obj = u.a(o.b.a);
            }
            if (obj != null)
            {
                ((Ho) (obj)).h();
                if ((obj instanceof HF) && (t instanceof AA))
                {
                    i1 = l();
                    obj1 = (AA)t;
                    j1 = o.b.a;
                    obj = ((HF)obj).b.mFilterId;
                    obj1 = (lg)((AA) (obj1)).mGeofilterSwipeMetaData.mData.get(obj);
                    if (obj1 != null)
                    {
                        break label0;
                    }
                    Timber.d(lf.TAG, (new StringBuilder("Item for ")).append(((String) (obj))).append(" is null.").toString(), new Object[0]);
                }
            }
            return;
        }
        obj1.filterIndexCount = i1;
        obj1.filterIndexPos = j1;
        ((lg) (obj1)).a();
    }

    public void onEnableFiltersEvent(MD md)
    {
        B.c = 0;
        B.d = 0;
        B.b = 0;
        B.a = 0;
        n.a();
        n.a(t.i(), t.mShouldEnableVisualFilters, t.mShouldEnableSmartFilters, t.mShouldEnableVideoSpeedFilters, t.mShouldEnableSponsoredFilters, t.mSnapType);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        if (!isEnabled())
        {
            return false;
        }
        i1 = q.getChildCount() - 1;
_L10:
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        EmojiMovableImageView emojimovableimageview;
        if (!(q.getChildAt(i1) instanceof EmojiMovableImageView))
        {
            continue; /* Loop/switch isn't completed */
        }
        emojimovableimageview = (EmojiMovableImageView)q.getChildAt(i1);
        obj = emojimovableimageview;
        if (((MovableImageView) (emojimovableimageview)).f) goto _L4; else goto _L3
_L3:
        int l1 = aP.a(motionevent);
        if (l1 != 0 && l1 != 5 && !((MovableImageView) (emojimovableimageview)).f) goto _L6; else goto _L5
_L5:
        Bitmap bitmap;
        boolean flag;
        bitmap = ((BitmapDrawable)emojimovableimageview.getDrawable()).getBitmap();
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0 || emojimovableimageview.getHeight() == 0 || emojimovableimageview.getWidth() == 0)
        {
            flag = false;
        } else
        {
label0:
            {
                float f1;
                float f2;
                float f3;
                float f4;
                float f5;
                Matrix matrix;
                if (motionevent.getActionIndex() == 0)
                {
                    obj = new float[2];
                    obj[0] = motionevent.getX();
                    obj[1] = motionevent.getY();
                } else
                if (motionevent.getActionIndex() == 0)
                {
                    obj = new float[2];
                    obj[0] = motionevent.getX();
                    obj[1] = motionevent.getY();
                } else
                {
                    obj = Jo.a(motionevent.getX(0), motionevent.getY(0), motionevent.getX(1), motionevent.getY(1));
                }
                matrix = new Matrix();
                emojimovableimageview.getMatrix().invert(matrix);
                matrix.mapPoints(((float []) (obj)));
                f1 = (float)emojimovableimageview.getResources().getDimensionPixelSize(0x7f0a00cd) / emojimovableimageview.getScaleX() / 2.0F;
                f2 = emojimovableimageview.getHeight() / 2;
                f3 = Math.max(f2, f1);
                f4 = emojimovableimageview.getWidth() / 2;
                f5 = Math.max(f4, f1);
                if (f2 > f1)
                {
                    break label0;
                }
                flag = (new RectF(f4 - f5, f2 - f3, f4 + f5, f2 + f3)).contains(obj[0], obj[1]);
            }
        }
_L9:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = emojimovableimageview;
_L4:
        int i2;
        D = ((EmojiMovableImageView) (obj));
        if (I != null && I.m())
        {
            return false;
        }
        if (I != null && I.p())
        {
            return false;
        }
        if (i.d())
        {
            i.dispatchTouchEvent(motionevent);
            return true;
        }
        i1 = motionevent.getAction();
        if (J.contains(Integer.valueOf(motionevent.getPointerId(0))))
        {
            if (i1 == 1 || i1 == 3)
            {
                Timber.c("SnapEditorView", "Remove pointerId %d", new Object[] {
                    Integer.valueOf(motionevent.getPointerId(0))
                });
                J.remove(Integer.valueOf(motionevent.getPointerId(0)));
            }
            i1 = 1;
        } else
        if (i1 == 0 && h.b(motionevent))
        {
            Timber.c("SnapEditorView", "Add pointerId %d", new Object[] {
                Integer.valueOf(motionevent.getPointerId(0))
            });
            J.add(Integer.valueOf(motionevent.getPointerId(0)));
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && f() != FilterPageType.TURN_ON_FILTERS_PAGE && (h.i() || D == null || !TextUtils.isEmpty(h.l())))
        {
            h.dispatchTouchEvent(motionevent);
            return true;
        }
        if (h.j() || D != null)
        {
            break MISSING_BLOCK_LABEL_1196;
        }
        obj = G;
        l1 = motionevent.getActionMasked();
        i1 = motionevent.getActionIndex();
        i2 = motionevent.getPointerId(i1);
          goto _L7
        obj[0] = (obj[0] * (float)bitmap.getWidth()) / (float)emojimovableimageview.getWidth();
        obj[1] = (obj[1] * (float)bitmap.getHeight()) / (float)emojimovableimageview.getHeight();
        if (!(new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight())).contains(obj[0], obj[1]) || bitmap.getPixel((int)obj[0], (int)obj[1]) == 0) goto _L6; else goto _L8
_L8:
        flag = true;
          goto _L9
_L6:
        flag = false;
          goto _L9
        i1--;
          goto _L10
_L2:
        obj = null;
          goto _L4
_L7:
        if (i1 <= 1 || l1 != 0 && l1 != 5 && l1 != 2) goto _L12; else goto _L11
_L11:
        return true;
_L12:
        Object obj1;
        int j1;
        if (l1 == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        obj1 = ((GT) (obj)).c;
        obj1.e = motionevent.getActionIndex();
        obj1.c = motionevent.getX(((GW) (obj1)).e);
        obj1.f = motionevent.getPointerId(((GW) (obj1)).e);
        if (((GW) (obj1)).b[1] != -1)
        {
            int j2 = motionevent.findPointerIndex(((GW) (obj1)).b[1]);
            if (j2 != -1)
            {
                obj1.d = motionevent.getX(j2);
            }
        }
        if (j1 != 0 || l1 == 5)
        {
            if (j1 != 0)
            {
                j1 = 0;
            } else
            {
                j1 = 1;
            }
            motionevent = ((GT) (obj)).a.a(((GT) (obj)).d, ((GT) (obj)).c, j1);
        } else
        if (l1 == 2)
        {
            int k1 = motionevent.getPointerCount();
            motionevent = ((GT) (obj)).a.a(((GT) (obj)).d, ((GT) (obj)).c, k1, ((GT) (obj)).b);
        } else
        if (l1 == 1 || l1 == 6 || l1 == 3)
        {
            obj1 = ((GT) (obj)).c;
            if (i2 >= 0 && i2 < 2)
            {
                ((GW) (obj1)).b[i2] = -1;
            }
            motionevent = ((GT) (obj)).a.a(((GT) (obj)).d, ((GT) (obj)).c, motionevent);
        } else
        {
            motionevent = null;
        }
        if (motionevent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((GT) (obj)).e;
        GU._cls1.a[motionevent.ordinal()];
        JVM INSTR tableswitch 1 4: default 1020
    //                   1 1160
    //                   2 1169
    //                   3 1178
    //                   4 1187;
           goto _L13 _L14 _L15 _L16 _L17
_L17:
        break MISSING_BLOCK_LABEL_1187;
_L14:
        break; /* Loop/switch isn't completed */
_L13:
        motionevent = null;
_L19:
        obj.a = motionevent;
        if (true) goto _L11; else goto _L18
_L18:
        motionevent = ((GU) (obj1)).c;
          goto _L19
_L15:
        motionevent = ((GU) (obj1)).b;
          goto _L19
_L16:
        motionevent = ((GU) (obj1)).d;
          goto _L19
        motionevent = ((GU) (obj1)).e;
          goto _L19
label1:
        {
            if (D != null && f() != FilterPageType.TURN_ON_FILTERS_PAGE)
            {
                if (!h.i())
                {
                    break label1;
                }
                h.a(true);
            }
            return true;
        }
        Jo.a(q, D);
        D.dispatchTouchEvent(motionevent);
        return true;
          goto _L9
    }

    public final void q()
    {
        k();
    }

    public void setAudible(boolean flag)
    {
        H = flag;
        if (rz.b())
        {
            if (l != null)
            {
                if (flag)
                {
                    l.setVolume(1.0F);
                    return;
                } else
                {
                    l.setVolume(0.0F);
                    return;
                }
            } else
            {
                c(flag);
                return;
            }
        } else
        {
            c(flag);
            return;
        }
    }

    public void setCaptionText(String s1)
    {
        h.setText(s1);
    }

    public void setInterface(b b1)
    {
        I = b1;
    }

    public void setMediabryo(Mediabryo mediabryo)
    {
        boolean flag2 = true;
        boolean flag;
        if (h != null && h.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = mediabryo;
        if (mediabryo.i() == 0 && mediabryo.mRawImageBitmap != null)
        {
            mediabryo = mediabryo.mRawImageBitmap;
            if (mediabryo == null)
            {
                throw new NullPointerException();
            }
            boolean flag1;
            if (s == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 || flag)
            {
                removeView(f);
                r = mediabryo;
                s = SnapMediaUtils.b(r, getContext());
                mediabryo = j;
                Bitmap bitmap = s;
                if (((SwipeImageView) (mediabryo)).d == null)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                mediabryo.d = bitmap;
                ((SwipeImageView) (mediabryo)).a.a = mediabryo.a(((SwipeImageView) (mediabryo)).d);
                if (flag1)
                {
                    n.a();
                    n.a(0, t.mShouldEnableVisualFilters, t.mShouldEnableSmartFilters, t.mShouldEnableVideoSpeedFilters, t.mShouldEnableSponsoredFilters, t.mSnapType);
                } else
                {
                    if (flag)
                    {
                        int i1 = getResources().getConfiguration().orientation;
                        for (mediabryo = u.a.iterator(); mediabryo.hasNext(); ((Ho)mediabryo.next()).a(i1, getContext())) { }
                    }
                    j.a();
                }
                if (t != null)
                {
                    setPreviewConfiguration(t.mPreviewConfiguration);
                }
            }
        }
    }

    public void setPreviewConfiguration(Be be)
    {
        if (be != null)
        {
            f.setGravity(be.mGravity);
            int i1 = be.mWidth;
            int j1 = be.mHeight;
            if (i1 >= 0 && j1 >= 0)
            {
                if (k != null)
                {
                    k.setVideoAspect(i1, j1);
                }
                if (l != null)
                {
                    l.setVideoAspect(i1, j1);
                }
            }
            if (be.mShouldHideSystemUi)
            {
                h.g();
                return;
            }
        }
    }

    public void setSnapPreviewRotationListener(SwipeImageView.a a1)
    {
        j.setSnapPreviewRotationListener(a1);
    }

    public void setSwipeImageViewAnalytics(lV lv1)
    {
        z = lv1;
    }

    public void setSwipeImageViewOnScrollListener(Fn.a a1)
    {
        E.a(a1);
    }

    // Unreferenced inner class com/snapchat/android/ui/SnapEditorView$1

/* anonymous class */
    public final class _cls1
        implements qp.a
    {

        private SnapEditorView a;

        public final void a(Wi wi)
        {
            SnapEditorView.a(a).b();
            Fq fq = SnapEditorView.b(a);
            fq.a = wi;
            fq.a();
        }

            public 
            {
                a = SnapEditorView.this;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/SnapEditorView$2

/* anonymous class */
    public final class _cls2
        implements Wv.a
    {

        private Bw a;

        public final void a(Wv.c c1, String s1)
        {
            if (c1 == Wv.c.f)
            {
                Timber.c("SnapEditorView", (new StringBuilder("Video Rendering finished successfully: ")).append(s1).toString(), new Object[0]);
                return;
            } else
            {
                Timber.e("SnapEditorView", (new StringBuilder("Video rendering is done with error status: ")).append(c1).append(", ").append(s1).toString(), new Object[0]);
                (new TranscodingTaskMetrics(com.snapchat.android.analytics.transcoding.TranscodingTaskMetrics.TranscodingType.PREVIEW)).a(a, null, c1, s1);
                return;
            }
        }

            public 
            {
                a = bw;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/ui/SnapEditorView$8

/* anonymous class */
    public static final class _cls8
    {

        public static final int a[];

        static 
        {
            a = new int[CaptionTypeEnums.values().length];
            try
            {
                a[CaptionTypeEnums.NON_FAT_VANILLA_CAPTION_TYPE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[CaptionTypeEnums.FAT_CAPTION_TYPE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[CaptionTypeEnums.FAT_CENTER_CAPTION_TYPE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
