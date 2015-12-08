// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, InternalCodes, VisitMetrics, 
//            MyPair

class PlayState extends States
{

    private HashMap _bitRateCountOverSession;
    private ArrayList _bitRateRequestedAt;
    private ArrayList _bitRateRequestedList;
    private ArrayList _bitRateSwitchedAt;
    private ArrayList _bitRateSwitchedAtStrHead;
    private ArrayList _bitRateSwitchedList;
    private float _currTotalPlayStreamTime;
    private ArrayList _endStreamHeadHist;
    private float _playStreamTimeSinceLastReset;
    private ArrayList _startStreamHeadHist;
    private int _totalPlayClockTime;
    private HashMap _totalPlayPerBitRate;
    private boolean isViewSetInVisitMetrics;

    public PlayState(int i)
    {
        super(i);
        _playStreamTimeSinceLastReset = 0.0F;
        _currTotalPlayStreamTime = 0.0F;
        _totalPlayClockTime = 0;
        _bitRateCountOverSession = new HashMap();
        _totalPlayPerBitRate = new HashMap();
        _startStreamHeadHist = new ArrayList();
        _endStreamHeadHist = new ArrayList();
        _bitRateSwitchedList = new ArrayList();
        _bitRateSwitchedAt = new ArrayList();
        _bitRateSwitchedAtStrHead = new ArrayList();
        _bitRateRequestedList = new ArrayList();
        _bitRateRequestedAt = new ArrayList();
        isViewSetInVisitMetrics = false;
    }

    public String debugSwitch(String s)
    {
        Iterator iterator;
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("\n").append(s).append("\n").toString()))).append("\nBitRate Count Over Session:\n").toString();
        iterator = _bitRateCountOverSession.keySet().iterator();
_L11:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf(s))).append("\nBitRateSwitchedList:\n").toString();
        iterator = _bitRateSwitchedList.iterator();
_L12:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        s = (new StringBuilder(String.valueOf(s))).append("\nBitRateSwitchedAt:\n").toString();
        iterator = _bitRateSwitchedAt.iterator();
_L13:
        if (iterator.hasNext()) goto _L6; else goto _L5
_L5:
        s = (new StringBuilder(String.valueOf(s))).append("\nBitRateSwitchedAtStrHead:\n").toString();
        iterator = _bitRateSwitchedAtStrHead.iterator();
_L14:
        if (iterator.hasNext()) goto _L8; else goto _L7
_L7:
        s = (new StringBuilder(String.valueOf(s))).append("\nBitRateRequestedList:\n").toString();
        iterator = _bitRateRequestedList.iterator();
_L15:
        if (iterator.hasNext()) goto _L10; else goto _L9
_L9:
        s = (new StringBuilder(String.valueOf(s))).append("\nBitRateRequestedAt:\n").toString();
        iterator = _bitRateRequestedAt.iterator();
_L16:
        if (!iterator.hasNext())
        {
            debug(s);
            return s;
        }
        break MISSING_BLOCK_LABEL_463;
_L2:
        Integer integer = (Integer)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(integer).append(":Count:").append(_bitRateCountOverSession.get(integer)).toString();
          goto _L11
_L4:
        Integer integer1 = (Integer)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(integer1).toString();
          goto _L12
_L6:
        Integer integer2 = (Integer)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(integer2).toString();
          goto _L13
_L8:
        Float float1 = (Float)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(float1).toString();
          goto _L14
