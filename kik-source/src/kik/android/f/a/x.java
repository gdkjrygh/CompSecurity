// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.ProgressDialog;

// Referenced classes of package kik.android.f.a:
//            w

final class x
    implements Runnable
{

    final ProgressDialog a;
    final w b;

    x(w w, ProgressDialog progressdialog)
    {
        b = w;
        a = progressdialog;
        super();
    }

    public final void run()
    {
        a.show();
    }
}
