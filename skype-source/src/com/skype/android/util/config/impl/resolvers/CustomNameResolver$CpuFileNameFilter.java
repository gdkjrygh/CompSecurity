// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl.resolvers;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.util.config.impl.resolvers:
//            CustomNameResolver

private static class <init>
    implements FileFilter
{

    private final Pattern CpuPattern;

    public boolean accept(File file)
    {
        return CpuPattern.matcher(file.getName()).matches();
    }

    private ()
    {
        CpuPattern = Pattern.compile("cpu[0-9]+");
    }

    CpuPattern(CpuPattern cpupattern)
    {
        this();
    }
}
