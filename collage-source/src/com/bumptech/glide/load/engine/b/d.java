// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import java.io.File;

// Referenced classes of package com.bumptech.glide.load.engine.b:
//            e, a

public class d
    implements a.a
{
    public static interface a
    {

        public abstract File a();
    }


    private final int a;
    private final a b;

    public d(a a1, int i)
    {
        a = i;
        b = a1;
    }

    public com.bumptech.glide.load.engine.b.a a()
    {
        File file;
        for (file = b.a(); file == null || !file.mkdirs() && (!file.exists() || !file.isDirectory());)
        {
            return null;
        }

        return e.a(file, a);
    }
}
