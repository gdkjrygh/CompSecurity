// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.j;

import java.io.File;
import java.io.FilenameFilter;

class d
    implements FilenameFilter
{

    d()
    {
    }

    public boolean accept(File file, String s)
    {
        boolean flag1 = false;
        file = s.substring(0, s.lastIndexOf("."));
        boolean flag = flag1;
        if (file != null)
        {
            flag = flag1;
            if (file.endsWith("_tmp"))
            {
                flag = true;
            }
        }
        return flag;
    }
}
