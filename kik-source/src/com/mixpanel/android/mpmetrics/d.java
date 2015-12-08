// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;

final class d
    implements Runnable
{

    final Activity a;
    final c.b b;

    d(Activity activity, c.b b1)
    {
        a = activity;
        b = b1;
        super();
    }

    public final void run()
    {
        (new c.a(a, b)).execute(new Void[0]);
    }
}
