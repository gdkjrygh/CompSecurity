// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jx

public final class kc
{

    private final List a = new ArrayList();

    public kc()
    {
    }

    public final kc a(jx jx1)
        throws IllegalArgumentException
    {
        y.a(jx1);
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((jx)iterator.next()).a().equals(jx1.a()))
            {
                throw new IllegalArgumentException((new StringBuilder("The container is already being requested. ")).append(jx1.a()).toString());
            }
        }

        a.add(jx1);
        return this;
    }

    public final List a()
    {
        return a;
    }

    public final String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = a.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            jx jx1 = (jx)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("#");
            }
            stringbuilder.append(jx1.a());
        }
        return stringbuilder.toString();
    }
}
