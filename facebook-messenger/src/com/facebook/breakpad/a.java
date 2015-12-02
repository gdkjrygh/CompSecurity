// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.breakpad;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.facebook.breakpad:
//            BreakpadManager

class a
    implements FilenameFilter
{

    final BreakpadManager a;

    a(BreakpadManager breakpadmanager)
    {
        a = breakpadmanager;
        super();
    }

    public boolean accept(File file, String s)
    {
        return s.endsWith(".dmp");
    }
}
