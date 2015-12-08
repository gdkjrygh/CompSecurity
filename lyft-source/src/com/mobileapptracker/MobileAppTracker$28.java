// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.mobileapptracker:
//            MobileAppTracker, MATParameters

class a
    implements Runnable
{

    final Activity a;
    final MobileAppTracker b;

    public void run()
    {
        b.e.D(a.getCallingPackage());
        Object obj = a.getIntent();
        if (obj != null)
        {
            obj = ((Intent) (obj)).getData();
            if (obj != null)
            {
                b.e.E(((Uri) (obj)).toString());
            }
        }
    }

    (MobileAppTracker mobileapptracker, Activity activity)
    {
        b = mobileapptracker;
        a = activity;
        super();
    }
}
