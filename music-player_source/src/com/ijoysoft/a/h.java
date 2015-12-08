// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;
import com.google.android.gms.ads.a;

// Referenced classes of package com.ijoysoft.a:
//            a, i

final class h extends a
{

    final com.ijoysoft.a.a a;
    private final boolean b;
    private final Activity c;
    private final Runnable d = null;

    h(com.ijoysoft.a.a a1, boolean flag, Activity activity)
    {
        a = a1;
        b = flag;
        c = activity;
        super();
    }

    public final void a()
    {
        super.a();
        if (d != null)
        {
            d.run();
        }
    }

    public final void c()
    {
        if (b && com.ijoysoft.a.a.a(a))
        {
            com.ijoysoft.a.a.b(a);
            com.ijoysoft.a.a.a(a, c, new i(this, c));
        }
    }
}
