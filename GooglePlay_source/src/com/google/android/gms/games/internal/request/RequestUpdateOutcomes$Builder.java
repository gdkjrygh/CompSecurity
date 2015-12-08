// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            RequestUpdateOutcomes

public static final class mStatusCode
{

    public HashMap mOutcomeMap;
    public int mStatusCode;

    public final mStatusCode addRequestOutcome(String s, int i)
    {
        i;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 53
    //                   1 53
    //                   2 53
    //                   3 53;
           goto _L1 _L2 _L2 _L2 _L2
_L1:
        boolean flag = false;
_L4:
        if (flag)
        {
            mOutcomeMap.put(s, Integer.valueOf(i));
        }
        return this;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final RequestUpdateOutcomes build()
    {
        return new RequestUpdateOutcomes(mStatusCode, mOutcomeMap, (byte)0);
    }

    public Q()
    {
        mOutcomeMap = new HashMap();
        mStatusCode = 0;
    }
}
