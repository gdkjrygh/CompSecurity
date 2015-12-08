// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            States, InternalCodes, CSMAKEYS, VisitMetrics

class RebufferState extends States
{

    private ArrayList _hLineRebufferEndTime;
    private ArrayList _hLineRebufferStartTime;
    int _timeAtFirstRebufferSinceReset;
    int _timeAtLastRebuffer;
    int _timeAtLastRebufferBeforeReset;
    String isSessionWithRebufferH;
    int totalRebufferCount;
    int totalRebufferTime;

    public RebufferState(int i)
    {
        super(i);
        _timeAtLastRebufferBeforeReset = -1;
        _timeAtFirstRebufferSinceReset = -1;
        _timeAtLastRebuffer = -1;
        isSessionWithRebufferH = "-";
        _cumulativeMetric = false;
        totalRebufferCount = 0;
        totalRebufferTime = 0;
        _hLineRebufferStartTime = new ArrayList();
        _hLineRebufferEndTime = new ArrayList();
    }

    public int enter_state(int i, int j, int k, float f)
    {
        if (_timeAtFirstRebufferSinceReset == -1)
        {
            _timeAtFirstRebufferSinceReset = k;
        }
        _hLineRebufferStartTime.add(new Integer(k));
        return super.enter_state(i, j, k, f);
    }

    public int exit_state(int i, int j, int k, float f)
    {
        _timeAtLastRebuffer = k;
        _hLineRebufferEndTime.add(new Integer(k));
        return super.exit_state(i, j, k, f);
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        int k;
        int j1;
        int i1 = InternalCodes.DEFAULT_HEARTBEAT_INTERVAL;
        k = InternalCodes.DEFAULT_ISSESSIONWITHREBUFFER_LIMIT;
        int l = i1;
        VisitMetrics visitmetrics1;
        int k1;
        long l1;
        if (hashmap.containsKey(CSMAKEYS.heartbeatinterval.toString()))
        {
            try
            {
                l = Integer.parseInt((String)hashmap.get(CSMAKEYS.heartbeatinterval.toString()));
            }
            // Misplaced declaration of an exception variable
            catch (VisitMetrics visitmetrics)
            {
                l = i1;
            }
        }
        i1 = k;
        if (hashmap.containsKey(CSMAKEYS.issessionwithrebufferlimit.toString()))
        {
            try
            {
                i1 = Integer.parseInt((String)hashmap.get(CSMAKEYS.issessionwithrebufferlimit.toString()));
            }
            // Misplaced declaration of an exception variable
            catch (VisitMetrics visitmetrics)
            {
                i1 = k;
            }
        }
        if (_stateActive)
        {
            hashmap.put(CSMAKEYS.playerstate.toString(), "B");
        }
        hashmap.put(CSMAKEYS.rebuffercount.toString(), Integer.toString(noOfEntries()));
        hashmap.put(CSMAKEYS.rebuffertime.toString(), Integer.toString(timeSpent(i, j)));
        if (!hashmap.containsKey(CSMAKEYS.rebuffersessionh.toString()) && !hashmap.containsKey(CSMAKEYS.issessionwithrebufferh.toString())) goto _L2; else goto _L1
_L1:
        k = 0;
_L20:
        if (k < _hLineRebufferEndTime.size()) goto _L4; else goto _L3
_L3:
        visitmetrics = "";
        k = 0;
_L21:
        if (k < _hLineRebufferEndTime.size()) goto _L6; else goto _L5
_L5:
        visitmetrics1 = visitmetrics;
        if (_hLineRebufferStartTime.size() != _hLineRebufferEndTime.size() + 1)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        k = _hLineRebufferStartTime.size() - 1;
        visitmetrics = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(visitmetrics))).append(Integer.toString(j - ((Integer)_hLineRebufferStartTime.get(k)).intValue())).toString()))).append(":").toString()))).append(Integer.toString(j - ((Integer)_hLineRebufferStartTime.get(k)).intValue())).toString()))).append(";").toString();
        visitmetrics1 = visitmetrics;
        if (!isSessionWithRebufferH.equals("-"))
        {
            break MISSING_BLOCK_LABEL_396;
        }
        visitmetrics1 = visitmetrics;
        if (j - ((Integer)_hLineRebufferStartTime.get(k)).intValue() < i1)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        isSessionWithRebufferH = "1";
        visitmetrics1 = visitmetrics;
        if (visitmetrics1.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_1270;
        }
        visitmetrics = visitmetrics1.substring(0, visitmetrics1.length() - 1);
_L22:
        hashmap.put(CSMAKEYS.rebuffersessionh.toString(), visitmetrics);
        if (!isSessionWithRebufferH.equals("1")) goto _L8; else goto _L7
_L7:
        hashmap.put(CSMAKEYS.issessionwithrebufferh.toString(), isSessionWithRebufferH);
_L2:
        if (!hashmap.containsKey(CSMAKEYS.rebuffersession.toString()) && !hashmap.containsKey(CSMAKEYS.issessionwithrebuffer.toString())) goto _L10; else goto _L9
_L9:
        k = 0;
        l = 0;
        l1 = j - i;
        if (_startTime.size() <= 0) goto _L12; else goto _L11
