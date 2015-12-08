// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.microsoft.advertising.android:
//            ak

public static final class a
    implements FilenameFilter
{

    private String a;

    public final boolean accept(File file, String s)
    {
        while (!ak.b().equals(file.getAbsolutePath()) || !s.matches((new StringBuilder("^[0-9]+\\.")).append(a).append("$").toString())) 
        {
            return false;
        }
        return true;
    }

    public (String s)
    {
        a = s;
    }
}
