// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import dalvik.system.DexFile;

final class DexFileLoadOld
{

    DexFileLoadOld()
    {
    }

    public static Class a(DexFile dexfile, String s, ClassLoader classloader)
    {
        return dexfile.loadClassBinaryName(s, classloader);
    }
}
