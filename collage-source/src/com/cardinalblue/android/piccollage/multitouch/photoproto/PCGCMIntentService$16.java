// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.h;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class d
    implements i
{

    final String a;
    final Intent b;
    final android.support.v4.app.lder c;
    final String d;
    final PCGCMIntentService e;

    public j a(j j1)
        throws Exception
    {
        j1 = (PicUser)j1.e();
        if (j1 == null)
        {
            return null;
        }
        Object obj = new h(e);
        if (j1.equals(PicAuth.h().i()))
        {
            ((h) (obj)).a(com/cardinalblue/android/piccollage/activities/HomeActivity).a("piccollage.intent.action.VIEW_PROFILE");
        } else
        {
            ((h) (obj)).a(com/cardinalblue/android/piccollage/activities/PicProfileActivity);
        }
        ((h) (obj)).a(PCGCMIntentService.b() + 1).b(0x14000000).a("extra_start_from", "notification").a("flurry_event", a).a("key_notification_target_activity", "User profile").a("key_notification_payload", k.a(b.getExtras()).toString()).a("key_notification_id", PCGCMIntentService.b() + 1).a("user", j1);
        obj = ((h) (obj)).c(0x8000000);
        c.addAction(0, e.getString(0x7f0700e4), ((android.app.PendingIntent) (obj)));
        return PCGCMIntentService.a(e, c, j1.getProfileImageUrl(), d, j1.getDisplayName());
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PCGCMIntentService pcgcmintentservice, String s, Intent intent, android.support.v4.app.lder lder, String s1)
    {
        e = pcgcmintentservice;
        a = s;
        b = intent;
        c = lder;
        d = s1;
        super();
    }
}
