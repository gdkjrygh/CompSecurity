// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.instrumentation;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import p.aq.b;
import p.aq.k;

public class InstrumentedFragmentActivity extends FragmentActivity
{

    public InstrumentedFragmentActivity()
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
