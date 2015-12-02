// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;


// Referenced classes of package com.facebook.backgroundtasks:
//            j

class m
    implements Runnable
{

    final j a;

    m(j j1)
    {
        a = j1;
        super();
    }

    public void run()
    {
        synchronized (j.a(a))
        {
            j.a(a, null);
        }
        j.b(a);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
