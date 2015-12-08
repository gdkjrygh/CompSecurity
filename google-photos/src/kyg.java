// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.webkit.JsResult;

final class kyg
    implements android.content.DialogInterface.OnCancelListener
{

    private JsResult a;

    kyg(JsResult jsresult)
    {
        a = jsresult;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel();
    }
}
