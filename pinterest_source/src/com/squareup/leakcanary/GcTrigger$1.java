// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.leakcanary;


// Referenced classes of package com.squareup.leakcanary:
//            GcTrigger

final class 
    implements GcTrigger
{

    public final void runGc()
    {
        Runtime.getRuntime().gc();
        try
        {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new AssertionError();
        }
        System.runFinalization();
    }

    ()
    {
    }
}
