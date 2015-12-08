// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.bf;
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.hi;

// Referenced classes of package com.google.android.gms.ads.internal:
//            e, c, zzq, p

final class a
    implements android.view.nClickListener
{

    final e a;
    final a b;

    public final void onClick(View view)
    {
        a.a();
    }

    a(a a1, e e1)
    {
        b = a1;
        a = e1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/ads/internal/c$2

/* anonymous class */
    final class c._cls2
        implements Runnable
    {

        final com.google.android.gms.internal.gb.a a;
        final be b;
        final c c;

        public final void run()
        {
            if (a.b.s && c.c.x != null)
            {
                Object obj = null;
                if (a.b.b != null)
                {
                    p.e();
                    obj = gm.a(a.b.b);
                }
                obj = new bf(c, ((String) (obj)), a.b.c);
                c.c.C = 1;
                try
                {
                    c.c.x.a(((com.google.android.gms.internal.bh) (obj)));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.b.b("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
                }
            }
            Object obj1 = new e();
            hi hi1 = c.a(a, ((e) (obj1)));
            ((e) (obj1)).a(new e.b(a, hi1));
            hi1.setOnTouchListener(new c._cls2._cls1(((e) (obj1))));
            hi1.setOnClickListener(new c._cls2._cls2(this, ((e) (obj1))));
            c.c.C = 0;
            obj1 = c.c;
            p.d();
            obj1.h = fc.a(c.c.c, c, a, c.c.d, hi1, c.g, c, b);
        }

            
            {
                c = c1;
                a = a1;
                b = be;
                super();
            }

        // Unreferenced inner class com/google/android/gms/ads/internal/c$2$1

/* anonymous class */
        final class c._cls2._cls1
            implements android.view.View.OnTouchListener
        {

            final e a;
            final c._cls2 b;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                a.a();
                return false;
            }

                    
                    {
                        b = c._cls2.this;
                        a = e1;
                        super();
                    }
        }

    }

}
