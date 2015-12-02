// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.a:
//            ji

final class jm extends ji
    implements Serializable
{

    final Object a;
    final int b;

    jm(Object obj, int i)
    {
        a = obj;
        b = i;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    public Object a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }
}
