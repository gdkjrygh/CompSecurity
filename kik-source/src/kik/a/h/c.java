// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import java.io.File;
import org.c.b;

public class c
{

    public static boolean a(File file, boolean flag, b b1)
    {
        boolean flag1 = true;
        if (file.isFile())
        {
            flag1 = file.delete();
            flag = flag1;
            if (b1 != null)
            {
                b1.a("deleting {}, success: {}", file, Boolean.valueOf(flag1));
                flag = flag1;
            }
        } else
        {
            if (file.isDirectory())
            {
                File afile[] = file.listFiles();
                int j = afile.length;
                int i = 0;
                boolean flag2;
                for (flag1 = true; i < j; flag1 = flag2 & flag1)
                {
                    flag2 = a(afile[i], true, b1);
                    i++;
                }

                if (flag)
                {
                    flag = file.delete();
                    if (b1 != null)
                    {
                        b1.a("deleting {}, success: {}", file, Boolean.valueOf(flag));
                    }
                    return flag & flag1;
                } else
                {
                    return flag1;
                }
            }
            flag = flag1;
            if (file.exists())
            {
                return false;
            }
        }
        return flag;
    }
}
