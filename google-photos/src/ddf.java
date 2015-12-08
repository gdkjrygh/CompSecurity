// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public class ddf
{

    final File a;

    public ddf(File file)
    {
        a = (File)b.a(file, "file", null);
    }

    public long a()
    {
        return a.getFreeSpace();
    }
}
