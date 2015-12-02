// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;


// Referenced classes of package com.facebook.systrace:
//            SystraceMetadata

final class 
    implements Runnable
{

    public final void run()
    {
        SystraceMetadata.c();
        try
        {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedexception) { }
        SystraceMetadata.f();
        SystraceMetadata.g();
        if (!SystraceMetadata.h())
        {
            return;
        } else
        {
            SystraceMetadata.i();
            return;
        }
    }

    ()
    {
    }
}
