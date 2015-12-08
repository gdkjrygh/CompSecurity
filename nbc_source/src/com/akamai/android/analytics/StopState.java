// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, VisitMetrics

class StopState extends States
{

    int _prevStateCode;
    String endReasonCode;

    public StopState(int i)
    {
        super(i);
        _prevStateCode = 12;
    }

    public int enter_state(int i, int j, int k, float f)
    {
        _prevStateCode = i;
        return super.enter_state(i, j, k, f);
    }

    public String getEndReasonCode()
    {
        return endReasonCode;
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (endReasonCode != null)
        {
            hashmap.put(CSMAKEYS.endreasoncode.toString(), endReasonCode);
        }
        if (!hashmap.containsKey(CSMAKEYS.playerstate.toString()) || !_stateActive) goto _L2; else goto _L1
_L1:
        _prevStateCode;
        JVM INSTR tableswitch 0 11: default 108
    //                   0 159
    //                   1 166
    //                   2 173
    //                   3 180
    //                   4 187
    //                   5 194
    //                   6 201
    //                   7 208
    //                   8 108
    //                   9 108
    //                   10 108
    //                   11 215;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L3 _L3 _L3 _L12
_L3:
        visitmetrics = "E";
_L14:
        hashmap.put(CSMAKEYS.playerstate.toString(), visitmetrics);
_L2:
        if (_stateActive && hashmap.containsKey(CSMAKEYS.endofstream.toString()))
        {
            hashmap.put(CSMAKEYS.endofstream.toString(), "1");
        }
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
_L8:
        visitmetrics = "B";
        continue; /* Loop/switch isn't completed */
_L9:
        visitmetrics = "SK";
        continue; /* Loop/switch isn't completed */
_L10:
        visitmetrics = "PS";
        continue; /* Loop/switch isn't completed */
_L11:
        visitmetrics = "RB";
        continue; /* Loop/switch isn't completed */
_L12:
        visitmetrics = "AP";
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void setEndReasonCode(String s)
    {
        endReasonCode = s;
    }
}
