// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.os.AsyncTask;

// Referenced classes of package com.crashlytics.android.core:
//            CrashTest

class  extends AsyncTask
{

    final long a;

    private transient Void a()
    {
        try
        {
            Thread.sleep(a);
        }
        catch (InterruptedException interruptedexception) { }
        CrashTest.a("Background thread crash");
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }
}