_L10:
        Integer integer3 = (Integer)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(integer3).toString();
          goto _L15
        Integer integer4 = (Integer)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(integer4).toString();
          goto _L16
    }

    public int enter_state(int i, int j, int k, float f)
    {
        if (_bitRateSwitchedList.size() == 0)
        {
            switchedTo(0, j, k, f);
        }
        return super.enter_state(i, j, k, f);
    }

    public int exit_state(int i, int j, int k, float f)
    {
        if (_stateActive)
        {
            updateStreamTimeHist((Float)_startStrHead.get(_startStrHead.size() - 1), Float.valueOf(f));
        }
        return super.exit_state(i, j, k, f);
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        HashMap hashmap1;
        ArrayList arraylist;
        int k;
        int i1;
        int j1;
        int k1;
        long l1;
        long l2;
        if (_stateActive)
        {
            updateStreamTimeHist((Float)_startStrHead.get(_startStrHead.size() - 1), Float.valueOf(f));
            hashmap.put(CSMAKEYS.playerstate.toString(), "PL");
        }
        if (_totalPlayClockTime + timeSpent(i, j) > InternalCodes.isViewMinimumPlayTime)
        {
            if (!isViewSetInVisitMetrics && visitmetrics != null)
            {
                synchronized (visitmetrics.visitLock)
                {
                    visitmetrics.visitViews = visitmetrics.visitViews + 1;
                }
            }
            isViewSetInVisitMetrics = true;
        }
        if (isViewSetInVisitMetrics)
        {
            hashmap.put(CSMAKEYS.isview.toString(), "1");
        } else
        {
            hashmap.remove(CSMAKEYS.isview.toString());
        }
        hashmap.put(CSMAKEYS.playclocktime.toString(), Integer.toString(timeSpent(i, j)));
        hashmap.put(CSMAKEYS.playstreamtime.toString(), Integer.toString(Math.round(_currTotalPlayStreamTime - _playStreamTimeSinceLastReset)));
        hashmap.put(CSMAKEYS.totalplayclocktime.toString(), Integer.toString(_totalPlayClockTime + timeSpent(i, j)));
        hashmap.put(CSMAKEYS.totalplaystreamtime.toString(), Float.toString(_currTotalPlayStreamTime));
        if (_bitRateSwitchedList.size() <= 0) goto _L2; else goto _L1
_L1:
        hashmap.put(CSMAKEYS.transitioncount.toString(), Integer.toString(_bitRateSwitchedList.size() - 1));
        if (!hashmap.containsKey(CSMAKEYS.transitiondownswitchcount.toString()) && !hashmap.containsKey(CSMAKEYS.transitionupswitchcount.toString())) goto _L4; else goto _L3
_L3:
        i = 0;
        k = 0;
        k1 = 0;
        j1 = 0;
_L32:
        if (j1 < _bitRateSwitchedList.size()) goto _L6; else goto _L5
_L5:
        hashmap.put(CSMAKEYS.transitiondownswitchcount.toString(), Integer.toString(i));
        hashmap.put(CSMAKEYS.transitionupswitchcount.toString(), Integer.toString(k));
_L4:
        if (!hashmap.containsKey(CSMAKEYS.transitionstreamtimes.toString()) && !hashmap.containsKey(CSMAKEYS.transitionstreamtimesession.toString()) && !hashmap.containsKey(CSMAKEYS.bitratebuckettimes.toString()) && !hashmap.containsKey(CSMAKEYS.visitmaxpersistentbitratebucket.toString()) && !hashmap.containsKey(CSMAKEYS.maxpersistentbitrate.toString()) && !hashmap.containsKey(CSMAKEYS.averagedbitrate.toString())) goto _L2; else goto _L7
_L7:
        arraylist = new ArrayList();
        i = 0;
_L33:
        if (i < _bitRateSwitchedList.size()) goto _L9; else goto _L8
_L8:
        obj = (ArrayList)_endTime.clone();
        if (_stateActive)
        {
            ((ArrayList) (obj)).add(Integer.valueOf(j));
        }
        j = _bitRateSwitchedList.size() - 1;
        visitmetrics = (new StringBuilder(String.valueOf(""))).append("StateTimes:\n").toString();
        i = 0;
_L34:
        if (i < ((ArrayList) (obj)).size()) goto _L11; else goto _L10
_L10:
        visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append("\nSwitched At:\n").toString();
        i = 0;
_L35:
        if (i < _bitRateSwitchedAt.size()) goto _L13; else goto _L12
_L12:
        k = ((ArrayList) (obj)).size() - 1;
        i = j;
        j = k;
_L38:
        if (j >= 0) goto _L15; else goto _L14
_L14:
        visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append("\nTimeSpent :\n").toString();
        i = 0;
_L42:
        if (i < arraylist.size()) goto _L17; else goto _L16
_L16:
        debug(visitmetrics);
        hashmap1 = new HashMap();
        visitmetrics = "";
        i = 0;
_L43:
        if (i < _bitRateSwitchedAt.size()) goto _L19; else goto _L18
_L18:
        hashmap.put(CSMAKEYS.transitionstreamtimesession.toString(), visitmetrics.substring(0, visitmetrics.length() - 1));
        obj = ((Object) (hashmap1.keySet().toArray()));
        Arrays.sort(((Object []) (obj)));
        visitmetrics = "";
        l2 = 0L;
        l1 = 0L;
        i = 0;
_L44:
        if (i < obj.length) goto _L21; else goto _L20
_L20:
        if (visitmetrics.length() > 0)
        {
            hashmap.put(CSMAKEYS.transitionstreamtimes.toString(), visitmetrics.substring(0, visitmetrics.length() - 1));
        }
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_763;
        }
        hashmap.put(CSMAKEYS.averagedbitrate.toString(), (new StringBuilder(String.valueOf(Long.toString(l2)))).append(":").append(Long.toString(l1)).toString());
        debug((new StringBuilder("Num::")).append(l2).append(":Deno:").append(l1).toString());
