// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.DialogInterface;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            e, c

class g
    implements android.content.DialogInterface.OnDismissListener
{

    final e a;

    g(e e1)
    {
        a = e1;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        c.b(a.b, false);
        if (c.f(a.b))
        {
            c.a(a.b, false);
        }
    }
}
