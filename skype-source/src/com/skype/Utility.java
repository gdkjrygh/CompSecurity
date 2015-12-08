// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.content.Context;

// Referenced classes of package com.skype:
//            NativeStringConvert, LibraryLoaderHelper

public class Utility
{

    public Utility()
    {
    }

    public static native void enableDeadlockMonitor();

    public static native void initMedia();

    private static native void initRootTools(Context context, byte abyte0[], byte abyte1[]);

    public static void initialize(Context context, String s, String s1)
    {
        initialize(context, null, s, s1);
    }

    public static void initialize(Context context, String s, String s1, String s2)
    {
        try
        {
            System.loadLibrary("gnustl_shared");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror) { }
        if (s == null)
        {
            System.loadLibrary("SkyLib");
        } else
        {
            tryToLoadLibrary(context, (new StringBuilder("SkyLib-Version-")).append(s.replaceAll("\\.", "-")).toString());
        }
        initializeManuallyLoadedLibrary(context, s1, s2);
    }

    private static native void initializeEnums();

    public static void initializeManuallyLoadedLibrary(Context context, String s, String s1)
    {
        initializeEnums();
        initRootTools(context, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    private static void tryToLoadLibrary(Context context, String s)
    {
        context = new LibraryLoaderHelper(context, new String[] {
            s
        });
        try
        {
            System.loadLibrary(s);
            context.cleanup(s);
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            unpackAndLoadLibrary(context, s);
        }
    }

    private static void unpackAndLoadLibrary(LibraryLoaderHelper libraryloaderhelper, String s)
    {
        if (!libraryloaderhelper.loadNativeLibrary(s))
        {
            throw new RuntimeException((new StringBuilder("Cannot dynamically load ")).append(s).toString());
        } else
        {
            return;
        }
    }
}
