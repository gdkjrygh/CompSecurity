// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, cs, eb

class ek
    implements bc.a
{

    final eb a;

    ek(eb eb1)
    {
        a = eb1;
        super();
    }

    public void a(Dialog dialog)
    {
        ct.f().a("ENFORCE_PRIVACY", "1");
        dialog.dismiss();
    }

    public void b(Dialog dialog)
    {
        dialog.dismiss();
    }

    public void c(Dialog dialog)
    {
        eb.a(a, "http://www.youradchoices.com/learn.aspx");
        dialog.dismiss();
    }
}
