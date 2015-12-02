// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.bugreport;

import com.facebook.bugreporter.b;

// Referenced classes of package com.facebook.bugreporter.activity.bugreport:
//            BugReportFragment

class f
    implements Runnable
{

    final BugReportFragment a;

    f(BugReportFragment bugreportfragment)
    {
        a = bugreportfragment;
        super();
    }

    public void run()
    {
        BugReportFragment.g(a).a(BugReportFragment.e(a).o(), BugReportFragment.f(a));
    }
}
