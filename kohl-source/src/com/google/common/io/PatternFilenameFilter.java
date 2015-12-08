// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PatternFilenameFilter
    implements FilenameFilter
{

    private final Pattern pattern;

    public PatternFilenameFilter(String s)
    {
        this(Pattern.compile(s));
    }

    public PatternFilenameFilter(Pattern pattern1)
    {
        pattern = (Pattern)Preconditions.checkNotNull(pattern1);
    }

    public boolean accept(File file, String s)
    {
        return pattern.matcher(s).matches();
    }
}
