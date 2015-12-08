// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.internal.jx;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class 
{

    String anr;
    final Set ans = new HashSet();

    public transient  addActivityTypes(String as[])
    {
        jx.b(as, "activityTypes may not be null.");
        for (int i = 0; i < as.length; i++)
        {
            ans.add(as[i]);
        }

        return this;
    }

    public ans build()
    {
        return new ans(this, null);
    }

    public ans setServerClientId(String s)
    {
        anr = s;
        return this;
    }

    public ()
    {
    }
}
