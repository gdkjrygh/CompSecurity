// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import com.qihoo.security.malware.vo.a;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a extends Thread
{

    final VirusScanFragmentV3 a;

    public void run()
    {
        int ai[] = VirusScanFragmentV3.I(a);
        int ai1[] = VirusScanFragmentV3.b(a);
        int i = VirusScanFragmentV3.J(a);
        VirusScanFragmentV3.b(a, ai[0] + ai1[0] + i);
        if (VirusScanFragmentV3.al(a) == null)
        {
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(a, new a(ai, ai1, i));
            return;
        } else
        {
            VirusScanFragmentV3.al(a).a(ai);
            VirusScanFragmentV3.al(a).b(ai1);
            VirusScanFragmentV3.al(a).a(i);
            return;
        }
    }

    (VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
