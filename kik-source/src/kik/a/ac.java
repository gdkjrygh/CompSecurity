// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a;

import java.io.File;
import kik.a.e.q;

public final class ac
    implements q
{

    private final File a;
    private final File b;

    public ac(String s, File file, File file1)
    {
        a = new File(file, s);
        b = new File(file1, s);
        b.mkdir();
    }

    public final File a()
    {
        return a;
    }

    public final File a(String s)
    {
        s = new File(a, s);
        if (s.exists() && s.isDirectory() || s.mkdirs())
        {
            return s;
        } else
        {
            return null;
        }
    }

    public final File b(String s)
    {
        s = new File(new File(a, "files"), s);
        s.mkdirs();
        return s;
    }

    public final File c(String s)
    {
        s = new File(new File(a, "files"), s);
        s.getParentFile().mkdirs();
        return s;
    }
}
