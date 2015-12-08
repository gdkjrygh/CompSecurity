// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;
import com.google.android.gms.ads.a;

// Referenced classes of package com.ijoysoft.a:
//            a

final class o extends a
{

    final com.ijoysoft.a.a a;
    private final Activity b;
    private final Runnable c;

    o(com.ijoysoft.a.a a1, Activity activity, Runnable runnable)
    {
        a = a1;
        b = activity;
        c = runnable;
        super();
    }

    public final void a()
    {
        com.ijoysoft.a.a.b(a, b, c);
        super.a();
    }
}
