// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            hd, cu, ae, af

public static final class e extends hd
{

    private final Object d = new Object();
    private final b e;
    private boolean f;

    static e a(e e1)
    {
        return e1.e;
    }

    public final void a()
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
        a(new hc.c() {

            final cu.d a;

            public final void a(Object obj1)
            {
                obj1 = (ae)obj1;
                b.a(2);
                ((af)obj1).a();
            }

            
            {
                a = cu.d.this;
                super();
            }
        }, ((til.client.b.a) (new <init>())));
        a(new hc.c() {

            final cu.d a;

            public final void a(Object obj1)
            {
                b.a(2);
                cu.d.a(a).b();
            }

            
            {
                a = cu.d.this;
                super();
            }
        }, new hc.a() {

            final cu.d a;

            public final void a()
            {
                cu.d.a(a).b();
            }

            
            {
                a = cu.d.this;
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
