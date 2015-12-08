// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.DialogInterface;
import com.roidapp.photogrid.c.d;

// Referenced classes of package com.roidapp.photogrid.common:
//            bq

final class cb
    implements android.content.DialogInterface.OnClickListener
{

    final bq a;

    cb(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(3, null, null, 0);
        d.b();
    }
}
