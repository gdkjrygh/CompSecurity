// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.os.Message;
import com.qihoo.security.malware.vo.a;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class b extends Thread
{

    final boolean a;
    final boolean b;
    final VirusScanFragmentV3 c;

    public void run()
    {
        int ai[] = VirusScanFragmentV3.I(c);
        int ai1[] = VirusScanFragmentV3.b(c);
        int i = VirusScanFragmentV3.J(c);
        VirusScanFragmentV3.b(c, ai[0] + ai1[0] + i);
        if (VirusScanFragmentV3.al(c) == null)
        {
            com.qihoo.security.ui.antivirus.VirusScanFragmentV3.a(c, new a(ai, ai1, i));
        } else
        {
            VirusScanFragmentV3.al(c).a(ai);
            VirusScanFragmentV3.al(c).b(ai1);
            VirusScanFragmentV3.al(c).a(i);
        }
        ai = VirusScanFragmentV3.au(c).ssage();
        ai.obj = VirusScanFragmentV3.al(c);
        ai.what = 2;
        if (a)
        {
            ai.arg1 = 1;
        } else
        {
            ai.arg1 = 0;
        }
        if (b)
        {
            ai.arg2 = 1;
        } else
        {
            ai.arg2 = 0;
        }
        VirusScanFragmentV3.av(c).age(ai);
    }

    (VirusScanFragmentV3 virusscanfragmentv3, boolean flag, boolean flag1)
    {
        c = virusscanfragmentv3;
        a = flag;
        b = flag1;
        super();
    }
}
