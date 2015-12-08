// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.g.p;
import com.kik.l.ab;
import com.kik.m.d;
import com.kik.sdkutils.y;
import com.kik.view.adapters.ap;
import com.kik.view.adapters.t;
import java.util.ArrayList;
import java.util.List;
import kik.a.a.c;
import kik.a.e.i;
import kik.a.e.v;
import kik.a.e.w;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.k;
import kik.android.f.a.f;
import kik.android.q;
import kik.android.util.aa;
import kik.android.util.ar;
import kik.android.util.by;
import kik.android.util.ck;
import kik.android.util.cv;
import kik.android.util.u;
import kik.android.widget.PullToRevealView;

// Referenced classes of package kik.android.chat.fragment:
//            ConversationsBaseFragment, jo, ju, kg, 
//            kb, ka, jz, jy, 
//            jx, kh, ki, ScanCodeTabFragment, 
//            js, jt, kj, kk, 
//            kl, km, kn, ko, 
//            kp, kq, jp, jq, 
//            ProgressDialogFragment, kd, ke, kf, 
//            kc

public class KikConversationsFragment extends ConversationsBaseFragment
    implements kik.android.widget.PullToRevealView.a
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        static String a(a a1)
        {
            return a1.g("convos.push.card.url");
        }

        static boolean b(a a1)
        {
            return a1.f("convos.pick.contact").booleanValue();
        }

        static String c(a a1)
        {
            return a1.g("convos.video.download");
        }

        static boolean d(a a1)
        {
            return a1.b("HASHTAG_GROUP_ERROR", false).booleanValue();
        }

        public final a a()
        {
            a("convos.pick.contact", true);
            return this;
        }

        public final a a(String s1)
        {
            a("convos.push.card.url", s1);
            return this;
        }

        public final a a(boolean flag)
        {
            a("HASHTAG_GROUP_ERROR", flag);
            return this;
        }

        public final a b(String s1)
        {
            a("convos.video.download", s1);
            return this;
        }

        public a()
        {
        }
    }


    private t A;
    private t B;
    private ap C;
    private a D;
    private final Handler E = new Handler();
    private AnimatorSet F;
    private ScanCodeTabFragment G;
    private ScanCodeTabFragment.b H;
    protected View _animationContainer;
    protected View _composeButton;
    protected View _composeButtonShadow;
    protected View _conversationsTopbar;
    protected View _missedConvoButton;
    protected ImageView _missedConvosNotification;
    protected TextView _missedConvosTitle;
    protected View _navBarShadow;
    protected PullToRevealView _pullToScan;
    protected View _pullToScanHeader;
    protected View _pullToScanHint;
    protected View _settingsButton;
    protected View _statusbarUnderlay;
    protected View _webButton;
    public com.kik.d.f l;
    protected ck m;
    protected kik.a.e.b n;
    protected w o;
    protected c p;
    protected ab q;
    protected ar r;
    protected kik.a.e.q s;
    protected ad t;
    private long x;
    private boolean y;
    private t z;

    public KikConversationsFragment()
    {
        D = new a();
        H = new jo(this);
    }

    static void a(KikConversationsFragment kikconversationsfragment)
    {
        kikconversationsfragment.b(new ju(kikconversationsfragment));
    }

    static void a(KikConversationsFragment kikconversationsfragment, int j)
    {
        kikconversationsfragment.b(new kg(kikconversationsfragment, j));
        if (kikconversationsfragment.h != null)
        {
            kikconversationsfragment.h = null;
        }
        kikconversationsfragment.a(((KikDialogFragment) (null)));
    }

    static void a(KikConversationsFragment kikconversationsfragment, long l1, String s1)
    {
        by.b(kikconversationsfragment.f.b("Video Trimmer Opened").a("Forced", true).a("Video Length", l1).a("Is From Intent", true), s1);
        k.a((new VideoTrimmingFragment.a()).a(s1).a(l1), kikconversationsfragment.getActivity()).f().a(new kb(kikconversationsfragment, l1, s1));
    }

    static boolean b(KikConversationsFragment kikconversationsfragment)
    {
        return kikconversationsfragment.e();
    }

    static ScanCodeTabFragment c(KikConversationsFragment kikconversationsfragment)
    {
        return kikconversationsfragment.G;
    }

    static void d(KikConversationsFragment kikconversationsfragment)
    {
        kikconversationsfragment.h();
    }

    private boolean e()
    {
        String s1 = p.a("browser_button_removal");
        return s1 != null && s1.equalsIgnoreCase("hide");
    }

    static boolean e(KikConversationsFragment kikconversationsfragment)
    {
        return kikconversationsfragment.y;
    }

    private void f()
    {
        if (kik.android.f.a.f.a().e() != null)
        {
            kik.android.f.a.f.a().a(kik.android.f.a.f.a().e(), getActivity(), b, c).a(new ka(this));
            return;
        } else
        {
            SendToFragment.a a1 = new SendToFragment.a();
            a1.a(true);
            k.a(a1, getActivity()).f();
            return;
        }
    }

    static void f(KikConversationsFragment kikconversationsfragment)
    {
        if (kikconversationsfragment.ac())
        {
            KikDialogFragment.a a1 = new KikDialogFragment.a(kikconversationsfragment.getResources());
            a1.b(kikconversationsfragment.getString(0x7f090029)).a(kikconversationsfragment.getString(0x7f0902e4)).b(0x7f090299, new jz(kikconversationsfragment)).a(0x7f0902c5, new jy(kikconversationsfragment)).a(new jx(kikconversationsfragment)).a(false);
            kikconversationsfragment.y = true;
            kikconversationsfragment.a(a1.a, kik.android.chat.fragment.KikScopedDialogFragment.a.b, "addr2");
        }
    }

    private void g()
    {
        if (j != null && z != null)
        {
            j.post(new kh(this));
        }
    }

    static boolean g(KikConversationsFragment kikconversationsfragment)
    {
        kikconversationsfragment.y = false;
        return false;
    }

    private void h()
    {
        Object obj;
        int j;
        if (_missedConvoButton == null)
        {
            return;
        }
        obj = _missedConvoButton.getContext();
        FragmentActivity fragmentactivity = getActivity();
        int i1 = a.L();
        j = i1;
        if (fragmentactivity != null)
        {
            j = i1;
            if (i1 > 0)
            {
                this.j.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.j.getResources().getDisplayMetrics().widthPixels, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(this.j.getResources().getDisplayMetrics().heightPixels, 0x80000000));
                j = i1;
                if (this.j.getMeasuredHeight() < this.j.getResources().getDisplayMetrics().heightPixels - this.j.getResources().getDimensionPixelSize(0x7f0d0023) - fragmentactivity.getResources().getDimensionPixelSize(0x7f0d0021))
                {
                    j = 0;
                }
            }
        }
        if (j <= 0) goto _L2; else goto _L1
