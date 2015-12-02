// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;

final class 
{

    public static void fallocate(FileDescriptor filedescriptor, long l)
    {
        try
        {
            Os.posix_fallocate(filedescriptor, 0L, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FileDescriptor filedescriptor)
        {
            throw new IOException(filedescriptor.toString(), filedescriptor);
        }
    }

    public static String[] getSupportedAbis()
    {
        return Build.SUPPORTED_32_BIT_ABIS;
    }

    private ()
    {
    }
}
