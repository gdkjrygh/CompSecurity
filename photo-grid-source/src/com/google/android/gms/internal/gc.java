// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gb, ry

final class gc
    implements Runnable
{

    final JSONObject a;
    final gb b;

    gc(gb gb1, JSONObject jsonobject)
    {
        b = gb1;
        a = jsonobject;
        super();
    }

    public final void run()
    {
        b.b.a("fetchHttpRequestCompleted", a);
        zzb.zzaF("Dispatched http response.");
    }
}
