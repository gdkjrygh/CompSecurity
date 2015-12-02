// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.app.ProgressDialog;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.common.executors:
//            d

class e
    implements h
{

    final ProgressDialog a;
    final d b;

    e(d d, ProgressDialog progressdialog)
    {
        b = d;
        a = progressdialog;
        super();
    }

    public void a(Object obj)
    {
        a.dismiss();
    }

    public void a(Throwable throwable)
    {
        a.dismiss();
    }
}
