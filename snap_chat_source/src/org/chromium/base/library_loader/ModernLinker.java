// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;


// Referenced classes of package org.chromium.base.library_loader:
//            Linker

class ModernLinker extends Linker
{

    private ModernLinker()
    {
    }

    private static native boolean nativeCreateSharedRelro(String s, long l, String s1, Linker.LibInfo libinfo);

    private static native String nativeGetCpuAbi();

    private static native boolean nativeLoadLibrary(String s, long l, Linker.LibInfo libinfo);

    static 
    {
        org/chromium/base/library_loader/ModernLinker.desiredAssertionStatus();
    }
}
