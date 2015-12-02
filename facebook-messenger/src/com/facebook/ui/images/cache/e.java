// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.cache;

import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.ui.images.cache:
//            f, g

public class e
{

    public static final f a;
    public final int b;
    public final int c;
    public final f d;

    public e(g g1)
    {
        Preconditions.checkNotNull(g1.c());
        b = g1.a();
        c = g1.b();
        d = g1.c();
    }

    public static g newBuilder()
    {
        return new g();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (e)obj;
            if (c != ((e) (obj)).c)
            {
                return false;
            }
            if (b != ((e) (obj)).b)
            {
                return false;
            }
            if (d != ((e) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (b * 31 + c) * 17 + d.ordinal();
    }

    static 
    {
        a = f.MemoryUsagePowerOfTwo;
    }
}
