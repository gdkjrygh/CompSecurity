// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.internal.o;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class 
{

    String alb;
    final Set alc = new HashSet();

    public transient  addActivityTypes(String as[])
    {
        o.b(as, "activityTypes may not be null.");
        for (int i = 0; i < as.length; i++)
        {
            alc.add(as[i]);
        }

        return this;
    }

    public alc build()
    {
        return new alc(this, null);
    }

    public alc setServerClientId(String s)
    {
        alb = s;
        return this;
    }

    public ()
    {
    }
}
