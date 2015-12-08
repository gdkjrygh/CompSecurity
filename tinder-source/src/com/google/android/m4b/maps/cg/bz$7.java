// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.ab;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bz

final class b
    implements com.google.android.m4b.maps.ay.b
{

    final bz a;
    private Runnable b;

    public final void a(boolean flag)
    {
        if (flag)
        {
            ab.a("The Maps API is blocked on this device.");
            bz.f(a).execute(new Runnable() {

                private bz._cls7 a;

                public final void run()
                {
                    bz.e(a.a);
                }

            
            {
                a = bz._cls7.this;
                super();
            }
            });
            return;
        } else
        {
            bz.f(a).execute(b);
            return;
        }
    }

    _cls1.a(bz bz1, Runnable runnable)
    {
        a = bz1;
        b = runnable;
        super();
    }
}
