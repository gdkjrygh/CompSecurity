// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.a.a.c:
//            x

final class ag
    implements FilenameFilter
{

    ag()
    {
    }

    public final boolean accept(File file, String s)
    {
        return x.f().matcher(s).matches();
    }
}
