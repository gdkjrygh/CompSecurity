// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.widget.Toast;

// Referenced classes of package com.flurry.sdk:
//            jo, ih, ij

class it>
    implements Runnable
{

    final ih a;
    final ij b;

    public void run()
    {
        Toast.makeText(jo.a().c(), (new StringBuilder("PulseCallbackReportInfo HTTP Response Code: ")).append(a.e).append(" for url: ").append(a.f()).toString(), 1).show();
    }

    (ij ij, ih ih1)
    {
        b = ij;
        a = ih1;
        super();
    }
}
