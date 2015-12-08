// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

// Referenced classes of package com.google.android.gms.internal:
//            gw

static final class xo
    implements android.content.gInterface.OnClickListener
{

    final JsPromptResult xo;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        xo.cancel();
    }

    ckListener(JsPromptResult jspromptresult)
    {
        xo = jspromptresult;
        super();
    }
}
