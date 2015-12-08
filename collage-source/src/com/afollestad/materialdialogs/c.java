// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.afollestad.materialdialogs.internal.MDRootLayout;

class c extends Dialog
    implements android.content.DialogInterface.OnShowListener
{

    protected MDRootLayout a;
    private android.content.DialogInterface.OnShowListener b;

    protected c(Context context, int i)
    {
        super(context, i);
    }

    protected final void a()
    {
        super.setOnShowListener(this);
    }

    protected final void a(View view)
    {
        super.setContentView(view);
    }

    public View findViewById(int i)
    {
        return a.findViewById(i);
    }

    public void onShow(DialogInterface dialoginterface)
    {
        if (b != null)
        {
            b.onShow(dialoginterface);
        }
    }

    public void setContentView(int i)
        throws IllegalAccessError
    {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public void setContentView(View view)
        throws IllegalAccessError
    {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
        throws IllegalAccessError
    {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setOnShowListener(android.content.DialogInterface.OnShowListener onshowlistener)
    {
        b = onshowlistener;
    }
}
