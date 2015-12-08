// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.provider.b;
import com.pandora.android.util.SearchBox;
import com.pandora.android.util.SearchMusicLayout;
import com.pandora.android.util.s;
import com.pandora.radio.data.ArtistSearchData;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import java.util.List;
import java.util.UUID;
import p.cw.c;
import p.dd.am;
import p.df.a;
import p.di.m;
import p.l.g;
import p.l.j;

// Referenced classes of package p.ca:
//            o, ah

public class d extends o
    implements android.widget.AdapterView.OnItemClickListener
{

    com.pandora.android.util.SearchMusicLayout.a a;
    private SearchMusicLayout b;
    private String c;
    private ah d;
    private ListView e;
    private BroadcastReceiver f;

    public d()
    {
        a = new com.pandora.android.util.SearchMusicLayout.a() {

            final d a;

            public void a(int k)
            {
                a.getActivity().finish();
            }

            public void e()
            {
                p.ca.d.a(a, false);
            }

            public void f()
            {
                p.ca.d.a(a, true);
            }

            public void k_()
            {
            }

            
            {
                a = d.this;
                super();
            }
        };
        f = new BroadcastReceiver() {

            final d a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                break MISSING_BLOCK_LABEL_5;
                if (!s.a(context) && context.equals(PandoraIntent.a("action_populate_search_results")) && ((UUID)intent.getSerializableExtra("intent_task_id")).equals(p.ca.d.a(a).a))
                {
                    s.k();
                    context = (MusicSearchData)intent.getParcelableExtra("intent_search_results");
                    if (context != null)
                    {
                        p.ca.d.a(a).a(context);
                        return;
                    }
                }
                return;
            }

            
            {
                a = d.this;
                super();
            }
        };
    }

    static SearchMusicLayout a(d d1)
    {
        return d1.b;
    }

    private void a(List list)
    {
        d.a(list);
    }

    static void a(d d1, boolean flag)
    {
        d1.a(flag);
    }

    private void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = e;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 4;
        }
        ((ListView) (obj)).setVisibility(k);
        obj = getView().findViewById(0x7f1000b9);
        if (flag)
        {
            k = ((flag1) ? 1 : 0);
        } else
        {
            k = 4;
        }
        ((View) (obj)).setVisibility(k);
    }

    public void a(ListAdapter listadapter)
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e != null && flag)
        {
            e.setAdapter(listadapter);
        }
    }

    public CharSequence d()
    {
        return null;
    }

    public boolean e_()
    {
        return false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f040020, viewgroup, false);
        bundle = (TextView)layoutinflater.findViewById(0x7f1000b6);
        c = getArguments().getString("intent_station_token");
        viewgroup = b.a.b().y().a(getActivity(), c);
        bundle.setText(viewgroup.d());
        bundle = (SearchBox)layoutinflater.findViewById(0x7f1000b7);
        b = (SearchMusicLayout)layoutinflater.findViewById(0x7f1000b8);
        b.a(bundle, 0x7f08022a, true);
        b.setSearchResultConsumer(new com.pandora.android.util.c(c, null, null));
        b.setSearchResultsShownListener(a);
        bundle = (ImageView)layoutinflater.findViewById(0x7f1000b5);
        g.a(this).a(viewgroup.o()).a(0x7f0200e9).a(bundle);
        viewgroup = new PandoraIntentFilter();
        viewgroup.a("action_populate_search_results");
        b.a.C().a(f, viewgroup);
        e = (ListView)layoutinflater.findViewById(0x7f1000ba);
        e.setOnItemClickListener(this);
        d = new ah(getActivity());
        a(d);
        (new m()).execute(new Object[] {
            b.a.b(), c
        });
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        try
        {
            b.a.C().a(f);
        }
        catch (Exception exception)
        {
            p.df.a.c("AddVarietyFragmentTablet", "exception during onDestroy- ", exception);
        }
        b.a();
        b.b();
        d = null;
    }

    public void onItemClick(AdapterView adapterview, View view, int k, long l)
    {
        adapterview = (ArtistSearchData)d.getItem(k);
        (new p.cm.b()).execute(new Object[] {
            c, adapterview.b(), adapterview.a()
        });
        getActivity().finish();
    }

    public void onSeedSuggestionsRadioEvent(am am1)
    {
        a((new StringBuilder()).append("event. station token").append(am1.a).append("  main station token: ").append(c).toString());
        if (am1.a.equals(c))
        {
            a(am1.b);
        }
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.g;
    }
}
