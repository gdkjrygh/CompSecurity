// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, MyPair, VisitMetrics

class SeekState extends States
{

    public SeekState(int i)
    {
        super(i);
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (_stateActive)
        {
            hashmap.put(CSMAKEYS.playerstate.toString(), "SK");
        }
        hashmap.put(CSMAKEYS.seekcount.toString(), Integer.toString(noOfEntries()));
        hashmap.put(CSMAKEYS.seektime.toString(), Integer.toString(timeSpent(i, j)));
        if (!hashmap.containsKey(CSMAKEYS.seekintervalsasstring.toString())) goto _L2; else goto _L1
_L1:
        visitmetrics = "";
        i = 0;
_L6:
        if (i < _endStrHead.size()) goto _L4; else goto _L3
_L3:
        if (visitmetrics.length() > 0)
        {
            hashmap.put(CSMAKEYS.seekintervalsasstring.toString(), visitmetrics.substring(0, visitmetrics.length() - 1));
        }
_L2:
        return;
_L4:
        visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append(Float.toString(((Float)_startStrHead.get(i)).floatValue())).append("-").append(Float.toString(((Float)_endStrHead.get(i)).floatValue())).append(",").toString();
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public ArrayList sessionString(int i, int j, float f)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        i = 0;
        do
        {
            if (i >= _endStrHead.size())
            {
                return arraylist;
            }
            try
            {
                arraylist.add(MyPair.create((new StringBuilder("S(")).append(_startStrHead.get(i)).append(":").append(_startTime.get(i)).append("-").append(_endStrHead.get(i)).append(":").append(_endTime.get(i)).append(")").toString(), (Integer)_startTime.get(i)));
            }
            catch (Exception exception)
            {
                return null;
            }
            i++;
        } while (true);
    }
}
