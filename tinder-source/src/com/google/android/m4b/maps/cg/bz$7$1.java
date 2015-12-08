// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.ab;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bz

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        bz.e(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/google/android/m4b/maps/cg/bz$7

/* anonymous class */
    final class bz._cls7
        implements com.google.android.m4b.maps.ay.ad.a
    {

        final bz a;
        private Runnable b;

        public final void a(boolean flag)
        {
            if (flag)
            {
                ab.a("The Maps API is blocked on this device.");
                bz.f(a).execute(new bz._cls7._cls1(this));
                return;
            } else
            {
                bz.f(a).execute(b);
                return;
            }
        }

            
            {
                a = bz1;
                b = runnable;
                super();
            }
    }

}
