// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.util.j;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package p.ca:
//            t

public class u extends t
{

    private List l;
    private Bundle m;

    public u()
    {
    }

    public static u a(j j1, Bundle bundle)
    {
        u u1 = new u();
        if (j1 != null)
        {
            Bundle bundle1 = new Bundle(1);
            bundle1.putSerializable("intent_search_result_consumer", j1);
            if (bundle != null)
            {
                bundle1.putBundle("intent_extra_key", bundle);
            }
            u1.setArguments(bundle1);
        }
        return u1;
    }

    protected void a(Bundle bundle)
    {
        if (bundle.containsKey("intent_search_result_consumer"))
        {
            k = (j)bundle.getSerializable("intent_search_result_consumer");
        }
    }

    protected void a(com.pandora.radio.data.j j1)
    {
        Object obj = null;
        Bundle bundle = obj;
        if (m != null)
        {
            bundle = obj;
            if (l != null)
            {
                bundle = new Bundle(m);
                l.add(com.pandora.android.tablet.TabletHome.c.b);
                bundle.putString("intent_station_pane_stack", com.pandora.android.tablet.TabletHome.c.a(l));
            }
        }
        b.a.C().a(TabletHome.a(j1, k, bundle));
    }

    public boolean c()
    {
        android.support.v4.content.j j1 = b.a.C();
        if (l == null || l.isEmpty())
        {
            j1.a(TabletHome.al());
            return true;
        }
        com.pandora.android.tablet.TabletHome.c c1 = (com.pandora.android.tablet.TabletHome.c)l.get(l.size() - 1);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.android.tablet.TabletHome.c.values().length];
                try
                {
                    a[com.pandora.android.tablet.TabletHome.c.h.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.tablet.TabletHome.c.f.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[c1.ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
            StationRecommendations stationrecommendations = (StationRecommendations)m.getParcelable("intent_station_recommendations");
            j j2 = (j)m.getSerializable("intent_search_result_consumer");
            ArrayList arraylist = new ArrayList(l);
            arraylist.remove(arraylist.size() - 1);
            Bundle bundle = new Bundle(1);
            bundle.putString("intent_station_pane_stack", com.pandora.android.tablet.TabletHome.c.a(arraylist));
            j1.a(TabletHome.a(stationrecommendations, j2, bundle));
            return true;

        case 2: // '\002'
            b.a.C().a(TabletHome.al());
            break;
        }
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        m = getArguments().getBundle("intent_extra_key");
        if (m != null)
        {
            l = com.pandora.android.tablet.TabletHome.c.a(m.getString("intent_station_pane_stack"));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.b).b(com.pandora.android.view.HeaderLayout.a.e).a(com.pandora.android.view.HeaderLayout.b.c).a(d().toString()).a();
        b.a.e().a(viewgroup);
        return layoutinflater;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putSerializable("intent_search_result_consumer", k);
        super.onSaveInstanceState(bundle);
    }
}
