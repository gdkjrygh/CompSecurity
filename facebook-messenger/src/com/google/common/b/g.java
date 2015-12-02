// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import java.io.File;
import java.io.FileInputStream;

// Referenced classes of package com.google.common.b:
//            i

final class g
    implements i
{

    final File a;

    g(File file)
    {
        a = file;
        super();
    }

    public FileInputStream a()
    {
        return new FileInputStream(a);
    }

    public Object b()
    {
        return a();
    }
}
