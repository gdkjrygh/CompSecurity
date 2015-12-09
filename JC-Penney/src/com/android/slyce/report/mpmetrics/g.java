// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            h, i

final class g
    implements Runnable
{

    final Activity a;
    final i b;

    g(Activity activity, i i)
    {
        a = activity;
        b = i;
        super();
    }

    public void run()
    {
        (new h(a, b)).execute(new Void[0]);
    }
}
