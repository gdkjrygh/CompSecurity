// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;

public final class p
{

    public static android.app.AlertDialog.Builder a(Context context, CharSequence charsequence)
    {
        context = new android.app.AlertDialog.Builder(context);
        if (TextUtils.isEmpty(charsequence))
        {
            return context;
        } else
        {
            return context.setMessage(charsequence);
        }
    }

    public static void a(Dialog dialog, String s)
    {
        try
        {
            dialog.dismiss();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            Singleton.b().a(-2002, LogParams.create(dialog.getMessage()).addParam("type", s));
        }
    }
}
