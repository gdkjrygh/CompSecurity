// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import butterknife.ButterKnife;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.sdkutils.y;
import java.util.Iterator;
import java.util.List;
import kik.a.e.l;
import kik.android.scan.fragment.ScanFragment;
import kik.android.util.bx;
import kik.android.util.by;
import kik.android.util.cv;
import kik.android.util.u;
import kik.android.widget.VelocityControlledViewPager;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, qm, qo, qp, 
//            KikCodeFragment, qu, qv, qq, 
//            qr, qs, qn, qt

public class ScanCodeTabFragment extends KikScopedDialogFragment
{
    public class CustomOnPageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        boolean a;
        boolean b;
        final ScanCodeTabFragment c;

        public void onPageScrollStateChanged(int i1)
        {
            switch (i1)
            {
            default:
                return;

            case 1: // '\001'
                ScanCodeTabFragment.e(c).c();
                break;
            }
        }

        public void onPageScrolled(int i1, float f1, int j1)
        {
        }

        public void onPageSelected(int i1)
        {
            boolean flag2 = true;
            boolean flag = true;
            if (i1 == ScanCodeTabFragment.d(c))
            {
                if (ScanCodeTabFragment.h(c) != null)
                {
                    ScanCodeTabFragment.h(c).b(false);
                }
                if (!b)
                {
                    ScanCodeTabFragment.e(c).a();
                    com.kik.android.a.f f1 = c.a.b("Show Code Tapped");
                    if (a)
                    {
                        flag = false;
                    }
                    f1.a("From Swipe", flag).b();
                    by.a("Toggle", c.a).b();
                }
                c.a.b("Code View Opened").a("Colour", kik.android.chat.b.a.a.values()[0].a()).a("Opened From", kik.android.chat.fragment.ScanCodeTabFragment.f(c).b()).b();
                c._scanToggle.setProgress(c._scanToggle.getMax());
            } else
            {
                if (ScanCodeTabFragment.e(c) != null)
                {
                    ScanCodeTabFragment.e(c).b();
                }
                boolean flag1;
                if (!kik.android.chat.fragment.ScanCodeTabFragment.f(c).e() || ScanCodeTabFragment.g(c))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (ScanCodeTabFragment.h(c) != null)
                {
                    ScanCodeTabFragment.h(c).b(flag1);
                }
                if (!b)
                {
                    ScanCodeTabFragment.e(c).f();
                    com.kik.android.a.f f2 = c.a.b("Show Scanner Tapped");
                    if (!a)
                    {
                        flag1 = flag2;
                    } else
                    {
                        flag1 = false;
                    }
                    f2.a("From Swipe", flag1).b();
                }
                c._scanToggle.setProgress(0);
            }
            a = false;
            b = false;
        }

