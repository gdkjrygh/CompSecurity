// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import com.google.a.a.ad;
import com.google.a.b.be;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.a.c:
//            a, k

final class n extends a
{

    private final File a;
    private final be b;

    private transient n(File file, k ak[])
    {
        a = (File)ad.a(file);
        b = be.a(ak);
    }

    n(File file, k ak[], byte byte0)
    {
        this(file, ak);
    }

    public final OutputStream a()
    {
        return new FileOutputStream(a, b.contains(k.a));
    }

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        String s1 = String.valueOf(String.valueOf(b));
        return (new StringBuilder(s.length() + 20 + s1.length())).append("Files.asByteSink(").append(s).append(", ").append(s1).append(")").toString();
    }
}
