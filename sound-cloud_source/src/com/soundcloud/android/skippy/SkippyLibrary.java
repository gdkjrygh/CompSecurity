// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


public final class SkippyLibrary extends Enum
{

    private static final SkippyLibrary $VALUES[];
    public static final SkippyLibrary GSTREAMER;
    public static final SkippyLibrary SKIPPY;
    private final String libraryFileName;
    private final String libraryName;

    private SkippyLibrary(String s, int i, String s1, String s2)
    {
        super(s, i);
        libraryName = s1;
        libraryFileName = s2;
    }

    public static SkippyLibrary valueOf(String s)
    {
        return (SkippyLibrary)Enum.valueOf(com/soundcloud/android/skippy/SkippyLibrary, s);
    }

    public static SkippyLibrary[] values()
    {
        return (SkippyLibrary[])$VALUES.clone();
    }

    public final String getFileName()
    {
        return libraryFileName;
    }

    public final String getLibraryName()
    {
        return libraryName;
    }

    static 
    {
        GSTREAMER = new SkippyLibrary("GSTREAMER", 0, "gstreamer_android", "libgstreamer_android.so");
        SKIPPY = new SkippyLibrary("SKIPPY", 1, "skippy", "libskippy.so");
        $VALUES = (new SkippyLibrary[] {
            GSTREAMER, SKIPPY
        });
    }
}
