// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ch

final class ck
    implements android.content.DialogInterface.OnClickListener
{

    final ch a;

    ck(ch ch)
    {
        a = ch;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
