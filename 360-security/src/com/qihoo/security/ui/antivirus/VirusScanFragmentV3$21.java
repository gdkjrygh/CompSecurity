// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.widget.LinearLayout;
import com.qihoo.security.malware.widget.RadarProgressBar;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements Runnable
{

    final VirusScanFragmentV3 a;

    public void run()
    {
        VirusScanFragmentV3.am(a).b();
        VirusScanFragmentV3.i(a, false);
        VirusScanFragmentV3.an(a);
        VirusScanFragmentV3.ag(a).setVisibility(8);
    }

    (VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = virusscanfragmentv3;
        super();
    }
}
