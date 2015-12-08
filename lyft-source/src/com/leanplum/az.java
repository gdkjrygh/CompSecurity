// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Configuration;

// Referenced classes of package com.leanplum:
//            aI

final class az extends aI
{

    az()
    {
    }

    public final Object a(String s)
    {
        if (s.startsWith("mnc"))
        {
            return Integer.getInteger(s.substring(3));
        } else
        {
            return null;
        }
    }

    public final boolean a(Object obj, Configuration configuration)
    {
        return configuration.mnc == ((Integer)obj).intValue();
    }
}
