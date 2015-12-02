// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.bugreport;

import android.view.View;

// Referenced classes of package com.facebook.bugreporter.activity.bugreport:
//            BugReportFragment

class a
    implements android.view.View.OnClickListener
{

    final BugReportFragment a;

    a(BugReportFragment bugreportfragment)
    {
        a = bugreportfragment;
        super();
    }

    public void onClick(View view)
    {
        BugReportFragment.a(a);
    }
}
