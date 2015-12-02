// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter;

import android.content.DialogInterface;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.bugreporter:
//            g

class k
    implements android.content.DialogInterface.OnDismissListener
{

    final s a;
    final g b;

    k(g g, s s1)
    {
        b = g;
        a = s1;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!a.isDone())
        {
            a.cancel(false);
        }
    }
}
