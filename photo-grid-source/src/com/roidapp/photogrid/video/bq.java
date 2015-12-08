// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.video:
//            bp, ca

final class bq
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final bp b;

    bq(bp bp1, int i)
    {
        b = bp1;
        a = i;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (bp.b(b) != null)
        {
            bp.c()[a] = false;
            bp.b(b).a(a);
            if (bp.c(b).length == 0)
            {
                bp.a(b);
                return;
            }
        }
    }
}
