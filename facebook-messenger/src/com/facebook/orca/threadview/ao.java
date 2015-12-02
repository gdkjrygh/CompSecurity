// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadAlertRateLimitView

class ao
    implements android.view.View.OnClickListener
{

    final ThreadAlertRateLimitView a;

    ao(ThreadAlertRateLimitView threadalertratelimitview)
    {
        a = threadalertratelimitview;
        super();
    }

    public void onClick(View view)
    {
        ThreadAlertRateLimitView.a(a);
    }
}
