// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.common:
//            e, b

final class i
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final e b;

    i(e e1, String s)
    {
        b = e1;
        a = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(e.a(b)).append(a).append("/com.cleanmaster.mguard/Click/Description/Dialog/Cancel").toString());
    }
}
