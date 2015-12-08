// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.a.a:
//            z

final class ae
    implements FilenameFilter
{

    final String a;
    final z b;

    ae(z z, String s)
    {
        b = z;
        a = s;
        super();
    }

    public final boolean accept(File file, String s)
    {
        return s.startsWith(a);
    }
}
