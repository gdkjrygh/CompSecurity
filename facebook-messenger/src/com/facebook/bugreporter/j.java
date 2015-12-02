// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.app.ProgressDialog;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.bugreporter:
//            g

class j
    implements h
{

    final ProgressDialog a;
    final g b;

    j(g g, ProgressDialog progressdialog)
    {
        b = g;
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
