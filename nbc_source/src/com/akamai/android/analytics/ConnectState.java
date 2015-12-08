// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, VisitMetrics

class ConnectState extends States
{

    public ConnectState(int i)
    {
        super(i);
        _cumulativeMetric = true;
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        hashmap.put(CSMAKEYS.connecttime.toString(), Integer.toString(timeSpent(i, j)));
        if (_stateActive)
        {
            hashmap.put(CSMAKEYS.playerstate.toString(), "C");
        }
    }
}
