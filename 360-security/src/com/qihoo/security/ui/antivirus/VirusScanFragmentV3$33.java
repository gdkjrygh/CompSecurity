// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

class a
    implements FilenameFilter
{

    final String a;
    final VirusScanFragmentV3 b;

    public boolean accept(File file, String s)
    {
        return s.equals(a);
    }

    (VirusScanFragmentV3 virusscanfragmentv3, String s)
    {
        b = virusscanfragmentv3;
        a = s;
        super();
    }
}
