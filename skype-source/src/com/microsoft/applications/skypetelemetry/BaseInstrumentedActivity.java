// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.microsoft.applications.skypetelemetry:
//            LogManager, a, b

public abstract class BaseInstrumentedActivity extends Activity
{

    private static final String a = com/microsoft/applications/skypetelemetry/BaseInstrumentedActivity.getSimpleName();

    public BaseInstrumentedActivity()
    {
    }

    private b a()
    {
        this;
        JVM INSTR monitorenter ;
        b b1 = LogManager.c();
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        a().a(a.g);
    }

    protected void onResume()
    {
        super.onResume();
        a().a(a.f);
    }

    protected void onStart()
    {
        super.onStart();
        a().a(a.e);
    }

    protected void onStop()
    {
        super.onStop();
        a().a(a.d);
    }

}
