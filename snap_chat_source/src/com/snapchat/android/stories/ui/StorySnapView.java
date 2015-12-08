// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import AD;
import AO;
import Bd;
import Bk;
import DB;
import DD;
import Dy;
import EO;
import EP;
import EQ;
import ER;
import Ei;
import Ex;
import Hb;
import Hd;
import IW;
import Jo;
import Jr;
import MV;
import Mf;
import No;
import OA;
import Og;
import On;
import Oo;
import PI;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bp;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.model.StorySnapLogbook;
import com.snapchat.android.ui.ClipCircleViewGroup;
import com.snapchat.android.ui.SnapTimerView;
import com.snapchat.android.ui.SponsoredSlugView;
import com.snapchat.android.ui.StoryTimerView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.ui.snapview.SnapViewSessionStopReason;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import com.snapchat.android.util.debug.FeatureFlagManager;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ld;
import rT;
import sJ;
import sW;
import sZ;
import vB;
import vP;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StorySnapViewGroup, StoryExplorerTooltip

public class StorySnapView extends RelativeLayout
    implements ER.a, sJ
{
    public static interface a
    {

        public abstract void a(Bk bk, boolean flag);
    }

    final class b
        implements Runnable
    {

        private StorySnapView a;

        public final void run()
        {
            StorySnapView.f(a);
            a.c();
        }

        private b()
        {
            a = StorySnapView.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private final android.view.View.OnClickListener A;
    private ER B;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener C;
    private ObjectAnimator D;
    private RelativeLayout E;
    private float F;
    private float G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private a O;
    protected final StorySnapViewGroup a;
    protected final ViewGroup b;
    protected final SponsoredSlugView c;
    protected final Context d;
    protected final EQ e;
    protected final Bus f;
    public final EO g;
    boolean h;
    protected PI i;
    protected Ex j;
    private VerticalSwipeLayout k;
    private final TextView l;
    private final TextView m;
    private final View n;
    private final int o;
    private final b p;
    private final Jo q;
    private final Ei r;
    private vP s;
    private StoryExplorerTooltip t;
    private final IW u;
    private AnimatorSet v;
    private boolean w;
    private int x;
    private final SharedPreferences y;
    private final android.view.View.OnClickListener z;

    public StorySnapView(Context context, StorySnapViewGroup storysnapviewgroup)
    {
        Bus bus = Mf.a();
        Ei ei = Ei.a();
        Jo jo = new Jo(context);
        EQ eq = new EQ();
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        FeatureFlagManager.a();
        this(context, storysnapviewgroup, bus, ei, jo, eq, sharedpreferences, new IW());
    }

    private StorySnapView(Context context, StorySnapViewGroup storysnapviewgroup, Bus bus, Ei ei, Jo jo, EQ eq, SharedPreferences sharedpreferences, 
            IW iw)
    {
        super(context, null);
        x = -1;
        j = null;
        C = null;
        D = null;
        F = -1F;
        G = -1F;
        H = false;
        I = false;
        J = false;
        L = false;
        M = false;
        N = false;
        d = context;
        a = storysnapviewgroup;
        f = bus;
        r = ei;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f040110, this, true);
        b = (ViewGroup)findViewById(0x7f0d0559);
        c = (SponsoredSlugView)findViewById(0x7f0d028e);
        l = (TextView)findViewById(0x7f0d00b4);
        l.setFocusableInTouchMode(true);
        l.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            private StorySnapView a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                Object obj;
                Bk bk;
                String s1;
                boolean flag;
                if (!FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.REPLY_STORY_TO_CHAT) || i1 != 4 && (keyevent == null || keyevent.getKeyCode() != 66))
                {
                    break MISSING_BLOCK_LABEL_495;
                }
                textview = StorySnapView.b(a);
                s1 = StorySnapView.a(a).getText().toString();
                bk = textview.h();
                if (bk == null)
                {
                    textview = null;
                } else
                {
label0:
                    {
                        obj = null;
                        keyevent = null;
                        flag = bk.ak();
                        if (!flag)
                        {
                            break MISSING_BLOCK_LABEL_364;
                        }
                        keyevent = ((DB)((EO) (textview)).n.c()).h;
                        if (keyevent != null)
                        {
                            break label0;
                        }
                        textview = null;
                    }
                }
_L1:
                if (textview == null)
                {
                    return false;
                } else
                {
                    a.f.a(new Oo(textview));
                    a.f();
                    return true;
                }
                if (((DD) (keyevent)).a != null)
                {
                    ((DD) (keyevent)).a.mShouldHoldOffCacheRemoval = true;
                }
                textview = keyevent.a();
                obj = Uri.parse(textview);
                keyevent = keyevent.b();
                textview = ThumbnailUtils.createVideoThumbnail(textview, 2);
_L2:
                CbcEncryptionAlgorithm cbcencryptionalgorithm = new CbcEncryptionAlgorithm();
                Object obj1 = new vB();
                ((vB) (obj1)).a(cbcencryptionalgorithm.b());
                ((vB) (obj1)).b(cbcencryptionalgorithm.c());
                if (flag)
                {
                    if (keyevent != null && textview != null)
                    {
                        Bitmap bitmap = Bitmap.createScaledBitmap(keyevent, textview.getWidth(), textview.getHeight(), true);
                        (new Canvas(textview)).drawBitmap(bitmap, 0.0F, 0.0F, null);
                    }
                    Bw.a a1 = (Bw.a)(new Bw.a()).a(com.snapchat.android.model.Mediabryo.SnapType.STORY_REPLY);
                    a1.mMediaExtras = ((AK) (obj1));
                    obj1 = (Bw.a)a1;
                    obj1.mMediaMailingMetadata = new Bd();
                    obj = (Bw.a)((Bw.a)obj1).a(((Uri) (obj)));
                    obj.mCompositeImageBitmap = keyevent;
                    keyevent = (Bw.a)obj;
                    keyevent.mFirstFrameBitmap = textview;
                    keyevent.mStoryReplyText = s1;
                    textview = (Bw.a)keyevent;
                    textview.mStoryId = bk.mClientId;
                    textview = (Bw.a)textview;
                    textview.mIsZipUpload = true;
                    textview = ((Bw.a)textview).c();
                } else
                {
                    keyevent = (Bc.a)(new Bc.a()).a(com.snapchat.android.model.Mediabryo.SnapType.STORY_REPLY);
                    keyevent.mMediaExtras = ((AK) (obj1));
                    keyevent = (Bc.a)keyevent;
                    keyevent.mMediaMailingMetadata = new Bd();
                    keyevent = (Bc.a)keyevent;
                    keyevent.mCompositeImageBitmap = textview;
                    textview = (Bc.a)keyevent;
                    textview.mStoryReplyText = s1;
                    textview = (Bc.a)textview;
                    textview.mStoryId = bk.d();
                    textview = ((Bc.a)textview).c();
                }
                ((Bd)((Mediabryo) (textview)).mMediaMailingMetadata).a(bk.j());
                  goto _L1
                textview = ((Dy)((EO) (textview)).n.c()).e();
                  goto _L2
                return false;
            }

            
            {
                a = StorySnapView.this;
                super();
            }
        });
        k = (VerticalSwipeLayout)findViewById(0x7f0d055d);
        i = new PI(this, 0x7f0d055a, 0x7f0d04aa);
        q = jo;
        m = (TextView)findViewById(0x7f0d055c);
        n = findViewById(0x7f0d055b);
        e = eq;
        y = sharedpreferences;
        o = ViewConfiguration.get(context).getScaledTouchSlop();
        p = new b((byte)0);
        u = iw;
        g = a();
        g.a(this);
        B = new ER(getContext(), k, g.p, this);
        z = new android.view.View.OnClickListener() {

            private StorySnapView a;

            public final void onClick(View view)
            {
                a.e();
            }

            
            {
                a = StorySnapView.this;
                super();
            }
        };
        A = new android.view.View.OnClickListener() {

            private StorySnapView a;

            public final void onClick(View view)
            {
                view = a.a;
                view.a(((StorySnapViewGroup) (view)).c.f + 1);
            }

            
            {
                a = StorySnapView.this;
                super();
            }
        };
    }

    static int a(StorySnapView storysnapview, int i1)
    {
        storysnapview.x = i1;
        return i1;
    }

    static TextView a(StorySnapView storysnapview)
    {
        return storysnapview.l;
    }

    private void a(MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 32
    //                   2 39;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        H = true;
        return;
_L3:
        if (H && a(motionevent.getX(), motionevent.getY()))
        {
            H = false;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(android.view.View.OnClickListener onclicklistener)
    {
        if (s == null)
        {
            Context context = d;
            if (s == null)
            {
                s = new vP(context);
                s.a(-1, 0xff000000);
                s.a(onclicklistener);
                addView(s.c);
            }
        }
        s.c.setVisibility(0);
        s.a();
    }

    private boolean a(float f1, float f2)
    {
        while (F == -1F || G == -1F || Math.abs(F - f1) <= (float)o && Math.abs(G - f2) <= (float)o) 
        {
            return false;
        }
        return true;
    }

    static EO b(StorySnapView storysnapview)
    {
        return storysnapview.g;
    }

    static int c(StorySnapView storysnapview)
    {
        return storysnapview.x;
    }

    static boolean d(StorySnapView storysnapview)
    {
        storysnapview.w = true;
        return true;
    }

    static boolean e(StorySnapView storysnapview)
    {
        return storysnapview.w;
    }

    static boolean f(StorySnapView storysnapview)
    {
        storysnapview.J = true;
        return true;
    }

    private void i()
    {
        removeCallbacks(p);
        I = false;
        J = false;
        requestDisallowInterceptTouchEvent(false);
    }

    protected EO a()
    {
        return new EO(d, a, b, e, c);
    }

    public void a(AO ao)
    {
        q.a(this, true);
        r.a(SnapchatApplication.get());
        if (s != null)
        {
            s.c.setVisibility(8);
        }
        if (i.c())
        {
            if (j != null)
            {
                j.b();
            }
            i.a(8);
            f.a(new MV(null));
        }
        g.o = null;
    }

    public void a(Hb hb)
    {
        Object obj;
        StorySnapViewGroup storysnapviewgroup;
        int i1;
        int j1;
        int k1;
        M = true;
        u.a();
        obj = g.g();
        if (obj != null)
        {
            if (obj instanceof sW)
            {
                obj = (sW)obj;
                Bk bk = (Bk)hb;
                obj = (StorySnapLogbook)((sW) (obj)).a.get(bk.mClientId);
                B.a(((StorySnapLogbook) (obj)), false, false);
            } else
            if (((sZ) (obj)).u_() != null)
            {
                B.a(null, false, false);
            } else
            {
                obj = ((sZ) (obj)).j();
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = (StorySnapLogbook)((List) (obj)).get(0);
                }
                setSecondTapForFailedStory(false);
                B.a(((StorySnapLogbook) (obj)), true, K);
                K = false;
            }
        }
        if (i.c())
        {
            if (D == null)
            {
                D = ObjectAnimator.ofFloat(i.a(), View.ALPHA, new float[] {
                    1.0F, 0.0F
                });
                D.setDuration(800L);
                D.addListener(new Jr() {

                    private StorySnapView a;

                    public final void onAnimationEnd(Animator animator)
                    {
                        a.i.a(8);
                    }

            
            {
                a = StorySnapView.this;
                super();
            }
                });
            }
            D.start();
        }
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.REPLY_STORY_TO_CHAT) && e.a() != null)
        {
            a(z);
        }
        if (!FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORY_EXPLORER)) goto _L2; else goto _L1
