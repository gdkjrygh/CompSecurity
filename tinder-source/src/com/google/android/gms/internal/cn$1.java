// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.d;

// Referenced classes of package com.google.android.gms.internal:
//            cn, cl

final class a
    implements android.content.gInterface.OnClickListener
{

    final String a;
    final cn b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        d.c();
        cl.a(b.a, Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", a), "Share via"));
    }

    (cn cn1, String s)
    {
        b = cn1;
        a = s;
        super();
    }
}
