// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.au;

import java.io.File;

// Referenced classes of package com.google.android.m4b.maps.au:
//            a

public static final class a
{

    private File a;

    public final a a(String s)
    {
        File file = a;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "cache_".concat(s);
        } else
        {
            s = new String("cache_");
        }
        return new a(new File(file, s), "rw");
    }

    public final void b(String s)
    {
        File file = a;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "cache_".concat(s);
        } else
        {
            s = new String("cache_");
        }
        s = new File(file, s);
        if (s.exists())
        {
            s.delete();
        }
    }

    public (File file)
    {
        a = file;
    }
}
