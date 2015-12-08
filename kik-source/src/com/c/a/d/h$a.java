// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import com.c.a.a.u;
import com.c.a.b.v;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.c.a.d:
//            a, h, g

private static final class <init> extends a
{

    private final File a;
    private final v b;

    public final OutputStream a()
    {
        return new FileOutputStream(a, b.contains(g.a));
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        String s1 = String.valueOf(String.valueOf(b));
        return (new StringBuilder(s.length() + 20 + s1.length())).append("Files.asByteSink(").append(s).append(", ").append(s1).append(")").toString();
    }

    private transient ct(File file, g ag[])
    {
        a = (File)u.a(file);
        b = v.a(ag);
    }

    ct(File file, g ag[], byte byte0)
    {
        this(file, ag);
    }
}
