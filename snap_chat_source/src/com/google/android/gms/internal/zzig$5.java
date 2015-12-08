// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzig

static final class zzAm
    implements android.content.nterface.OnClickListener
{

    final JsPromptResult zzAm;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        zzAm.cancel();
    }

    Listener(JsPromptResult jspromptresult)
    {
        zzAm = jspromptresult;
        super();
    }
}
