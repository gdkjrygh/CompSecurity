// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

public final class u extends Dialog
{

    public u(Context context)
    {
        super(context, 0x7f0b016b);
        getWindow().setFlags(1024, 1024);
        getWindow().setLayout(-1, -1);
        setContentView(0x7f0300ab);
    }
}
