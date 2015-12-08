// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.f.c;
import a.a.a.a.a.f.d;
import android.content.DialogInterface;

// Referenced classes of package com.b.a.c:
//            o, t

final class r
    implements android.content.DialogInterface.OnClickListener
{

    final o a;

    r(o o1)
    {
        a = o1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        d d1 = new d(a.e);
        d1.a(d1.b().putBoolean("always_send_reports_opt_in", true));
        a.b.a(true);
        dialoginterface.dismiss();
    }
}
