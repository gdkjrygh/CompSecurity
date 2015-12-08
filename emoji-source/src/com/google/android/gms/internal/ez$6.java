// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

// Referenced classes of package com.google.android.gms.internal:
//            ez

static final class sR
    implements android.content.gInterface.OnClickListener
{

    final JsPromptResult sQ;
    final EditText sR;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        sQ.confirm(sR.getText().toString());
    }

    ckListener(JsPromptResult jspromptresult, EditText edittext)
    {
        sQ = jspromptresult;
        sR = edittext;
        super();
    }
}
