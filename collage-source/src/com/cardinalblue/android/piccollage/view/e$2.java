// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import com.cardinalblue.android.piccollage.activities.EchoesListActivity;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            e

class a
    implements android.view..OnClickListener
{

    final WebPhoto a;
    final e b;

    public void onClick(View view)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        switch (view.getId())
        {
        default:
            return;

        case 2131755242: 
            if (a.getLikeNum() > 0 || a.getEchoesNum() > 0)
            {
                Intent intent = new Intent(view.getContext(), com/cardinalblue/android/piccollage/activities/EchoesListActivity);
                intent.putExtra("extra_webphoto", a);
                intent.putExtra("start_from", e.b(b));
                view.getContext().startActivity(intent);
                return;
            }
            break;

        case 2131755392: 
        case 2131755394: 
            obj = a.getUser();
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (obj == null) goto _L1; else goto _L4
_L4:
        Intent intent1;
        if (((PicUser) (obj)).equals(PicAuth.h().i()))
        {
            intent1 = new Intent(view.getContext(), com/cardinalblue/android/piccollage/activities/HomeActivity);
            intent1.setAction("piccollage.intent.action.VIEW_PROFILE");
        } else
        {
            intent1 = new Intent(view.getContext(), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
        }
        intent1.putExtra("user", ((android.os.Parcelable) (obj)));
        obj = (Activity)view.getContext();
        ActivityCompat.startActivity(((Activity) (obj)), intent1, ActivityOptionsCompat.makeSceneTransitionAnimation(((Activity) (obj)), b.b, view.getContext().getString(0x7f0703aa)).toBundle());
        return;
    }

    n.WebPhoto(e e1, WebPhoto webphoto)
    {
        b = e1;
        a = webphoto;
        super();
    }
}
