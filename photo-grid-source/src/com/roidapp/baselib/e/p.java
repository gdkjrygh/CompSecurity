// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import android.content.DialogInterface;

final class p
    implements android.content.DialogInterface.OnClickListener
{

    final android.content.DialogInterface.OnClickListener a;

    p(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a = onclicklistener;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (a != null)
        {
            a.onClick(dialoginterface, i);
        }
    }
}
