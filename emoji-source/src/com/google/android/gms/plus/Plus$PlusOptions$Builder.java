// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.internal.hm;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class 
{

    String abr;
    final Set abs = new HashSet();

    public transient  addActivityTypes(String as[])
    {
        hm.b(as, "activityTypes may not be null.");
        for (int i = 0; i < as.length; i++)
        {
            abs.add(as[i]);
        }

        return this;
    }

    public abs build()
    {
        return new abs(this, null);
    }

    public abs setServerClientId(String s)
    {
        abr = s;
        return this;
    }

    public ()
    {
    }
}
