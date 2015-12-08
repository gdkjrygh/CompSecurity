// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Configuration;

// Referenced classes of package com.leanplum:
//            aI

final class aq extends aI
{

    aq()
    {
    }

    public final Object a(String s)
    {
        if (s.equals("port"))
        {
            return Integer.valueOf(1);
        }
        if (s.equals("land"))
        {
            return Integer.valueOf(2);
        } else
        {
            return null;
        }
    }

    public final boolean a(Object obj, Configuration configuration)
    {
        return configuration.orientation == ((Integer)obj).intValue();
    }
}
