// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            dv

final class a
    implements android.content.gInterface.OnClickListener
{

    final dv a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.b();
        dv.a(a).startActivity(dialoginterface);
    }

    ckListener(dv dv1)
    {
        a = dv1;
        super();
    }
}
