// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class kyj
    implements android.content.DialogInterface.OnCancelListener
{

    private JsPromptResult a;

    kyj(JsPromptResult jspromptresult)
    {
        a = jspromptresult;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel();
    }
}
