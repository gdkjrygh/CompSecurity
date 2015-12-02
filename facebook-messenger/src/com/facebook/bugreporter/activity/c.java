// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity;

import android.content.Intent;
import com.facebook.base.fragment.b;

// Referenced classes of package com.facebook.bugreporter.activity:
//            BugReportActivity

class c
    implements com.facebook.base.fragment.c
{

    final BugReportActivity a;

    c(BugReportActivity bugreportactivity)
    {
        a = bugreportactivity;
        super();
    }

    public void a(b b, Intent intent)
    {
        BugReportActivity.a(a, b, intent);
    }
}
