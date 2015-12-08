// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.ab;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            at

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        at.e(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/google/android/m4b/maps/cg/at$4

/* anonymous class */
    final class at._cls4
        implements com.google.android.m4b.maps.ay.ad.a
    {

        final at a;
        private Runnable b;

        public final void a(boolean flag)
        {
            if (flag)
            {
                ab.a("The Maps API is blocked on this device.");
                at.f(a).execute(new at._cls4._cls1(this));
                return;
            } else
            {
                at.f(a).execute(b);
                return;
            }
        }

            
            {
                a = at1;
                b = runnable;
                super();
            }
    }

}
