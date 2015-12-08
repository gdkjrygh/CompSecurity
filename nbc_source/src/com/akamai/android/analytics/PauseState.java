// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, MyPair, VisitMetrics

class PauseState extends States
{

    ArrayList entryDueToPauseSeekSess;
    ArrayList exitDueToPauseSeekSess;

    public PauseState(int i)
    {
        super(i);
        entryDueToPauseSeekSess = new ArrayList();
        exitDueToPauseSeekSess = new ArrayList();
    }

    public int enter_state(int i, int j, int k, float f)
    {
        entryDueToPauseSeekSess.add(Boolean.valueOf(false));
        return super.enter_state(i, j, k, f);
    }

    public int exit_state(int i, int j, int k, float f)
    {
        exitDueToPauseSeekSess.add(Boolean.valueOf(false));
        return super.exit_state(i, j, k, f);
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (_stateActive)
        {
            hashmap.put(CSMAKEYS.playerstate.toString(), "PS");
        }
        if (!hashmap.containsKey(CSMAKEYS.pausecount.toString())) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        l = 0;
        k = 0;
_L18:
        if (k < entryDueToPauseSeekSess.size()) goto _L4; else goto _L3
_L3:
        hashmap.put(CSMAKEYS.pausecount.toString(), Integer.toString(l));
_L2:
        hashmap.put(CSMAKEYS.pauseduration.toString(), Integer.toString(timeSpent(i, j)));
        if (!hashmap.containsKey(CSMAKEYS.pauseintervalsasstring.toString())) goto _L6; else goto _L5
_L5:
        visitmetrics = "";
        i = 0;
_L15:
        if (i < _endStrHead.size()) goto _L8; else goto _L7
_L7:
        if (visitmetrics.length() <= 0) goto _L10; else goto _L9
_L9:
        visitmetrics = visitmetrics.substring(0, visitmetrics.length() - 1);
_L16:
        hashmap.put(CSMAKEYS.pauseintervalsasstring.toString(), visitmetrics);
        return;
_L4:
        int i1 = l;
        if (((Boolean)entryDueToPauseSeekSess.get(k)).booleanValue()) goto _L12; else goto _L11
_L11:
        if (k != 0) goto _L14; else goto _L13
_L13:
        i1 = l;
        if (_stateEnteredBeforeReset) goto _L12; else goto _L14
_L8:
        visitmetrics = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(visitmetrics))).append(Float.toString(((Float)_startStrHead.get(i)).floatValue())).append(":").toString()))).append(Integer.toString(((Integer)_endTime.get(i)).intValue() - ((Integer)_startTime.get(i)).intValue())).append(",").toString();
        i++;
          goto _L15
_L10:
        visitmetrics = "-";
          goto _L16
        hashmap;
_L6:
        return;
_L14:
        i1 = l + 1;
_L12:
        k++;
        l = i1;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public void lastEntryDueToPauseSeekSess()
    {
        if (entryDueToPauseSeekSess.size() > 0 && _stateActive)
        {
            entryDueToPauseSeekSess.set(entryDueToPauseSeekSess.size() - 1, Boolean.valueOf(true));
        }
    }

    public void lastExitDueToPauseSeekSess()
    {
        if (!_stateActive && exitDueToPauseSeekSess.size() > 0)
        {
            exitDueToPauseSeekSess.set(exitDueToPauseSeekSess.size() - 1, Boolean.valueOf(true));
        }
    }

    public boolean reset(int i, int j, float f, VisitMetrics visitmetrics)
    {
        boolean flag = false;
        if (_stateActive)
        {
            flag = ((Boolean)entryDueToPauseSeekSess.get(entryDueToPauseSeekSess.size() - 1)).booleanValue();
        }
        entryDueToPauseSeekSess.clear();
        exitDueToPauseSeekSess.clear();
        super.reset(i, j, f, visitmetrics);
        if (_stateActive)
        {
            entryDueToPauseSeekSess.add(Boolean.valueOf(flag));
        }
        return true;
    }

    public ArrayList sessionString(int i, int j, float f)
    {
        ArrayList arraylist = new ArrayList();
        i = 0;
        do
        {
            if (i >= _startStrHead.size())
            {
                return arraylist;
            }
            if (i != 0 || !_stateEnteredBeforeReset)
            {
                arraylist.add(MyPair.create((new StringBuilder("P(")).append(_startStrHead.get(i)).append(":").append(_startTime.get(i)).append(")").toString(), (Integer)_startTime.get(i)));
            }
            if (_endStrHead.size() > i && !((Boolean)exitDueToPauseSeekSess.get(i)).booleanValue())
            {
                arraylist.add(MyPair.create((new StringBuilder("R(")).append(_endStrHead.get(i)).append(":").append(_endTime.get(i)).append(")").toString(), (Integer)_startTime.get(i)));
            }
            i++;
        } while (true);
    }
}