_L48:
        if (!hashmap.containsKey(CSMAKEYS.bitratebuckettimes.toString())) goto _L23; else goto _L22
_L22:
        i1 = 0;
        k = 0;
        j = 0;
        i = 0;
        visitmetrics = hashmap1.keySet().iterator();
_L45:
        if (visitmetrics.hasNext()) goto _L25; else goto _L24
_L24:
        hashmap.put(CSMAKEYS.bitratebuckettimes.toString(), (new StringBuilder("Y:")).append(i).append(",S:").append(j).append(",Q:").append(k).append(",D:").append(i1).toString());
_L23:
        j = 0;
        i = 1;
_L46:
        if (i < _bitRateSwitchedAt.size()) goto _L27; else goto _L26
_L26:
        hashmap.put(CSMAKEYS.transitiontime.toString(), Integer.toString(j));
_L2:
        if (!hashmap.containsKey(CSMAKEYS.maxpersistentbitrate.toString())) goto _L29; else goto _L28
_L28:
        j = 0;
        i = 0;
        visitmetrics = _totalPlayPerBitRate.keySet().iterator();
_L47:
        if (visitmetrics.hasNext()) goto _L31; else goto _L30
_L30:
        if (j != 0)
        {
            hashmap.put(CSMAKEYS.maxpersistentbitrate.toString(), Integer.toString(j));
        }
_L29:
        return;
        hashmap;
        obj;
        JVM INSTR monitorexit ;
        throw hashmap;
_L6:
        if (j1 == 0)
        {
            k1 = ((Integer)_bitRateSwitchedList.get(j1)).intValue();
            i1 = k;
            k = k1;
        } else
        {
            if (k1 < ((Integer)_bitRateSwitchedList.get(j1)).intValue())
            {
                i1 = k + 1;
            } else
            {
                i++;
                i1 = k;
            }
            k = ((Integer)_bitRateSwitchedList.get(j1)).intValue();
        }
        j1++;
        k1 = k;
        k = i1;
          goto _L32
_L9:
        arraylist.add(Integer.valueOf(0));
        i++;
          goto _L33
_L11:
        visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append("St:").append(_startTime.get(i)).append(":En:").append(((ArrayList) (obj)).get(i)).append("::").toString();
        i++;
          goto _L34
_L13:
        visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append("To:").append(_bitRateSwitchedList.get(i)).append(":At:").append(_bitRateSwitchedAt.get(i)).append("::").toString();
        i++;
          goto _L35
_L15:
        i1 = ((Integer)_startTime.get(j)).intValue();
        j1 = ((Integer)((ArrayList) (obj)).get(j)).intValue();
        k = i1;
        if (j == 0)
        {
            k = i1;
            if (_stateEnteredBeforeReset)
            {
                k = i1 + _timeSpentInTransitionBeforeReset;
            }
        }
        i1 = 0;
