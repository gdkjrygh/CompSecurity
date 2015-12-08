// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.app.Activity;

// Referenced classes of package com.fitbit.ui:
//            r, q

static final class init>
    implements Runnable
{

    final Activity a;

    public void run()
    {
        if (a instanceof q)
        {
            ((q)a).g();
            return;
        } else
        {
            a.setProgressBarIndeterminateVisibility(false);
            return;
        }
    }

    ty(Activity activity)
    {
        a = activity;
        super();
    }
}
