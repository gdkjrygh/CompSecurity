// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Configuration;

// Referenced classes of package com.leanplum:
//            aI

final class av extends aI
{

    av()
    {
    }

    public final Object a(String s)
    {
        if (s.equals("keysexposed"))
        {
            return Integer.valueOf(1);
        }
        if (s.equals("keyshidden"))
        {
            return Integer.valueOf(2);
        }
        if (s.equals("keyssoft"))
        {
            return Integer.valueOf(0);
        } else
        {
            return null;
        }
    }

    public final boolean a(Object obj, Configuration configuration)
    {
        if (((Integer)obj).intValue() == 0)
        {
            return true;
        }
        return configuration.keyboardHidden == ((Integer)obj).intValue();
    }
}
