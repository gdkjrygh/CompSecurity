// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            rr, hp, rp, hq, 
//            hr, hs

public final class ho extends rr
{

    private final Object d = new Object();
    private final hs e;
    private boolean f;

    public ho(hs hs)
    {
        e = hs;
    }

    static hs a(ho ho1)
    {
        return ho1.e;
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
        a(((rq) (new hp(this))), ((ro) (new rp())));
        a(((rq) (new hq(this))), ((ro) (new hr(this))));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
