// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.adapters.c;
import com.tinder.model.FacebookAlbum;
import com.tinder.views.CustomActionBar;

// Referenced classes of package com.tinder.fragments:
//            e, a

final class a
    implements android.widget.terView.OnItemClickListener
{

    final e a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = com.tinder.fragments.e.c(a).a(i).id;
        view = com.tinder.fragments.e.c(a).a(i).name;
        ActivityAddPhoto activityaddphoto = (ActivityAddPhoto)a.getActivity();
        (new StringBuilder("albumId=")).append(adapterview).append(", albumName=").append(view);
        Bundle bundle = new Bundle();
        bundle.putString("id", adapterview);
        bundle.putString("name", view);
        activityaddphoto.c.setArguments(bundle);
        activityaddphoto.c(activityaddphoto.c);
        activityaddphoto.H().setMenu(activityaddphoto.d);
        activityaddphoto.e = false;
    }

    w(e e1)
    {
        a = e1;
        super();
    }
}
