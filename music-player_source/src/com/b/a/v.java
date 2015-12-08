// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.b.a:
//            u

final class v
    implements FilenameFilter
{

    final u a;

    v(u u)
    {
        a = u;
        super();
    }

    public final boolean accept(File file, String s)
    {
        return s.startsWith("um");
    }
}
