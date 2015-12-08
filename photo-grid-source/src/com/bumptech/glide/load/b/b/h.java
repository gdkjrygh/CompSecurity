// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import java.io.File;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            b, i, j, a

public class h
    implements b
{

    private final int a = 0xfa00000;
    private final i b;

    public h(i k)
    {
        b = k;
    }

    public final a a()
    {
        File file;
        for (file = b.a(); file == null || !file.mkdirs() && (!file.exists() || !file.isDirectory());)
        {
            return null;
        }

        return j.a(file, a);
    }
}
