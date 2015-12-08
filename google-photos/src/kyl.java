// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class kyl
    implements android.content.DialogInterface.OnClickListener
{

    private JsPromptResult a;
    private EditText b;

    kyl(JsPromptResult jspromptresult, EditText edittext)
    {
        a = jspromptresult;
        b = edittext;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.confirm(b.getText().toString());
    }
}
