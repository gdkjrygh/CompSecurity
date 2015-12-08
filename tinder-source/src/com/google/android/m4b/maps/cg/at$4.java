// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.ab;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            at

final class b
    implements com.google.android.m4b.maps.ay.b
{

    final at a;
    private Runnable b;

    public final void a(boolean flag)
    {
        if (flag)
        {
            ab.a("The Maps API is blocked on this device.");
            at.f(a).execute(new Runnable() {

                private at._cls4 a;

                public final void run()
                {
                    at.e(a.a);
                }

            
            {
                a = at._cls4.this;
                super();
            }
            });
            return;
        } else
        {
            at.f(a).execute(b);
            return;
        }
    }

    _cls1.a(at at1, Runnable runnable)
    {
        a = at1;
        b = runnable;
        super();
    }
}
