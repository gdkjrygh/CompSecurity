// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class sn
    implements android.content.DialogInterface.OnClickListener
{

    final JsResult a;

    sn(JsResult jsresult)
    {
        a = jsresult;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.cancel();
    }
}
