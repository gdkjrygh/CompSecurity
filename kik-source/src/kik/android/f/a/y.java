// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.ProgressDialog;
import com.kik.g.r;

// Referenced classes of package kik.android.f.a:
//            w

final class y extends r
{

    final ProgressDialog a;
    final w b;

    y(w w, ProgressDialog progressdialog)
    {
        b = w;
        a = progressdialog;
        super();
    }

    public final void a()
    {
        a.dismiss();
    }
}
