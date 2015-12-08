// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import org.chromium.base.ThreadUtils;
import qww;

// Referenced classes of package org.chromium.base.library_loader:
//            Linker

public class LegacyLinker extends Linker
{

    private LegacyLinker()
    {
    }

    public static void a(long l)
    {
        nativeRunCallbackOnUiThread(l);
    }

    private static native boolean nativeCreateSharedRelro(String s, long l, Linker.LibInfo libinfo);

    private static native boolean nativeLoadLibrary(String s, long l, Linker.LibInfo libinfo);

    private static native boolean nativeLoadLibraryInZipFile(String s, String s1, long l, Linker.LibInfo libinfo);

    private static native void nativeRunCallbackOnUiThread(long l);

    private static native boolean nativeUseSharedRelro(String s, Linker.LibInfo libinfo);

    public static void postCallbackOnMainThread(long l)
    {
        ThreadUtils.b(new qww(l));
    }
}
