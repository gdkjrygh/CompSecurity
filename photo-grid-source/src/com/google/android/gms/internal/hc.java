// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            bh, qa, hd, hl, 
//            bg, hb

final class hc
    implements bh
{

    final bg a;
    final hb b;

    hc(hb hb, bg bg)
    {
        b = hb;
        a = bg;
        super();
    }

    public final void a()
    {
        qa.a.postDelayed(new hd(this), hl.b);
    }
}
