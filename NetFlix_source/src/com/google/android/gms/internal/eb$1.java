// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

// Referenced classes of package com.google.android.gms.internal:
//            eb

static final class rI
    implements android.content.gInterface.OnCancelListener
{

    final JsResult rI;

    public void onCancel(DialogInterface dialoginterface)
    {
        rI.cancel();
    }

    celListener(JsResult jsresult)
    {
        rI = jsresult;
        super();
    }
}