_L11:
        if (_stateEnteredBeforeReset)
        {
            visitmetrics = "1:0;";
        } else
        if (_timeAtLastRebufferBeforeReset == -1)
        {
            visitmetrics = "0:-1;";
        } else
        {
            visitmetrics = (new StringBuilder("0:")).append(Integer.toString(_timeAtFirstRebufferSinceReset - _timeAtLastRebufferBeforeReset)).append(";").toString();
        }
        j1 = 0;
        k = l;
_L19:
        if (j1 < _startTime.size()) goto _L14; else goto _L13
_L13:
        if (visitmetrics.length() > 0)
        {
            visitmetrics = visitmetrics.substring(0, visitmetrics.length() - 1);
        } else
        {
            visitmetrics = "-";
        }
        hashmap.put(CSMAKEYS.rebuffersession.toString(), visitmetrics);
_L12:
        if (k != 0)
        {
            hashmap.put(CSMAKEYS.issessionwithrebuffer.toString(), "1");
        } else
        {
            hashmap.remove(CSMAKEYS.issessionwithrebuffer.toString());
        }
_L10:
        hashmap.put(CSMAKEYS.totalrebuffercount.toString(), Integer.toString(totalRebufferCount + noOfEntries()));
        hashmap.put(CSMAKEYS.totalrebuffertime.toString(), Integer.toString(totalRebufferTime + timeSpent(i, j)));
        return;
_L4:
        j1 = k;
        if (j - ((Integer)_hLineRebufferEndTime.get(k)).intValue() <= l * 2) goto _L16; else goto _L15
_L15:
        _hLineRebufferEndTime.remove(k);
        _hLineRebufferStartTime.remove(k);
        k--;
        j1 = k;
        if (isSessionWithRebufferH != "1") goto _L16; else goto _L17
_L17:
        isSessionWithRebufferH = "0";
        j1 = k;
          goto _L16
_L6:
        visitmetrics = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(visitmetrics))).append(Integer.toString(j - ((Integer)_hLineRebufferStartTime.get(k)).intValue())).toString()))).append(":").toString()))).append(Integer.toString(((Integer)_hLineRebufferEndTime.get(k)).intValue() - ((Integer)_hLineRebufferStartTime.get(k)).intValue())).toString()))).append(";").toString();
        if (isSessionWithRebufferH.equals("-") && ((Integer)_hLineRebufferEndTime.get(k)).intValue() - ((Integer)_hLineRebufferStartTime.get(k)).intValue() >= i1)
        {
            isSessionWithRebufferH = "1";
        }
          goto _L18
_L8:
        try
        {
            hashmap.remove(CSMAKEYS.issessionwithrebufferh.toString());
        }
        // Misplaced declaration of an exception variable
        catch (VisitMetrics visitmetrics) { }
          goto _L2
_L14:
        if ((long)((Integer)_startTime.get(j1)).intValue() < l1)
        {
            visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append(Long.toString(l1 - l1)).append(":").toString();
        } else
        {
            visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append(Long.toString((long)((Integer)_startTime.get(j1)).intValue() - l1)).append(":").toString();
        }
        if (_endTime.size() <= j1)
        {
            l = j - ((Integer)_startTime.get(j1)).intValue();
        } else
        {
            l = ((Integer)_endTime.get(j1)).intValue() - ((Integer)_startTime.get(j1)).intValue();
        }
        k1 = l;
        if (j1 == 0)
        {
            k1 = l - _timeSpentInTransitionBeforeReset;
        }
        visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append(Integer.toString(k1)).append(";").toString();
        if (k1 >= i1)
        {
            k = 1;
        }
        j1++;
          goto _L19
_L16:
        k = j1 + 1;
          goto _L20
_L18:
        k++;
          goto _L21
        visitmetrics = "-";
          goto _L22
    }

    public boolean reset(int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (visitmetrics != null)
        {
            synchronized (visitmetrics.visitLock)
            {
                visitmetrics.visitRebufferCount = visitmetrics.visitRebufferCount + noOfEntries();
                visitmetrics.visitRebufferTime = visitmetrics.visitRebufferTime + timeSpent(i, j);
            }
        }
        totalRebufferCount = totalRebufferCount + noOfEntries();
        totalRebufferTime = totalRebufferTime + timeSpent(i, j);
        _timeAtLastRebufferBeforeReset = _timeAtLastRebuffer;
        _timeAtFirstRebufferSinceReset = -1;
        debug((new StringBuilder("Total RebufferTime:")).append(totalRebufferTime).toString());
        return super.reset(i, j, f, visitmetrics);
        visitmetrics;
        obj;
        JVM INSTR monitorexit ;
        throw visitmetrics;
    }

    public void updateTimesDueToBg(int i)
    {
        int j = 0;
_L5:
        if (j < _hLineRebufferStartTime.size()) goto _L2; else goto _L1
_L1:
        j = 0;
_L6:
        int k = _hLineRebufferEndTime.size();
        if (j < k) goto _L4; else goto _L3
_L3:
        super.updateTimesDueToBg(i);
        return;
_L2:
        _hLineRebufferStartTime.set(j, Integer.valueOf(((Integer)_hLineRebufferStartTime.get(j)).intValue() + i));
        j++;
          goto _L5
_L4:
        _hLineRebufferEndTime.set(j, Integer.valueOf(((Integer)_hLineRebufferEndTime.get(j)).intValue() + i));
        j++;
          goto _L6
        Exception exception;
        exception;
          goto _L3
    }
}
