// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            bl, ha, hc, bg, 
//            hf, rd, hg, qa, 
//            hh, hl, hs

final class hb
    implements Runnable
{

    final hs a;
    final ha b;

    hb(ha ha1, hs hs)
    {
        b = ha1;
        a = hs;
        super();
    }

    public final void run()
    {
        bl bl1 = new bl(ha.a(b), ha.b(b), null);
        bl1.a(new hc(this, bl1));
        bl1.a("/jsLoaded", new hf(this, bl1));
        rd rd1 = new rd();
        hg hg1 = new hg(this, bl1, rd1);
        rd1.a(hg1);
        bl1.a("/requestReload", hg1);
        if (ha.f(b).endsWith(".js"))
        {
            bl1.a(ha.f(b));
        } else
        if (ha.f(b).startsWith("<html>"))
        {
            bl1.c(ha.f(b));
        } else
        {
            bl1.b(ha.f(b));
        }
        qa.a.postDelayed(new hh(this, bl1), hl.a);
    }
}
