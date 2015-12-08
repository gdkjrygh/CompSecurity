// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Br;
import Bt;
import CU;
import Db;
import Eh;
import Ei;
import Gd;
import IF;
import IO;
import JH;
import JY;
import Ka;
import LY;
import MW;
import Mf;
import Nw;
import Nx;
import Ny;
import OC;
import OH;
import Oe;
import Oi;
import PA;
import PG;
import PI;
import Pn;
import Po;
import Py;
import Pz;
import Y;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import ao;
import ap;
import cn;
import com.caverock.androidsvg.SVGImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.camera.ui.viewflipper.CameraViewFlipper;
import com.snapchat.android.database.OnboardingTooltip;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.networkmanager.NetworkManager;
import com.snapchat.android.ui.ProfileCameraMaskView;
import com.snapchat.android.ui.ProfilePictureView;
import com.snapchat.android.ui.SharedProfileSnapcodeView;
import com.snapchat.android.ui.VerticalSwipeLayout;
import com.snapchat.android.util.emoji.Emoji;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.snapchat.android.util.profileimages.ProfileImageUtils;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import com.squareup.otto.Bus;
import eg;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
import lX;
import ll;
import mS;
import mV;
import oV;
import pi;
import qx;
import rr;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            LeftSwipeContentFragment, SnapTagHelpFragment

