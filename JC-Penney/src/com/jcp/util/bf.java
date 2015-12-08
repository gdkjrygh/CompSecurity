// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.DialogInterface;
import com.jcp.e.s;

final class bf
    implements android.content.DialogInterface.OnClickListener
{

    final s a;

    bf(s s1)
    {
        a = s1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            dialoginterface.dismiss();
            a.s();
            return;

        case -2: 
            a.t();
            dialoginterface.dismiss();
            return;
        }
    }
}
