// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.os.Handler;

// Referenced classes of package com.facebook.orca.d:
//            k, e

class f
    implements Runnable
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        e.a(a, k.PLAYBACK_POSITION_UPDATED);
        e.a(a).postDelayed(this, 25L);
    }
}
