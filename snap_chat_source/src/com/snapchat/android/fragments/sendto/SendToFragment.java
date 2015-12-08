// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import AA;
import AM;
import AQ;
import Bd;
import Bj;
import Br;
import Bt;
import DZ;
import Ea;
import Eb;
import Ec;
import En;
import Fu;
import GJ;
import Ga;
import IY;
import Id;
import Jc;
import Jk;
import Jo;
import Ll;
import MA;
import Mf;
import Mh;
import Mj;
import Mk;
import Ml;
import Mo;
import NH;
import NI;
import Nt;
import OC;
import Oa;
import Og;
import Oi;
import Zs;
import Zt;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.NetworkAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.fragments.addfriends.AddFriendsMenuFragment;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.model.MediaMailingMetadata;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.ui.SendToBottomPanelView;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import gH;
import gN;
import hJ;
import ha;
import hh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import le;
import lv;
import tp;
import vv;
import wH;
import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;
import yj;
import yn;

public class SendToFragment extends SnapchatFragment
    implements com.snapchat.android.ui.SendToBottomPanelView.a, yj.a
{

    private static Mediabryo b;
    public tp a;
    private View c;
    private View d;
    private yj e;
    private Handler f;
    private InputMethodManager g;
    private EditText h;
    private View i;
    private boolean j;
    private LinkedHashSet k;
    private ArrayList l;
    private SendToBottomPanelView m;
    private TreeMap n;
    private final lv o;
    private final NetworkAnalytics p;
    private final DiscoverUsageAnalytics q;
    private final FriendManager r;

    public SendToFragment()
    {
        this(FriendManager.e());
    }

    private SendToFragment(FriendManager friendmanager)
    {
        f = new Handler();
        j = false;
        k = new LinkedHashSet();
        l = new ArrayList();
        n = new TreeMap();
        o = lv.a();
        p = NetworkAnalytics.a();
        q = new DiscoverUsageAnalytics();
        new le();
        SnapchatApplication.getDIComponent().a(this);
        r = friendmanager;
    }

    public static SendToFragment a(Mediabryo mediabryo)
    {
        b = mediabryo;
        return new SendToFragment();
    }

    static lv a(SendToFragment sendtofragment)
    {
        return sendtofragment.o;
    }

    private void a(AQ aq)
    {
        if (!Bj.a(aq))
        {
            return;
        }
        Iterator iterator = l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (Bj.a(aq, (AQ)iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
        ((android.support.v7.widget.RecyclerView.a) (e)).a.b();
        h();
    }

    static void a(SendToFragment sendtofragment, com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode statusbardrawmode)
    {
        sendtofragment.a(statusbardrawmode);
    }

    static void a(SendToFragment sendtofragment, vv vv1)
    {
        Object obj = (AA)b;
        hs hs = le.a(((AA) (obj)));
        obj = le.b(((AA) (obj)));
        DiscoverUsageAnalytics discoverusageanalytics = sendtofragment.q;
        String s1 = vv1.a;
        String s2 = vv1.d;
        Object obj1 = vv1.e;
        int j1 = vv1.s;
        int k1 = vv1.t;
        int i1 = vv1.u;
        Object obj2 = vv1.v;
        int l1 = vv1.w;
        int i2 = vv1.x;
        com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype1 = vv1.y;
        com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype = vv1.z;
        boolean flag4 = vv1.A;
        long l2 = vv1.B;
        boolean flag5 = ((AA)b).mHasDrawing;
        String s3 = ((AA)b).mCaptionStyleDescription;
        long l3 = sendtofragment.k.size();
        double d1 = b.mTimerValueOrDuration;
        boolean flag6 = b.n();
        sendtofragment = vv1.C;
        int j2 = wH.a(s3);
        if (i1 == 0)
        {
            if (flag4)
            {
                vv1 = DiscoverUsageAnalytics.a(mediatype1, flag6);
                obj2 = new hh();
                obj2.publisherId = s1;
                obj2.dsnapId = ((String) (obj1));
                obj2.editionId = s2;
                obj2.mediaType = vv1;
                obj2.timeViewed = Double.valueOf(Jk.a(l2, 1));
                obj2.drawing = Boolean.valueOf(flag5);
                obj2.recipientCount = Long.valueOf(l3);
                obj2.source = sendtofragment;
                if (j2 != -1)
                {
                    obj2.caption = Long.valueOf(j2);
                }
                if (hs != null)
                {
                    obj2.filterInfo = hs;
                }
                if (obj != null)
                {
                    obj2.filterVisual = ((hw) (obj));
                }
                if (vv1 == hJ.VIDEO || vv1 == hJ.VIDEO_NO_SOUND)
                {
                    obj2.snapTimeSec = Double.valueOf(d1);
                }
                boolean flag;
                if (k1 < 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    obj2.snapIndexCount = Long.valueOf(k1);
                    obj2.snapIndexPos = Long.valueOf(j1 + 1);
                }
                discoverusageanalytics.a.a(((kl) (obj2)));
                return;
            }
            vv1 = DiscoverUsageAnalytics.a(mediatype1, flag6);
            obj2 = new ha();
            obj2.publisherId = s1;
            obj2.dsnapId = ((String) (obj1));
            obj2.editionId = s2;
            obj2.mediaType = vv1;
            obj2.longformType = DiscoverUsageAnalytics.b(mediatype);
            obj2.timeViewed = Double.valueOf(Jk.a(l2, 1));
            obj2.drawing = Boolean.valueOf(flag5);
            obj2.recipientCount = Long.valueOf(l3);
            obj2.source = sendtofragment;
            if (j2 != -1)
            {
                obj2.caption = Long.valueOf(j2);
            }
            if (hs != null)
            {
                obj2.filterInfo = hs;
            }
            if (obj != null)
            {
                obj2.filterVisual = ((hw) (obj));
            }
            if (vv1 == hJ.VIDEO || vv1 == hJ.VIDEO_NO_SOUND)
            {
                obj2.snapTimeSec = Double.valueOf(d1);
            }
            boolean flag1;
            if (k1 < 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                obj2.snapIndexCount = Long.valueOf(k1);
                obj2.snapIndexPos = Long.valueOf(j1 + 1);
            }
            discoverusageanalytics.a.a(((kl) (obj2)));
            return;
        }
        if (flag4)
        {
            vv1 = DiscoverUsageAnalytics.a(mediatype1, flag6);
            obj1 = new gN();
            obj1.publisherId = s1;
            obj1.adsnapId = ((String) (obj2));
            obj1.editionId = s2;
            obj1.mediaType = vv1;
            obj1.timeViewed = Double.valueOf(Jk.a(l2, 1));
            obj1.drawing = Boolean.valueOf(flag5);
            obj1.recipientCount = Long.valueOf(l3);
            obj1.source = sendtofragment;
            if (j2 != -1)
            {
                obj1.caption = Long.valueOf(j2);
            }
            if (hs != null)
            {
                obj1.filterInfo = hs;
            }
            if (obj != null)
            {
                obj1.filterVisual = ((hw) (obj));
            }
            if (vv1 == hJ.VIDEO || vv1 == hJ.VIDEO_NO_SOUND)
            {
                obj1.snapTimeSec = Double.valueOf(d1);
            }
            boolean flag2;
            if (k1 < 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (!flag2)
            {
                obj1.snapIndexCount = Long.valueOf(k1);
                obj1.snapIndexPos = Long.valueOf(j1 + 1);
                obj1.adIndexPos = Long.valueOf(l1);
                obj1.adIndexCount = Long.valueOf(i2);
            }
            discoverusageanalytics.a.a(((kl) (obj1)));
            return;
        }
        vv1 = DiscoverUsageAnalytics.a(mediatype1, flag6);
        obj1 = new gH();
        obj1.publisherId = s1;
        obj1.adsnapId = ((String) (obj2));
        obj1.editionId = s2;
        obj1.mediaType = vv1;
        obj1.timeViewed = Double.valueOf(Jk.a(l2, 1));
        obj1.drawing = Boolean.valueOf(flag5);
        obj1.recipientCount = Long.valueOf(l3);
        obj1.longformType = DiscoverUsageAnalytics.b(mediatype);
        obj1.source = sendtofragment;
        if (j2 != -1)
        {
            obj1.caption = Long.valueOf(j2);
        }
        if (hs != null)
        {
            obj1.filterInfo = hs;
        }
        if (obj != null)
        {
            obj1.filterVisual = ((hw) (obj));
        }
        if (vv1 != hJ.IMAGE)
        {
            obj1.snapTimeSec = Double.valueOf(d1);
        }
        boolean flag3;
        if (k1 < 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3)
        {
            obj1.snapIndexCount = Long.valueOf(k1);
            obj1.snapIndexPos = Long.valueOf(j1 + 1);
            obj1.adIndexPos = Long.valueOf(l1);
            obj1.adIndexCount = Long.valueOf(i2);
        }
        discoverusageanalytics.a.a(((kl) (obj1)));
    }

    static LinkedHashSet b(SendToFragment sendtofragment)
    {
        return sendtofragment.k;
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            Jo.h(getActivity());
        }
        c.setVisibility(4);
        d.setVisibility(8);
        h.setVisibility(0);
        h.requestFocus();
        j = true;
        a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
    }

    static ArrayList c(SendToFragment sendtofragment)
    {
        return sendtofragment.l;
    }

    static FriendManager d(SendToFragment sendtofragment)
    {
        return sendtofragment.r;
    }

    static void e(SendToFragment sendtofragment)
    {
        Object obj = sendtofragment.getResources().getString(0x7f080113);
        vv vv1 = (vv)b.mMediaExtras;
        obj = new MA(((CharSequence) (obj)), vv1.m, vv1.n, (new StringBuilder("sending-")).append(b.mClientId).toString());
        sendtofragment = new MA(sendtofragment.getResources().getString(0x7f080114), vv1.m, vv1.n, (new StringBuilder("sent-")).append(b.mClientId).toString());
        sendtofragment.delayed = true;
        Mf.a().a(obj);
        Mf.a().a(sendtofragment);
    }

    static NetworkAnalytics f(SendToFragment sendtofragment)
    {
        return sendtofragment.p;
    }

    static View g(SendToFragment sendtofragment)
    {
        return sendtofragment.d;
    }

    static boolean h(SendToFragment sendtofragment)
    {
        return sendtofragment.j;
    }

    static void i(SendToFragment sendtofragment)
    {
        sendtofragment.n();
    }

    static void j(SendToFragment sendtofragment)
    {
        sendtofragment.b(true);
    }

    static yj k(SendToFragment sendtofragment)
    {
        return sendtofragment.e;
    }

    static View l(SendToFragment sendtofragment)
    {
        return sendtofragment.i;
    }

    static Mediabryo l()
    {
        return b;
    }

    static EditText m(SendToFragment sendtofragment)
    {
        return sendtofragment.h;
    }

    private void m()
    {
        Runnable runnable = new Runnable() {

            private SendToFragment a;

            public final void run()
            {
                SendToFragment.q(a).b.fullScroll(66);
                if (SendToFragment.b(a).isEmpty() && SendToFragment.c(a).isEmpty())
                {
                    SendToFragment.r(a);
                    return;
                }
                if (SendToFragment.q(a).getVisibility() == 8)
                {
                    SendToFragment.s(a);
                    return;
                } else
                {
                    SendToFragment.q(a).a(true);
                    return;
                }
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        };
        f.post(runnable);
    }

    static WindowConfiguration n(SendToFragment sendtofragment)
    {
        return ((SnapchatFragment) (sendtofragment)).mWindowConfiguration;
    }

    private void n()
    {
        c.setVisibility(0);
        d.setVisibility(0);
        h.setText("");
        h.clearFocus();
        g.hideSoftInputFromWindow(mFragmentLayout.getWindowToken(), 0);
        h.setVisibility(4);
        j = false;
        a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BACKGROUND_BEHIND);
    }

    static WindowConfiguration o(SendToFragment sendtofragment)
    {
        return ((SnapchatFragment) (sendtofragment)).mWindowConfiguration;
    }

    static InputMethodManager p(SendToFragment sendtofragment)
    {
        return sendtofragment.g;
    }

    static SendToBottomPanelView q(SendToFragment sendtofragment)
    {
        return sendtofragment.m;
    }

    static void r(SendToFragment sendtofragment)
    {
        if (sendtofragment.getActivity() != null)
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofInt(sendtofragment.m, "top", new int[] {
                sendtofragment.mFragmentLayout.getHeight() - sendtofragment.m.getHeight(), sendtofragment.mFragmentLayout.getHeight()
            });
            objectanimator.setDuration(100L);
            objectanimator.addListener(sendtofragment. new android.animation.Animator.AnimatorListener() {

                private SendToFragment a;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    SendToFragment.q(a).b();
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                    SendToFragment.q(a).a();
                }

            
            {
                a = SendToFragment.this;
                super();
            }
            });
            objectanimator.start();
        }
    }

    static void s(SendToFragment sendtofragment)
    {
        if (sendtofragment.getActivity() != null)
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofInt(sendtofragment.m, "top", new int[] {
                sendtofragment.mFragmentLayout.getHeight(), sendtofragment.mFragmentLayout.getHeight() - sendtofragment.m.getHeight()
            });
            objectanimator.setDuration(100L);
            objectanimator.addListener(sendtofragment. new android.animation.Animator.AnimatorListener() {

                private SendToFragment a;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    SendToFragment.q(a).b();
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                    SendToFragment.q(a).a();
                }

            
            {
                a = SendToFragment.this;
                super();
            }
            });
            objectanimator.start();
        }
    }

    public final void a(Integer integer)
    {
        integer = n.ceilingEntry(integer);
        if (integer == null || integer.getValue() == null)
        {
            return;
        }
        if (!j)
        {
            b(false);
        }
        h.setText((CharSequence)integer.getValue());
        h.setSelection(h.getText().length());
    }

    public final void a(yn yn, boolean flag)
    {
        if (!(yn instanceof Friend)) goto _L2; else goto _L1
_L1:
        yn = (Friend)yn;
        lv lv1 = o;
        boolean flag2 = j;
        lv1.mNumTotalActions = lv1.mNumTotalActions + 1;
        if (flag2)
        {
            lv1.mNumSearchedFriends = lv1.mNumSearchedFriends + 1;
        } else
        if (yn.j())
        {
            lv1.mNumBestFriends = lv1.mNumBestFriends + 1;
        } else
        if (((Friend) (yn)).mIsRecent)
        {
            lv1.mNumRecentFriends = lv1.mNumRecentFriends + 1;
        } else
        if (((Friend) (yn)).mJustAdded)
        {
            lv1.mNumJustAddedFriends = lv1.mNumJustAddedFriends + 1;
        } else
        if (((Friend) (yn)).mSelectedForNeedsLove)
        {
            lv1.mNumNeedsLoveFriends = lv1.mNumNeedsLoveFriends + 1;
        } else
        {
            lv1.mNumOtherFriends = lv1.mNumOtherFriends + 1;
        }
        if (flag)
        {
            if (k.size() < 200)
            {
                k.add(yn);
            } else
            {
                Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, 0x7f080080));
            }
        } else
        {
            k.remove(yn);
        }
        h.selectAll();
