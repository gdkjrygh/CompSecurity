// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            RequestUpdateOutcomes

public static final class Iv
{

    private int Iv;
    private HashMap adm;

    public Iv ek(int i)
    {
        Iv = i;
        return this;
    }

    public RequestUpdateOutcomes mF()
    {
        return new RequestUpdateOutcomes(Iv, adm, null);
    }

    public adm z(String s, int i)
    {
        if (RequestUpdateResultOutcome.isValid(i))
        {
            adm.put(s, Integer.valueOf(i));
        }
        return this;
    }

    public Q()
    {
        adm = new HashMap();
        Iv = 0;
    }
}
