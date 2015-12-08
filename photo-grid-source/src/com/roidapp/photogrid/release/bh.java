// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import com.roidapp.photogrid.common.c;

// Referenced classes of package com.roidapp.photogrid.release:
//            bg

final class bh
    implements android.content.DialogInterface.OnClickListener
{

    final bg a;

    bh(bg bg1)
    {
        a = bg1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (bg.a(a))
        {
            c.a("110", bg.b(a));
        }
    }
}
