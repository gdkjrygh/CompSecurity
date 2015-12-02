// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

private static class a
    implements com.qihoo.security.malware.V3.a
{

    private final WeakReference a;

    public void a()
    {
        VirusScanFragmentV3 virusscanfragmentv3 = (VirusScanFragmentV3)a.get();
        if (virusscanfragmentv3 != null)
        {
            VirusScanFragmentV3.h(virusscanfragmentv3, true);
        }
    }

    public (VirusScanFragmentV3 virusscanfragmentv3)
    {
        a = new WeakReference(virusscanfragmentv3);
    }
}
