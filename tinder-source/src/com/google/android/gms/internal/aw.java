// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.d;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ch, ax, cl, cw, 
//            ay

public final class aw extends ch
{

    final cw a;
    final ay b;
    private final String d;

    aw(cw cw, ay ay, String s)
    {
        a = cw;
        b = ay;
        d = s;
        com.google.android.gms.ads.internal.d.k().a.add(this);
    }

    public final void a()
    {
        cl.a.post(new Runnable() {

            final aw a;

            public final void run()
            {
                ax ax1 = com.google.android.gms.ads.internal.d.k();
                aw aw1 = a;
                ax1.a.remove(aw1);
            }

            
            {
                a = aw.this;
                super();
            }
        });
    }
}
