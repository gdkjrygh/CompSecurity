// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TabWidget;
import android.widget.TextView;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.f;
import com.pandora.android.data.a;
import com.pandora.android.inbox.c;
import com.pandora.android.provider.b;
import com.pandora.android.util.af;
import com.pandora.android.util.s;
import java.lang.reflect.Field;

// Referenced classes of package p.ca:
//            l, a, s, y, 
//            x, q

public class r extends l
    implements android.widget.TabHost.OnTabChangeListener, com.pandora.android.util.AddCommentLayout.a
{

    private static a d[];
    private static a e[];
    private static a f[];
    private static a g[];
    private static com.pandora.android.activity.f.b h = new com.pandora.android.activity.f.b() {

        public a[] a(HomeTabsActivity hometabsactivity, boolean flag)
        {
            if (flag)
            {
                return p.ca.r.h();
            }
            x x = hometabsactivity.ag();
            if (hometabsactivity.ah())
            {
                if (x instanceof q)
                {
                    return r.j();
                } else
                {
                    return p.ca.r.k();
                }
            }
            if ((x instanceof r) && !p.ca.r.a((r)x))
            {
                return p.ca.r.k();
            } else
            {
                return r.l();
            }
        }

    };
    private FragmentTabHost a;
    private int b;
    private boolean c;

    public r()
    {
        b = -1;
    }

    private View a(Context context, String s1)
    {
        context = LayoutInflater.from(context).inflate(0x7f0400ad, null);
        ((TextView)context.findViewById(0x7f1002b7)).setText(s1);
        return context;
    }

    private void a(FragmentTabHost fragmenttabhost, f f1)
    {
        android.widget.TabHost.TabSpec tabspec = fragmenttabhost.newTabSpec(f1.b);
        tabspec.setIndicator(a(fragmenttabhost.getContext(), f1.c));
        fragmenttabhost.a(tabspec, f1.d, f1.a(false));
    }

    static boolean a(r r1)
    {
        return r1.n();
    }

    private c c(boolean flag)
    {
        if (!flag || o() == 0)
        {
            Fragment fragment = getChildFragmentManager().a("notifications");
            if ((fragment instanceof c) && fragment.isVisible())
            {
                return (c)fragment;
            }
        }
        return null;
    }

    private p.ca.a d(boolean flag)
    {
        if (!flag || o() == 1)
        {
            Fragment fragment = getChildFragmentManager().a("following");
            if (fragment instanceof p.ca.a)
            {
                return (p.ca.a)fragment;
            }
        }
        return null;
    }

    public static f e()
    {
        return new f("feed", b.a.h().getString(0x7f08026e), p/ca/r, null, h);
    }

    static a[] h()
    {
        return g;
    }

    static a[] j()
    {
        return e;
    }

    static a[] k()
    {
        return d;
    }

    static a[] l()
    {
        return f;
    }

    private void m()
    {
        if (b != -1)
        {
            a.setCurrentTab(b);
            b = -1;
        }
    }

    private boolean n()
    {
        p.ca.a a1 = d(true);
        return a1 != null && a1.isVisible() && !a1.w();
    }

    private int o()
    {
        if (a == null)
        {
            return -1;
        } else
        {
            return a.getCurrentTab();
        }
    }

    private void p()
    {
        if (a != null)
        {
            ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(a.getApplicationWindowToken(), 0);
        }
    }

    private p.ca.s q()
    {
        Fragment fragment = getChildFragmentManager().a("find_people");
        if (fragment instanceof p.ca.s)
        {
            return (p.ca.s)fragment;
        } else
        {
            return null;
        }
    }

    private boolean r()
    {
        h h1 = getChildFragmentManager();
        if (h1.e() > 0 && q() != null)
        {
            return h1.d();
        } else
        {
            return false;
        }
    }

    protected FragmentTabHost a(View view)
    {
        view = (FragmentTabHost)view.findViewById(0x1020012);
        view.a(getActivity(), getChildFragmentManager(), 0x7f10016f);
        view.getTabWidget().setDividerDrawable(null);
        a(((FragmentTabHost) (view)), com.pandora.android.inbox.c.e());
        a(((FragmentTabHost) (view)), p.ca.a.j_());
        view.setOnTabChangedListener(this);
        return view;
    }

    public void a(int i1)
    {
        if (a != null)
        {
            a.setCurrentTab(i1);
            b = -1;
            return;
        } else
        {
            b = i1;
            return;
        }
    }

    public void a(String s1, String s2)
    {
        p.ca.a a1 = d(true);
        if (a1 != null && a1.isVisible())
        {
            a1.a(s1, s2);
        }
    }

    public void a(x x)
    {
        i.b(a.i.b);
        if (o() != 1)
        {
            return;
        }
        String s1;
        h h1;
        k k1;
        if (x instanceof p.ca.s)
        {
            s1 = "find_people";
        } else
        {
            s1 = null;
        }
        h1 = getChildFragmentManager();
        k1 = h1.a();
        k1.a(0, 0);
        x = (Fragment)x;
        k1.a(0x7f050007, 0x7f050008);
        k1.a(0x7f10016f, x, s1);
        k1.a(0);
        k1.a(null);
        k1.b();
        h1.b();
    }

    public void a(boolean flag)
    {
        if (a != null)
        {
            FragmentTabHost fragmenttabhost = a;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            fragmenttabhost.setVisibility(i1);
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
        p.ca.a a1 = d(true);
        if (a1 != null && a1.isVisible())
        {
            a1.a(flag, flag1);
        } else
        if (getActivity() instanceof BaseAdFragmentActivity)
        {
            c c1 = c(true);
            if (c1 != null && c1.isVisible())
            {
                ((BaseAdFragmentActivity)getActivity()).a("inbox_shown", true);
            }
        }
        if (i.e() instanceof r)
        {
            c = true;
            r();
            if (n())
            {
                i.a(a.i.b);
            } else
            {
                i.b(a.i.b);
            }
            a(true);
            return;
        }
        if (c)
        {
            c c2 = c(true);
            if (c2 != null)
            {
                c2.f();
            }
        }
        c = false;
    }

    public boolean a()
    {
        boolean flag1 = true;
        p.ca.a a1 = d(true);
        boolean flag = flag1;
        if (a1 != null)
        {
            flag = flag1;
            if (a1.isVisible())
            {
                flag = a1.a();
            }
        }
        return flag;
    }

    public boolean c()
    {
        p.ca.a a1 = d(true);
        if (a1 != null && a1.isVisible())
        {
            p.ca.s s1 = q();
            if (s1 != null)
            {
                if (s1.g() && r())
                {
                    a1.t();
                    return true;
                }
            } else
            {
                return a1.c();
            }
        }
        return false;
    }

    public CharSequence d()
    {
        o();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 35
    //                   1 58;
           goto _L1 _L2 _L3
_L1:
        return getString(0x7f08026e);
_L2:
        c c1 = c(false);
        if (c1 != null)
        {
            return c1.d();
        }
        getString(0x7f080270);
_L3:
        p.ca.a a1 = d(false);
        if (a1 != null)
        {
            return a1.f();
        }
        getString(0x7f08026f);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public boolean f()
    {
        return o() == 1;
    }

    public int g()
    {
        if (a != null && a.getVisibility() == 0)
        {
            return a.getTabWidget().getHeight();
        } else
        {
            return 0;
        }
    }

    public boolean i()
    {
        boolean flag = true;
        o();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 35
    //                   1 54;
           goto _L1 _L2 _L3
_L1:
        flag = super.i();
_L5:
        return flag;
_L2:
        c c1 = c(false);
        if (c1 == null || !c1.i())
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        p.ca.a a1 = d(false);
        if (a1 == null || !a1.i())
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int l_()
    {
        p.ca.a a1 = d(true);
        if (a1 != null && a1.isVisible())
        {
            return a1.l_();
        } else
        {
            return 5;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            setHasOptionsMenu(true);
        }
        if (getArguments() != null)
        {
            b = getArguments().getInt("intent_sub_page_name");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        if (n())
        {
            menuinflater.inflate(0x7f120006, menu);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (s.l())
        {
            return null;
        } else
        {
            layoutinflater = layoutinflater.inflate(0x7f040054, viewgroup, false);
            a = a(layoutinflater);
            m();
            return layoutinflater;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        a = null;
    }

    public void onDetach()
    {
        super.onDetach();
        try
        {
            Field field = android/support/v4/app/Fragment.getDeclaredField("mChildFragmentManager");
            field.setAccessible(true);
            field.set(this, null);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131755020: 
            i.a(p.ca.s.a(false));
            break;
        }
        return true;
    }

    public void onPause()
    {
        super.onPause();
        if (c)
        {
            c c1 = c(true);
            if (c1 != null)
            {
                c1.f();
            }
            c = false;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (i.e() instanceof r)
        {
            c = true;
        }
    }

    public void onTabChanged(String s1)
    {
        p();
        if (n())
        {
            i.a(a.i.b);
        } else
        {
            i.b(a.i.b);
        }
        if (getActivity() instanceof BaseAdFragmentActivity)
        {
            ((BaseAdFragmentActivity)getActivity()).d(true);
        }
        if (!"notifications".equals(s1)) goto _L2; else goto _L1
_L1:
        af.a().a(com.pandora.android.util.af.c.i);
        r();
        if (getActivity() instanceof BaseAdFragmentActivity)
        {
            ((BaseAdFragmentActivity)getActivity()).a("inbox_shown", true);
        }
_L4:
        getChildFragmentManager().b();
        i.c();
        if (getActivity() instanceof BaseAdFragmentActivity)
        {
            ((BaseAdFragmentActivity)getActivity()).H();
        }
        getActivity().invalidateOptionsMenu();
        return;
_L2:
        if ("following".equals(s1))
        {
            s1 = c(false);
            if (s1 != null)
            {
                s1.f();
            }
            af.a().a(com.pandora.android.util.af.c.h);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public com.pandora.android.util.af.c v()
    {
        switch (o())
        {
        default:
            return com.pandora.android.util.af.c.aa;

        case 0: // '\0'
            return com.pandora.android.util.af.c.i;

        case 1: // '\001'
            return com.pandora.android.util.af.c.h;
        }
    }

    static 
    {
        d = (new a[] {
            a.e
        });
        e = (new a[] {
            a.h
        });
        f = (new a[] {
            a.e, a.i
        });
        g = (new a[] {
            a.e, a.i, a.h
        });
    }
}
