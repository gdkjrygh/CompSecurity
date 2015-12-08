// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Configuration;

// Referenced classes of package com.leanplum:
//            aI

final class ay extends aI
{

    ay()
    {
    }

    public final Object a(String s)
    {
        if (s.equals("nonav"))
        {
            return Integer.valueOf(1);
        }
        if (s.equals("dpad"))
        {
            return Integer.valueOf(2);
        }
        if (s.equals("trackball"))
        {
            return Integer.valueOf(3);
        }
        if (s.equals("wheel"))
        {
            return Integer.valueOf(4);
        } else
        {
            return null;
        }
    }

    public final boolean a(Object obj, Configuration configuration)
    {
        return configuration.navigation == ((Integer)obj).intValue();
    }
}
