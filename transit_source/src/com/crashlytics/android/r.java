// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.os.AsyncTask;

// Referenced classes of package com.crashlytics.android:
//            CrashTest

final class r extends AsyncTask
{

    private long a;
    private CrashTest b;

    r(CrashTest crashtest, long l)
    {
        b = crashtest;
        a = l;
        super();
    }

    private transient Void a()
    {
        try
        {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedexception) { }
        b.throwRuntimeException("Background thread crash");
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}
