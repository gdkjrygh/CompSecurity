// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import com.google.a.a.ad;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.a.c:
//            b

final class o extends b
{

    private final File a;

    private o(File file)
    {
        a = (File)ad.a(file);
    }

    o(File file, byte byte0)
    {
        this(file);
    }

    public final InputStream a()
    {
        return new FileInputStream(a);
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 20)).append("Files.asByteSource(").append(s).append(")").toString();
    }
}
