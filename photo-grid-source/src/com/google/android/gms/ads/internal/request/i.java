// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.ho;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm, j, k

final class i
    implements Runnable
{

    final JSONObject a;
    final String b;
    final zzm c;

    i(zzm zzm1, JSONObject jsonobject, String s)
    {
        c = zzm1;
        a = jsonobject;
        b = s;
        super();
    }

    public final void run()
    {
        zzm.a(c, zzm.b().b());
        zzm.b(c).a(new j(this), new k(this));
    }
}