_L1:
        obj = (Bk)hb;
        if (!((Bk) (obj)).mIsShared) goto _L2; else goto _L3
_L3:
        Timber.c("StorySnapView", "Displaying snap with id: %s, client id: %s, media id: %s", new Object[] {
            ((Bk) (obj)).d(), ((Bk) (obj)).mClientId, ((Bk) (obj)).mMediaId
        });
        storysnapviewgroup = a;
        k1 = storysnapviewgroup.c.f;
        hb = storysnapviewgroup.f;
        hb;
        JVM INSTR monitorenter ;
        j1 = storysnapviewgroup.f.size();
        if (k1 <= j1) goto _L5; else goto _L4
_L4:
        Timber.d("StorySnapViewGroup", "Attempt to view snap multiple levels below last. Previous level: %d, New level: %d", new Object[] {
            Integer.valueOf(j1), Integer.valueOf(k1)
        });
        i1 = 0;
_L13:
        if (i1 != 0) goto _L7; else goto _L6
_L6:
        hb;
        JVM INSTR monitorexit ;
_L11:
        if (O != null)
        {
            O.a(((Bk) (obj)), g.e());
        }
_L2:
        return;
_L5:
        i1 = j1;
        if (k1 != j1)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        storysnapviewgroup.f.add(new HashSet());
        break; /* Loop/switch isn't completed */
