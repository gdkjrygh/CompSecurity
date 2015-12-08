// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.DialogInterface;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            l

class m
    implements android.content.DialogInterface.OnDismissListener
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        a.b.a(a);
    }
}
