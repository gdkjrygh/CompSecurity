// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, aB

final class A
    implements Runnable
{

    private File a;
    private CountDownLatch b;
    private Context c;
    private float d;
    private CountDownLatch e;
    private Crashlytics f;

    A(Crashlytics crashlytics, File file, CountDownLatch countdownlatch, Context context, float f1, CountDownLatch countdownlatch1)
    {
        f = crashlytics;
        a = file;
        b = countdownlatch;
        c = context;
        d = f1;
        e = countdownlatch1;
        super();
    }

    public final void run()
    {
        a.createNewFile();
        b.countDown();
_L1:
        Crashlytics.a(f, c, d);
        a.delete();
        e.countDown();
        return;
        Object obj;
        obj;
        aB.a("Problem encountered creating Crashlytics initialization marker.", ((Throwable) (obj)));
        b.countDown();
          goto _L1
        obj;
        b.countDown();
        throw obj;
        obj;
        aB.a("Problem encountered during Crashlytics initialization.", ((Throwable) (obj)));
        e.countDown();
        return;
        obj;
        e.countDown();
        throw obj;
    }
}
