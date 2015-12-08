// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.ui.toast;

import android.content.Context;
import android.widget.Toast;

public final class Toasts
{

    public static Toast show(Context context, int i)
    {
        return show(context, ((CharSequence) (context.getString(i))));
    }

    public static Toast show(Context context, CharSequence charsequence)
    {
        context = Toast.makeText(context, charsequence, 1);
        context.show();
        return context;
    }
}
