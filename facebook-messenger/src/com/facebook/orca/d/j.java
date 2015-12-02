// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.os.Handler;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.d:
//            e, k

class j
    implements h
{

    final e a;

    j(e e1)
    {
        a = e1;
        super();
    }

    public void a(Object obj)
    {
        e.a(a, null);
        e.a(a, k.PLAYBACK_STARTED);
        e.a(a).post(e.d(a));
    }

    public void a(Throwable throwable)
    {
        e.a(a, null);
        e.b(a);
        e.a(a, k.PLAYBACK_ERROR);
    }
}
