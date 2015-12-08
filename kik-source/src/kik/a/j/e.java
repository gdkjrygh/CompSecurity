// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package kik.a.j:
//            a

final class e
    implements FilenameFilter
{

    final String a;
    final a b;

    e(a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    public final boolean accept(File file, String s)
    {
        return s.equals(a);
    }
}
