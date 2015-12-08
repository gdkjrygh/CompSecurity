// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import com.c.a.a.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// Referenced classes of package com.c.a.d:
//            b, h

private static final class <init> extends b
{

    private final File a;

    public final InputStream a()
    {
        return new FileInputStream(a);
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 20)).append("Files.asByteSource(").append(s).append(")").toString();
    }

    private ct(File file)
    {
        a = (File)u.a(file);
    }

    ct(File file, byte byte0)
    {
        this(file);
    }
}
