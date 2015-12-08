// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.internal.fq;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class 
{

    String TJ;
    final Set TK = new HashSet();

    public transient  addActivityTypes(String as[])
    {
        fq.b(as, "activityTypes may not be null.");
        for (int i = 0; i < as.length; i++)
        {
            TK.add(as[i]);
        }

        return this;
    }

    public TK build()
    {
        return new TK(this, null);
    }

    public TK setServerClientId(String s)
    {
        TJ = s;
        return this;
    }

    public ()
    {
    }
}
