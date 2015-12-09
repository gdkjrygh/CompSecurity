// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            f

class a
    implements android.view..OnClickListener
{

    final WebPhoto a;
    final f b;

    public void onClick(View view)
    {
        view = view.getContext();
        break MISSING_BLOCK_LABEL_5;
        if (view != null && a != null)
        {
            PicUser picuser = a.getUser();
            if (picuser != null)
            {
                if (picuser.equals(PicAuth.h().i()))
                {
                    view = new Intent(view, com/cardinalblue/android/piccollage/activities/HomeActivity);
                    view.setAction("piccollage.intent.action.VIEW_PROFILE");
                } else
                {
                    view = new Intent(view, com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                }
                view.putExtra("user", picuser);
                f.b(b).startActivity(view);
                return;
            }
        }
        return;
    }

    WebPhoto(f f1, WebPhoto webphoto)
    {
        b = f1;
        a = webphoto;
        super();
    }
}
