// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.m;

import java.io.File;

// Referenced classes of package p.m:
//            a

public final class File
{

    final a a;
    private final String b;
    private final long c;
    private final long d[];
    private final File e[];

    public File a(int i)
    {
        return e[i];
    }

    private File(a a1, String s, long l, File afile[], long al[])
    {
        a = a1;
        super();
        b = s;
        c = l;
        e = afile;
        d = al;
    }

    File(a a1, String s, long l, File afile[], long al[], File file)
    {
        this(a1, s, l, afile, al);
    }
}
