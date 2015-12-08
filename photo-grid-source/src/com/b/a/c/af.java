// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.b.a.c:
//            aa

final class af
    implements FilenameFilter
{

    final String a;
    final aa b;

    af(aa aa, String s)
    {
        b = aa;
        a = s;
        super();
    }

    public final boolean accept(File file, String s)
    {
        return s.startsWith(a);
    }
}
