// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.util.SearchBox;
import com.pandora.android.util.SearchMusicLayout;
import com.pandora.android.util.af;
import com.pandora.android.util.s;
import com.pandora.radio.data.ArtistSearchData;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.util.i;
import java.util.List;
import p.bz.n;
import p.cm.b;
import p.dd.am;
import p.di.m;

// Referenced classes of package p.ca:
//            af, ah, y

public class c extends p.ca.af
{

    private String p;
    private ah q;
    private TextView r;

    public c()
    {
    }

    public static c a(com.pandora.radio.util.j j1, String s1, boolean flag)
    {
        return a(j1, true, flag, null, null, s1);
    }

    public static c a(com.pandora.radio.util.j j1, boolean flag, boolean flag1, MusicSearchData musicsearchdata, String s1, String s2)
    {
        c c1 = new c();
        c1.setArguments(b(j1, flag, flag1, musicsearchdata, s1, s2));
        return c1;
    }

    protected static Bundle b(com.pandora.radio.util.j j1, boolean flag, boolean flag1, MusicSearchData musicsearchdata, String s1, String s2)
    {
        j1 = p.ca.af.b(j1, flag, flag1, musicsearchdata, s1);
        j1.putString("intent_station_token", s2);
        return j1;
    }

    private void c(boolean flag)
    {
        if (flag)
        {
            if (m_().getHeaderViewsCount() == 0)
            {
                m_().addHeaderView(r);
            }
        } else
        {
            m_().removeHeaderView(r);
        }
        s.k();
    }

    public void a(ListView listview, View view, int k, long l)
    {
        k -= listview.getHeaderViewsCount();
        if (k >= 0)
        {
            if ((listview = (ArtistSearchData)q.getItem(k)) != null)
            {
                (new b()).execute(new Object[] {
                    p, listview.b(), listview.a()
                });
                i.f();
                return;
            }
        }
    }

    protected void a(List list)
    {
        if (l)
        {
            q.a(list);
            boolean flag;
            if (!q.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c(flag);
            a(((android.widget.ListAdapter) (q)));
        }
    }

    public void e()
    {
        super.e();
        c(false);
    }

    public void f()
    {
        super.f();
        c(true);
    }

    protected int g()
    {
        return 0x7f08022a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        LayoutInflater layoutinflater1 = layoutinflater;
        if (s.u())
        {
            layoutinflater1 = layoutinflater.cloneInContext(new ContextThemeWrapper(getActivity(), 0x7f0d0014));
        }
        layoutinflater = super.onCreateView(layoutinflater1, viewgroup, bundle);
        p = getArguments().getString("intent_station_token");
        q = new ah(getActivity());
        if (s.u())
        {
            ((SearchBox)layoutinflater.findViewById(0x7f100043)).setVisibility(0);
        }
        r = (TextView)layoutinflater1.inflate(0x7f040070, null);
        r.setText(getResources().getString(0x7f080077));
        viewgroup = getParentFragment();
        if ((viewgroup instanceof p.cj.c) && d() != null)
        {
            ((p.cj.c)viewgroup).a(d());
        }
        return layoutinflater;
    }

    public void onPersonalizationThumbView(n n1)
    {
        PandoraIntent pandoraintent;
        Bundle bundle;
        if (!n1.b)
        {
            return;
        }
        pandoraintent = new PandoraIntent("action_show_thumb_history");
        bundle = new Bundle();
        static class _cls1
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

        _cls1.a[n1.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 82
    //                   2 64
    //                   3 64;
           goto _L1 _L2 _L1 _L1
_L1:
        pandoraintent.putExtras(bundle);
        com.pandora.android.provider.b.a.C().a(pandoraintent);
        return;
_L2:
        bundle.putBoolean("intent_jump_to_thumbs_down", true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onSeedSuggestionsRadioEvent(am am1)
    {
        if (am1.a.equals(p))
        {
            a(am1.b);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (b() != null)
        {
            m_().setAdapter(null);
        }
        m_().addHeaderView(r);
        if (!i.a(p))
        {
            (new m()).execute(new Object[] {
                com.pandora.android.provider.b.a.b(), p
            });
            s.j();
        }
        if (k != null)
        {
            j.a(k, g(), true);
            k.requestFocus();
        }
        af.a().a(v());
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.g;
    }
}
