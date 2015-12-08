// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.j;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import p.cp.d;
import p.df.a;

// Referenced classes of package p.ca:
//            j

public class q extends p.ca.j
{

    public static final int a;
    private String s;

    public q()
    {
    }

    private boolean E()
    {
        com.pandora.android.util.s.a(getActivity(), B());
        if (!com.pandora.android.util.s.a(s))
        {
            l.a(B(), (new StringBuilder()).append(s).append("();").toString());
            b.a.C().a(new PandoraIntent("reload_backstage_page"));
            return true;
        } else
        {
            p.df.a.c("EditModalPageTabFragment", "EditModalPageTabFragment() missing okHandler.");
            return false;
        }
    }

    public static q a(String s1, boolean flag, String s2, int i, int k, String s3, String s4)
    {
        s1 = b(s1, flag, s2, i, k, s3, s4);
        s2 = new q();
        s2.setArguments(s1);
        return s2;
    }

    public static Bundle b(String s1, boolean flag, String s2, int i, int k, String s3, String s4)
    {
        s1 = a(s1, flag, i, false);
        s1.putString("ok_handler", s3);
        s1.putInt("view_type", k);
        s1.putString("intent_title", s4);
        if (!com.pandora.android.util.s.a(s2))
        {
            s1.putString("intent_station_token", s2);
        }
        return s1;
    }

    public void a(View view)
    {
        if (E())
        {
            e();
        }
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        return f();
    }

    public void e()
    {
        getActivity().setResult(-1);
        getActivity().finish();
    }

    public boolean e_()
    {
        return false;
    }

    public String f()
    {
        return getString(0x7f08013c);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        D();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        s = getArguments().getString("ok_handler");
        if (com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            setHasOptionsMenu(true);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menuinflater.inflate(0x7f12000b, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f100016)
        {
            E();
            return true;
        } else
        {
            return false;
        }
    }

    public com.pandora.android.util.af.c v()
    {
        if (getArguments().getInt("view_type") == 1310)
        {
            return com.pandora.android.util.af.c.v;
        } else
        {
            return com.pandora.android.util.af.c.aa;
        }
    }

    static 
    {
        a = b.a.h().getResources().getColor(0x7f0b004f);
    }
}
