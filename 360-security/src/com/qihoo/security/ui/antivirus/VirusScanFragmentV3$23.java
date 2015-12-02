// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a extends Thread
{

    final VirusScanFragmentV3 a;

    public void run()
    {
        (new Intent("android.intent.action.MAIN", null)).addCategory("android.intent.category.LAUNCHER");
        if (VirusScanFragmentV3.h(a) != null && VirusScanFragmentV3.h(a).getPackageManager() != null)
        {
            List list = VirusScanFragmentV3.h(a).getPackageManager().getInstalledApplications(0);
            if (list.size() > VirusScanFragmentV3.C(a))
            {
                VirusScanFragmentV3.a(a, list.size());
            }
        }
    }

    (VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