_L40:
        if (i >= 0) goto _L37; else goto _L36
_L36:
        j--;
          goto _L38
_L37:
label0:
        {
            k1 = ((Integer)_bitRateSwitchedAt.get(i)).intValue();
            if (j1 >= k1)
            {
                break label0;
            }
            i--;
        }
        if (true) goto _L40; else goto _L39
_L39:
label1:
        {
            if (k <= k1)
            {
                break label1;
            }
            arraylist.set(i, Integer.valueOf((((Integer)arraylist.get(i)).intValue() + j1) - k - i1));
        }
        if (true) goto _L36; else goto _L41
_L41:
        arraylist.set(i, Integer.valueOf((((Integer)arraylist.get(i)).intValue() + j1) - k1 - i1));
        i1 = j1 - k1;
        i--;
          goto _L40
_L17:
        visitmetrics = (new StringBuilder(String.valueOf(visitmetrics))).append("Time:").append(arraylist.get(i)).append("::").toString();
        i++;
          goto _L42
_L19:
        j = ((Integer)_bitRateSwitchedList.get(i)).intValue();
        k = ((Integer)arraylist.get(i)).intValue();
        if (hashmap1.containsKey(Integer.valueOf(j)))
        {
            obj = (MyPair)hashmap1.get(Integer.valueOf(j));
        } else
        {
            obj = MyPair.create(Integer.valueOf(0), Integer.valueOf(0));
        }
        hashmap1.put(Integer.valueOf(j), MyPair.create(Integer.valueOf(((Integer)((MyPair) (obj)).first).intValue() + k), Integer.valueOf(((Integer)((MyPair) (obj)).second).intValue() + 1)));
        if (!_totalPlayPerBitRate.containsKey(Integer.valueOf(j)))
        {
            _totalPlayPerBitRate.put(Integer.valueOf(j), Integer.valueOf(k));
        } else
        {
            _totalPlayPerBitRate.put(Integer.valueOf(j), Integer.valueOf(((Integer)_totalPlayPerBitRate.get(Integer.valueOf(j))).intValue() + k));
        }
        if (!_bitRateCountOverSession.containsKey(Integer.valueOf(j)))
        {
            _bitRateCountOverSession.put(Integer.valueOf(j), Integer.valueOf(1));
        } else
        if (i != 0)
        {
            _bitRateCountOverSession.put(Integer.valueOf(j), Integer.valueOf(((Integer)_bitRateCountOverSession.get(Integer.valueOf(j))).intValue() + 1));
        }
        obj = new StringBuilder(String.valueOf(visitmetrics));
        if (j != 0)
        {
            visitmetrics = Integer.toString(j);
        } else
        {
            visitmetrics = "-";
        }
        visitmetrics = ((StringBuilder) (obj)).append(visitmetrics).append(":").append(Float.toString(((Float)_bitRateSwitchedAtStrHead.get(i)).floatValue())).append(":").append(Integer.toString(k)).append(":0001:").append(_bitRateCountOverSession.get(Integer.valueOf(j))).append(",").toString();
        i++;
          goto _L43
_L21:
        long l6 = ((Integer)obj[i]).longValue();
        long l5 = ((Integer)((MyPair)hashmap1.get((Integer)obj[i])).first).longValue();
        long l4 = l1;
        long l3 = l2;
        if (l6 * l5 > 0L)
        {
            l3 = l2 + l6 * l5;
            l4 = l1 + l5;
        }
        StringBuilder stringbuilder = new StringBuilder(String.valueOf(visitmetrics));
        if (((Integer)obj[i]).intValue() != 0)
        {
            visitmetrics = Integer.toString(((Integer)obj[i]).intValue());
        } else
        {
            visitmetrics = "-";
        }
        visitmetrics = stringbuilder.append(visitmetrics).append(":").append(((MyPair)hashmap1.get((Integer)obj[i])).first).append(",").toString();
        debug((new StringBuilder("Num::")).append(l3).append(":Deno:").append(l4).toString());
        i++;
        l1 = l4;
        l2 = l3;
          goto _L44
