// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d;

import android.os.Looper;

// Referenced classes of package com.nuance.dragon.toolkit.d:
//            b

final class d
    implements Runnable
{

    final b a;

    d(b b)
    {
        a = b;
        super();
    }

    public final void run()
    {
        Looper.myLooper().quit();
    }
}
