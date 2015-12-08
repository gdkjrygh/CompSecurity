// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;


// Referenced classes of package com.pandora.android.widget:
//            e, c

public class d
{

    private static volatile c a;
    private static Object b = new Object();

    public static c a()
    {
        if (a == null)
        {
            a = new e();
        }
        return a;
    }

    public static void b()
    {
        synchronized (b)
        {
            if (a != null)
            {
                a().d();
            }
            a = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
