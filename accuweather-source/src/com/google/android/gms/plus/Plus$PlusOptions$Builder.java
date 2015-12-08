// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.internal.hn;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class 
{

    String abo;
    final Set abp = new HashSet();

    public transient  addActivityTypes(String as[])
    {
        hn.b(as, "activityTypes may not be null.");
        for (int i = 0; i < as.length; i++)
        {
            abp.add(as[i]);
        }

        return this;
    }

    public abp build()
    {
        return new abp(this, null);
    }

    public abp setServerClientId(String s)
    {
        abo = s;
        return this;
    }

    public ()
    {
    }
}
