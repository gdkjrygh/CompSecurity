// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;
import com.google.android.gms.ads.a;

// Referenced classes of package com.ijoysoft.a:
//            n, a

final class m extends a
{

    final com.ijoysoft.a.a a;
    private final Activity b;

    m(com.ijoysoft.a.a a1, Activity activity)
    {
        a = a1;
        b = activity;
        super();
    }

    public final void a()
    {
        com.ijoysoft.a.a.b(a, b, new n(this, b));
    }
}