_L7:
        ((android.support.v7.widget.RecyclerView.a) (e)).a.b();
        h();
        return;
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (!(yn instanceof AQ)) goto _L6; else goto _L5
_L5:
        Object obj;
        boolean flag1;
        obj = (AQ)yn;
        if (obj instanceof En)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        View view;
        CheckBox checkbox;
        if (obj instanceof AM)
        {
            if (Bt.Y())
            {
                break MISSING_BLOCK_LABEL_461;
            }
            flag1 = true;
        } else
        {
            if (a.a(((AQ) (obj)).mStoryId))
            {
                break MISSING_BLOCK_LABEL_461;
            }
            flag1 = true;
        }
_L8:
        if (flag1)
        {
            obj = (AQ)yn;
            if (obj instanceof AM)
            {
                obj = new android.app.AlertDialog.Builder(getActivity());
                view = LayoutInflater.from(getActivity()).inflate(0x7f0400ae, null);
                checkbox = (CheckBox)view.findViewById(0x7f0d03bf);
                ((LinearLayout)view).removeView(checkbox);
                ((android.app.AlertDialog.Builder) (obj)).setInverseBackgroundForced(true);
                ((android.app.AlertDialog.Builder) (obj)).setView(view).setTitle(0x7f080051).setNegativeButton(0x7f08007f, null).setPositiveButton(0x7f080020, null);
                ((android.app.AlertDialog.Builder) (obj)).create().show();
            } else
            {
                (new Ga(getActivity(), ((AQ) (obj)), a, new Ga.a(((AQ) (obj))) {

                    private AQ a;
                    private SendToFragment b;

                    public final void a(boolean flag3)
                    {
                        if (!flag3)
                        {
                            SendToFragment.c(b).remove(a);
                            ((android.support.v7.widget.RecyclerView.a) (SendToFragment.k(b))).a.b();
                            b.h();
                        }
                    }

            
            {
                b = SendToFragment.this;
                a = aq;
                super();
            }
                })).show();
            }
        }
