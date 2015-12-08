// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;
import android.support.v4.content.j;
import android.support.v7.app.ActionBar;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.NowPlaying;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.personalization.view.PersonalizationThumbView;
import com.pandora.android.provider.b;
import com.pandora.android.util.q;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.bz.n;
import p.ca.ap;
import p.ca.x;
import p.cn.e;
import p.dd.au;

// Referenced classes of package p.cj:
//            a, d, b

public class c extends a
{

    protected BroadcastReceiver b;
    private h c;
    private View d;
    private y e;
    private PersonalizationThumbView f;
    private Rect g;
    private String h;
    private long i;
    private boolean j;
    private CharSequence k;

    public c()
    {
        k = "";
        b = new BroadcastReceiver() {

            final c a;

            public void onReceive(Context context, Intent intent)
            {
                a.a(intent, intent.getAction());
            }

            
            {
                a = c.this;
                super();
            }
        };
    }

    public static c a(Bundle bundle)
    {
        c c1 = new c();
        c1.setArguments(bundle);
        return c1;
    }

    public static c a(y y1, Rect rect, String s1, boolean flag, boolean flag1, boolean flag2)
    {
        c c1 = new c();
        Bundle bundle = new Bundle();
        bundle.putSerializable("intent_station_data", y1);
        bundle.putBoolean("action_show_add_variety", flag);
        bundle.putBoolean("sp_show_thumb_history", flag1);
        bundle.putBoolean("intent_jump_to_thumbs_down", flag2);
        if (rect != null)
        {
            bundle.putParcelable("sp_menu_action_view_rect", rect);
        }
        if (s1 != null)
        {
            bundle.putString("sp_entry_point_launch", s1.toString());
        }
        c1.setArguments(bundle);
        return c1;
    }

    private String b(String s1)
    {
        if (s1 != null)
        {
            if (s1.equals(p/ca/ap.toString()))
            {
                return "station_list";
            }
            if (s1.equals(com/pandora/android/activity/NowPlaying.toString()))
            {
                return "nowplaying";
            }
        }
        a("Shouldn't get into to this state. please check if you add new entry point of station personalization page. you need to added new stats entry point code");
        return null;
    }

    private void e()
    {
        b.a.b().o().a(b(h), s.a(System.currentTimeMillis() - i), j);
    }