_L1:
        int j1;
        List list;
        List list1;
        if (_pullToScan.a())
        {
            cv.e(new View[] {
                _missedConvoButton
            });
        } else
        {
            cv.b(new View[] {
                _missedConvoButton
            });
        }
        j1 = ((Context) (obj)).getResources().getDimensionPixelSize(0x7f0d0021);
        cv.b(this.j).b(j1);
        list = a.B();
        list1 = a.C();
        j1 = list.size() + list1.size();
        if (j1 == 1)
        {
            obj = ((Context) (obj)).getResources().getString(0x7f090198);
        } else
        {
            obj = ((Context) (obj)).getResources().getString(0x7f090163, new Object[] {
                Integer.valueOf(j1)
            });
        }
        _missedConvosTitle.setText(((CharSequence) (obj)));
        j1 = a.D();
        if (j <= j1) goto _L4; else goto _L3
_L3:
        _missedConvosTitle.setTextColor(_missedConvosTitle.getResources().getColorStateList(0x7f070064));
        _missedConvosNotification.setImageResource(0x7f070066);
_L5:
        a.a(j);
        _missedConvoButton.setOnClickListener(new ki(this));
        return;
_L4:
        _missedConvosNotification.setImageResource(0x7f070065);
        _missedConvosTitle.setTextColor(_missedConvosTitle.getResources().getColorStateList(0x7f070063));
        if (j < j1)
        {
            a.b(j);
        }
        if (true) goto _L5; else goto _L2
