// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.bugreport;

import android.net.Uri;
import java.io.File;
import java.net.URI;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.bugreporter.activity.bugreport:
//            BugReportFragment

class d
    implements Callable
{

    final Uri a;
    final BugReportFragment b;

    d(BugReportFragment bugreportfragment, Uri uri)
    {
        b = bugreportfragment;
        a = uri;
        super();
    }

    public Long a()
    {
        return Long.valueOf((new File(new URI(a.toString()))).length());
    }

    public Object call()
    {
        return a();
    }
}
