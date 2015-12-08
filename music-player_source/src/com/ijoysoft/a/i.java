// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.a;

import android.app.Activity;

// Referenced classes of package com.ijoysoft.a:
//            h, a

final class i
    implements Runnable
{

    final h a;
    private final Activity b;

    i(h h1, Activity activity)
    {
        a = h1;
        b = activity;
        super();
    }

    public final void run()
    {
        com.ijoysoft.a.a.a(a.a, b);
    }
}
