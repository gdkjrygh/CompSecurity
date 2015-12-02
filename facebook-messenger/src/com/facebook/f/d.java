// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;

import com.facebook.common.w.q;
import com.facebook.prefs.shared.ae;

// Referenced classes of package com.facebook.f:
//            n

public class d extends com.facebook.inject.d
{

    private final ae a;

    public d(String s)
    {
        a = n.a(s);
    }

    public q a()
    {
        Object obj = (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d);
        if (!((com.facebook.prefs.shared.d) (obj)).a())
        {
            return q.UNSET;
        }
        obj = ((com.facebook.prefs.shared.d) (obj)).c(a);
        if (obj instanceof Boolean)
        {
            if (((Boolean)obj).booleanValue())
            {
                return q.YES;
            } else
            {
                return q.NO;
            }
        } else
        {
            return q.UNSET;
        }
    }

    public Object b()
    {
        return a();
    }
}
