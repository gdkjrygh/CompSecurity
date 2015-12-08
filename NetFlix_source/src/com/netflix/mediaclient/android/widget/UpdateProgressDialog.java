// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.app.ProgressDialog;
import android.content.Context;

public class UpdateProgressDialog extends ProgressDialog
{

    public UpdateProgressDialog(Context context)
    {
        super(context);
        setCancelable(false);
    }

    public UpdateProgressDialog(Context context, int i)
    {
        super(context, i);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public boolean onSearchRequested()
    {
        return false;
    }
}
