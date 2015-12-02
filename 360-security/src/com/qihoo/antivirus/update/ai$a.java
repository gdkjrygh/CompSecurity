// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.qihoo.antivirus.update:
//            ai

private static class <init>
    implements FilenameFilter
{

    public boolean a(String s)
    {
        return s.endsWith(".apk");
    }

    public boolean accept(File file, String s)
    {
        return a(s);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
