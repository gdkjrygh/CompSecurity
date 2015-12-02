// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import java.io.File;
import java.io.FileOutputStream;

// Referenced classes of package com.google.common.b:
//            j

final class h
    implements j
{

    final File a;
    final boolean b;

    h(File file, boolean flag)
    {
        a = file;
        b = flag;
        super();
    }

    public FileOutputStream a()
    {
        return new FileOutputStream(a, b);
    }

    public Object b()
    {
        return a();
    }
}
