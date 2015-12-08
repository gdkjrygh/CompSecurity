// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.AlertDialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.common:
//            bq

final class bw
    implements android.view.View.OnClickListener
{

    final bq a;

    bw(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void onClick(View view)
    {
        bq.b(a).dismiss();
    }
}
