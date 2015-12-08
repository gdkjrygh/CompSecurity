// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.imagelib.filter:
//            az

final class bb
    implements android.content.DialogInterface.OnClickListener
{

    final az a;

    bb(az az)
    {
        a = az;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
