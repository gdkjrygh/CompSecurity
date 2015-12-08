// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.a.a:
//            z

final class am
    implements FilenameFilter
{

    private am()
    {
    }

    am(byte byte0)
    {
        this();
    }

    public final boolean accept(File file, String s)
    {
        return !z.a.accept(file, s) && z.f().matcher(s).matches();
    }
}
