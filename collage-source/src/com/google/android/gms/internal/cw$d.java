// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            hn, cw, ag, af

public static class e extends hn
{

    private final Object d = new Object();
    private final b e;
    private boolean f;

    static e a(e e1)
    {
        return e1.e;
    }

    public void a()
    {
label0:
        {
            synchronized (d)
            {
                if (!f)
                {
                    break label0;
                }
            }
            return;
        }
        f = true;
        a(new hm.c() {

            final cw.d a;

            public void a(af af1)
            {
                zzb.v("Ending javascript session.");
                ((ag)af1).a();
            }

            public void zzc(Object obj1)
            {
                a((af)obj1);
            }

            
            {
                a = cw.d.this;
                super();
            }
        }, ((_cls1.a) (new <init>())));
        a(new hm.c() {

            final cw.d a;

            public void a(af af1)
            {
                zzb.v("Releasing engine reference.");
                cw.d.a(a).b();
            }

            public void zzc(Object obj1)
            {
                a((af)obj1);
            }

            
            {
                a = cw.d.this;
                super();
            }
        }, new hm.a() {

            final cw.d a;

            public void run()
            {
                cw.d.a(a).b();
            }

            
            {
                a = cw.d.this;
                super();
            }
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public _cls3.a(_cls3.a a1)
    {
        e = a1;
    }
}
