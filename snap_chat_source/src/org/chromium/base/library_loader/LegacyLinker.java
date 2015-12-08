// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.base.library_loader:
//            Linker

class LegacyLinker extends Linker
{

    private LegacyLinker()
    {
    }

    static void a(long l)
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
        ThreadUtils.b(new Runnable(l) {

            private long a;

            public final void run()
            {
                LegacyLinker.a(a);
            }

            
            {
                a = l;
                super();
            }
        });
    }

    static 
    {
        org/chromium/base/library_loader/LegacyLinker.desiredAssertionStatus();
    }
}
