// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            j

class a
    implements android.view..OnClickListener
{

    final WebPhoto a;
    final j b;

    public void onClick(View view)
    {
        PicUser picuser = a.getUser();
        if (picuser == null)
        {
            return;
        }
        if (picuser.equals(PicAuth.h().i()))
        {
            view = new Intent(j.b(b), com/cardinalblue/android/piccollage/activities/HomeActivity);
            view.setAction("piccollage.intent.action.VIEW_PROFILE");
        } else
        {
            view = new Intent(j.b(b), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
        }
        view.putExtra("user", picuser);
        j.b(b).startActivity(view);
    }

    (j j1, WebPhoto webphoto)
    {
        b = j1;
        a = webphoto;
        super();
    }
}
