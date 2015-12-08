// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Bundle;
import android.support.v4.content.j;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.SearchMusicLayout;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.StationRecommendations;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package p.ca:
//            af

public class ag extends af
{

    public ag()
    {
    }

    public static ag b(com.pandora.radio.util.j j1, boolean flag, boolean flag1)
    {
        return c(j1, flag, flag1, null, null);
    }

    public static ag c(com.pandora.radio.util.j j1, boolean flag, boolean flag1, MusicSearchData musicsearchdata, String s)
    {
        ag ag1 = new ag();
        ag1.setArguments(b(j1, flag, flag1, musicsearchdata, s));
        return ag1;
    }

    private Bundle o()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(com.pandora.android.tablet.TabletHome.c.f);
        Bundle bundle = new Bundle(1);
        bundle.putString("intent_station_pane_stack", com.pandora.android.tablet.TabletHome.c.a(arraylist));
        return bundle;
    }

    protected void a(StationRecommendations stationrecommendations, com.pandora.radio.util.j j1)
    {
        b.a.C().a(TabletHome.a(stationrecommendations, j1, o()));
    }

    protected void a(com.pandora.radio.util.j j1)
    {
        b.a.C().a(TabletHome.a(j1, o()));
    }

    protected void b(String s)
    {
        s = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.a).a(com.pandora.android.view.HeaderLayout.b.b).b(com.pandora.android.view.HeaderLayout.a.e).a(com.pandora.android.view.HeaderLayout.c.b, j.getSearchListener(), j.getMusicSearchTextWatcher()).b(g()).b(s).c(false).b(false).a();
        b.a.e().a(s);
    }

    public boolean c()
    {
        b.a.C().a(TabletHome.ak());
        return true;
    }

    protected void h()
    {
        p.bz.i i = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.a).a(com.pandora.android.view.HeaderLayout.b.b).b(com.pandora.android.view.HeaderLayout.a.e).b(g()).a(com.pandora.android.view.HeaderLayout.c.b, j.getSearchListener(), j.getMusicSearchTextWatcher()).c(true).a();
        b.a.e().a(i);
    }

    protected void j()
    {
        p.bz.i i = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.a).a(com.pandora.android.view.HeaderLayout.b.b).b(com.pandora.android.view.HeaderLayout.a.e).b(g()).a(com.pandora.android.view.HeaderLayout.c.b, j.getSearchListener(), j.getMusicSearchTextWatcher()).c(true).a();
        b.a.e().a(i);
    }

    protected void k()
    {
        p.bz.i i = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).d(true).c(false).a();
        b.a.e().a(i);
    }

    protected void m()
    {
        p.bz.i i = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.a).a(com.pandora.android.view.HeaderLayout.b.b).b(com.pandora.android.view.HeaderLayout.a.e).b(0x7f080123).a(com.pandora.android.view.HeaderLayout.c.a, m).b(false).a();
        b.a.e().a(i);
    }
}
