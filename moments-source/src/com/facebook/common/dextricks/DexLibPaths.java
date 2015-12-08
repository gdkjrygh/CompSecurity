// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import java.io.File;

class DexLibPaths
{

    private final PathTransformer a;

    DexLibPaths(PathTransformer pathtransformer)
    {
        a = pathtransformer;
    }

    final File a()
    {
        return a.a("secondary_program_dex");
    }

    final File b()
    {
        return a.a("secondary_program_dex_opt");
    }

    private class PathTransformer
    {

        public abstract File a(String s);
    }

}
