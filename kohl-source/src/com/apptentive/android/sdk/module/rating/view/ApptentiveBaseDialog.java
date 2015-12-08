// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.rating.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;

public abstract class ApptentiveBaseDialog extends Dialog
{

    public ApptentiveBaseDialog(Context context, int i)
    {
        super(context);
        requestWindowFeature(1);
        setContentView(i);
        context = getWindow().getAttributes();
        context.width = -1;
        context.height = -1;
        context.gravity = 17;
        getWindow().setAttributes(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0x7f000000));
    }
}
