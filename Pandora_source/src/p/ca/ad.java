// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.activity.f;
import com.pandora.android.data.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.af;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.android.view.PandoraWebView;

// Referenced classes of package p.ca:
//            j, q

public class ad extends p.ca.j
{

    protected static final com.pandora.android.activity.f.a a = new com.pandora.android.activity.f.a() {

        public Bundle a(boolean flag)
        {
            return p.ca.j.a("profile", flag);
        }

    };
    private static a t[];
    private static a u[];
    private static a v[];
    private static com.pandora.android.activity.f.b w = new com.pandora.android.activity.f.b() {

        public a[] a(HomeTabsActivity hometabsactivity, boolean flag)
        {
            if (flag)
            {
                return ad.G();
            }
            if (hometabsactivity.ah() && (hometabsactivity.ag() instanceof q))
            {
                return ad.H();
            } else
            {
                return ad.I();
            }
        }

    };
    private BroadcastReceiver s;

    public ad()
    {
        s = new BroadcastReceiver() {

            final ad a;

            public void onReceive(Context context, Intent intent)
            {
                if (intent.getAction().equals(PandoraIntent.a("cmd_change_settings_result")))
                {
                    a.B().reload();
                }
            }

            
            {
                a = ad.this;
                super();
            }
        };
    }

    static a[] G()
    {
        return t;
    }

    static a[] H()
    {
        return u;
    }

    static a[] I()
    {
        return v;
    }

    public static f n_()
    {
        return new f("profile", b.a.h().getString(0x7f080271), p/ca/ad, a, w);
    }

    public static ad o_()
    {
        ad ad1 = new ad();
        ad1.setArguments(a.a(false));
        return ad1;
    }

    public CharSequence d()
    {
        return f();
    }

    public String f()
    {
        if (w())
        {
            return super.f();
        } else
        {
            return getString(0x7f080271);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("cmd_change_settings_result");
        b.a.C().a(s, pandoraintentfilter);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroyView()
    {
        try
        {
            b.a.C().a(s);
        }
        catch (Exception exception)
        {
            p.df.a.c("ProfileFragment", "exception during onDestroy- ", exception);
        }
        super.onDestroyView();
    }

    public com.pandora.android.util.af.c v()
    {
        if (!com.pandora.android.util.s.a(b))
        {
            if (b.equalsIgnoreCase("station details"))
            {
                return af.a(p.l, "station");
            } else
            {
                return af.a(p.l, b);
            }
        } else
        {
            return com.pandora.android.util.af.c.aa;
        }
    }

    static 
    {
        t = (new a[] {
            a.e, a.h
        });
        u = (new a[] {
            a.h
        });
        v = (new a[] {
            a.e
        });
    }
}
