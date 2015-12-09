// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import java.io.File;

// Referenced classes of package com.facebook.soloader:
//            SoSource, MinElf, SoLoader

public class DirectorySoSource extends SoSource
{

    protected final File a;
    protected final int b;

    public DirectorySoSource(File file, int i)
    {
        a = file;
        b = i;
    }

    public int a(String s, int i)
    {
        return a(s, i, a);
    }

    protected final int a(String s, int i, File file)
    {
        int j = 0;
        s = new File(file, s);
        if (!s.exists())
        {
            return 0;
        }
        if ((i & 1) != 0 && (b & 2) != 0)
        {
            return 2;
        }
        if ((b & 1) != 0)
        {
            for (file = MinElf.a(s); j < file.length; j++)
            {
                String s1 = file[j];
                if (!s1.startsWith("/"))
                {
                    SoLoader.a(s1, i | 1);
                }
            }

        }
        System.load(s.getAbsolutePath());
        return 1;
    }

    public File a(String s)
    {
        s = new File(a, s);
        if (s.exists())
        {
            return s;
        } else
        {
            return null;
        }
    }
}
