// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.DialogInterface;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            eb

class ev
    implements android.content.DialogInterface.OnDismissListener
{

    final eb a;

    ev(eb eb1)
    {
        a = eb1;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        eb.a(a, true);
    }
}