_L2:
        cv.b(this.j).b(0);
        _missedConvoButton.setVisibility(8);
        return;
    }

    static void h(KikConversationsFragment kikconversationsfragment)
    {
        kikconversationsfragment.f();
    }

    static t i(KikConversationsFragment kikconversationsfragment)
    {
        return kikconversationsfragment.z;
    }

    public final boolean M()
    {
        return true;
    }

    public final int a()
    {
        return 1;
    }

    public final void a(float f1)
    {
        Object obj = getView();
        if (obj == null)
        {
            return;
        }
        ImageView imageview1 = (ImageView)((View) (obj)).findViewById(0x7f0e0046);
        ImageView imageview = (ImageView)((View) (obj)).findViewById(0x7f0e0047);
        imageview1.setPivotX(imageview1.getWidth() / 2);
        imageview1.setPivotY(imageview1.getHeight() / 2);
        imageview.setPivotX(imageview.getWidth() / 2);
        imageview.setPivotY(imageview.getHeight() / 2);
        imageview1.setRotation(f1 * 360F);
        imageview.setRotation(-f1 * 360F);
        int j = aa.a(kik.android.chat.b.a.a(), KikApplication.e(0x7f0c002b), f1);
        obj = (TextView)((View) (obj)).findViewById(0x7f0e0048);
        int i1 = KikApplication.d(0x7f0d0023);
        int j1 = N();
        int k1 = imageview.getHeight() / 2;
        int l1 = PullToRevealView.f();
        int i2 = _pullToScanHint.getHeight();
        l1 = (int)(((float)(imageview.getHeight() + (l1 - i2)) * f1) / 2.0F);
        cv.b(_pullToScanHint).a(l1 + ((i1 + j1) - k1));
        if ((double)f1 > 0.69999999999999996D)
        {
            ((TextView) (obj)).setText(KikApplication.f(0x7f0901f6));
        } else
        {
            ((TextView) (obj)).setText(KikApplication.f(0x7f0901db));
        }
        _animationContainer.setBackgroundColor(j);
    }

    public final void a(AbsListView abslistview, int j, int i1, int j1)
    {
        super.a(abslistview, j, i1, j1);
        break MISSING_BLOCK_LABEL_9;
        if (abslistview != null && j + i1 == j1)
        {
            View view = abslistview.getChildAt(abslistview.getChildCount() - 1);
            if (view != null && view.getBottom() <= abslistview.getHeight() - abslistview.getScrollY())
            {
                j = a.D();
                if (a.L() > j)
                {
                    a.b(a.L());
                    h();
                    return;
                }
            }
        }
        return;
    }

    public final void b(kik.a.d.f f1)
    {
        a(a.A().indexOf(f1));
    }

    public final void b(boolean flag)
    {
        if (j == null)
        {
            return;
        }
        List list = a.B();
        List list1 = a.C();
        List list2 = a.A();
        t = q.a();
        if (z == null)
        {
            A = new t(getActivity(), list, t, b, d, e, f);
            B = new t(getActivity(), list1, t, b, d, e, f);
            z = new t(getActivity(), list2, t, b, d, e, f);
            g();
            B.a();
            A.a();
            C = new ap(getActivity());
            C.c(z);
            C.a(A);
            C.b(B);
        }
        if (j.getAdapter() == null)
        {
            j.setAdapter(C);
        }
        A.a(list);
        B.a(list1);
        B.notifyDataSetChanged();
        A.notifyDataSetChanged();
        z.a(list2);
        z.notifyDataSetChanged();
        C.notifyDataSetChanged();
        if (flag || com.kik.sdkutils.ab.a() - x < 200L)
        {
            x = com.kik.sdkutils.ab.a();
            j.setSelection(0);
            j.requestFocus();
        }
        h();
    }

    protected final boolean b()
    {
        while (_pullToScan == null || !_pullToScan.a()) 
        {
            return false;
        }
        _pullToScan.d();
        return true;
    }

    public final void c()
    {
        if (k == null)
        {
            return;
        }
        c(1);
        E.removeCallbacksAndMessages(null);
        cv.b(new View[] {
            G.getView(), _animationContainer
        });
        G.b();
        ArrayList arraylist = new ArrayList();
        cv.e(new View[] {
            _pullToScanHint
        });
        arraylist.add(ObjectAnimator.ofFloat(_composeButton, View.ALPHA, new float[] {
            1.0F, 0.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(_navBarShadow, View.ALPHA, new float[] {
            1.0F, 0.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(_conversationsTopbar, View.ALPHA, new float[] {
            1.0F, 0.0F
        }));
        if (!e())
        {
            arraylist.add(ObjectAnimator.ofFloat(_webButton, View.ALPHA, new float[] {
                1.0F, 0.0F
            }));
        }
        arraylist.add(ObjectAnimator.ofFloat(_settingsButton, View.ALPHA, new float[] {
            1.0F, 0.0F
        }));
        arraylist.add(ObjectAnimator.ofFloat(_animationContainer, View.ALPHA, new float[] {
            1.0F, 0.0F
        }));
        ObjectAnimator aobjectanimator[] = (ObjectAnimator[])arraylist.toArray(new ObjectAnimator[arraylist.size()]);
        F = new AnimatorSet();
        F.playTogether(aobjectanimator);
        F.setDuration(200L);
        F.addListener(new js(this));
        F.start();
    }

    public final void d()
    {
        if (k == null)
        {
            return;
        }
        if (F != null)
        {
            F.removeAllListeners();
            F.cancel();
            F = null;
        }
        c(-1);
        cv.b(new View[] {
            _composeButton, _statusbarUnderlay, _navBarShadow, _composeButtonShadow, _conversationsTopbar, _settingsButton
        });
        cv.c(new View[] {
            _composeButton, _statusbarUnderlay, _navBarShadow, _composeButtonShadow, _conversationsTopbar, _settingsButton
        });
        if (!e())
        {
            cv.b(new View[] {
                _webButton
            });
            cv.c(new View[] {
                _webButton
            });
        }
        E.postDelayed(new jt(this), 300L);
        cv.b(j).b(0);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        ((KikApplication)getActivity().getApplication()).f();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (j != null)
        {
            j.postDelayed(new kj(this), 100L);
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        l = KikApplication.i().c();
        if (r.c().contains("kik.FIRST_OPENDATE"))
        {
            c.a("kik.FIRST_OPENDATE", Long.valueOf(com.kik.sdkutils.ab.a()));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (!c.y("kik.web.home.preloaded"))
        {
            c.a("kik.web.home.preloaded", Boolean.valueOf(true));
            CardsWebViewFragment.a("https://home.kik.com/", getActivity(), s);
        }
        if (o.d().a())
        {
            o.f();
        }
        n.c().a(new kk(this));
        ((KikApplication)getActivity().getApplication()).j();
        k = layoutinflater.inflate(0x7f03000a, viewgroup, false);
        ButterKnife.inject(this, k);
        D.a(getArguments());
        layoutinflater = getChildFragmentManager().beginTransaction();
        G = new ScanCodeTabFragment();
        viewgroup = (new ScanCodeTabFragment.a()).a(kik.android.chat.fragment.ScanCodeTabFragment.c.a).a(false).f();
        G.a(H);
        G.setArguments(viewgroup.i());
        viewgroup = (FrameLayout)k.findViewById(0x7f0e004c);
        int j = Math.max(0, N());
        bundle = (android.widget.FrameLayout.LayoutParams)_pullToScan.getLayoutParams();
        bundle.topMargin = ((android.widget.FrameLayout.LayoutParams) (bundle)).topMargin + j;
        _pullToScan.setLayoutParams(bundle);
        cv.b(viewgroup, j);
        _animationContainer.setBackgroundColor(kik.android.chat.b.a.a());
        layoutinflater.replace(0x7f0e0042, G);
        layoutinflater.commit();
        this.j = (ListView)k.findViewById(0x7f0e004b);
        _pullToScan.a(this.j);
        _pullToScan.a(_pullToScanHeader);
        _pullToScan.a(this);
        this.j.setContentDescription("AUTOMATION_CONVERSATIONS_LIST");
        if (!com.kik.sdkutils.y.b(9))
        {
            this.j.setOverscrollFooter(null);
        }
        this.j.setEmptyView(k.findViewById(0x7f0e003e));
        this.j.setOnCreateContextMenuListener(new kl(this));
        this.j.setOnTouchListener(new km(this));
        this.j.setOnItemClickListener(new kn(this));
        k.findViewById(0x7f0e0055).setOnClickListener(new ko(this));
        layoutinflater = k.findViewById(0x7f0e004e);
        com.kik.m.d.a(layoutinflater, "AUTOMATION_CONVERSATION_WEB_BUTTON");
        layoutinflater.setOnClickListener(new kp(this));
        k.findViewById(0x7f0e0036).setOnClickListener(new kq(this));
        this.j.addFooterView(new View(getActivity()), null, true);
        b(false);
        S.o();
        if (kik.android.chat.fragment.a.a(D) != null)
        {
            layoutinflater = kik.android.chat.fragment.a.a(D);
            viewgroup = new KikCardBrowserFragment.a();
            viewgroup.a(layoutinflater).b(com.kik.cards.util.b.b(layoutinflater));
            k.a(viewgroup, getActivity()).f();
        }
        if (!kik.android.chat.fragment.a.b(D)) goto _L2; else goto _L1
_L1:
        layoutinflater = kik.android.f.a.f.a();
        boolean flag;
        if (layoutinflater.e() != null || layoutinflater.h() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        f();
_L5:
        if (!u.d())
        {
            _pullToScan.b();
        }
        if (c.p("kik.scan.hint.display").booleanValue() && u.d())
        {
            c.a("kik.scan.hint.display", Boolean.valueOf(false));
            _pullToScan.post(new jp(this));
        }
        m.a(kik.android.util.ck.b.c);
        if (kik.android.chat.fragment.a.d(D))
        {
            D.a(false);
            b(new jq(this));
        }
        return k;
_L2:
        if (kik.android.f.a.f.a().c() && kik.android.chat.fragment.a.c(D) != null)
        {
            h = new ProgressDialogFragment(getResources().getString(0x7f0901bf), true);
            h.a(getResources().getString(0x7f0900c9));
            h.c(KikApplication.f(0x7f090299), new kd(this));
            h.a(new ke(this));
            a(h);
            kik.android.q.a().a(Uri.parse(kik.android.chat.fragment.a.c(D)), k.getContext()).a(new kf(this));
            D.b(null);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onPause()
    {
        super.onPause();
        if (h == null)
        {
            w();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (_pullToScan != null && (G == null || !G.a()))
        {
            _pullToScan.c();
            c(-1);
        }
        g();
        n.c().a(new kc(this));
        if (e())
        {
            if (_webButton != null)
            {
                cv.e(new View[] {
                    _webButton
                });
            }
        } else
        if (_webButton != null)
        {
            cv.b(new View[] {
                _webButton
            });
            return;
        }
    }

    public final boolean v()
    {
        if (b())
        {
            return true;
        } else
        {
            return super.v();
        }
    }

    public final int y()
    {
        return KikApplication.e(0x7f0c0077);
    }
}