_L6:
        if ((yn instanceof AQ) && Bj.a((AQ)yn))
        {
            a((AQ)yn);
        }
_L4:
        yn = (AQ)yn;
        obj = o;
        obj.mNumTotalActions = ((lv) (obj)).mNumTotalActions + 1;
        obj.mNumStories = ((lv) (obj)).mNumStories + 1;
        if (flag)
        {
            l.add(yn);
        } else
        {
            l.remove(yn);
        }
          goto _L7
        flag1 = false;
          goto _L8
    }

    public final boolean a(yn yn)
    {
        if (yn instanceof Friend)
        {
            return k.contains(yn);
        }
        if (yn instanceof AQ)
        {
            return l.contains(yn);
        } else
        {
            return false;
        }
    }

    public final void e()
    {
        super.e();
    }

    public final boolean f()
    {
        if (j)
        {
            n();
            return true;
        } else
        {
            o.e();
            return false;
        }
    }

    protected final void h()
    {
        n.clear();
        Iterator iterator = l.iterator();
        String s2 = "";
        String s1;
        for (s1 = ""; iterator.hasNext(); s1 = ", ")
        {
            AQ aq = (AQ)iterator.next();
            s2 = (new StringBuilder()).append(s2).append(s1).append(aq.mDisplayName).toString();
            n.put(Integer.valueOf(s2.length()), null);
        }

        Friend friend;
        for (Iterator iterator1 = k.iterator(); iterator1.hasNext(); n.put(Integer.valueOf(s2.length()), friend.g()))
        {
            friend = (Friend)iterator1.next();
            s2 = (new StringBuilder()).append(s2).append(s1).append(friend.c()).toString();
            s1 = ", ";
        }

        m.setText(s2);
        m();
    }

    public final boolean k_()
    {
        return true;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        g = (InputMethodManager)getActivity().getSystemService("input_method");
        Br.a(getActivity());
        k = b.mMediaMailingMetadata.d();
        if (b.mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP)
        {
            l = ((Bd)b.mMediaMailingMetadata).mPostToStories;
        }
        RecyclerView recyclerview = (RecyclerView)d(0x7f0d01f0);
        ImageView imageview = (ImageView)d(0x7f0d042c);
        FragmentActivity fragmentactivity = getActivity();
        new Ec();
        bundle = b;
        FriendManager friendmanager = r;
        if (((Mediabryo) (bundle)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
        {
            bundle = new DZ(friendmanager);
        } else
        if (((Mediabryo) (bundle)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)
        {
            bundle = new DZ(friendmanager);
        } else
        if (((Mediabryo) (bundle)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.TEXT)
        {
            bundle = new DZ(friendmanager);
        } else
        {
            bundle = new Ea(friendmanager, Bj.a());
        }
        new com.snapchat.android.model.Friend.a();
        new GJ();
        e = new yj(fragmentactivity, bundle, this, new Fu(imageview, recyclerview));
        getActivity();
        recyclerview.setLayoutManager(new LinearLayoutManager());
        recyclerview.setAdapter(e);
        recyclerview.setOnTouchListener(new android.view.View.OnTouchListener() {

            private SendToFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (SendToFragment.h(a))
                {
                    SendToFragment.o(a).a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BACKGROUND_BEHIND);
                    SendToFragment.p(a).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                return false;
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        bundle = new Zs(e);
        recyclerview.a(bundle);
        bundle = new Zt(recyclerview, bundle);
        bundle.b = e;
        recyclerview.a(bundle);
        bundle = (VerticalRecyclerViewFastScroller)d(0x7f0d042b);
        bundle.setRecyclerView(recyclerview);
        recyclerview.setOnScrollListener(bundle.a());
        c = d(0x7f0d0427);
        d = d(0x7f0d0424);
        h = (EditText)d(0x7f0d0425);
        i = d(0x7f0d003d);
        d(0x7f0d0426).setOnClickListener(new android.view.View.OnClickListener() {

            private SendToFragment a;

            public final void onClick(View view)
            {
                if (SendToFragment.h(a))
                {
                    SendToFragment.i(a);
                }
                view = SendToFragment.a(a);
                view.a("add_friend");
                view.d();
                Mf.a().a(new Oi(new AddFriendsMenuFragment()));
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        c.setOnClickListener(new android.view.View.OnClickListener() {

            private SendToFragment a;

            public final void onClick(View view)
            {
                SendToFragment.j(a);
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        h.addTextChangedListener(new TextWatcher() {

            private SendToFragment a;

            public final void afterTextChanged(Editable editable)
            {
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                SendToFragment.k(a).c().filter(charsequence);
                if (TextUtils.isEmpty(charsequence))
                {
                    SendToFragment.l(a).setVisibility(4);
                    SendToFragment.k(a).g = false;
                    return;
                } else
                {
                    SendToFragment.l(a).setVisibility(0);
                    SendToFragment.k(a).g = true;
                    return;
                }
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        i.setOnClickListener(new android.view.View.OnClickListener() {

            private SendToFragment a;

            public final void onClick(View view)
            {
                SendToFragment.m(a).setText("");
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        h.setOnTouchListener(new android.view.View.OnTouchListener() {

            private SendToFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    SendToFragment.n(a).a(com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
                }
                return false;
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        m = (SendToBottomPanelView)d(0x7f0d042a);
        m.setOnTouchListenerForSearch(this);
        m.setSendButtonOnClickListener(new android.view.View.OnClickListener() {

            private SendToFragment a;

            public final void onClick(View view)
            {
                boolean flag1 = true;
                view = SendToFragment.a(a);
                view.a("send");
                view.c();
                view = (LandingPageActivity)a.getActivity();
                if (view == null || SendToFragment.b(a).isEmpty() && SendToFragment.c(a).isEmpty())
                {
                    return;
                }
                SendToFragment.a(a, com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BACKGROUND_BEHIND);
                if (!SendToFragment.b(a).isEmpty())
                {
                    SendToFragment.d(a).g();
                }
                Object obj = SendToFragment.l().mMediaMailingMetadata;
                ((MediaMailingMetadata) (obj)).a(SendToFragment.b(a));
                boolean flag;
                if (SendToFragment.l() instanceof AA)
                {
                    if (SendToFragment.l().mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP)
                    {
                        if (!SendToFragment.c(a).isEmpty())
                        {
                            Bt.Z();
                            Object obj1;
                            boolean flag2;
                            boolean flag3;
                            if (((LandingPageActivity) (view)).b != null)
                            {
                                flag2 = true;
                            } else
                            {
                                flag2 = false;
                            }
                            obj1 = (AA)SendToFragment.l();
                            if (!SendToFragment.b(a).isEmpty())
                            {
                                flag3 = true;
                            } else
                            {
                                flag3 = false;
                            }
                            AnalyticsEvents.a(((AA) (obj1)), flag2, flag3, "SEND_TO_SCREEN");
                        }
                        ((Bd)obj).mPostToStories = SendToFragment.c(a);
                    } else
                    if (SendToFragment.l().mSnapType == com.snapchat.android.model.Mediabryo.SnapType.DISCOVER)
                    {
                        SendToFragment.e(a);
                        SendToFragment.a(a, (vv)SendToFragment.l().mMediaExtras);
                    }
                }
                obj = SendToFragment.f(a);
                obj1 = SendToFragment.l().mClientId;
                if (SendToFragment.b(a).size() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (SendToFragment.c(a).size() <= 0)
                {
                    flag1 = false;
                }
                if (flag)
                {
                    ((NetworkAnalytics) (obj)).a("SNAP_SENT_DELAY", ((String) (obj1)), "send_to_screen");
                }
                if (flag1)
                {
                    ((NetworkAnalytics) (obj)).a("STORY_POST_DELAY", ((String) (obj1)), "send_to_screen");
                }
                Timber.c("SendToFragment", "Posts SnapReadyForSendingEvent event from initBottomPanel.", new Object[0]);
                Mf.a().a(new Oa(SendToFragment.l()));
                Mf.a().a(new Ml());
                Mf.a().a(new Mj(false, false));
                Mf.a().a(new Mk((byte)0));
                Mf.a().a(new Mh(CameraDisplayState.SHOW));
                Jo.a(view, SendToFragment.g(a));
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        m.setSendButtonOnTouchListener(new Id(m.a));
        m();
        d(0x7f0d0422).setOnClickListener(new android.view.View.OnClickListener() {

            private SendToFragment a;

            public final void onClick(View view)
            {
                SendToFragment.a(a).e();
                a.getActivity().onBackPressed();
            }

            
            {
                a = SendToFragment.this;
                super();
            }
        });
        bundle = k.iterator();
        do
        {
            if (!bundle.hasNext())
            {
                break;
            }
            Friend friend = (Friend)bundle.next();
            if (!r.c(friend.g()))
            {
                friend.mSuggestionState = com.snapchat.android.model.Friend.SuggestState.PENDING;
            }
        } while (true);
        if (k.size() > 0 || l.size() > 0)
        {
            h();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(false);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400c7, viewgroup, false);
        return mFragmentLayout;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        Iterator iterator = r.mOutgoingFriendsListMap.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Friend friend = (Friend)iterator.next();
            if (friend.mJustAdded)
            {
                friend.mJustAdded = false;
            }
        } while (true);
    }

    public void onPause()
    {
        super.onPause();
        MediaMailingMetadata mediamailingmetadata = b.mMediaMailingMetadata;
        mediamailingmetadata.a(k);
        if (b.mSnapType == com.snapchat.android.model.Mediabryo.SnapType.SNAP)
        {
            ((Bd)mediamailingmetadata).mPostToStories = l;
        }
    }

    public void onPostToStoriesUpdatedEvent(Nt nt)
    {
        nt = e;
        nt.e = ((yj) (nt)).c.a();
        ((android.support.v7.widget.RecyclerView.a) (nt)).a.b();
        e.c().filter(h.getText().toString());
    }

    public void onRefreshFriendExistsTask(NI ni)
    {
        ((android.support.v7.widget.RecyclerView.a) (e)).a.b();
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        Friend friend;
        boolean flag;
        flag = false;
        friend = nh.mFriend;
        nh = nh.mAction;
        if (friend == null) goto _L2; else goto _L1
_L1:
        if (FriendAction.ADD != nh) goto _L4; else goto _L3
_L3:
        friend.mJustAdded = true;
        nh = e;
        if (((yj) (nh)).e.indexOf(friend) == -1)
        {
            ((yj) (nh)).e.add(0, friend);
            nh.f = ((yj) (nh)).e;
            ((android.support.v7.widget.RecyclerView.a) (nh)).a.b();
        }
_L6:
        e.c().filter(h.getText().toString());
_L2:
        return;
_L4:
        if (FriendAction.DELETE == nh)
        {
            nh = e;
            if (((yj) (nh)).e.remove(friend) || ((yj) (nh)).f.remove(friend))
            {
                flag = true;
            }
            if (flag)
            {
                ((android.support.v7.widget.RecyclerView.a) (nh)).a.b();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onVisible()
    {
        Mf.a().a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE));
        Mf.a().a(new Og(true));
        Mf.a().a(new Mo(1));
        boolean flag = IY.a(b);
        lv lv1 = o;
        lv1.mSelectFriendMetric = com.snapchat.android.analytics.framework.EasyMetric.EasyMetricFactory.b("SELECT_FRIEND").a("type", lv.a(flag)).b();
        lv1.d();
        lv1.mNumSelectFriendSession = lv1.mNumSelectFriendSession + 1;
        if (lv1.mPrepareSnapMetric != null)
        {
            lv1.mPrepareSnapMetric.a("type", lv.a(flag)).a("session_number", Integer.valueOf(lv1.mNumSelectFriendSession)).b(false);
            lv1.mPrepareSnapMetric = null;
        }
    }

    public final boolean p_()
    {
        return true;
    }
}
