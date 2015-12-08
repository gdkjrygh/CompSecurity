// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.p;

// Referenced classes of package com.google.android.gms.internal:
//            gi, cp, cq, gm, 
//            hi

public final class co extends gi
{

    final hi a;
    final cq b;
    private final String c;

    co(hi hi, cq cq1, String s)
    {
        a = hi;
        b = cq1;
        c = s;
        p.r().a(this);
    }

    public final void a()
    {
        b.a(c);
        gm.a.post(new Runnable() {

            final co a;

            public final void run()
            {
                p.r().b(a);
            }

            
            {
                a = co.this;
                super();
            }
        });
        return;
        Exception exception;
        exception;
        gm.a.post(new _cls1());
        throw exception;
    }

    public final void b()
    {
        b.b();
    }
}