_L25:
        Integer integer = (Integer)visitmetrics.next();
        if (integer.intValue() > 0 && integer.intValue() < 0x16e360)
        {
            j += ((Integer)((MyPair)hashmap1.get(integer)).first).intValue();
        } else
        if (integer.intValue() >= 0x16e360 && integer.intValue() < 0x2625a0)
        {
            k += ((Integer)((MyPair)hashmap1.get(integer)).first).intValue();
        } else
        if (integer.intValue() >= 0x2625a0)
        {
            i1 += ((Integer)((MyPair)hashmap1.get(integer)).first).intValue();
        } else
        {
            i += ((Integer)((MyPair)hashmap1.get(integer)).first).intValue();
        }
          goto _L45
_L27:
        j += ((Integer)_bitRateSwitchedAt.get(i)).intValue() - ((Integer)_bitRateRequestedAt.get(i)).intValue();
        i++;
          goto _L46
_L31:
        Integer integer1 = (Integer)visitmetrics.next();
        int l = ((Integer)_totalPlayPerBitRate.get(integer1)).intValue();
        if (i < l)
        {
            j = integer1.intValue();
            i = l;
        }
          goto _L47
        visitmetrics;
          goto _L48
    }

    public boolean reset(int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (_stateActive)
        {
            updateStreamTimeHist((Float)_startStrHead.get(_startStrHead.size() - 1), Float.valueOf(f));
        }
        if (visitmetrics == null) goto _L2; else goto _L1
_L1:
        Object obj = visitmetrics.visitLock;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator;
        visitmetrics.visitPlayClockTime = visitmetrics.visitPlayClockTime + timeSpent(i, j);
        visitmetrics.visitPlayStreamTime = visitmetrics.visitPlayStreamTime + (_currTotalPlayStreamTime - _playStreamTimeSinceLastReset);
        if (visitmetrics.visitBitRateTimes == null)
        {
            visitmetrics.visitBitRateTimes = new HashMap();
        }
        iterator = _totalPlayPerBitRate.keySet().iterator();
_L4:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        if (_bitRateSwitchedList.size() > 0)
        {
            int k1 = _bitRateSwitchedAt.size() - 1;
            int j1 = ((Integer)_bitRateSwitchedList.get(k1)).intValue();
            float f1 = ((Float)_bitRateSwitchedAtStrHead.get(k1)).floatValue();
            int k = -1;
            int i1 = -1;
            if (_bitRateRequestedAt.size() > _bitRateSwitchedAt.size())
            {
                k = ((Integer)_bitRateRequestedList.get(k1)).intValue();
                i1 = ((Integer)_bitRateRequestedAt.get(k1)).intValue();
            }
            _bitRateSwitchedList.clear();
            _bitRateSwitchedAt.clear();
            _bitRateSwitchedAtStrHead.clear();
            _bitRateRequestedList.clear();
            _bitRateRequestedAt.clear();
            switchedTo(j1, i, j, f1);
            if (k != -1 && i1 != -1)
            {
                switchRequestedTo(k, i, i1, f);
            }
        }
        if (_stateActive)
        {
            updateStreamTimeHist((Float)_startStrHead.get(_startStrHead.size() - 1), Float.valueOf(f));
        }
        _playStreamTimeSinceLastReset = _currTotalPlayStreamTime;
        _totalPlayClockTime = _totalPlayClockTime + timeSpent(i, j);
        super.reset(i, j, f, visitmetrics);
        return true;
_L3:
        Integer integer;
        integer = (Integer)iterator.next();
        if (!visitmetrics.visitBitRateTimes.containsKey(integer))
        {
            break MISSING_BLOCK_LABEL_471;
        }
        HashMap hashmap = visitmetrics.visitBitRateTimes;
        int l = ((Integer)visitmetrics.visitBitRateTimes.get(integer)).intValue();
        hashmap.put(integer, Integer.valueOf(((Integer)_totalPlayPerBitRate.get(integer)).intValue() + l));
          goto _L4
        visitmetrics;
        obj;
        JVM INSTR monitorexit ;
        throw visitmetrics;
        visitmetrics.visitBitRateTimes.put(integer, (Integer)_totalPlayPerBitRate.get(integer));
          goto _L4
    }

    public void switchRequestedTo(int i, int j, int k, float f)
    {
        if (_bitRateRequestedAt.size() > _bitRateSwitchedAt.size())
        {
            _bitRateRequestedAt.set(_bitRateSwitchedAt.size(), Integer.valueOf(k));
            _bitRateRequestedList.set(_bitRateSwitchedAt.size(), Integer.valueOf(i));
            return;
        } else
        {
            _bitRateRequestedAt.add(Integer.valueOf(k));
            _bitRateRequestedList.add(Integer.valueOf(i));
            return;
        }
    }

    public void switchedTo(int i, int j, int k, float f)
    {
        if (_bitRateSwitchedList.size() <= 0 || ((Integer)_bitRateSwitchedList.get(_bitRateSwitchedList.size() - 1)).intValue() != i)
        {
            _bitRateSwitchedAt.add(Integer.valueOf(k));
            _bitRateSwitchedList.add(Integer.valueOf(i));
            _bitRateSwitchedAtStrHead.add(Float.valueOf(f));
            if (_bitRateRequestedAt.size() < _bitRateSwitchedAt.size())
            {
                _bitRateRequestedAt.add(Integer.valueOf(k));
                _bitRateRequestedList.add(Integer.valueOf(i));
                return;
            }
        }
    }

    public void updateStreamTimeHist(Float float1, Float float2)
    {
        String s;
        Iterator iterator;
        s = "";
        iterator = _startStreamHeadHist.iterator();
_L7:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf(s))).append("\n").toString();
        iterator = _endStreamHeadHist.iterator();
