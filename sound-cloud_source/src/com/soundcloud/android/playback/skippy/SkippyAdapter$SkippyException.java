// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.skippy;


// Referenced classes of package com.soundcloud.android.playback.skippy:
//            SkippyAdapter

private static class <init> extends Exception
{

    private final String errorCategory;
    private final int line;
    private final String sourceFile;

    public String getMessage()
    {
        return errorCategory;
    }

    public StackTraceElement[] getStackTrace()
    {
        return (new StackTraceElement[] {
            new StackTraceElement(errorCategory, "", sourceFile, line)
        });
    }

    private (String s, int i, String s1)
    {
        errorCategory = s;
        line = i;
        sourceFile = s1;
    }

    sourceFile(String s, int i, String s1, sourceFile sourcefile)
    {
        this(s, i, s1);
    }
}
