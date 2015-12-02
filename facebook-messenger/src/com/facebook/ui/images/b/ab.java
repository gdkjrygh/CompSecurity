// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import com.facebook.ui.images.base.a;
import com.google.common.a.es;

// Referenced classes of package com.facebook.ui.images.b:
//            m

public class ab
{

    private final es a;
    private final a b;

    public ab(es es1, a a1)
    {
        a = es1;
        b = a1;
    }

    public static boolean a(ab ab1, ab ab2)
    {
        if (ab1 == null && ab2 == null)
        {
            return true;
        }
        if (ab1 == null || ab2 == null)
        {
            return false;
        } else
        {
            return ab1.a(ab2);
        }
    }

    public es a()
    {
        return a;
    }

    public boolean a(ab ab1)
    {
        if (a.size() == ab1.a.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
_L4:
        if (i >= a.size())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!com.facebook.ui.images.b.m.a((m)a.get(i), (m)ab1.a.get(i))) goto _L1; else goto _L3
_L3:
        i++;
          goto _L4
        if (b != ab1.b) goto _L1; else goto _L5
_L5:
        return true;
    }

    public a b()
    {
        return b;
    }
}
