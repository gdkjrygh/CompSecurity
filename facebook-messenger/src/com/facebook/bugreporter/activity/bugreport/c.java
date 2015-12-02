// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.bugreport;

import android.content.Intent;
import android.net.Uri;
import com.facebook.widget.text.f;

// Referenced classes of package com.facebook.bugreporter.activity.bugreport:
//            BugReportFragment

class c extends f
{

    final BugReportFragment a;

    c(BugReportFragment bugreportfragment)
    {
        a = bugreportfragment;
        super();
    }

    public void a()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://m.facebook.com/about/privacy"));
        a.a(intent);
    }
}
