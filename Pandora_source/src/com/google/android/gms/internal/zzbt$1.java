// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbt, zzfl, zzgd

class b
    implements Runnable
{

    final Map a;
    final zzgd b;
    final zzbt c;

    public void run()
    {
        zzb.zzaj("Received Http request.");
        Object obj = (String)a.get("http_request");
        obj = c.zzF(((String) (obj)));
        if (obj == null)
        {
            zzb.zzak("Response should not be null.");
            return;
        } else
        {
            zzfl.zzCr.post(new Runnable(((JSONObject) (obj))) {

                final JSONObject a;
                final zzbt._cls1 b;

                public void run()
                {
                    b.b.zzb("fetchHttpRequestCompleted", a);
                    zzb.zzaj("Dispatched http response.");
                }

            
            {
                b = zzbt._cls1.this;
                a = jsonobject;
                super();
            }
            });
            return;
        }
    }

    _cls1.a(zzbt zzbt1, Map map, zzgd zzgd)
    {
        c = zzbt1;
        a = map;
        b = zzgd;
        super();
    }
}
