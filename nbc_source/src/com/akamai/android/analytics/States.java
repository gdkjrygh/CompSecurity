// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.akamai.android.analytics:
//            VisitMetrics

class States
{
    static interface DebugInterface
    {

        public abstract void debugToParent(String s);
    }


    protected boolean _cumulativeMetric;
    protected int _curStateCode;
    protected ArrayList _endStrHead;
    protected ArrayList _endTime;
    protected ArrayList _startStrHead;
    protected ArrayList _startTime;
    protected boolean _stateActive;
    boolean _stateEnteredBeforeReset;
    float _strHeadAtReset;
    int _timeSpent;
    int _timeSpentInTransitionBeforeReset;
    DebugInterface debugListener;

    public States(int i)
    {
        _startTime = null;
        _endTime = null;
        _startStrHead = null;
        _endStrHead = null;
        _stateActive = false;
        _curStateCode = 12;
        _timeSpent = 0;
        debugListener = null;
        _cumulativeMetric = false;
        _startTime = new ArrayList();
        _endTime = new ArrayList();
        _startStrHead = new ArrayList();
        _endStrHead = new ArrayList();
        _stateActive = false;
        _stateEnteredBeforeReset = false;
        _timeSpentInTransitionBeforeReset = 0;
        _strHeadAtReset = 0.0F;
        _curStateCode = i;
        _timeSpent = 0;
    }

    public void debug(String s)
    {
        if (debugListener != null)
        {
            debugListener.debugToParent(s);
        }
    }

    public String debugStateInfo()
    {
        String s;
        Iterator iterator;
        s = "ST";
        iterator = _startTime.iterator();
_L7:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf(s))).append("::ET").toString();
        iterator = _endTime.iterator();
_L8:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        s = (new StringBuilder(String.valueOf(s))).append("::SS").toString();
        iterator = _startStrHead.iterator();
_L9:
        if (iterator.hasNext()) goto _L6; else goto _L5
_L5:
        s = (new StringBuilder(String.valueOf(s))).append("::ES").toString();
        iterator = _endStrHead.iterator();
_L10:
        if (!iterator.hasNext())
        {
            return s;
        }
        break MISSING_BLOCK_LABEL_244;
_L2:
        Integer integer = (Integer)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(integer).toString();
          goto _L7
_L4:
        Integer integer1 = (Integer)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(integer1).toString();
          goto _L8
_L6:
        Float float1 = (Float)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(float1).toString();
          goto _L9
        Float float2 = (Float)iterator.next();
        s = (new StringBuilder(String.valueOf(s))).append(":").append(float2).toString();
          goto _L10
    }

    public int enter_state(int i, int j, int k, float f)
    {
        if (!_stateActive)
        {
            _stateActive = true;
            _startTime.add(new Integer(k));
            _startStrHead.add(new Float(f));
        }
        return _curStateCode;
    }

    public int exit_state(int i, int j, int k, float f)
    {
        if (_stateActive)
        {
            _stateActive = false;
            _endTime.add(new Integer(k));
            _endStrHead.add(new Float(f));
            i = k - ((Integer)_startTime.get(_startTime.size() - 1)).intValue();
            j = _timeSpent;
            if (i <= 0)
            {
                i = 0;
            }
            _timeSpent = j + i;
            return _curStateCode;
        } else
        {
            return 12;
        }
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
    }

    public int noOfEntries()
    {
        int j = _startTime.size();
        int i;
        if (_stateEnteredBeforeReset)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return j - i;
    }

    public int noOfExits()
    {
        return _endTime.size();
    }

    public boolean reset(int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (!_cumulativeMetric)
        {
            i = j;
            float f1 = 0.0F;
            if (_stateActive)
            {
                i = ((Integer)_startTime.get(_startTime.size() - 1)).intValue();
                f1 = ((Float)_startStrHead.get(_startStrHead.size() - 1)).floatValue();
            }
            _startTime.clear();
            _endTime.clear();
            _startStrHead.clear();
            _endStrHead.clear();
            if (_stateActive)
            {
                _startTime.add(Integer.valueOf(i));
                _startStrHead.add(Float.valueOf(f1));
                _timeSpentInTransitionBeforeReset = j - i;
            } else
            {
                _timeSpentInTransitionBeforeReset = 0;
            }
            _stateEnteredBeforeReset = _stateActive;
            _timeSpent = 0;
            _strHeadAtReset = f;
            if (_stateActive)
            {
                debug((new StringBuilder("StateCode: ")).append(_curStateCode).append(":Time already spent in the last transition is :").append(_timeSpentInTransitionBeforeReset).toString());
                return true;
            }
        }
        return true;
    }

    public void setDebugListener(DebugInterface debuginterface)
    {
        debugListener = debuginterface;
    }

    public int timeSpent(int i, int j)
    {
        i = 0;
        if (_stateActive)
        {
            i = j - ((Integer)_startTime.get(_startTime.size() - 1)).intValue();
        }
        i = (_timeSpent + i) - _timeSpentInTransitionBeforeReset;
        if (i > 0)
        {
            return i;
        } else
        {
            return 0;
        }
    }

    public void updateTimesDueToBg(int i)
    {
    }
}
