// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.facebook.loom.logger:
//            FileManager

class a
    implements Comparator
{

    final FileManager a;

    private static int a(File file, File file1)
    {
        return file.getName().compareTo(file1.getName());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }

    (FileManager filemanager)
    {
        a = filemanager;
        super();
    }
}
