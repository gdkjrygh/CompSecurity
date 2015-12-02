// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;


// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a extends Thread
{

    final boolean a;
    final VirusScanFragmentV3 b;

    public void run()
    {
        try
        {
            Thread.sleep(2500L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        VirusScanFragmentV3.g(b, a);
    }

    (VirusScanFragmentV3 virusscanfragmentv3, boolean flag)
    {
        b = virusscanfragmentv3;
        a = flag;
        super();
    }
}