        public CustomOnPageChangeListener()
        {
            c = ScanCodeTabFragment.this;
            super();
            a = false;
            b = true;
        }
    }

    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        private final String a = "kik.tab.code.first";
        private final String b = "kik.tab.group.jid";
        private final String c = "kik.tab.group.set";
        private final String d = "kik.tab.opened.from";
        private final String e = "kik.tab.hidden.on.fragment.install";

        public final a a(String s)
        {
            if (s != null)
            {
                a("kik.tab.group.jid", s);
                a("kik.tab.group.set", true);
            }
            return this;
        }

        public final a a(c c1)
        {
            if (c1 != null)
            {
                a("kik.tab.opened.from", c1.a());
            }
            return this;
        }

        public final a a(boolean flag)
        {
            a("kik.tab.code.first", flag);
            return this;
        }

        public final boolean a()
        {
            return b("kik.tab.code.first", false).booleanValue();
        }

        public final String b()
        {
            return g("kik.tab.opened.from");
        }

        public final String c()
        {
            return g("kik.tab.group.jid");
        }

        public final boolean d()
        {
            return f("kik.tab.group.set").booleanValue();
        }

        public final boolean e()
        {
            return b("kik.tab.hidden.on.fragment.install", false).booleanValue();
        }

        public final a f()
        {
            a("kik.tab.hidden.on.fragment.install", true);
            return this;
        }

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract boolean a();

        public abstract boolean b();
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        private static final c g[];
        private final String f;

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(kik/android/chat/fragment/ScanCodeTabFragment$c, s);
        }

        public static c[] values()
        {
            return (c[])g.clone();
        }

        public final String a()
        {
            return f;
        }

        static 
        {
            a = new c("PULL", 0, "Pull");
            b = new c("SETTINGS", 1, "Settings");
            c = new c("FIND_PEOPLE", 2, "Find People");
            d = new c("GROUP", 3, "Group Info");
            e = new c("DEEP_LINK", 4, "Deep Link");
            g = (new c[] {
                a, b, c, d, e
            });
        }

        private c(String s, int i1, String s1)
        {
            super(s, i1);
            f = s1;
        }
    }


    View _backButton;
    ImageView _backButtonImage;
    ImageView _cameraIcon;
    ImageView _codeIcon;
    SeekBar _scanToggle;
    LinearLayout _toggleHolder;
    View _topBar;
    VelocityControlledViewPager _viewPager;
    com.kik.android.a a;
    l b;
    private int c;
    private int d;
    private View e;
    private a f;
    private FragmentManager g;
    private ScanFragment h;
    private KikCodeFragment i;
    private boolean j;
    private FragmentPagerAdapter k;
    private b l;
    private CustomOnPageChangeListener m;
    private final kik.android.scan.fragment.ScanFragment.b n = new qm(this);
    private final KikCodeFragment.b o = new qo(this);
    private final i p = new qp(this);

    public ScanCodeTabFragment()
    {
        boolean flag = false;
        super();
        int i1;
        if (u.d())
        {
            i1 = 0;
        } else
        {
            i1 = -1;
        }
        c = i1;
        i1 = ((flag) ? 1 : 0);
        if (u.d())
        {
            i1 = 1;
        }
        d = i1;
        f = new a();
        m = new CustomOnPageChangeListener();
    }

    private static void a(FragmentManager fragmentmanager)
    {
        if (fragmentmanager != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if ((obj = fragmentmanager.getFragments()) != null)
        {
            try
            {
                obj = ((List) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Fragment fragment = (Fragment)((Iterator) (obj)).next();
                    if ((fragment instanceof ScanFragment) || (fragment instanceof KikCodeFragment))
                    {
                        fragmentmanager.beginTransaction().remove(fragment).commit();
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (FragmentManager fragmentmanager)
            {
                bx.d(fragmentmanager);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void a(ScanCodeTabFragment scancodetabfragment)
    {
        scancodetabfragment.b(new qu(scancodetabfragment));
    }

    static void b(ScanCodeTabFragment scancodetabfragment)
    {
        scancodetabfragment.g();
    }

    static b c(ScanCodeTabFragment scancodetabfragment)
    {
        return scancodetabfragment.l;
    }

    static int d(ScanCodeTabFragment scancodetabfragment)
    {
        return scancodetabfragment.d;
    }

    static KikCodeFragment e(ScanCodeTabFragment scancodetabfragment)
    {
        return scancodetabfragment.i;
    }

    static a f(ScanCodeTabFragment scancodetabfragment)
    {
        return scancodetabfragment.f;
    }

    static boolean f()
    {
        return u.d();
    }

    private void g()
    {
        b(new qv(this));
    }

    static boolean g(ScanCodeTabFragment scancodetabfragment)
    {
        return scancodetabfragment.j;
    }

    static ScanFragment h(ScanCodeTabFragment scancodetabfragment)
    {
        return scancodetabfragment.h;
    }

    static void i(ScanCodeTabFragment scancodetabfragment)
    {
        scancodetabfragment._scanToggle.setProgress(scancodetabfragment.c);
        by.a("Toggle", scancodetabfragment.a).b();
        scancodetabfragment.m.a = true;
        scancodetabfragment._viewPager.setCurrentItem(scancodetabfragment.c);
    }

    public final boolean M()
    {
        return true;
    }

    protected final void a(f f1)
    {
        super.a(f1);
        if (_viewPager != null && _viewPager.a() != null)
        {
            f1.a(_viewPager.a(), p);
        }
    }

    public final void a(b b1)
    {
        l = b1;
    }

    public final boolean a()
    {
        return i != null && i.e();
    }

    public final void b()
    {
        if (h != null)
        {
            h.b();
        }
        g();
        G();
        if (i != null)
        {
            i.d();
        }
        j = true;
        _scanToggle.setProgress(c);
        if (m != null)
        {
            m.b = true;
            m.a = true;
        }
        if (_viewPager.getCurrentItem() == c)
        {
            m.onPageSelected(c);
            return;
        } else
        {
            _viewPager.setCurrentItem(c);
            return;
        }
    }

    public final void c()
    {
        if (h != null)
        {
            h.b(false);
        }
    }

    public final void d()
    {
        _scanToggle.setProgress(_scanToggle.getMax());
        m.a = true;
        _viewPager.setCurrentItem(d);
    }

    public final void e()
    {
        h.a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c(1);
        bundle = getArguments();
        f.a(bundle);
        e = layoutinflater.inflate(0x7f03005d, viewgroup, false);
        if (y.b(16))
        {
            ((ViewGroup)e).addView(new View(getActivity()));
        }
        ButterKnife.inject(this, e);
        g = getFragmentManager();
        _backButton.setBackgroundDrawable(null);
        _topBar.setBackgroundDrawable(null);
        int i1 = N();
        if (i1 > 0)
        {
            cv.b(_topBar).a(i1);
        }
        _backButtonImage.setImageResource(0x7f070011);
        _scanToggle.setOnSeekBarChangeListener(new qq(this));
        _cameraIcon.setOnClickListener(new qr(this));
        _codeIcon.setOnClickListener(new qs(this));
        i = new KikCodeFragment();
        if (f.d())
        {
            layoutinflater = new KikCodeFragment.a();
            layoutinflater.a(f.c());
            i.setArguments(layoutinflater.i());
        }
        i.a(o);
        h = new ScanFragment();
        layoutinflater = new kik.android.scan.fragment.ScanFragment.a();
        boolean flag;
        if (!f.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        layoutinflater = layoutinflater.a(flag);
        h.setArguments(layoutinflater.i());
        h.a(n);
        if (!u.d())
        {
            cv.e(new View[] {
                _toggleHolder
            });
        }
        a(g);
        k = new qn(this, g);
        _viewPager.setAdapter(k);
        _viewPager.setOnPageChangeListener(m);
        i1 = c;
        if (f.a())
        {
            i1 = d;
        }
        _viewPager.setCurrentItem(i1);
        if (i1 == 0)
        {
            m.onPageSelected(0);
        }
        return e;
    }

    public void onDestroy()
    {
        c(-1);
        super.onDestroy();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _backButton.setOnClickListener(new qt(this));
    }

    public final boolean v()
    {
        if (_viewPager.getCurrentItem() == d)
        {
            i.f();
        } else
        {
            h.c();
        }
        if (l != null && l.a())
        {
            return true;
        } else
        {
            return super.v();
        }
    }
}
