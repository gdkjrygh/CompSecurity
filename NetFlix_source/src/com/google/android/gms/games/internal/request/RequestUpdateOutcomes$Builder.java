// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            RequestUpdateOutcomes

public static final class Ah
{

    private int Ah;
    private HashMap LO;

    public Ah bm(int i)
    {
        Ah = i;
        return this;
    }

    public RequestUpdateOutcomes hB()
    {
        return new RequestUpdateOutcomes(Ah, LO, null);
    }

    public LO s(String s1, int i)
    {
        if (RequestUpdateResultOutcome.isValid(i))
        {
            LO.put(s1, Integer.valueOf(i));
        }
        return this;
    }

    public Q()
    {
        LO = new HashMap();
        Ah = 0;
    }
}
