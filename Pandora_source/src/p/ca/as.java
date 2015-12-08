// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.View;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.radio.data.StationRecommendations;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package p.ca:
//            ar

public class as extends ar
{

    private List l;

    public as()
    {
    }

    public static as a(StationRecommendations stationrecommendations, com.pandora.radio.util.j j1, Bundle bundle)
    {
        as as1 = new as();
        stationrecommendations = b(stationrecommendations, j1);
        stationrecommendations.putAll(bundle);
        as1.setArguments(stationrecommendations);
        return as1;
    }

    protected void a(com.pandora.radio.util.j j1)
    {
        l = new ArrayList(l);
        l.add(com.pandora.android.tablet.TabletHome.c.h);
        Bundle bundle = new Bundle(3);
        bundle.putString("intent_station_pane_stack", com.pandora.android.tablet.TabletHome.c.a(l));
        bundle.putParcelable("intent_station_recommendations", j);
        bundle.putSerializable("intent_search_result_consumer", j1);
        b.a.C().a(TabletHome.a(j1, bundle));
    }

    public boolean c()
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.android.tablet.TabletHome.c.values().length];
                try
                {
                    a[com.pandora.android.tablet.TabletHome.c.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.tablet.TabletHome.c.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((com.pandora.android.tablet.TabletHome.c)l.get(0)).ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 80
    //                   2 95;
           goto _L1 _L2 _L3
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("StationRecommendationsFragmentTablet called with unsupported StationPane arg: ").append(l.get(0)).toString());
_L2:
        b.a.C().a(TabletHome.al());
_L5:
        return true;
_L3:
        b.a.C().a(TabletHome.ak());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        l = com.pandora.android.tablet.TabletHome.c.a(getArguments().getString("intent_station_pane_stack"));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.b).b(com.pandora.android.view.HeaderLayout.a.e).a(com.pandora.android.view.HeaderLayout.b.c).a(b.a.h().getString(0x7f080221)).a();
        b.a.e().a(view);
    }
}
