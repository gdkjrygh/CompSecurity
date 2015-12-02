// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.Context;
import com.mobvista.sdk.m.a.f.d;
import com.mobvista.sdk.m.core.c.b;
import com.mobvista.sdk.m.core.c.f;

// Referenced classes of package com.mobvista.sdk.m.core:
//            MobvistaAd

final class r extends Thread
{

    final Context a;

    r(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        b.a(f.a(a)).a();
        if (d.a == null)
        {
            d.a(a.getApplicationContext());
        }
        MobvistaAd.a(a);
    }
}
