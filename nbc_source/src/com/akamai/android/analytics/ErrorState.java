// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, VisitMetrics

class ErrorState extends States
{

    String errorCode;
    int transitionedFrom;

    public ErrorState(int i)
    {
        super(i);
        transitionedFrom = 12;
    }

    public int enter_state(int i, int j, int k, float f)
    {
        transitionedFrom = i;
        return super.enter_state(i, j, k, f);
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (hashmap.containsKey(CSMAKEYS.errorcode.toString()) && errorCode != null)
        {
            hashmap.put(CSMAKEYS.errorcode.toString(), errorCode);
        }
        if (_stateActive && hashmap.containsKey(CSMAKEYS.endofstream.toString()))
        {
            hashmap.put(CSMAKEYS.endofstream.toString(), "1");
        }
        if (!hashmap.containsKey(CSMAKEYS.playerstate.toString()) || !_stateActive) goto _L2; else goto _L1
_L1:
        String s;
        s = "E";
        visitmetrics = s;
        transitionedFrom;
        JVM INSTR tableswitch 0 7: default 148
    //                   0 166
    //                   1 173
    //                   2 180
    //                   3 187
    //                   4 152
    //                   5 194
    //                   6 201
    //                   7 208;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L8:
        break; /* Loop/switch isn't completed */
_L3:
        visitmetrics = s;
_L13:
        hashmap.put(CSMAKEYS.playerstate.toString(), visitmetrics);
_L2:
        return;
_L4:
        visitmetrics = "I";
        continue; /* Loop/switch isn't completed */
_L5:
        visitmetrics = "C";
        continue; /* Loop/switch isn't completed */
_L6:
        visitmetrics = "IB";
        continue; /* Loop/switch isn't completed */
_L7:
        visitmetrics = "PL";
        continue; /* Loop/switch isn't completed */
_L9:
        visitmetrics = "SK";
        continue; /* Loop/switch isn't completed */
_L10:
        visitmetrics = "PS";
        continue; /* Loop/switch isn't completed */
_L11:
        visitmetrics = "RB";
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void setErrorCode(String s)
    {
        errorCode = s;
    }
}
