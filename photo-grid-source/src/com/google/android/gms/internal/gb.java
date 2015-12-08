// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ga, qa, gc, ry

final class gb
    implements Runnable
{

    final Map a;
    final ry b;
    final ga c;

    gb(ga ga1, Map map, ry ry)
    {
        c = ga1;
        a = map;
        b = ry;
        super();
    }

    public final void run()
    {
        zzb.zzaF("Received Http request.");
        Object obj = (String)a.get("http_request");
        obj = c.a(((String) (obj)));
        if (obj == null)
        {
            zzb.e("Response should not be null.");
            return;
        } else
        {
            qa.a.post(new gc(this, ((org.json.JSONObject) (obj))));
            return;
        }
    }
}
