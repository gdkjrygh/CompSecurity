// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.instrumentation;

import android.app.Activity;
import android.os.Bundle;
import p.aq.b;
import p.aq.k;

public class InstrumentedActivity extends Activity
{

    public InstrumentedActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k.a(getApplicationContext());
    }

    protected void onPause()
    {
        super.onPause();
        k.d();
    }

    protected void onResume()
    {
        super.onResume();
        k.g().a(getClass().getSimpleName());
        k.c();
    }
}
