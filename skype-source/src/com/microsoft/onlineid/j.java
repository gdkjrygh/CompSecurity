// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;

import android.os.Bundle;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.sts.b;

// Referenced classes of package com.microsoft.onlineid:
//            a, d

public final class j
{

    private final a a;
    private final String b;
    private final String c;
    private final String d;

    j(a a1, b b1)
    {
        this(a1, b1.d(), b1.b(), b1.c());
    }

    private j(a a1, String s, String s1, String s2)
    {
        a = a1;
        b = s;
        c = s1;
        d = s2;
    }

    public final String a()
    {
        return b;
    }

    public final void a(d d1, Bundle bundle)
    {
        a.a(this, d1, bundle);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof j)
            {
                obj = (j)obj;
                flag = flag1;
                if (k.a(c, ((j) (obj)).c))
                {
                    flag = flag1;
                    if (k.a(b, ((j) (obj)).b))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return k.a(c) + k.a(b);
    }
}
