// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import com.fsr.tracker.state.TrackingStates;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersistedState
    implements Serializable
{

    public static final int CURRENT_VERSION = 2;
    private Date exitNotificationDate;
    private Date firstLaunchDate;
    private int launchCount;
    private String respondentId;
    private HashMap significantEvents;
    private TrackingStates state;
    private boolean surveyCompleted;
    private Date surveyCompletedDate;
    private boolean surveyDeclined;
    private Date surveyDeclinedDate;
    private String triggeredMeasure;

    public PersistedState()
    {
        state = TrackingStates.TRACKING;
        significantEvents = new HashMap();
        respondentId = "";
    }

    public PersistedState(String s)
    {
        state = TrackingStates.TRACKING;
        significantEvents = new HashMap();
        respondentId = "";
        respondentId = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PersistedState)obj;
            if (launchCount != ((PersistedState) (obj)).launchCount)
            {
                return false;
            }
            if (surveyCompleted != ((PersistedState) (obj)).surveyCompleted)
            {
                return false;
            }
            if (surveyDeclined != ((PersistedState) (obj)).surveyDeclined)
            {
                return false;
            }
            if (exitNotificationDate == null ? ((PersistedState) (obj)).exitNotificationDate != null : !exitNotificationDate.equals(((PersistedState) (obj)).exitNotificationDate))
            {
                return false;
            }
            if (firstLaunchDate == null ? ((PersistedState) (obj)).firstLaunchDate != null : !firstLaunchDate.equals(((PersistedState) (obj)).firstLaunchDate))
            {
                return false;
            }
            if (respondentId == null ? ((PersistedState) (obj)).respondentId != null : !respondentId.equals(((PersistedState) (obj)).respondentId))
            {
                return false;
            }
            if (significantEvents == null ? ((PersistedState) (obj)).significantEvents != null : !significantEvents.equals(((PersistedState) (obj)).significantEvents))
            {
                return false;
            }
            if (state != ((PersistedState) (obj)).state)
            {
                return false;
            }
            if (surveyCompletedDate == null ? ((PersistedState) (obj)).surveyCompletedDate != null : !surveyCompletedDate.equals(((PersistedState) (obj)).surveyCompletedDate))
            {
                return false;
            }
            if (surveyDeclinedDate == null ? ((PersistedState) (obj)).surveyDeclinedDate != null : !surveyDeclinedDate.equals(((PersistedState) (obj)).surveyDeclinedDate))
            {
                return false;
            }
            if (triggeredMeasure == null ? ((PersistedState) (obj)).triggeredMeasure != null : !triggeredMeasure.equals(((PersistedState) (obj)).triggeredMeasure))
            {
                return false;
            }
        }
        return true;
    }

    public Date getExitNotificationDate()
    {
        return exitNotificationDate;
    }

    public Date getFirstLaunchDate()
    {
        return firstLaunchDate;
    }

    public int getLaunchCount()
    {
        return launchCount;
    }

    public String getRespondentId()
    {
        return respondentId;
    }

    public Map getSignificantEvents()
    {
        return significantEvents;
    }

    public TrackingStates getState()
    {
        return state;
    }

    public Date getSurveyCompletedDate()
    {
        return surveyCompletedDate;
    }

    public Date getSurveyDeclinedDate()
    {
        return surveyDeclinedDate;
    }

    public String getTriggeredMeasure()
    {
        return triggeredMeasure;
    }

    public int hashCode()
    {
        int k1 = 1;
        int j2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
        int i2;
        int k2;
        if (state != null)
        {
            i = state.hashCode();
        } else
        {
            i = 0;
        }
        k2 = launchCount;
        if (significantEvents != null)
        {
            j = significantEvents.hashCode();
        } else
        {
            j = 0;
        }
        if (firstLaunchDate != null)
        {
            k = firstLaunchDate.hashCode();
        } else
        {
            k = 0;
        }
        if (surveyDeclinedDate != null)
        {
            l = surveyDeclinedDate.hashCode();
        } else
        {
            l = 0;
        }
        if (surveyDeclined)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (surveyCompletedDate != null)
        {
            j1 = surveyCompletedDate.hashCode();
        } else
        {
            j1 = 0;
        }
        if (!surveyCompleted)
        {
            k1 = 0;
        }
        if (respondentId != null)
        {
            l1 = respondentId.hashCode();
        } else
        {
            l1 = 0;
        }
        if (triggeredMeasure != null)
        {
            i2 = triggeredMeasure.hashCode();
        } else
        {
            i2 = 0;
        }
        if (exitNotificationDate != null)
        {
            j2 = exitNotificationDate.hashCode();
        }
        return (((((((((i * 31 + k2) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2;
    }

    public boolean isSurveyCompleted()
    {
        return surveyCompleted;
    }

    public boolean isSurveyDeclined()
    {
        return surveyDeclined;
    }

    public void reset()
    {
        resetCounters();
        state = TrackingStates.TRACKING;
    }

    public void resetCounters()
    {
        launchCount = 0;
        significantEvents.clear();
        firstLaunchDate = new Date();
        triggeredMeasure = null;
        surveyDeclinedDate = null;
        surveyCompletedDate = null;
        surveyDeclined = false;
        surveyCompleted = false;
        exitNotificationDate = null;
    }

    public void setExitNotificationDate(Date date)
    {
        exitNotificationDate = date;
    }

    public void setFirstLaunchDate(Date date)
    {
        firstLaunchDate = date;
    }

    public void setLaunchCount(int i)
    {
        launchCount = i;
    }

    public void setRespondentId(String s)
    {
        respondentId = s;
    }

    public void setState(TrackingStates trackingstates)
    {
        state = trackingstates;
    }

    public void setSurveyCompleted(boolean flag)
    {
        surveyCompleted = flag;
    }

    public void setSurveyCompletedDate(Date date)
    {
        surveyCompletedDate = date;
    }

    public void setSurveyDeclined(boolean flag)
    {
        surveyDeclined = flag;
    }

    public void setSurveyDeclinedDate(Date date)
    {
        surveyDeclinedDate = date;
    }

    public void setTriggeredMeasure(String s)
    {
        triggeredMeasure = s;
    }
}
