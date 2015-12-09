// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.view.a.r;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ai

class a
    implements android.widget.erView.OnItemClickListener
{

    final ai a;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.bn();
        view = ai.a(a).a(i);
        if (view == null)
        {
            return;
        }
        if (view.equals(PicAuth.h().i()))
        {
            adapterview = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/HomeActivity);
            adapterview.setAction("piccollage.intent.action.VIEW_PROFILE");
        } else
        {
            adapterview = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
        }
        adapterview.putExtra("user", view);
        a.startActivity(adapterview);
    }

    eActivity(ai ai1)
    {
        a = ai1;
        super();
    }
}
