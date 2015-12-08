// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.fitbit.data.repo:
//            o

class a
    implements Comparator
{

    final o a;

    public int a(File file, File file1)
    {
        return Long.valueOf(file1.lastModified()).compareTo(Long.valueOf(file.lastModified()));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }

    (o o1)
    {
        a = o1;
        super();
    }
}
