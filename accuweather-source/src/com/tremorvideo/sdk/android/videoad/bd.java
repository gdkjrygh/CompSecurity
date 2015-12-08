// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.view.View;

final class bd
    implements android.view.View.OnClickListener
{

    final bc.a a;
    final Dialog b;

    bd(bc.a a1, Dialog dialog)
    {
        a = a1;
        b = dialog;
        super();
    }

    public void onClick(View view)
    {
        if (((Integer)view.getTag()).intValue() == 0)
        {
            a.a(b);
        } else
        {
            if (((Integer)view.getTag()).intValue() == 1)
            {
                a.c(b);
                return;
            }
            if (((Integer)view.getTag()).intValue() == 2)
            {
                a.b(b);
                return;
            }
        }
    }
}
