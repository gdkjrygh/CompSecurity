// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class sp
    implements android.content.DialogInterface.OnCancelListener
{

    final JsPromptResult a;

    sp(JsPromptResult jspromptresult)
    {
        a = jspromptresult;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel();
    }
}
