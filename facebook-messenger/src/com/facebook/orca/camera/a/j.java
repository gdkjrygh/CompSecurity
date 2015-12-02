// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import java.util.Comparator;

// Referenced classes of package com.facebook.orca.camera.a:
//            k, h

class j
    implements Comparator
{

    private j()
    {
    }

    j(h h)
    {
        this();
    }

    public int a(k k1, k k2)
    {
        if (k1.b != k2.b)
        {
            return k1.b >= k2.b ? -1 : 1;
        } else
        {
            return k1.a - k2.a;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((k)obj, (k)obj1);
    }
}
