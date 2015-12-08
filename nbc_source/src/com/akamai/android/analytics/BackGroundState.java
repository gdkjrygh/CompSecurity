// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, VisitMetrics

class BackGroundState extends States
{

    public BackGroundState(int i)
    {
        super(i);
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (hashmap.containsKey(CSMAKEYS.backgroundtime.toString()))
        {
            hashmap.put(CSMAKEYS.backgroundtime.toString(), Integer.toString(_timeSpent));
        }
    }
}
