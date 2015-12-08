// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.PublicCollageActivity;
import com.cardinalblue.android.piccollage.controller.FeedAccessorFactory;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ag, j

class a
    implements android.widget.erView.OnItemClickListener
{

    final ag a;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!k.b(a.getActivity()))
        {
            k.a(a.getActivity(), 0x7f07021d, 1);
            return;
        } else
        {
            b.bm();
            adapterview = new Intent(a.getActivity().getApplicationContext(), com/cardinalblue/android/piccollage/activities/PublicCollageActivity);
            adapterview.setAction("piccollage.intent.action.VIEW_MULTIPLE_COLLAGES");
            adapterview.putExtra("position", i);
            adapterview.putExtra("web_photos_data", ag.e(a).a());
            adapterview.putExtra("extra_start_from", "collage search");
            adapterview.putExtra("feed_accessor", FeedAccessorFactory.a(8, null));
            a.startActivityForResult(adapterview, 1);
            return;
        }
    }

    sorFactory(ag ag1)
    {
        a = ag1;
        super();
    }
}
