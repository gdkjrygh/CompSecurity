// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;


// Referenced classes of package com.facebook.prefs.shared:
//            j

class o
    implements Runnable
{

    final j a;

    o(j j1)
    {
        a = j1;
        super();
    }

    public void run()
    {
        synchronized (a)
        {
            j.a(a, false);
        }
        j.b(a);
        return;
        exception;
        j1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
