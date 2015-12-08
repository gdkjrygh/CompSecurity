// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import com.google.a.ad;
import com.google.a.af;
import com.google.a.w;
import com.google.a.x;
import java.lang.reflect.Type;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            c

final class t
    implements af, w
{

    private t()
    {
    }

    t(byte byte0)
    {
        this();
    }

    public final x a(Object obj)
    {
        boolean flag;
        if ((c)obj == c.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new ad(Boolean.valueOf(flag));
    }

    public final Object a(x x1, Type type)
    {
        if (x1.h())
        {
            return c.b;
        } else
        {
            return c.c;
        }
    }
}
