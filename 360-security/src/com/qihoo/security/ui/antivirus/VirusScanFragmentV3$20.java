// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a extends Thread
{

    final VirusScanFragmentV3 a;

    public void run()
    {
        SharedPref.a(VirusScanFragmentV3.h(a), "malware_find_issue_time", System.currentTimeMillis());
    }

    (VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
