// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            w, v, r

final class x
    implements android.content.DialogInterface.OnClickListener
{

    final w a;

    x(w w1)
    {
        a = w1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        r.a(a.b.c, false);
    }
}
