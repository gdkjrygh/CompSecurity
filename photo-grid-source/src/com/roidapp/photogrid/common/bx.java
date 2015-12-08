// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.common:
//            bq, b

final class bx
    implements android.view.View.OnClickListener
{

    final String a;
    final bq b;

    bx(bq bq1, String s)
    {
        b = bq1;
        a = s;
        super();
    }

    public final void onClick(View view)
    {
        if (bq.c(b))
        {
            if (bq.a(b, "com.android.vending"))
            {
                b.c();
            } else
            {
                b.g();
            }
        } else
        {
            b.g();
        }
        if (bq.d(b))
        {
            com.roidapp.photogrid.common.b.a("Notification/Update/Click/Http");
            bq.e(b);
            return;
        } else
        {
            com.roidapp.photogrid.common.b.a("Update/Http/Click");
            return;
        }
    }
}
