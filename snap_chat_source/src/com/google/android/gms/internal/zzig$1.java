// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzig

static final class zzAl
    implements android.content.nterface.OnCancelListener
{

    final JsResult zzAl;

    public final void onCancel(DialogInterface dialoginterface)
    {
        zzAl.cancel();
    }

    lListener(JsResult jsresult)
    {
        zzAl = jsresult;
        super();
    }
}