_L8:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        debug((new StringBuilder(String.valueOf(s))).append("\nCurrentStreamTime:").append(_currTotalPlayStreamTime).toString());
        if (float1.floatValue() < float2.floatValue()) goto _L6; else goto _L5
_L5:
        return;
_L2:
        float f = ((Float)iterator.next()).floatValue();
        s = (new StringBuilder(String.valueOf(s))).append(f).append(":").toString();
          goto _L7
_L4:
        float f1 = ((Float)iterator.next()).floatValue();
        s = (new StringBuilder(String.valueOf(s))).append(f1).append(":").toString();
          goto _L8
_L6:
        int i;
        _startStreamHeadHist.add(float1);
        _endStreamHeadHist.add(float2);
        if (_startStreamHeadHist.size() == 1)
        {
            _currTotalPlayStreamTime = float2.floatValue() - float1.floatValue();
            return;
        }
        Collections.sort(_startStreamHeadHist);
        Collections.sort(_endStreamHeadHist);
        float1 = new ArrayList();
        float2 = new ArrayList();
        float1.add((Float)_startStreamHeadHist.get(0));
        i = 1;
_L9:
label0:
        {
            if (i < _startStreamHeadHist.size())
            {
                break label0;
            }
            float2.add((Float)_endStreamHeadHist.get(_endStreamHeadHist.size() - 1));
            _startStreamHeadHist = float1;
            _endStreamHeadHist = float2;
            _currTotalPlayStreamTime = 0.0F;
            i = 0;
            while (i < _startStreamHeadHist.size()) 
            {
                float f2 = _currTotalPlayStreamTime;
                _currTotalPlayStreamTime = (((Float)_endStreamHeadHist.get(i)).floatValue() - ((Float)_startStreamHeadHist.get(i)).floatValue()) + f2;
                i++;
            }
        }
          goto _L5
        Float float3 = (Float)_endStreamHeadHist.get(i - 1);
        Float float4 = (Float)_startStreamHeadHist.get(i);
        if (float3.floatValue() < float4.floatValue())
        {
            float2.add(float3);
            float1.add(float4);
        }
        i++;
          goto _L9
    }
}
