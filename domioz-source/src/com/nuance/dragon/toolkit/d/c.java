// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d;

import android.os.Looper;
import com.nuance.dragon.toolkit.d.b.a;

// Referenced classes of package com.nuance.dragon.toolkit.d:
//            b

final class c
    implements Runnable
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void run()
    {
        Looper.prepare();
        a(a).a();
        Looper.loop();
    }
}
