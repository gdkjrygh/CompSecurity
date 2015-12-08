// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class dmb
{

    public static long a(File file)
    {
        long l = 0L;
        long l1 = l;
        if (file.exists())
        {
            file = file.listFiles();
            l1 = l;
            if (file != null)
            {
                int j = file.length;
                int i = 0;
                do
                {
                    l1 = l;
                    if (i >= j)
                    {
                        break;
                    }
                    File file1 = file[i];
                    if (file1.isDirectory())
                    {
                        l1 = l + a(file1);
                    } else
                    {
                        l1 = l;
                        if (file1.isFile())
                        {
                            l1 = l + file1.length();
                        }
                    }
                    i++;
                    l = l1;
                } while (true);
            }
        }
        return l1;
    }
}
