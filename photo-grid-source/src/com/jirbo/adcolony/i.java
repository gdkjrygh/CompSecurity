// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.File;

class i
{

    i()
    {
    }

    public static boolean a(File file)
    {
        if (file.exists())
        {
            File afile[] = file.listFiles();
            int j = 0;
            while (j < afile.length) 
            {
                if (afile[j].isDirectory())
                {
                    a(afile[j]);
                } else
                {
                    afile[j].delete();
                }
                j++;
            }
        }
        return file.delete();
    }
}
