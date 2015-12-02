// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.qihoo.antivirus.update:
//            d

private static class <init>
    implements FilenameFilter
{

    private boolean a(File file, String s)
    {
        while ((new File(file, s)).isDirectory() || !s.startsWith("v_")) 
        {
            return false;
        }
        return true;
    }

    public boolean accept(File file, String s)
    {
        return a(file, s);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
