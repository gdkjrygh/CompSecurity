// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.f;
import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            k, ba, bm, h

public abstract class q
    implements Comparator
{

    public q()
    {
    }

    public static q a(Comparator comparator)
    {
        if (comparator instanceof q)
        {
            return (q)comparator;
        } else
        {
            return new k(comparator);
        }
    }

    public static q b()
    {
        return ba.a;
    }

    public q a()
    {
        return new bm(this);
    }

    public final q a(f f)
    {
        return new h(f, this);
    }

    public abstract int compare(Object obj, Object obj1);
}
