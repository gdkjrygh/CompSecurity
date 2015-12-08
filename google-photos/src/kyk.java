// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class kyk
    implements android.content.DialogInterface.OnClickListener
{

    private JsPromptResult a;

    kyk(JsPromptResult jspromptresult)
    {
        a = jspromptresult;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.cancel();
    }
}
