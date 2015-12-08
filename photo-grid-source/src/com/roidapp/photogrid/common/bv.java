// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.common:
//            bq

final class bv
    implements android.content.DialogInterface.OnDismissListener
{

    final bq a;

    bv(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        bq.a(a);
    }
}
