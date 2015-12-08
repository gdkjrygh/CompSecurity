// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.DialogInterface;
import com.arist.activity.EqualizerActivity;

// Referenced classes of package com.arist.model.equize:
//            a, j

final class g
    implements android.content.DialogInterface.OnClickListener
{

    final a a;
    private final String b[];

    g(a a1, String as[])
    {
        a = a1;
        b = as;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        com.arist.model.equize.a.a(a).a(i);
        com.arist.model.equize.a.b(a).b(b[i]);
    }
}
