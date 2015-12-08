// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

// Referenced classes of package com.google.android.gms.internal:
//            hm

static final class a
    implements android.content.gInterface.OnClickListener
{

    final JsResult a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.confirm();
    }

    ckListener(JsResult jsresult)
    {
        a = jsresult;
        super();
    }
}