_L9:
        if (k1 >= i1 - 1 || i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        List list = storysnapviewgroup.f;
        i1--;
        list.remove(i1);
        if (true) goto _L9; else goto _L8
_L8:
        break; /* Loop/switch isn't completed */
        obj;
        hb;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        ((Set)storysnapviewgroup.f.get(k1)).add(((Bk) (obj)).d());
        hb;
        JVM INSTR monitorexit ;
        if (true) goto _L11; else goto _L10
_L10:
        i1 = 1;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void a(Hb hb, AO ao)
    {
        q.a(this, false);
        Jo.a(getContext(), this);
    }

    public void a(Hb hb, SnapViewSessionStopReason snapviewsessionstopreason, int i1)
    {
        M = false;
        u.d();
        if (h)
        {
            f();
        }
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORY_EXPLORER) && snapviewsessionstopreason != SnapViewSessionStopReason.TEMPORARY_ABORT_REQUEST)
        {
            hb = (Bk)hb;
            if (((Bk) (hb)).mIsShared)
            {
                snapviewsessionstopreason = a;
                hb = hb.d();
                snapviewsessionstopreason = ((StorySnapViewGroup) (snapviewsessionstopreason)).c;
                if (((EP) (snapviewsessionstopreason)).i.containsKey(hb))
                {
                    i1 = snapviewsessionstopreason.a(hb);
                    int j1 = ((EP) (snapviewsessionstopreason)).f;
                    int k1 = j1 + 1;
                    j1 = i1;
                    i1 = k1;
                    do
                    {
                        if (i1 >= ((EP) (snapviewsessionstopreason)).a.getChildCount())
                        {
                            break;
                        }
                        Bk bk = ((StorySnapView)((EP) (snapviewsessionstopreason)).a.getChildAt(i1)).g.h();
                        if (bk == null)
                        {
                            break;
                        }
                        j1 += snapviewsessionstopreason.a(bk.d());
                        i1++;
                    } while (true);
                    if (j1 > 0)
                    {
                        Timber.a("ExplorerStoryLevelsController", "Canceled %d requests after user moved past parent snap %s", new Object[] {
                            Integer.valueOf(j1), hb
                        });
                    }
                }
            }
        }
    }

    public final void a(PI.a a1, Ex ex)
    {
        if (a1 != null)
        {
            i.a(a1);
        }
        a1 = g.o;
        if (a1 != null)
        {
            setLoadingBackground(a1);
        }
        i.a(0);
        j = ex;
    }

    public final void a(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        a(A);
        b();
_L4:
        if (M)
        {
            u.b();
            if (g.h() != null)
            {
                g.h().mTimeToKnownExplorableStatusMs = u.c();
            }
            u.d();
        }
        return;
_L2:
        if (s != null)
        {
            s.c.setVisibility(8);
            s.b();
        }
        if (t != null)
        {
            t.setVisibility(8);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void b()
    {
        if (t == null && !L)
        {
            t = new StoryExplorerTooltip(d);
            L = true;
            if (!t.a())
            {
                t = null;
                return;
            }
            if (s != null)
            {
                StoryExplorerTooltip storyexplorertooltip = t;
                vP vp = s;
                float f1 = Jo.a(vp.b);
                storyexplorertooltip.setPadding(0, 0, 0, (int)((float)Jo.b(vp.b) * 0.08F + f1 * 0.1F * 0.26F) / 2);
            }
            addView(t);
            Object obj = t;
            if (((StoryExplorerTooltip) (obj)).getAlpha() <= 0.0F && ((StoryExplorerTooltip) (obj)).a())
            {
                ViewPropertyAnimator viewpropertyanimator = ((StoryExplorerTooltip) (obj)).animate();
                viewpropertyanimator.alpha(1.0F).setDuration(1000L);
                ((StoryExplorerTooltip) (obj)).setVisibility(0);
                viewpropertyanimator.setListener(new StoryExplorerTooltip._cls1(viewpropertyanimator));
                int i1 = ((StoryExplorerTooltip) (obj)).a.getInt(SharedPreferenceKey.STORY_EXPLORER_TOOLTIP_DISPLAY_COUNT.getKey(), 0);
                obj = ((StoryExplorerTooltip) (obj)).a.edit();
                ((android.content.SharedPreferences.Editor) (obj)).putInt(SharedPreferenceKey.STORY_EXPLORER_TOOLTIP_DISPLAY_COUNT.getKey(), i1 + 1);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
                viewpropertyanimator.start();
                return;
            }
        }
    }

    public void c()
    {
        i();
    }

    public final void d()
    {
        k.d();
        g.a(SnapViewSessionStopReason.DELETED_SNAP);
        f.a(new No(null));
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = super.dispatchTouchEvent(motionevent);
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (motionevent.getActionMasked() == 1)
            {
                flag = onTouchEvent(motionevent);
            }
        }
        return flag;
    }

    public final void e()
    {
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.REPLY_STORY_TO_CHAT))
        {
            ld.a().a(true);
            if (C == null)
            {
                C = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                    private StorySnapView a;

                    public final void onGlobalLayout()
                    {
                        int k1 = Jo.b(a.d);
                        View view = a.getRootView();
                        Rect rect = new Rect();
                        view.getWindowVisibleDisplayFrame(rect);
                        int l1 = k1 - (rect.bottom - rect.top);
                        if (l1 > 100)
                        {
                            k1 -= l1;
                            if (StorySnapView.c(a) != k1)
                            {
                                StorySnapView.a(a, k1);
                                SharedPreferenceKey.KEYBOARD_HEIGHT_PORTRAIT.putInt(k1);
                            }
                            StorySnapView.d(a);
                        } else
                        if (StorySnapView.e(a))
                        {
                            a.f();
                            return;
                        }
                    }

            
            {
                a = StorySnapView.this;
                super();
            }
                };
            }
            getViewTreeObserver().addOnGlobalLayoutListener(C);
            Friend friend = e.a();
            if (friend != null)
            {
                h = true;
                Object obj = g.h();
                float f1;
                float f2;
                int i1;
                int j1;
                if (obj != null && ((Bk) (obj)).ak())
                {
                    g.a(true);
                } else
                {
                    g.c(true);
                }
                l.setAlpha(0.0F);
                l.setVisibility(0);
                l.requestFocus();
                l.setCursorVisible(true);
                Jo.g(l.getContext());
                j1 = Jo.a(l);
                if (x != -1)
                {
                    i1 = x;
                } else
                {
                    i1 = y.getInt(SharedPreferenceKey.KEYBOARD_HEIGHT_PORTRAIT.getKey(), -1);
                    if (i1 == -1)
                    {
                        i1 = (int)((float)(new rT()).heightPixels * 0.5F);
                    } else
                    {
                        x = i1;
                    }
                }
                obj = (android.widget.FrameLayout.LayoutParams)l.getLayoutParams();
                ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(((android.widget.FrameLayout.LayoutParams) (obj)).leftMargin, i1 - j1, ((android.widget.FrameLayout.LayoutParams) (obj)).rightMargin, ((android.widget.FrameLayout.LayoutParams) (obj)).bottomMargin);
                l.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                f1 = getContext().getResources().getDimension(0x7f0a0141);
                f2 = getContext().getResources().getDimension(0x7f0a0142);
                if (v != null)
                {
                    v.cancel();
                }
                v = new AnimatorSet();
                n.setAlpha(0.0F);
                n.setVisibility(0);
                m.setText(friend.e());
                m.setY(f2);
                m.setAlpha(0.0F);
                m.setVisibility(0);
                v.play(ObjectAnimator.ofFloat(m, View.ALPHA, new float[] {
                    1.0F
                })).with(ObjectAnimator.ofFloat(n, View.ALPHA, new float[] {
                    1.0F
                })).with(ObjectAnimator.ofFloat(m, View.Y, new float[] {
                    f1
                })).with(ObjectAnimator.ofFloat(l, View.ALPHA, new float[] {
                    1.0F
                }));
                v.setDuration(300L);
                v.setInterpolator(new bp());
                v.start();
                return;
            }
        }
    }

    public final void f()
    {
        h = false;
        Bk bk = g.h();
        if (bk != null && bk.ak())
        {
            g.a(false);
        } else
        {
            g.c(false);
        }
        w = false;
        getViewTreeObserver().removeGlobalOnLayoutListener(C);
        l.setVisibility(4);
        m.setVisibility(4);
        n.setVisibility(4);
        l.setText("");
        m.setText("");
        Jo.a(l.getContext(), this);
        f.a(new Og(false));
    }

    public final void g()
    {
        b.setVisibility(8);
        if (ClipCircleViewGroup.h)
        {
            f.a(new On());
        }
        if (t != null)
        {
            t.setVisibility(8);
            removeView(t);
            t = null;
            L = false;
        }
    }

    protected final void h()
    {
        I = false;
        J = false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        a(motionevent);
        i1 = motionevent.getActionMasked();
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.STORY_EXPLORER)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        F = motionevent.getX();
        G = motionevent.getY();
        if (!I)
        {
            motionevent = g.h();
            boolean flag;
            if (motionevent == null)
            {
                flag = false;
            } else
            {
                flag = ((Bk) (motionevent)).mIsShared;
            }
            if (flag)
            {
                postDelayed(p, 400L);
                I = true;
                return false;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (motionevent.getActionMasked() != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!I || J || !a(motionevent.getX(), motionevent.getY())) goto _L1; else goto _L4
_L4:
        i();
        return false;
        if (!I || J) goto _L1; else goto _L5
_L5:
        i();
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag2 = false;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 48
    //                   1 54
    //                   2 306
    //                   3 361;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag1 = flag2;
_L10:
        a(motionevent);
        return flag1;
_L2:
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L3:
        boolean flag;
        if (I && !J)
        {
            i();
        }
        if (J)
        {
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (!H)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!g.k)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        Object obj = g;
        if (((EO) (obj)).n == null)
        {
            obj = null;
        } else
        {
            obj = ((EO) (obj)).n.a();
        }
        if ((obj instanceof Bk) && ((Bk)obj).mFailed)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !N) goto _L7; else goto _L6
_L6:
        flag = true;
_L8:
        if (h)
        {
            f();
        } else
        {
            if (flag)
            {
                k.d();
                g.f();
                if (g.c())
                {
                    f.a(new OA());
                }
            }
            if (D != null && D.isRunning())
            {
                D.end();
            }
            if (i.c())
            {
                MotionEvent motionevent1 = MotionEvent.obtain(0L, 0L, 1, 0.0F, 0.0F, 0);
                ((RelativeLayout)i.a()).dispatchTouchEvent(motionevent1);
            }
        }
        H = false;
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L7:
        setSecondTapForFailedStory(true);
        flag = false;
          goto _L8
_L4:
        if (I && !J && a(motionevent.getX(), motionevent.getY()))
        {
            i();
        }
        flag1 = flag2;
        if (J)
        {
            requestDisallowInterceptTouchEvent(true);
            flag1 = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag1 = flag2;
        if (I)
        {
            flag1 = flag2;
            if (!J)
            {
                i();
                flag1 = flag2;
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void setExplorerSnapsPresenceListener(a a1)
    {
        O = a1;
    }

    public void setGoToViewersInfoAfterFirstShow(boolean flag)
    {
        K = flag;
    }

    public void setLoadingBackground(Bitmap bitmap)
    {
        if (E == null)
        {
            E = (RelativeLayout)((RelativeLayout)i.a()).findViewById(0x7f0d04aa);
        }
        E.setBackgroundDrawable(new BitmapDrawable(bitmap));
    }

    public void setSecondTapForFailedStory(boolean flag)
    {
        N = flag;
    }

    public void setTimerViews(StoryTimerView storytimerview, SnapTimerView snaptimerview)
    {
        EO eo = g;
        eo.l = storytimerview;
        eo.m = snaptimerview;
    }
}
