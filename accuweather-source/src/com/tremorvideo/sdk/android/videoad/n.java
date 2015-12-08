// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.DialogInterface;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            l

class n
    implements android.content.DialogInterface.OnCancelListener
{

    final l a;

    n(l l1)
    {
        a = l1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.b.a(a);
    }
}
