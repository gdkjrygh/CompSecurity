// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            RequestUpdateOutcomes

public static final class HF
{

    private int HF;
    private HashMap abt;

    public HF dR(int i)
    {
        HF = i;
        return this;
    }

    public RequestUpdateOutcomes ly()
    {
        return new RequestUpdateOutcomes(HF, abt, null);
    }

    public abt x(String s, int i)
    {
        if (RequestUpdateResultOutcome.isValid(i))
        {
            abt.put(s, Integer.valueOf(i));
        }
        return this;
    }

    public Q()
    {
        abt = new HashMap();
        HF = 0;
    }
}
