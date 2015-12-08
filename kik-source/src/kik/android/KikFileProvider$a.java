// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package kik.android:
//            KikFileProvider

private final class <init>
    implements Comparator
{

    final KikFileProvider a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        return (int)(((File)obj1).lastModified() - ((File) (obj)).lastModified());
    }

    private (KikFileProvider kikfileprovider)
    {
        a = kikfileprovider;
        super();
    }

    a(KikFileProvider kikfileprovider, byte byte0)
    {
        this(kikfileprovider);
    }
}
