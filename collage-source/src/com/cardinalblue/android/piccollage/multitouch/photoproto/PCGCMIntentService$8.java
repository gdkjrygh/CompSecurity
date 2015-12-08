// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.content.Context;
import android.os.Bundle;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.h;
import com.cardinalblue.android.piccollage.model.Collage;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class d
    implements i
{

    final Context a;
    final String b;
    final Bundle c;
    final android.support.v4.app.ilder d;
    final PCGCMIntentService e;

    public Void a(j j1)
        throws Exception
    {
        j1 = (String)j1.e();
        j1 = Collage.a(a, b, "notification", j1);
        j1 = new h(e, j1);
        j1.a(PCGCMIntentService.b() + 1).a("key_notification_target_activity", "Editor for echo").a("key_notification_payload", k.a(c).toString()).a("key_notification_id", PCGCMIntentService.b() + 1).a(c);
        j1 = j1.c(0x8000000);
        d.addAction(0, e.getString(0x7f0700e1), j1);
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PCGCMIntentService pcgcmintentservice, Context context, String s, Bundle bundle, android.support.v4.app.ilder ilder)
    {
        e = pcgcmintentservice;
        a = context;
        b = s;
        c = bundle;
        d = ilder;
        super();
    }
}
