// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.a:
//            d

final class a
    implements Executor
{

    private Handler a;
    private d b;

    public final void execute(Runnable runnable)
    {
        a.post(runnable);
    }

    (d d1, Handler handler)
    {
        b = d1;
        a = handler;
        super();
    }
}
