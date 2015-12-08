// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.e.l;
import com.roidapp.baselib.view.FixedDrawerLayout;
import com.roidapp.photogrid.video.onlinemusic.Genre;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, XListView, g, bg, 
//            q, ad, f

final class aq
    implements android.widget.AdapterView.OnItemClickListener
{

    final TrackSelector a;

    aq(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        if (i != TrackSelector.D(a).getAdapter().getCount() - 1 && TrackSelector.E(a) != i)
        {
            TrackSelector.h(a).c();
            TrackSelector.h(a).b();
            TrackSelector.c(a, i);
            TrackSelector.i(a).a(TrackSelector.E(a));
            TrackSelector.d(a, bg.e);
            TrackSelector.G(a).f(TrackSelector.F(a));
            com.roidapp.photogrid.video.TrackSelector.l(a);
            adapterview = (Genre)TrackSelector.i(a).getItem(TrackSelector.E(a));
            TrackSelector.e(a, ((Genre) (adapterview)).genre_id);
            if (a.a != null)
            {
                TrackSelector.a(a, a.a.e(TrackSelector.e(a)));
            }
            TrackSelector.g(a).a();
            TrackSelector.h(a).setAdapter(TrackSelector.g(a));
            a.getSharedPreferences(a.getPackageName(), 0).edit().putInt("last_gener_id", TrackSelector.e(a)).apply();
            TrackSelector.H(a).setText(((Genre) (adapterview)).genre_title);
            if (TrackSelector.z(a).b() <= 0 && TrackSelector.z(a).c())
            {
                TrackSelector.j(a).setVisibility(0);
                if (TrackSelector.h(a) != null)
                {
                    TrackSelector.h(a).a(true);
                }
            } else
            {
                TrackSelector.j(a).setVisibility(8);
            }
            if (TrackSelector.e(a) == 0x989682 && TrackSelector.z(a) != null && TrackSelector.z(a).b() > 0)
            {
                if (TrackSelector.h(a) != null)
                {
                    TrackSelector.h(a).a();
                }
            } else
            if (TrackSelector.z(a) != null && TrackSelector.z(a).b() < 10)
            {
                a.a();
            } else
            {
                TrackSelector.h(a).b(true);
            }
            if (!l.b(TrackSelector.b(a)))
            {
                if (TrackSelector.g(a).getCount() <= 0)
                {
                    TrackSelector.m(a).setVisibility(0);
                    TrackSelector.k(a).setVisibility(8);
                    TrackSelector.h(a).setAdapter(null);
                    TrackSelector.h(a).a(true);
                } else
                {
                    TrackSelector.m(a).setVisibility(8);
                    TrackSelector.k(a).setVisibility(0);
                    TrackSelector.r(a).setVisibility(0);
                    TrackSelector.q(a).setVisibility(8);
                }
                TrackSelector.j(a).setVisibility(8);
                if (TrackSelector.h(a) != null)
                {
                    TrackSelector.h(a).a(true);
                    return;
                }
            } else
            {
                TrackSelector.m(a).setVisibility(8);
                TrackSelector.k(a).setVisibility(8);
                return;
            }
        }
    }
}