public class ProfileFragment extends SnapchatFragment
    implements Y.a, android.content.SharedPreferences.OnSharedPreferenceChangeListener, android.view.View.OnClickListener, com.snapchat.android.ui.ProfilePictureView.a
{
    public final class a
        implements Po
    {

        private ProfileFragment a;

        public final void a(List list)
        {
            if (list == null)
            {
                Timber.e("ProfileFragment", "profile images - onProfileImagesLoaded but bitmapList is null", new Object[0]);
                return;
            }
            if (list.size() != 5)
            {
                Timber.e("ProfileFragment", "profile images - loaded profile images from cache but the number of images is wrong!", new Object[0]);
                return;
            }
            if (a.e == null || !a.e.g)
            {
                a.a = list;
                a.a(list);
                Timber.c("ProfileFragment", "profile images - pictures were loaded from cache", new Object[0]);
                return;
            }
            list = new StringBuilder("profile images - pictures were loaded but user is capturing pictures now with mProfileImagesList size: ");
            int i1;
            if (a.a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.a.size();
            }
            Timber.c("ProfileFragment", list.append(i1).toString(), new Object[0]);
        }

        protected a()
        {
            a = ProfileFragment.this;
            super();
        }
    }

    final class b
        implements PA
    {

        private ProfileFragment a;

        public final void a(cn cn, String s1)
        {
            boolean flag2 = true;
            if (a.getActivity() != null) goto _L2; else goto _L1
_L1:
            Timber.d("ProfileFragment", "getActivity() returned null in onSvgLoaded() we need to figure this out!", new Object[0]);
_L4:
            return;
_L2:
            if (cn == null)
            {
                cn = ProfileFragment.v(a);
                s1 = a.getActivity();
                ProfileFragment.b(a);
                cn.c(s1, Bt.r());
                return;
            }
            ProfileFragment.b(a);
            if (!TextUtils.equals(Bt.r(), s1)) goto _L4; else goto _L3
_L3:
            boolean flag;
            if (ProfileFragment.r(a) == null)
            {
                ProfileFragment.w(a);
            }
            ProfileFragment.r(a).setSVG(cn);
            a.a(8);
            ProfileFragment.b(a);
            if (Bt.Q())
            {
                break MISSING_BLOCK_LABEL_346;
            }
            ProfileFragment.b(a);
            if (!Bt.bc())
            {
                break MISSING_BLOCK_LABEL_346;
            }
            flag = true;
_L5:
            boolean flag1;
            if (flag)
            {
                a.h.setText(ProfileFragment.x(a));
                a.g.setVisibility(0);
            } else
            {
                a.g.setVisibility(8);
            }
            s1 = (Br)ProfileFragment.y(a).get();
            if (s1 != null && s1.g())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ProfileFragment.b(a);
            if (!Bt.bF() && !flag && flag1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ProfileFragment.l(a).setVisibility(0);
            } else
            {
                ProfileFragment.l(a).setVisibility(8);
            }
            if (a.e == null)
            {
                a.e = (ProfilePictureView)ProfileFragment.z(a).inflate();
                a.e.setCallback(a);
            }
            a.e.setSnapcodeSvg(cn);
            if (ProfileFragment.A(a) == null)
            {
                ProfileFragment.B(a);
            }
            ProfileFragment.A(a).setSnapcodeSvg(cn);
            Timber.c("ProfileFragment", "profile images - snapcode was loaded from cache", new Object[0]);
            return;
            flag = false;
              goto _L5
        }

        private b()
        {
            a = ProfileFragment.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    static final class c
    {

        public float a;
        public float b;
        public float c;
        public float d;
        public float e;

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements qx
    {

        final ProfileFragment a;

        public final void a(Bitmap bitmap)
        {
            if (bitmap == null)
            {
                ProfileFragment.s(a).a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f0800eb));
                a.w();
                a.l();
                return;
            }
            (new JH(bitmap, BitmapFactory.decodeResource(a.getResources(), 0x7f020162), ProfileFragment.t(a))).executeOnExecutor(IO.HIGH_PRIORITY_EXECUTOR, new Void[0]);
            bitmap = a.e;
            bitmap.f = new AnimatorSet();
            ((ProfilePictureView) (bitmap)).f.play(ObjectAnimator.ofFloat(((ProfilePictureView) (bitmap)).b, "alpha", new float[] {
                0.0F, 1.0F
            }));
            ((ProfilePictureView) (bitmap)).f.setDuration(150L);
            ((ProfilePictureView) (bitmap)).f.addListener(new com.snapchat.android.ui.ProfilePictureView._cls5(bitmap));
            ((ProfilePictureView) (bitmap)).f.start();
            ProfileFragment.C(a);
            if (ProfileFragment.t(a) >= 5)
            {
                a.w();
                return;
            } else
            {
                (new Handler(Looper.getMainLooper())).postDelayed(new Runnable(this) {

                    private d a;

                    public final void run()
                    {
                        Timber.c("ProfileFragment", (new StringBuilder("profile images - Capturing profile photo at index ")).append(ProfileFragment.t(a.a)).toString(), new Object[0]);
                        ProfileFragment.c(a.a).a(a.a. new d((byte)0));
                    }

            
            {
                a = d1;
                super();
            }
                }, 1000L);
                return;
            }
        }

        private d()
        {
            a = ProfileFragment.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final Set j;
    private ViewStub A;
    private PI B;
    private SharedProfileSnapcodeView C;
    private c D;
    private AnimationDrawable E;
    private int F;
    private int G;
    private String H;
    private String I;
    private ColorStateList J;
    private ColorStateList K;
    private final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext L;
    private final Bt M;
    private final JY N;
    private final Ei O;
    private final Provider P;
    private final Pz Q;
    private final Pn R;
    private final ProfileEventAnalytics S;
    private final NetworkManager T;
    private final FriendManager U;
    private final Gd V;
    private final Bus W;
    private View X;
    private PA Y;
    private Po Z;
    protected List a;
    private String aa;
    private String ab;
    private final HashSet ac;
    private final Eh ad;
    private final com.snapchat.android.networkmanager.NetworkManager.a ae;
    public CameraViewFlipper b;
    public rr c;
    boolean d;
    protected ProfilePictureView e;
    protected AnimatorSet f;
    protected View g;
    protected TextView h;
    protected ImageView i;
    private int k;
    private TextView l;
    private TextView m;
    private View n;
    private TextView o;
    private View p;
    private View q;
    private ImageView r;
    private View s;
    private View t;
    private ImageView u;
    private View v;
    private ViewGroup w;
    private SVGImageView x;
    private ImageView y;
    private View z;

    public ProfileFragment()
    {
        Bt bt = Bt.a();
        JY jy = Ka.PROFILE_IMAGE_CACHE;
        Ei ei = Ei.a();
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        Pz pz = new Pz();
        Pn pn = new Pn();
        Py.a();
        ProfileImageUtils.a();
        Bus bus = Mf.a();
        ProfileEventAnalytics profileeventanalytics = ProfileEventAnalytics.a();
        NetworkManager networkmanager = NetworkManager.a();
        new lX();
        this(bt, jy, ei, provider, pz, pn, bus, profileeventanalytics, networkmanager, FriendManager.e(), Gd.a());
    }

    private ProfileFragment(Bt bt, JY jy, Ei ei, Provider provider, Pz pz, Pn pn, Bus bus, 
            ProfileEventAnalytics profileeventanalytics, NetworkManager networkmanager, FriendManager friendmanager, Gd gd)
    {
        k = 0;
        L = com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MAIN_PAGE;
        d = false;
        ac = new HashSet();
        ad = new Eh() {

            private ProfileFragment a;

            public final void a(CU cu)
            {
                int i1 = Ei.a(cu);
                if (ProfileFragment.a(a).contains(Integer.valueOf(i1)))
                {
                    ProfileFragment.a(a).remove(Integer.valueOf(i1));
                    if (cu instanceof Db)
                    {
                        cu = (Db)cu;
                        if (((Db) (cu)).b)
                        {
                            long l1 = ((Db) (cu)).a;
                            ProfileFragment.b(a);
                            if (l1 > Bt.L())
                            {
                                a.a.clear();
                            }
                        } else
                        {
                            long l2 = ((Db) (cu)).a;
                            ProfileFragment.b(a);
                            if (l2 > Bt.L())
                            {
                                a.a(a.a);
                                return;
                            }
                        }
                    }
                }
            }

            
            {
                a = ProfileFragment.this;
                super();
            }
        };
        ae = new com.snapchat.android.networkmanager.NetworkManager.a() {

            private ProfileFragment a;

            public final void a(oV ov, pi pi)
            {
                a.d = false;
            }

            
            {
                a = ProfileFragment.this;
                super();
            }
        };
        M = bt;
        N = jy;
        O = ei;
        P = provider;
        Q = pz;
        Y = new b((byte)0);
        R = pn;
        Z = new a();
        a = new ArrayList(5);
        W = bus;
        S = profileeventanalytics;
        T = networkmanager;
        U = friendmanager;
        V = gd;
    }

    static SharedProfileSnapcodeView A(ProfileFragment profilefragment)
    {
        return profilefragment.C;
    }

    private void A()
    {
        i.setImageDrawable(null);
        i.setBackgroundColor(-1);
        i.setContentDescription(aa);
    }

    private int B()
    {
        if (U.f())
        {
            return U.a(Bt.m());
        } else
        {
            return 0;
        }
    }

    static void B(ProfileFragment profilefragment)
    {
        profilefragment.C = (SharedProfileSnapcodeView)LayoutInflater.from(profilefragment.getActivity()).inflate(0x7f0400d0, null, false);
        profilefragment.C.setUsername(Bt.q());
    }

    static int C(ProfileFragment profilefragment)
    {
        int i1 = profilefragment.k + 1;
        profilefragment.k = i1;
        return i1;
    }

    private void C()
    {
        if (Bt.bu())
        {
            r.setImageResource(0x7f0201fd);
            r.setContentDescription("red");
            return;
        } else
        {
            r.setImageResource(0x7f0201fe);
            r.setContentDescription("not red");
            return;
        }
    }

    private void D()
    {
        Br br = (Br)P.get();
        if (br != null && br.g())
        {
            u.setImageResource(0x7f02020b);
            u.setContentDescription("highlighted");
            return;
        } else
        {
            u.setImageResource(0x7f02020a);
            u.setContentDescription("not highlighted");
            return;
        }
    }

    private Point E()
    {
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    private void F()
    {
        StringBuilder stringbuilder = new StringBuilder("profile images - saving profile images with dirty ");
        boolean flag;
        if (!Bt.N())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Timber.c("ProfileFragment", stringbuilder.append(flag).toString(), new Object[0]);
        if (!Bt.N() && a != null && a.size() == 5)
        {
            Timber.c("ProfileFragment", (new StringBuilder("profile images - IsUploading : ")).append(d).toString(), new Object[0]);
            if (!d)
            {
                d = true;
                PG.b(new Runnable() {

                    private ProfileFragment a;

                    public final void run()
                    {
                        a.v();
                    }

            
            {
                a = ProfileFragment.this;
                super();
            }
                });
                return;
            }
        }
    }

    static HashSet a(ProfileFragment profilefragment)
    {
        return profilefragment.ac;
    }

    static Bt b(ProfileFragment profilefragment)
    {
        return profilefragment.M;
    }

    static rr c(ProfileFragment profilefragment)
    {
        return profilefragment.c;
    }

    static CameraViewFlipper d(ProfileFragment profilefragment)
    {
        return profilefragment.b;
    }

    static ProfileEventAnalytics e(ProfileFragment profilefragment)
    {
        return profilefragment.S;
    }

    static ViewGroup f(ProfileFragment profilefragment)
    {
        return profilefragment.w;
    }

    static c g(ProfileFragment profilefragment)
    {
        return profilefragment.D;
    }

    static View h(ProfileFragment profilefragment)
    {
        return profilefragment.t;
    }

    static View i(ProfileFragment profilefragment)
    {
        return profilefragment.z;
    }

    static TextView j(ProfileFragment profilefragment)
    {
        return profilefragment.l;
    }

    static TextView k(ProfileFragment profilefragment)
    {
        return profilefragment.m;
    }

    static View l(ProfileFragment profilefragment)
    {
        return profilefragment.v;
    }

    static ImageView m(ProfileFragment profilefragment)
    {
        return profilefragment.u;
    }

    static ImageView n(ProfileFragment profilefragment)
    {
        return profilefragment.r;
    }

    static View o(ProfileFragment profilefragment)
    {
        return profilefragment.s;
    }

    static PI p(ProfileFragment profilefragment)
    {
        return profilefragment.B;
    }

    static void q(ProfileFragment profilefragment)
    {
        Object obj = profilefragment.E();
        int i1 = (int)Math.ceil(0.175F * (float)((Point) (obj)).x);
        int j1 = profilefragment.F + profilefragment.G;
        int k1 = (int)Math.floor(0.65F * (float)((Point) (obj)).x);
        int l1 = (int)Math.floor(0.89F * (float)((Point) (obj)).x);
        int i2 = profilefragment.G;
        RectF rectf = new RectF(i1, j1, i1 + k1, j1 + (l1 - i2 * 2));
        profilefragment = (ProfileCameraMaskView)profilefragment.B.a();
        obj = Bitmap.createBitmap(((Point) (obj)).x, ((Point) (obj)).y, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        i1 = profilefragment.getResources().getColor(0x7f0c0002);
        canvas.drawARGB(Color.alpha(i1), Color.red(i1), Color.green(i1), Color.green(i1));
        canvas.drawRect(rectf, paint);
        profilefragment.a = ((Bitmap) (obj));
        profilefragment.invalidate();
        profilefragment.setVisibility(4);
    }

    static SVGImageView r(ProfileFragment profilefragment)
    {
        return profilefragment.x;
    }

    static Bus s(ProfileFragment profilefragment)
    {
        return profilefragment.W;
    }

    static int t(ProfileFragment profilefragment)
    {
        return profilefragment.k;
    }

    static String u(ProfileFragment profilefragment)
    {
        return profilefragment.H;
    }

    static Ei v(ProfileFragment profilefragment)
    {
        return profilefragment.O;
    }

    static void w(ProfileFragment profilefragment)
    {
        profilefragment.x = new SVGImageView(profilefragment.w.getContext());
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(13, -1);
        profilefragment.w.addView(profilefragment.x, layoutparams);
    }

    static String x(ProfileFragment profilefragment)
    {
        return profilefragment.I;
    }

    private void x()
    {
        boolean flag = true;
        Object obj = Bt.J();
        Object obj1 = Bt.q();
        int i1 = Bt.T();
        String s1 = IF.b(i1);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            l.setText(((CharSequence) (obj1)));
            if (i1 > 0)
            {
                m.setVisibility(0);
                m.setText(getResources().getString(0x7f080067, new Object[] {
                    s1
                }));
            } else
            {
                m.setVisibility(8);
            }
        } else
        {
            l.setText(((CharSequence) (obj)));
            m.setVisibility(0);
            if (i1 > 0)
            {
                obj = getResources().getString(0x7f080206, new Object[] {
                    obj1, s1
                });
                m.setText(((CharSequence) (obj)));
            } else
            {
                m.setText(((CharSequence) (obj1)));
            }
        }
        i1 = B();
        if (i1 != 0)
        {
            flag = false;
        }
        obj1 = o;
        if (flag)
        {
            obj = J;
        } else
        {
            obj = K;
        }
        ((TextView) (obj1)).setTextColor(((ColorStateList) (obj)));
        y.setImageLevel(i1);
        y.setContentDescription(String.valueOf(i1));
        Timber.c("ProfileFragment", (new StringBuilder("refreshNewFriendsButton - LastSeenAddedMeTimestamp: ")).append(Bt.m()).append(" # of unseen friend requests: ").append(i1).toString(), new Object[0]);
        D();
        z();
        C();
        D();
    }

    static Provider y(ProfileFragment profilefragment)
    {
        return profilefragment.P;
    }

    static ViewStub z(ProfileFragment profilefragment)
    {
        return profilefragment.A;
    }

    private void z()
    {
        Br br = (Br)P.get();
        if (br != null && br.mInitialized)
        {
            Timber.c("ProfileFragment", "profile images - attempting to load snapcode and profile images from cache", new Object[0]);
            if (Py.a(N, Bt.r()))
            {
                Q.a(Bt.r(), Y);
                if (ProfileImageUtils.a(N))
                {
                    Pn pn = R;
                    (new Pn._cls1(pn, Z)).executeOnExecutor(pn.mExecutor, new Void[0]);
                    return;
                }
                A();
                Timber.c("ProfileFragment", "profile images - no cached profile images found", new Object[0]);
                if (Bt.O())
                {
                    Timber.c("ProfileFragment", "profile images - no cached images found and try downloading from server", new Object[0]);
                    O.b(getActivity(), com.snapchat.android.util.profileimages.ProfileImageUtils.ProfileImageSize.MEDIUM.toString(), Bt.q());
                    return;
                }
            } else
            {
                if (!TextUtils.isEmpty(Bt.bm()))
                {
                    O.c(getActivity(), Bt.r());
                }
                a(0);
                Timber.c("ProfileFragment", "profile images - no cached snapcode showing white ghost only", new Object[0]);
                return;
            }
        }
    }

    protected final void a(int i1)
    {
        while (o() || i1 == X.getVisibility()) 
        {
            return;
        }
        if (i1 == 0)
        {
            X.setVisibility(0);
            i.setVisibility(8);
            return;
        } else
        {
            X.setVisibility(8);
            i.setVisibility(0);
            return;
        }
    }

    protected final void a(List list)
    {
        if (!super.isAdded())
        {
            Timber.c("ProfileFragment", "profile images - stop loading images since ProfileFragment is not attached to activity.", new Object[0]);
            return;
        }
        E = new AnimationDrawable();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            BitmapDrawable bitmapdrawable = new BitmapDrawable(getResources(), (Bitmap)list.get(i1));
            E.addFrame(bitmapdrawable, 200);
            Timber.c("ProfileFragment", (new StringBuilder("profile images - rendering profile image at index : ")).append(i1).toString(), new Object[0]);
        }

        E.setOneShot(false);
        i.setImageDrawable(E);
        i.setContentDescription(ab);
        E.start();
        Timber.c("ProfileFragment", "profile images - start animating", new Object[0]);
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND;
    }

    public final boolean f()
    {
        while (!n() || m()) 
        {
            return true;
        }
        return super.f();
    }

    protected final void h()
    {
        if (D == null)
        {
            D = new c((byte)0);
            Point point = E();
            int ai[] = new int[2];
            w.getLocationOnScreen(ai);
            float f1 = ai[1];
            float f2 = (float)w.getHeight() / 2.0F;
            float f3 = (float)F + ((float)point.x * 0.89F) / 2.0F;
            D.a = w.getY();
            D.c = f3 - (f1 + f2);
            D.b = ((float)point.x * 0.89F) / (float)w.getWidth();
            D.d = f3;
            D.e = (float)point.y / 2.0F;
        }
    }

    protected final void l()
    {
        h();
        AnimatorSet animatorset = (new AnimatorSet()).setDuration(300L);
        animatorset.play(ObjectAnimator.ofFloat(s, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(r, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(u, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(v, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(m, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(l, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(z, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(t, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(i, "alpha", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(e, "alpha", new float[] {
            0.0F
        })).with(ObjectAnimator.ofFloat(w, "y", new float[] {
            D.a
        })).with(ObjectAnimator.ofFloat(w, "scaleX", new float[] {
            1.0F
        })).with(ObjectAnimator.ofFloat(w, "scaleY", new float[] {
            1.0F
        }));
        animatorset.addListener(new android.animation.Animator.AnimatorListener() {

            private ProfileFragment a;

            public final void onAnimationCancel(Animator animator)
            {
                Timber.c("ProfileFragment", "profile images - animating back to profile view has been canceled", new Object[0]);
            }

            public final void onAnimationEnd(Animator animator)
            {
                ProfileFragment.p(a).a(4);
                a.e.setVisibility(4);
                a.i.setVisibility(0);
                ProfileFragment.d(a).setScrollableInBothDirections(true);
                ProfileFragment.d(a).setInProfilePictureView(false);
                ProfileFragment.s(a).a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE));
                Timber.c("ProfileFragment", "profile images - animated back to profile view", new Object[0]);
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
                a.e.h = false;
                a.e.a.setVisibility(4);
                ProfileFragment.r(a).setVisibility(0);
                ProfileFragment.d(a).setBackgroundViewVisibility(0);
                ProfileFragment.p(a).a(4);
                float f1 = ProfileFragment.g(a).e;
                float f2 = ProfileFragment.g(a).e;
                ProfileFragment.c(a).a(1.0F, 1.0F, f1 - f2);
            }

            
            {
                a = ProfileFragment.this;
                super();
            }
        });
        f = animatorset;
        f.start();
    }

    public final boolean m()
    {
        if (e != null && e.getVisibility() == 0)
        {
            p();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean n()
    {
        return e != null && e.getVisibility() == 0 && !e.g;
    }

    public final boolean o()
    {
        return e != null && e.getVisibility() == 0;
    }

    protected final boolean o_()
    {
        return super.isAdded();
    }

    public void onClick(View view)
    {
        StringBuilder stringbuilder;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (f != null && f.isStarted())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b != null && b.e())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        stringbuilder = (new StringBuilder("onClick - animationStarted ")).append(flag).append(", isCameraViewFlipperScrolling ").append(flag1).append(", (mCameraViewFlipper == null) ");
        if (b == null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Timber.c("ProfileFragment", stringbuilder.append(flag2).append(", view ").append(view).toString(), new Object[0]);
        if (flag || flag1)
        {
            Timber.c("ProfileFragment", "Ignore the click event when any animation or scroll is going on.", new Object[0]);
        } else
        {
            int i1 = view.getId();
            if (i1 == 0x7f0d03c8)
            {
                S.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADDED_ME_PAGE, B(), Bt.O());
                W.a(new Oi(LeftSwipeContentFragment.ADDED_ME_FRAGMENT));
                return;
            }
            if (i1 == 0x7f0d03cb)
            {
                S.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_MENU_PAGE, B(), Bt.O());
                W.a(new Oi(LeftSwipeContentFragment.ADD_FRIENDS_MENU_FRAGMENT));
                return;
            }
            if (i1 == 0x7f0d03cc)
            {
                S.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_FRIENDS_PAGE, B(), Bt.O());
                W.a(new Oi(LeftSwipeContentFragment.FRIENDS_CONTACTS_TOGGLE_FRAGMENT));
                return;
            }
            if (i1 == 0x7f0d03ce)
            {
                S.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.SETTINGS, B(), Bt.O());
                if (Bt.bu())
                {
                    Bt.g(System.currentTimeMillis());
                    Bt.u(false);
                }
                W.a(new Oi(LeftSwipeContentFragment.SETTINGS_FRAGMENT));
                return;
            }
            if (i1 == 0x7f0d03cd)
            {
                S.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.HELP_PAGE, B(), Bt.O());
                W.a(new Oi(new SnapTagHelpFragment()));
                return;
            }
            if (i1 == 0x7f0d0016)
            {
                S.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.CAMERA_PAGE, B(), Bt.O());
                W.a(new Ny(1));
                return;
            }
            if (i1 == 0x7f0d0098 || i1 == 0x7f0d03c6)
            {
                V.a(getActivity(), new Friend(Bt.q(), Bt.K()), null, L, null);
                return;
            }
            if (i1 == 0x7f0d03c3 || i1 == 0x7f0d03e3)
            {
                Timber.c("ProfileFragment", "profile images - user clicks the snapcode button or profile pics tooltips", new Object[0]);
                if (!Bt.Q())
                {
                    if (!Bt.Q())
                    {
                        (new mS(OnboardingTooltip.PROFILE_PICTURES)).execute();
                    }
                    SharedPreferenceKey.HAS_SEEN_PROFILE_PICTURES_ONBOARDING_MESSAGE.putBoolean(true);
                    g.setVisibility(8);
                }
                PG.a(new Runnable() {

                    final ProfileFragment a;

                    public final void run()
                    {
                        boolean flag3;
                        boolean flag4;
                        boolean flag5;
                        if (a.e == null)
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                        if (ProfileFragment.c(a) == null || !ProfileFragment.c(a).b())
                        {
                            flag4 = true;
                        } else
                        {
                            flag4 = false;
                        }
                        if (ProfileFragment.d(a) == null || ((VerticalSwipeLayout) (ProfileFragment.d(a))).c == 1)
                        {
                            flag5 = true;
                        } else
                        {
                            flag5 = false;
                        }
                        if (flag3 || flag4 || flag5)
                        {
                            Timber.c("ProfileFragment", "profile images - ignore animateToProfilePictureView if profile picture view is not initialized(%s), or no front camera(%s), or current page is CAMERA_PAGE(%s)", new Object[] {
                                Boolean.valueOf(flag3), Boolean.valueOf(flag4), Boolean.valueOf(flag5)
                            });
                            return;
                        }
                        ProfileFragment.e(a).a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_PICTURES_PAGE_VIEW);
                        if (!ProfileFragment.c(a).a() && ProfileFragment.c(a).b())
                        {
                            ProfileFragment.c(a).c();
                        }
                        a.h();
                        a.f = new AnimatorSet();
                        a.f.play(ObjectAnimator.ofFloat(ProfileFragment.o(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.n(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.m(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.l(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.k(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.j(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.i(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.h(a), "alpha", new float[] {
                            0.0F
                        })).with(ObjectAnimator.ofFloat(a.e, "alpha", new float[] {
                            1.0F
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.f(a), "translationY", new float[] {
                            ProfileFragment.g(a).c
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.f(a), "scaleX", new float[] {
                            ProfileFragment.g(a).b
                        })).with(ObjectAnimator.ofFloat(ProfileFragment.f(a), "scaleY", new float[] {
                            ProfileFragment.g(a).b
                        }));
                        a.f.addListener(new android.animation.Animator.AnimatorListener(this) {

                            private _cls3 a;

                            public final void onAnimationCancel(Animator animator)
                            {
                                Timber.c("ProfileFragment", "profile images - animating to profile picture view has been canceled", new Object[0]);
                            }

                            public final void onAnimationEnd(Animator animator)
                            {
                                ProfileFragment.d(a.a).setBackgroundViewVisibility(4);
                                ProfileFragment.p(a.a).a(0);
                                a.a.e.a.setVisibility(0);
                                a.a.e.setProfilePicturesControlButtonsVisibility(0);
                                ProfileFragment.r(a.a).setVisibility(4);
                                a.a.e.h = true;
                                float f1;
                                float f2;
                                if (a.a.i.getDrawable() != null)
                                {
                                    a.a.e.a(true);
                                    a.a.i.setVisibility(0);
                                } else
                                {
                                    a.a.e.a(false);
                                    a.a.i.setVisibility(4);
                                }
                                f1 = ProfileFragment.g(a.a).d;
                                f2 = ProfileFragment.g(a.a).e;
                                ProfileFragment.c(a.a).a(0.65F, 0.65F, f1 - f2);
                                ProfileFragment.d(a.a).setInProfilePictureView(true);
                                ProfileFragment.s(a.a).a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.HIDDEN));
                                Timber.c("ProfileFragment", "profile images - animated into profile picture view", new Object[0]);
                            }

                            public final void onAnimationRepeat(Animator animator)
                            {
                            }

                            public final void onAnimationStart(Animator animator)
                            {
                                a.a.e.setVisibility(0);
                                ProfileFragment.d(a.a).setScrollableInBothDirections(false);
                                boolean flag;
                                if (((ProfileCameraMaskView)ProfileFragment.p(a.a).a()).a != null)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                if (!flag)
                                {
                                    ProfileFragment.q(a.a);
                                }
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                        a.f.setDuration(300L);
                        a.f.start();
                    }

            
            {
                a = ProfileFragment.this;
                super();
            }
                });
                return;
            }
            if (i1 == 0x7f0d03cf || i1 == 0x7f0d051b)
            {
                S.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.TROPHY, B(), Bt.O());
                W.a(new Oi(LeftSwipeContentFragment.TROPHYCASE_FRAGMENT));
                if (!Bt.bF())
                {
                    SharedPreferenceKey.HAS_SEEN_TROPHY_CASE_TOOLTIP.putBoolean(true);
                    (new mS(OnboardingTooltip.TROPHY_CASE)).execute();
                }
                v.setVisibility(8);
                return;
            }
        }
    }

    public ap onCreateLoader(int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            return null;

        case 1200: 
            bundle = Uri.withAppendedPath(android.provider.ContactsContract.Profile.CONTENT_URI, "data");
            break;
        }
        return new ao(getActivity(), bundle, new String[] {
            "display_name", "display_name_source"
        }, null);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f0400b2, viewgroup, false);
        m = (TextView)d(0x7f0d0098);
        m.setOnClickListener(this);
        l = (TextView)d(0x7f0d03c6);
        l.setOnClickListener(this);
        o = (TextView)d(0x7f0d03ca);
        n = d(0x7f0d03c8);
        n.setOnClickListener(this);
        p = d(0x7f0d03cb);
        p.setOnClickListener(this);
        q = d(0x7f0d03cc);
        q.setOnClickListener(this);
        r = (ImageView)d(0x7f0d03ce);
        r.setOnClickListener(this);
        C();
        s = d(0x7f0d03cd);
        s.setOnClickListener(this);
        t = d(0x7f0d0016);
        t.setOnClickListener(this);
        w = (ViewGroup)d(0x7f0d03c3);
        w.setOnClickListener(this);
        X = d(0x7f0d03c4);
        i = (ImageView)d(0x7f0d03c5);
        y = (ImageView)d(0x7f0d03c9);
        z = d(0x7f0d03c7);
        u = (ImageView)d(0x7f0d03cf);
        u.setOnClickListener(this);
        A = (ViewStub)d(0x7f0d03d0);
        B = new PI(mFragmentLayout, 0x7f0d03c2, 0x7f0d03d4);
        g = d(0x7f0d03e3);
        g.setOnClickListener(this);
        h = (TextView)d(0x7f0d03e4);
        v = d(0x7f0d051b);
        v.setOnClickListener(this);
        layoutinflater = getResources();
        J = layoutinflater.getColorStateList(0x7f0c0083);
        K = layoutinflater.getColorStateList(0x7f0c0082);
        F = layoutinflater.getDimensionPixelSize(0x7f0a00ec);
        G = layoutinflater.getDimensionPixelSize(0x7f0a00e5);
        H = layoutinflater.getString(0x7f080204);
        I = layoutinflater.getString(0x7f080207, new Object[] {
            LY.a(Emoji.GHOST)
        });
        aa = layoutinflater.getString(0x7f080354);
        ab = layoutinflater.getString(0x7f080355);
        getLoaderManager().a(1200, this);
        ll.f();
        return mFragmentLayout;
    }

    public void onImageProfileBitmapReadyForProfile(MW mw)
    {
label0:
        {
            Timber.c("ProfileFragment", (new StringBuilder("profile images - received ImageProfileBitmapReadyForProfileEvent for image at index : ")).append(mw.mProfileImageIndex).toString(), new Object[0]);
            Bitmap bitmap = mw.mBitmap;
            if (bitmap != null)
            {
                a.add(bitmap);
                Timber.c("ProfileFragment", (new StringBuilder("profile images - adding bitmap into mProfileImagesList with mProfileImagesList size: ")).append(a.size()).toString(), new Object[0]);
            }
            if (mw.mProfileImageIndex == 4)
            {
                if (a.size() != 5)
                {
                    break label0;
                }
                i.setVisibility(0);
                e.a(true);
                e.setProfilePicturesControlButtonsVisibility(0);
                a(a);
                long l1 = System.currentTimeMillis();
                if (Bt.L() < l1)
                {
                    SharedPreferenceKey.LAST_PROFILE_IMAGES_TAKEN_TIMESTAMP.putLong(l1);
                }
                Bt.f(false);
                Bt.c(0);
                Timber.c("ProfileFragment", "profile images - new set of pics have been successfully processed and displayed!", new Object[0]);
            }
            return;
        }
        W.a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f0800eb));
        w();
        l();
        z();
        Timber.c("ProfileFragment", (new StringBuilder("profile images - failed to process new set of pics with size: ")).append(a.size()).toString(), new Object[0]);
    }

    public void onLoadFinished(ap ap1, Object obj)
    {
        obj = (Cursor)obj;
        ap1.getId();
        JVM INSTR tableswitch 1200 1200: default 28
    //                   1200 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (obj == null) goto _L1; else goto _L3
_L3:
        if (!((Cursor) (obj)).moveToFirst()) goto _L5; else goto _L4
_L4:
        int i1 = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("display_name_source"));
        if (i1 != 40 && i1 != 35) goto _L5; else goto _L6
_L6:
        ap1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("display_name"));
_L8:
        Bt.f(ap1);
        return;
_L5:
        ap1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onLoaderReset(ap ap1)
    {
    }

    public void onPause()
    {
        super.onPause();
        if (m() && e.g)
        {
            w();
        }
        F();
        O.b(1029, ad);
        d = false;
        ac.clear();
    }

    public void onProfileDataUpdatedEvent(Nw nw)
    {
        x();
    }

    public void onProfileImagesFetchedEvent(Nx nx)
    {
        z();
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        d = false;
        w();
        O.a(1029, ad);
        x();
        ll.f();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        if (j.contains(s1) && super.isAdded())
        {
            x();
        }
    }

    public void onSnapTagCacheUpdatedEvent(Oe oe)
    {
        if (TextUtils.equals(oe.mKey, Bt.r()))
        {
            z();
        }
    }

    public void onStart()
    {
        super.onStart();
        Bt.a(this);
    }

    public void onStop()
    {
        super.onStop();
        Bt.b(this);
        m();
    }

    public void onUserLoadedEvent(OH oh)
    {
        x();
    }

    public final void p()
    {
        if (f.isStarted())
        {
            return;
        } else
        {
            F();
            l();
            return;
        }
    }

    public final void q()
    {
        if (!c.d() || f.isStarted())
        {
            return;
        } else
        {
            ProfileEventAnalytics.a(Long.valueOf(Bt.L()));
            Timber.c("ProfileFragment", "profile images - preparing for taking profile pictures", new Object[0]);
            k = 0;
            a.clear();
            e.g = true;
            i.setVisibility(4);
            e.setProfilePicturesControlButtonsVisibility(4);
            Object obj = e;
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.play(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).c, "alpha", new float[] {
                0.0F, 1.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).c, "scaleX", new float[] {
                0.5F, 1.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).c, "scaleY", new float[] {
                0.5F, 1.0F
            }));
            animatorset.setDuration(450L);
            AnimatorSet animatorset1 = new AnimatorSet();
            animatorset1.play(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).c, "alpha", new float[] {
                1.0F, 0.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).c, "scaleX", new float[] {
                1.0F, 2.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).c, "scaleY", new float[] {
                1.0F, 2.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).d, "alpha", new float[] {
                0.0F, 1.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).d, "scaleX", new float[] {
                0.5F, 1.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).d, "scaleY", new float[] {
                0.5F, 1.0F
            }));
            animatorset1.setDuration(450L);
            AnimatorSet animatorset2 = new AnimatorSet();
            animatorset2.play(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).d, "alpha", new float[] {
                1.0F, 0.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).d, "scaleX", new float[] {
                1.0F, 2.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).d, "scaleY", new float[] {
                1.0F, 2.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).e, "alpha", new float[] {
                0.0F, 1.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).e, "scaleX", new float[] {
                0.5F, 1.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).e, "scaleY", new float[] {
                0.5F, 1.0F
            }));
            animatorset2.setDuration(450L);
            AnimatorSet animatorset3 = new AnimatorSet();
            animatorset3.play(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).e, "alpha", new float[] {
                1.0F, 0.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).e, "scaleX", new float[] {
                1.0F, 2.0F
            })).with(ObjectAnimator.ofFloat(((ProfilePictureView) (obj)).e, "scaleY", new float[] {
                1.0F, 2.0F
            }));
            animatorset3.setDuration(450L);
            animatorset.addListener(new com.snapchat.android.ui.ProfilePictureView._cls1());
            animatorset1.addListener(new com.snapchat.android.ui.ProfilePictureView._cls2(((ProfilePictureView) (obj))));
            animatorset2.addListener(new com.snapchat.android.ui.ProfilePictureView._cls3(((ProfilePictureView) (obj))));
            animatorset3.addListener(new com.snapchat.android.ui.ProfilePictureView._cls4(((ProfilePictureView) (obj))));
            obj = new AnimatorSet();
            ((AnimatorSet) (obj)).playSequentially(new Animator[] {
                animatorset, animatorset1, animatorset2, animatorset3
            });
            ((AnimatorSet) (obj)).start();
            return;
        }
    }

    public final void s()
    {
        (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

            private ProfileFragment a;

            public final void run()
            {
                Timber.c("ProfileFragment", (new StringBuilder("profile images - capturing profile photo at index ")).append(ProfileFragment.t(a)).toString(), new Object[0]);
                ProfileFragment.c(a).a(a. new d((byte)0));
            }

            
            {
                a = ProfileFragment.this;
                super();
            }
        }, 1000L);
    }

    public final void t()
    {
        long l1 = System.currentTimeMillis();
        Timber.c("ProfileFragment", (new StringBuilder("profile images - deleting profile images with timestamp: ")).append(l1).toString(), new Object[0]);
        ProfileEventAnalytics.b(Long.valueOf(Bt.L()));
        A();
        HashSet hashset = ac;
        Ei ei = O;
        FragmentActivity fragmentactivity = getActivity();
        Intent intent = ei.c(fragmentactivity);
        intent.putExtra("op_code", 1029);
        intent.putExtra("last_deleted", l1);
        hashset.add(Integer.valueOf(ei.a(fragmentactivity, intent)));
        l();
    }

    public final void u()
    {
        Timber.c("ProfileFragment", "profile images - sharing profile images", new Object[0]);
        if (C == null)
        {
            return;
        }
        e.b(true);
        SharedProfileSnapcodeView sharedprofilesnapcodeview;
        Bitmap bitmap;
        Canvas canvas;
        Drawable drawable;
        if (a == null || a.size() == 0)
        {
            Timber.c("ProfileFragment", "profile images - sharing without profile images", new Object[0]);
            C.setProfileImage(null);
            ProfileEventAnalytics.a(Boolean.valueOf(false));
        } else
        {
            int i1 = Bt.P();
            int j1 = i1 % a.size();
            Timber.c("ProfileFragment", (new StringBuilder("profile images - sharing with profile image index: ")).append(j1).append(" sharing count: ").append(i1).toString(), new Object[0]);
            C.setProfileImage((Bitmap)a.get(j1));
            Bt.c(i1 + 1);
            ProfileEventAnalytics.a(Boolean.valueOf(true));
        }
        sharedprofilesnapcodeview = C;
        sharedprofilesnapcodeview.setDrawingCacheEnabled(true);
        sharedprofilesnapcodeview.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        sharedprofilesnapcodeview.layout(0, 0, sharedprofilesnapcodeview.getMeasuredWidth(), sharedprofilesnapcodeview.getMeasuredHeight());
        sharedprofilesnapcodeview.buildDrawingCache();
        bitmap = Bitmap.createBitmap(sharedprofilesnapcodeview.getWidth(), sharedprofilesnapcodeview.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        drawable = sharedprofilesnapcodeview.getBackground();
        if (drawable != null)
        {
            drawable.draw(canvas);
        } else
        {
            canvas.drawColor(-1);
        }
        sharedprofilesnapcodeview.draw(canvas);
        (new SaveImageToGalleryTask(getActivity(), bitmap, com.snapchat.android.util.save.SaveImageToGalleryTask.SaveLocation.SNAPCHAT_ALBUM) {

            private ProfileFragment a;

            protected final void a()
            {
                Timber.c("ProfileFragment", "profile images - shared image failed to be inserted into media store", new Object[0]);
                a.e.b(false);
                Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f0800ea));
            }

            protected final void a(String s1)
            {
                Timber.c("ProfileFragment", (new StringBuilder("profile images - shared image was inserted into media store successfully! ")).append(s1).toString(), new Object[0]);
                a.e.b(false);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(s1)));
                intent.setType("image/jpeg");
                a.startActivity(Intent.createChooser(intent, ProfileFragment.u(a)));
            }

            
            {
                a = ProfileFragment.this;
                super(context, bitmap, savelocation);
            }
        }).executeOnExecutor(IO.HIGH_PRIORITY_EXECUTOR, new Void[0]);
    }

    protected final void v()
    {
        ProfileImageUtils.a(ProfileImageUtils.a(a), Bt.L(), N);
        T.a(new mV(), ae);
    }

    protected final void w()
    {
        k = 0;
        if (e != null)
        {
            e.g = false;
        }
    }

    static 
    {
        j = eg.a(SharedPreferenceKey.USERNAME.getKey(), SharedPreferenceKey.LAST_SEEN_ADDED_ME_TIMESTAMP.getKey(), SharedPreferenceKey.DISPLAY_NAME.getKey(), SharedPreferenceKey.IDENTITY_RED_GEAR_IS_ON.getKey(), SharedPreferenceKey.HAS_PROFILE_IMAGES.getKey(), SharedPreferenceKey.IDENTITY_LAST_CHECKED_TROPHY_CASE_TIMESTAMP.getKey(), new String[0]);
    }
}
