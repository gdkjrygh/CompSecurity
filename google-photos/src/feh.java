// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

final class feh
{

    feh()
    {
    }

    final long a(File file)
    {
        long l1;
        if (file.isDirectory())
        {
            file = file.listFiles();
            int j = file.length;
            long l = 0L;
            int i = 0;
            do
            {
                l1 = l;
                if (i >= j)
                {
                    break;
                }
                l1 = a(file[i]);
                i++;
                l = l1 + l;
            } while (true);
        } else
        {
            l1 = file.length();
        }
        return l1;
    }

    final boolean b(File file)
    {
        boolean flag1;
        if (file.isDirectory())
        {
            file = file.listFiles();
            int j = file.length;
            int i = 0;
            boolean flag = true;
            do
            {
                flag1 = flag;
                if (i >= j)
                {
                    break;
                }
                if (b(file[i]) && flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i++;
            } while (true);
        } else
        {
            flag1 = file.delete();
        }
        return flag1;
    }
}
