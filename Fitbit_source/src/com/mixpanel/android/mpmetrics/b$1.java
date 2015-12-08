// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            b

static final class b
    implements Runnable
{

    final Activity a;
    final execute b;

    public void run()
    {
        (new <init>(a, b)).execute(new Void[0]);
    }

    (Activity activity,  )
    {
        a = activity;
        b = ;
        super();
    }
}
