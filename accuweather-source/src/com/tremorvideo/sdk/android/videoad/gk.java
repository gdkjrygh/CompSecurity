// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.DialogInterface;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gr

final class gk
    implements android.content.DialogInterface.OnCancelListener
{

    final gr a;
    final gj.a b;

    gk(gr gr1, gj.a a1)
    {
        a = gr1;
        b = a1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.a = true;
        b.a(-1, "");
    }
}
