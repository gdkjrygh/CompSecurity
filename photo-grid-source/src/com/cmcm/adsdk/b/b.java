// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b;

import android.os.AsyncTask;
import com.cmcm.adsdk.b.b.a;

// Referenced classes of package com.cmcm.adsdk.b:
//            a, d

final class b extends AsyncTask
{

    final com.cmcm.adsdk.b.a a;

    b(com.cmcm.adsdk.b.a a1)
    {
        a = a1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        return Boolean.valueOf(com.cmcm.adsdk.b.b.a.a(com.cmcm.adsdk.b.a.a(a)).b());
    }

    protected final void onPostExecute(Object obj)
    {
label0:
        {
            obj = (Boolean)obj;
            if (com.cmcm.adsdk.b.a.b(a) != null)
            {
                if (!((Boolean) (obj)).booleanValue())
                {
                    break label0;
                }
                com.cmcm.adsdk.b.c.b.a("RequestConfig", "read config from cache...");
                com.cmcm.adsdk.b.a.b(a).b();
            }
            return;
        }
        com.cmcm.adsdk.b.a.b(a).a();
    }
}
