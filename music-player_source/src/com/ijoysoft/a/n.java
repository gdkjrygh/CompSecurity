// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;

// Referenced classes of package com.ijoysoft.a:
//            m, a

final class n
    implements Runnable
{

    final m a;
    private final Activity b;

    n(m m1, Activity activity)
    {
        a = m1;
        b = activity;
        super();
    }

    public final void run()
    {
        a.a.a(b, false);
        com.ijoysoft.a.a.b(a.a, b);
    }
}