    private void f()
    {
        if (s.u())
        {
            p.bz.i.a a1 = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c).a(com.pandora.android.view.HeaderLayout.b.c);
            Object obj;
            if (i())
            {
                obj = com.pandora.android.view.HeaderLayout.a.b;
            } else
            {
                obj = com.pandora.android.view.HeaderLayout.a.a;
            }
            obj = a1.a(((com.pandora.android.view.HeaderLayout.a) (obj))).b(com.pandora.android.view.HeaderLayout.a.e).a(d()).a();
            b.a.e().a(obj);
        } else
        {
            String as[] = k.toString().split("\n");
            getActivity().setTitle(as[0]);
            if (getActivity() instanceof BaseFragmentActivity)
            {
                ActionBar actionbar = ((BaseFragmentActivity)getActivity()).h();
                if (actionbar != null)
                {
                    if (as.length > 1)
                    {
                        actionbar.a(as[1]);
                        return;
                    } else
                    {
                        actionbar.a(null);
                        return;
                    }
                }
            }
        }
    }

    private void g()
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("add_music_seed_success");
        pandoraintentfilter.a("action_show_thumb_history");
        pandoraintentfilter.a("action_show_add_variety");
        if (pandoraintentfilter != null)
        {
            b.a.C().a(b, pandoraintentfilter);
        }
    }

    private boolean h()
    {
        s.a(getActivity(), d);
        boolean flag = a();
        f();
        if (s.u())
        {
            return flag;
        }
        if (!flag && !f.b())
        {
            f.a();
            if (g != null)
            {
                (new Handler()).postDelayed(new Runnable() {

                    final c a;

                    public void run()
                    {
                        a.getActivity().finish();
                    }

            
            {
                a = c.this;
                super();
            }
                }, 525L);
            } else
            {
                getActivity().finish();
            }
        }
        return false;
    }

    public void a(Intent intent, String s1)
    {
        if (s1.equals(PandoraIntent.a("add_music_seed_success")))
        {
            a();
            intent = (BaseFragmentActivity)getActivity();
            q.a(intent.ac(), intent, e);
        } else
        {
            if (s1.equals(PandoraIntent.a("action_show_thumb_history")))
            {
                boolean flag;
                if (intent != null)
                {
                    flag = intent.getExtras().getBoolean("intent_jump_to_thumbs_down");
                } else
                {
                    flag = false;
                }
                a(((x) (p.cj.d.a(e, flag))), false);
                return;
            }
            if (s1.equals(PandoraIntent.a("action_show_add_variety")))
            {
                a(((x) (p.ca.c.a(new com.pandora.android.util.c(e.c(), e.d(), null), e.c(), e.A()))), false);
                return;
            }
        }
    }

    public void a(CharSequence charsequence)
    {
        k = charsequence;
    }

    public void a(x x, boolean flag)
    {
        android.support.v4.app.k k1 = c.a();
        k1.a(0, 0);
        x = (Fragment)x;
        if (flag)
        {
            k1.a(0x7f050007, 0x7f050008);
        }
        k1.b(0x7f10020e, x, null);
        k1.a(0);
        k1.a(null);
        k1.b();
        c.b();
        f();
    }

    public boolean a()
    {
        if (!i())
        {
            return false;
        } else
        {
            c.d();
            return true;
        }
    }

    public y b()
    {
        return e;
    }

    public boolean c()
    {
        if (!h())
        {
            return super.c();
        } else
        {
            return true;
        }
    }

    public CharSequence d()
    {
        return k;
    }

    public boolean i()
    {
        return c.e() > 1;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Bundle bundle1 = getArguments();
        g = (Rect)bundle1.getParcelable("sp_menu_action_view_rect");
        e = (y)bundle1.getSerializable("intent_station_data");
        h = bundle1.getString("sp_entry_point_launch");
        boolean flag1 = bundle1.getBoolean("sp_show_thumb_history", false);
        boolean flag;
        if (flag1)
        {
            flag = false;
        } else
        {
            flag = bundle1.getBoolean("action_show_add_variety", false);
        }
        f.setActionViewRect(g);
        f.setStationData(e);
        c = getChildFragmentManager();
        f();
        if (bundle == null)
        {
            a(p.cj.b.a(e), true);
        }
        if (flag1)
        {
            bundle = new PandoraIntent("action_show_thumb_history");
            bundle.putExtra("intent_jump_to_thumbs_down", bundle1.getBoolean("intent_jump_to_thumbs_down", false));
            a(bundle, bundle.getAction());
        }
        if (flag)
        {
            bundle = new PandoraIntent("action_show_add_variety");
            a(bundle, bundle.getAction());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = System.currentTimeMillis();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        bundle = layoutinflater;
        if (s.u())
        {
            bundle = layoutinflater.cloneInContext(new ContextThemeWrapper(getActivity(), 0x7f0d0014));
        }
        layoutinflater = bundle.inflate(0x7f04007f, viewgroup, false);
        d = layoutinflater.findViewById(0x7f10020e);
        f = (PersonalizationThumbView)layoutinflater.findViewById(0x7f10020d);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        p.cn.e.a().a(e.h());
        e();
    }

    public void onPersonalizationThumbView(n n1)
    {
        if (!n1.b)
        {
            return;
        }
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[p.bz.n.a.values().length];
                try
                {
                    a[p.bz.n.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.bz.n.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.bz.n.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3.a[n1.a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            j = true;
            break;
        }
    }

    public void onResume()
    {
        super.onResume();
        f();
    }

    public void onStart()
    {
        super.onStart();
        g();
    }

    public void onStationPersonalizationChange(au au1)
    {
        e = au1.a;
    }

    public void onStop()
    {
        super.onStop();
        b.a.C().a(b);
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.f;
    }
}
