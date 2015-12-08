// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;

public final class Kl
{

    private static final long MIN_NUM_FREE_BYTES = 10L;
    public static File sExternalCacheDirectory;
    public static File sInternalCacheDirectory;
    public static File sInternalFilesDirectory;

    public static void a(File file, File file1)
    {
        sInternalCacheDirectory = file;
        sExternalCacheDirectory = file1;
    }
}
