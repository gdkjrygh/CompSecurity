// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Configuration;

// Referenced classes of package com.leanplum:
//            aI

final class aD extends aI
{

    aD()
    {
    }

    public final Object a(String s)
    {
        if (s.equals("ldrtl"))
        {
            return Integer.valueOf(128);
        }
        if (s.equals("ldltr"))
        {
            return Integer.valueOf(64);
        } else
        {
            return null;
        }
    }

    public final boolean a(Object obj, Configuration configuration)
    {
        return (configuration.screenLayout & 0xc0) == ((Integer)obj).intValue();
    }
}
