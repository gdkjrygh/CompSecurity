// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

// Referenced classes of package com.google.android.gms.internal:
//            zzig

static final class zzAn
    implements android.content.nterface.OnClickListener
{

    final JsPromptResult zzAm;
    final EditText zzAn;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        zzAm.confirm(zzAn.getText().toString());
    }

    Listener(JsPromptResult jspromptresult, EditText edittext)
    {
        zzAm = jspromptresult;
        zzAn = edittext;
        super();
    }
}
