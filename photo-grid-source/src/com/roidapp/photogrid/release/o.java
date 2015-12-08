// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.roidapp.photogrid.release:
//            c

public final class o
    implements Comparator
{

    final c a;

    public o(c c)
    {
        a = c;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        return ((File) (obj)).lastModified() >= ((File) (obj1)).lastModified() ? 1 : -1;
    }
}
