// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.DialogInterface;
import b.a.a.a.a.f.b;
import b.a.a.a.a.f.c;

// Referenced classes of package com.a.a.c:
//            n

final class q
    implements android.content.DialogInterface.OnClickListener
{

    final n a;

    q(n n1)
    {
        a = n1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        c c1 = new c(a.e);
        c1.a(c1.b().putBoolean("always_send_reports_opt_in", true));
        a.b.a(true);
        dialoginterface.dismiss();
    }
}
