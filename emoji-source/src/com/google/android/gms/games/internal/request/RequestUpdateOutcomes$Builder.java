// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            RequestUpdateOutcomes

public static final class CT
{

    private int CT;
    private HashMap So;

    public CT cw(int i)
    {
        CT = i;
        return this;
    }

    public RequestUpdateOutcomes iy()
    {
        return new RequestUpdateOutcomes(CT, So, null);
    }

    public So v(String s, int i)
    {
        if (RequestUpdateResultOutcome.isValid(i))
        {
            So.put(s, Integer.valueOf(i));
        }
        return this;
    }

    public Q()
    {
        So = new HashMap();
        CT = 0;
    }
}
