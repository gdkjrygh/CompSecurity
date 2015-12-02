// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.bugreport;

import android.widget.TextView;
import com.facebook.common.n.a;
import com.facebook.o;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.bugreporter.activity.bugreport:
//            BugReportFragment

class e
    implements h
{

    final BugReportFragment a;

    e(BugReportFragment bugreportfragment)
    {
        a = bugreportfragment;
        super();
    }

    public void a(Long long1)
    {
        long1 = BugReportFragment.c(a).a((int)long1.longValue());
        long1 = a.a(o.bug_report_screen_shot_title_with_size, new Object[] {
            long1
        });
        BugReportFragment.d(a).setText(long1);
    }

    public volatile void a(Object obj)
    {
        a((Long)obj);
    }

    public void a(Throwable throwable)
    {
    }
}
