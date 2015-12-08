// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            c, w, b

public final class d
    implements c
{

    static boolean a = false;
    private int b;
    private int c;

    static void a()
    {
        null;
        JVM INSTR monitorenter ;
        throw new NullPointerException();
        Exception exception;
        exception;
        null;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(b b1)
    {
        a = true;
        null;
        JVM INSTR monitorenter ;
        throw new NullPointerException();
        b1;
        a = false;
        throw b1;
        b1;
        null;
        JVM INSTR monitorexit ;
        throw b1;
    }

    static void b()
    {
        if (!a)
        {
            throw new RuntimeException("Attempt to update live data from outside a Behavior");
        } else
        {
            return;
        }
    }

    public final void a(b b1, w w1)
    {
        j.a(b1, w1);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[w.a.values().length];
                try
                {
                    a[w.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[w.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[w1.a.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 50
    //                   2 65;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException("Unimplemented WakeUpCondition");
_L2:
        null;
        JVM INSTR monitorenter ;
        throw new NullPointerException();
        b1;
        null;
        JVM INSTR monitorexit ;
        throw b1;
_L3:
        null;
        JVM INSTR monitorenter ;
        throw new NullPointerException();
        b1;
        null;
        JVM INSTR monitorexit ;
        throw b1;
    }

}
