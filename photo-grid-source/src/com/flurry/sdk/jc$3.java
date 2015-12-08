// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.flurry.sdk:
//            jc

class it>
    implements FilenameFilter
{

    final jc a;

    public boolean accept(File file, String s)
    {
        return s.startsWith(".flurryagent.");
    }

    er(jc jc)
    {
        a = jc;
        super();
    }
}
