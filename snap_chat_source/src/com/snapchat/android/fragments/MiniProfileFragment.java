// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import AH;
import Bt;
import Ei;
import Gd;
import IF;
import JY;
import Jo;
import Ka;
import MI;
import Mf;
import NH;
import NL;
import NT;
import Ny;
import OH;
import Oe;
import Of;
import Ot;
import PA;
import PG;
import Pp;
import Py;
import Pz;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import cn;
import com.caverock.androidsvg.SVGImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.ui.EmojiTextView;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import hK;
import hM;
import hN;
import hO;
import hR;
import iP;
import java.util.Iterator;
import java.util.List;
import wN;

public class MiniProfileFragment extends SnapchatFragment
    implements PA, android.view.View.OnClickListener, android.view.View.OnTouchListener, mh.a
{
    public static interface a
    {

        public abstract int a();
    }


    private float A;
    private float B;
    private int C;
    private int D;
    private VelocityTracker E;
    private AnimatorSet F;
    private int G;
    private float H;
    private String I;
    public wN a;
    private final JY b;
    private final Ei c;
    private final Pz d;
    private final Pp e;
    private final FriendManager f;
    private final Bus g;
    private final Bt h;
    private final Gd i;
    private final ProfileEventAnalytics j;
    private final Rect k;
    private View l;
    private View m;
    private View n;
    private SVGImageView o;
    private View p;
    private View q;
    private View r;
    private View s;
    private TextView t;
    private TextView u;
    private EmojiTextView v;
    private String w;
    private Friend x;
    private int y;
    private float z;

    public MiniProfileFragment()
    {
        JY jy = Ka.PROFILE_IMAGE_CACHE;
        Ei ei = Ei.a();
        Pz pz = new Pz();
        Py.a();
        this(jy, ei, pz, Pp.a(), FriendManager.e(), Mf.a(), Bt.a(), Gd.a(), ProfileEventAnalytics.a());
    }

    private MiniProfileFragment(JY jy, Ei ei, Pz pz, Pp pp, FriendManager friendmanager, Bus bus, Bt bt, 
            Gd gd, ProfileEventAnalytics profileeventanalytics)
    {
        k = new Rect();
        I = "Loading";
        b = jy;
        c = ei;
        d = pz;
        e = pp;
        f = friendmanager;
        g = bus;
        h = bt;
        i = gd;
        j = profileeventanalytics;
    }

    public static MiniProfileFragment a(String s1, int i1)
    {
        return a(s1, "", i1);
    }

    public static MiniProfileFragment a(String s1, String s2, int i1)
    {
        Bt.a();
        AnalyticsEvents.a(Bt.L(), c(i1), s1);
        Object obj = ProfileEventAnalytics.a();
        Object obj2 = e(i1);
        Object obj1 = new hM();
        obj2 = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj2)));
        obj1.source = (hR)((Pair) (obj2)).first;
        obj1.sourcePage = (iP)((Pair) (obj2)).second;
        ((ProfileEventAnalytics) (obj)).mBlizzardEventLogger.a(((kl) (obj1)));
        obj = new MiniProfileFragment();
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("MINI_PROFILE_FRIEND_USERNAME", s1);
        ((Bundle) (obj1)).putString("MINI_PROFILE_FRIEND_DISPLAYNAME", s2);
        ((Bundle) (obj1)).putInt("MINI_PROFILE_ORIGINATING_FRAGMENT", i1);
        ((MiniProfileFragment) (obj)).setArguments(((Bundle) (obj1)));
        return ((MiniProfileFragment) (obj));
    }

    static Friend a(MiniProfileFragment miniprofilefragment)
    {
        return miniprofilefragment.x;
    }

    private Friend a(String s1)
    {
        Friend friend1 = f.a(s1);
        Friend friend = friend1;
        if (friend1 == null)
        {
            friend = f.b(s1);
        }
        friend1 = friend;
        if (friend == null)
        {
            friend1 = f.i(s1);
        }
        return friend1;
    }

    static String a(int i1)
    {
        return c(i1);
    }

    static void a(MiniProfileFragment miniprofilefragment, String s1, String s2, String s3, String s4)
    {
        miniprofilefragment.a(s1, s2, s3, s4);
    }

    private void a(String s1, String s2, String s3, String s4)
    {
        if (!TextUtils.isEmpty(s1))
        {
            t.setText(s1);
            if (!TextUtils.isEmpty(s3))
            {
                s1 = getString(0x7f080206, new Object[] {
                    s2, s3
                });
                u.setText(s1);
            } else
            {
                u.setText(s2);
            }
        } else
        {
            t.setText(s2);
            u.setText(s3);
        }
        v.setText(s4);
    }

    private boolean a(View view, MotionEvent motionevent)
    {
        view.getGlobalVisibleRect(k);
        return k.contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
    }

    static Pp b(MiniProfileFragment miniprofilefragment)
    {
        return miniprofilefragment.e;
    }

    static com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext b(int i1)
    {
        return e(i1);
    }

    static Bt c(MiniProfileFragment miniprofilefragment)
    {
        return miniprofilefragment.h;
    }

    private static String c(int i1)
    {
        switch (i1)
        {
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 14: // '\016'
        default:
            return "";

        case 1: // '\001'
            return "Feed";

        case 3: // '\003'
            return "Stories";

        case 13: // '\r'
            return "AddedMe";

        case 11: // '\013'
            return "MyFriends";

        case 12: // '\f'
            return "MyContacts";

        case 15: // '\017'
            return "AddbyUsername";

        case 17: // '\021'
            return "AddNearby";

        case 16: // '\020'
            return "AddfromAddressBook";
        }
    }

    static int d(MiniProfileFragment miniprofilefragment)
    {
        return miniprofilefragment.y;
    }

    private static com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext e(int i1)
    {
        switch (i1)
        {
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 14: // '\016'
        default:
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.UNKNOWN;

        case 1: // '\001'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.FEED;

        case 3: // '\003'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.STORIES;

        case 13: // '\r'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADDED_ME_PAGE;

        case 11: // '\013'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_FRIENDS_PAGE;

        case 12: // '\f'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_CONTACTS_PAGE;

        case 15: // '\017'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE;

        case 17: // '\021'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_NEARBY_FRIENDS_PAGE;

        case 16: // '\020'
            return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE;
        }
    }

    static String e(MiniProfileFragment miniprofilefragment)
    {
        return miniprofilefragment.I;
    }

    static ProfileEventAnalytics f(MiniProfileFragment miniprofilefragment)
    {
        return miniprofilefragment.j;
    }

    static void g(MiniProfileFragment miniprofilefragment)
    {
        miniprofilefragment.j_();
    }

    private void h()
    {
        if (!super.isAdded())
        {
            Timber.c("MiniProfileFragment", "mini profile - stop refreshViews since fragment is not attached to activity", new Object[0]);
            return;
        }
        m();
        n();
        if (x == null)
        {
            Timber.e("MiniProfileFragment", "mini profile - cannot refresh profile picture since friend is null", new Object[0]);
            return;
        } else
        {
            s.setVisibility(0);
            I = "Loading";
            PG.b(new Runnable() {

                private MiniProfileFragment a;

                public final void run()
                {
                    if (a.getActivity() != null && MiniProfileFragment.a(a) != null)
                    {
                        MiniProfileFragment.b(a).a(a.getActivity(), MiniProfileFragment.a(a), com.snapchat.android.util.profileimages.ProfileImageUtils.ProfileImageSize.MEDIUM);
                    }
                }

            
            {
                a = MiniProfileFragment.this;
                super();
            }
            });
            return;
        }
    }

    private void m()
    {
        if (x == null)
        {
            Timber.e("MiniProfileFragment", "mini profile - cannot refresh friend info since friend is null", new Object[0]);
            return;
        }
        f.k(x.g());
        if (x.mDirection == com.snapchat.android.model.Friend.Direction.BOTH)
        {
            a(x.mDisplayName, x.g(), getString(0x7f080175), x.q());
            String s1 = x.g();
            AH.a(x, new AH.a(s1) {

                private String a;
                private MiniProfileFragment b;

                public final void a(AH ah)
                {
                    if (b.o_() && ah != null && MiniProfileFragment.a(b) != null && TextUtils.equals(a, MiniProfileFragment.a(b).g()))
                    {
                        ah = IF.b(ah.mScore);
                        MiniProfileFragment.a(b, MiniProfileFragment.a(b).mDisplayName, MiniProfileFragment.a(b).g(), ah, MiniProfileFragment.a(b).q());
                    }
                }

            
            {
                b = MiniProfileFragment.this;
                a = s1;
                super();
            }
            });
            return;
        } else
        {
            a(x.mDisplayName, x.g(), "", x.q());
            return;
        }
    }

    private void n()
    {
        if (x == null)
        {
            Timber.e("MiniProfileFragment", "mini profile - cannot refresh snapcode since friend is null", new Object[0]);
            return;
        }
        o.setVisibility(8);
        p.setVisibility(0);
        q.setVisibility(0);
        if (Py.a(b, x.t()))
        {
            d.a(x.t(), this);
            return;
        } else
        {
            c.a(getActivity(), x.mUserId, x.g());
            return;
        }
    }

    private void o()
    {
        if (F != null && F.isStarted())
        {
            Timber.c("MiniProfileFragment", "mini profile - kill ease out request if previous animation hasn't ended yet.", new Object[0]);
            return;
        } else
        {
            F = new AnimatorSet();
            F.play(ObjectAnimator.ofFloat(t, View.ALPHA, new float[] {
                t.getAlpha(), 0.0F
            })).with(ObjectAnimator.ofFloat(u, View.ALPHA, new float[] {
                u.getAlpha(), 0.0F
            })).with(ObjectAnimator.ofFloat(v, View.ALPHA, new float[] {
                v.getAlpha(), 0.0F
            })).with(ObjectAnimator.ofFloat(n, View.TRANSLATION_Y, new float[] {
                n.getTranslationY(), (float)G - H
            }));
            F.setDuration(300L);
            F.addListener(new android.animation.Animator.AnimatorListener() {

                private MiniProfileFragment a;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    MiniProfileFragment.c(a);
                    AnalyticsEvents.a(Bt.L(), MiniProfileFragment.a(MiniProfileFragment.d(a)), MiniProfileFragment.a(a).g(), MiniProfileFragment.e(a));
                    MiniProfileFragment.f(a).a(MiniProfileFragment.b(MiniProfileFragment.d(a)), MiniProfileFragment.e(a));
                    MiniProfileFragment.g(a);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                a = MiniProfileFragment.this;
                super();
            }
            });
            F.start();
            return;
        }
    }

    private void p()
    {
        if (!super.isAdded())
        {
            Timber.c("MiniProfileFragment", "mini profile - stop loading profile pic since fragment is not attached to activity", new Object[0]);
            return;
        }
        Object obj = e.a(x.g(), com.snapchat.android.util.profileimages.ProfileImageUtils.ProfileImageSize.MEDIUM);
        if (obj == null || ((List) (obj)).isEmpty())
        {
            r.setVisibility(8);
            obj = (new StringBuilder("mini profile - no cached profile pics for friend: ")).append(x.g()).toString();
        } else
        {
            AnimationDrawable animationdrawable = new AnimationDrawable();
            Bitmap bitmap;
            for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); animationdrawable.addFrame(new BitmapDrawable(getResources(), bitmap), 200))
            {
                bitmap = (Bitmap)iterator.next();
            }

            animationdrawable.setOneShot(false);
            r.setBackgroundDrawable(animationdrawable);
            r.setContentDescription(w);
            animationdrawable.start();
            r.setVisibility(0);
            if ((new StringBuilder("mini profile - profile picture loaded for friend: ")).append(x).toString() == null)
            {
                obj = "";
            } else
            {
                obj = (new StringBuilder()).append(x.g()).append(" with size: ").append(((List) (obj)).size()).toString();
            }
        }
        Timber.c("MiniProfileFragment", ((String) (obj)), new Object[0]);
    }

    private void q()
    {
        z = -1F;
        if (E != null)
        {
            E.recycle();
            E = null;
        }
    }

    public final void a(cn cn, String s1)
    {
        if (super.isAdded()) goto _L2; else goto _L1
_L1:
        Timber.c("MiniProfileFragment", "mini profile - stop loading svg since fragment is not attached to activity", new Object[0]);
_L4:
        return;
_L2:
        if (cn != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (x == null || x.t() == null) goto _L4; else goto _L3
_L3:
        c.a(getActivity(), x.mUserId, x.g());
        return;
        if (x == null || !TextUtils.equals(x.t(), s1)) goto _L4; else goto _L5
_L5:
        o.setSVG(cn);
        o.setVisibility(0);
        p.setVisibility(8);
        q.setVisibility(8);
        Timber.c("MiniProfileFragment", (new StringBuilder("mini profile - snapcode loaded for friend: ")).append(x.g()).toString(), new Object[0]);
        return;
    }

    public final void a(FriendAction friendaction, boolean flag, String s1)
    {
        if (a != null)
        {
            a.b(friendaction, a.e());
        }
    }

    protected final boolean o_()
    {
        return super.isAdded();
    }

    public void onClick(View view)
    {
        boolean flag = true;
        if (F != null && F.isStarted())
        {
            Timber.c("MiniProfileFragment", "mini profile - disable onClick if animation hasn't ended yet.", new Object[0]);
            return;
        }
        int i1 = view.getId();
        if (i1 == 0x7f0d0344)
        {
            AnalyticsEvents.b(Bt.L(), c(y), x.g(), I);
            view = j;
            Object obj2 = e(y);
            String s1 = I;
            hK hk = new hK();
            obj2 = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj2)));
            hk.source = (hR)((Pair) (obj2)).first;
            hk.sourcePage = (iP)((Pair) (obj2)).second;
            hk.hasProfilePic = Boolean.valueOf(TextUtils.equals(s1, "YES"));
            ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(hk);
            g.a(new NT(true));
            g.a(new Ny(1));
            g.a(new Ot(x.g()));
            return;
        }
        if (i1 == 0x7f0d0345)
        {
            AnalyticsEvents.c(Bt.L(), c(y), x.g(), I);
            view = j;
            Object obj3 = e(y);
            String s2 = I;
            hO ho = new hO();
            obj3 = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj3)));
            ho.source = (hR)((Pair) (obj3)).first;
            ho.sourcePage = (iP)((Pair) (obj3)).second;
            ho.hasProfilePic = Boolean.valueOf(TextUtils.equals(s2, "YES"));
            ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(ho);
            g.a(new Ny(1));
            g.a(new NL(x.g(), y, false));
            return;
        }
        if (i1 == 0x7f0d0346)
        {
            AnalyticsEvents.d(Bt.L(), c(y), x.g(), I);
            Object obj = j;
            Object obj5 = e(y);
            Object obj1 = I;
            Object obj4 = new hN();
            obj5 = ProfileEventAnalytics.c(((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj5)));
            obj4.source = (hR)((Pair) (obj5)).first;
            obj4.sourcePage = (iP)((Pair) (obj5)).second;
            obj4.hasProfilePic = Boolean.valueOf(TextUtils.equals(((CharSequence) (obj1)), "YES"));
            ((ProfileEventAnalytics) (obj)).mBlizzardEventLogger.a(((kl) (obj4)));
            Jo.a(getActivity(), view.getRootView());
            view = i;
            obj = getActivity();
            obj1 = x;
            obj4 = e(y);
            if (y != 13)
            {
                flag = false;
            }
            view.a(((android.content.Context) (obj)), ((Friend) (obj1)), null, ((com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext) (obj4)), flag, this);
            return;
        } else
        {
            AnalyticsEvents.a(Bt.L(), c(y), x.g(), I);
            j.a(e(y), I);
            j_();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = getArguments();
        y = bundle.getInt("MINI_PROFILE_ORIGINATING_FRAGMENT");
        if (f.f())
        {
            x = a(bundle.getString("MINI_PROFILE_FRIEND_USERNAME"));
            bundle = bundle.getString("MINI_PROFILE_FRIEND_DISPLAYNAME");
            if (TextUtils.isEmpty(x.mDisplayName) && !TextUtils.isEmpty(bundle))
            {
                x.a(bundle);
            }
        }
        mFragmentLayout = layoutinflater.inflate(0x7f04009e, viewgroup, false);
        l = d(0x7f0d033f);
        m = d(0x7f0d0347);
        n = d(0x7f0d033e);
        o = (SVGImageView)d(0x7f0d034b);
        p = d(0x7f0d034a);
        q = d(0x7f0d034c);
        r = d(0x7f0d0349);
        s = d(0x7f0d0348);
        t = (TextView)d(0x7f0d0340);
        u = (TextView)d(0x7f0d0341);
        v = (EmojiTextView)d(0x7f0d0342);
        w = getString(0x7f080355);
        layoutinflater = getResources();
        int i1 = (int)((double)layoutinflater.getDimensionPixelSize(0x7f0a00cb) * 0.73599999999999999D);
        viewgroup = r.getLayoutParams();
        viewgroup.width = i1;
        viewgroup.height = i1;
        r.setLayoutParams(viewgroup);
        viewgroup = d(0x7f0d0344);
        bundle = d(0x7f0d0345);
        View view = d(0x7f0d0346);
        viewgroup.setOnClickListener(this);
        bundle.setOnClickListener(this);
        view.setOnClickListener(this);
        mFragmentLayout.setOnClickListener(this);
        mFragmentLayout.setOnTouchListener(this);
        viewgroup = ViewConfiguration.get(mFragmentLayout.getContext());
        A = viewgroup.getScaledTouchSlop();
        B = viewgroup.getScaledPagingTouchSlop();
        C = viewgroup.getScaledMaximumFlingVelocity();
        D = viewgroup.getScaledMinimumFlingVelocity();
        G = layoutinflater.getDisplayMetrics().heightPixels;
        H = (float)(G - layoutinflater.getDimensionPixelSize(0x7f0a00c2)) / 2.0F;
        h();
        return mFragmentLayout;
    }

    public void onFriendsProfileImageLoadedEvent(MI mi)
    {
label0:
        {
            if (x != null && mi != null && TextUtils.equals(mi.mFriendUsername, x.g()) && mi.mSize == com.snapchat.android.util.profileimages.ProfileImageUtils.ProfileImageSize.MEDIUM)
            {
                if (!mi.mHasImages)
                {
                    break label0;
                }
                Timber.c("MiniProfileFragment", (new StringBuilder("mini profile - refresh profile pics onFriendsProfileImageLoadedEvent for friend: ")).append(x.g()).toString(), new Object[0]);
                p();
                I = "YES";
            }
            return;
        }
        Timber.c("MiniProfileFragment", (new StringBuilder("mini profile - hide progress bar onFriendsProfileImageLoadedEvent for friend: ")).append(x.g()).append(" since pic is not found").toString(), new Object[0]);
        s.setVisibility(8);
        I = "NO";
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        if (x == null || nh == null || nh.mFriend == null || !TextUtils.equals(nh.mFriend.g(), x.g())) goto _L2; else goto _L1
_L1:
        static final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[FriendAction.values().length];
                try
                {
                    a[FriendAction.IGNORE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[FriendAction.DELETE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[FriendAction.REMOVE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[FriendAction.HIDE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[FriendAction.BLOCK.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[FriendAction.SET_DISPLAY_NAME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[nh.mAction.ordinal()];
        JVM INSTR tableswitch 1 6: default 88
    //                   1 89
    //                   2 89
    //                   3 89
    //                   4 89
    //                   5 89
    //                   6 94;
           goto _L2 _L3 _L3 _L3 _L3 _L3 _L4
_L2:
        return;
_L3:
        o();
        return;
_L4:
        m();
        return;
    }

    public void onResume()
    {
        super.onResume();
        h();
    }

    public void onSnapTagCacheUpdatedEvent(Oe oe)
    {
        if (x != null && oe != null && TextUtils.equals(oe.mKey, x.t()))
        {
            n();
        }
    }

    public void onSnapTagDownloadFailedEvent(Of of)
    {
        q.setVisibility(8);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (F == null || !F.isStarted()) goto _L2; else goto _L1
_L1:
        Timber.c("MiniProfileFragment", "mini profile - disable onTouch if animation hasn't ended yet.", new Object[0]);
_L4:
        return true;
_L2:
        int i1 = motionevent.getAction();
        float f1 = motionevent.getRawY();
        float f3 = f1 - z;
        switch (i1)
        {
        default:
            return true;

        case 0: // '\0'
            z = f1;
            if (E == null)
            {
                E = VelocityTracker.obtain();
            } else
            {
                E.clear();
            }
            E.addMovement(motionevent);
            return true;

        case 2: // '\002'
            if (E == null)
            {
                E = VelocityTracker.obtain();
            }
            E.addMovement(motionevent);
            n.setTranslationY(f3);
            if (f1 > (float)(G / 2))
            {
                float f2 = f3 / ((float)G - H);
                t.setAlpha(1.0F - f2);
                u.setAlpha(1.0F - f2);
                v.setAlpha(1.0F - f2);
                return true;
            }
            break;

        case 1: // '\001'
            int j1;
            boolean flag;
            boolean flag1;
            boolean flag3;
            if (E == null)
            {
                j1 = 0;
            } else
            {
                E.computeCurrentVelocity(1000, C);
                j1 = (int)E.getYVelocity();
            }
            flag1 = a(m, motionevent);
            flag3 = a(l, motionevent);
            Timber.c("MiniProfileFragment", (new StringBuilder("ACTION_UP - isTapInSnapcodeContainer ")).append(flag1).append(" isTapInMiniProfileCard ").append(flag3).toString(), new Object[0]);
            if (f3 > B && j1 > D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (Math.abs(f3) <= A && (flag1 || flag3))
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0)
            {
                Timber.c("MiniProfileFragment", "Don't dismiss if clicking the mini profile container or the snap container", new Object[0]);
            } else
            if (Math.abs(f3) <= A || flag)
            {
                view = new StringBuilder("Tap on the transparent area outside the mini profile? ");
                boolean flag2;
                if (Math.abs(f3) <= A)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                Timber.c("MiniProfileFragment", view.append(flag2).toString(), new Object[0]);
                Timber.c("MiniProfileFragment", (new StringBuilder("Swipe down with proper velocity and slop? ")).append(flag).toString(), new Object[0]);
                o();
            } else
            if (F != null && F.isStarted())
            {
                Timber.c("MiniProfileFragment", "mini profile - kill ease in to center request if previous animation hasn't ended yet.", new Object[0]);
            } else
            {
                F = new AnimatorSet();
                F.play(ObjectAnimator.ofFloat(t, View.ALPHA, new float[] {
                    t.getAlpha(), 1.0F
                })).with(ObjectAnimator.ofFloat(u, View.ALPHA, new float[] {
                    u.getAlpha(), 1.0F
                })).with(ObjectAnimator.ofFloat(v, View.ALPHA, new float[] {
                    v.getAlpha(), 1.0F
                })).with(ObjectAnimator.ofFloat(n, View.TRANSLATION_Y, new float[] {
                    n.getTranslationY(), 0.0F
                }));
                long l1 = (long)(300D * (((double)Math.abs(n.getTranslationY()) * 2D) / (double)G));
                F.setDuration(l1);
                F.start();
            }
            q();
            return true;

        case 3: // '\003'
            q();
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onUserLoadedEvent(OH oh)
    {
        x = a(getArguments().getString("MINI_PROFILE_FRIEND_USERNAME"));
        h();
    }

    public void onVisible()
    {
        super.onVisible();
        if (F != null && F.isStarted())
        {
            Timber.c("MiniProfileFragment", "mini profile - kill ease in from bottom request if previous animation hasn't ended yet.", new Object[0]);
            return;
        } else
        {
            F = new AnimatorSet();
            F.play(ObjectAnimator.ofFloat(t, View.ALPHA, new float[] {
                0.0F, 1.0F
            })).with(ObjectAnimator.ofFloat(u, View.ALPHA, new float[] {
                0.0F, 1.0F
            })).with(ObjectAnimator.ofFloat(v, View.ALPHA, new float[] {
                0.0F, 1.0F
            })).with(ObjectAnimator.ofFloat(n, View.TRANSLATION_Y, new float[] {
                (float)(G / 2), 0.0F
            }));
            F.setDuration(300L);
            F.start();
            return;
        }
    }
}
