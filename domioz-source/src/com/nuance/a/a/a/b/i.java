// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import android.os.Looper;

// Referenced classes of package com.nuance.a.a.a.b:
//            f, a

final class i
    implements Runnable
{

    private f a;

    i(f f1)
    {
        a = f1;
        super();
    }

    public final void run()
    {
        Looper.prepare();
        f.b(a).a();
        Looper.loop();
    }
}
