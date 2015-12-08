// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;

import java.io.Serializable;

public class Summaries
    implements Serializable
{

    private static final long serialVersionUID = 0x456cc68d558661f6L;
    private Integer CountMinute;
    private Integer EndMinute;
    private String MinuteText;
    private String MinutesText;
    private Integer StartMinute;

    public Summaries()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Summaries)obj;
        if (CountMinute == null)
        {
            if (((Summaries) (obj)).CountMinute != null)
            {
                return false;
            }
        } else
        if (!CountMinute.equals(((Summaries) (obj)).CountMinute))
        {
            return false;
        }
        if (EndMinute == null)
        {
            if (((Summaries) (obj)).EndMinute != null)
            {
                return false;
            }
        } else
        if (!EndMinute.equals(((Summaries) (obj)).EndMinute))
        {
            return false;
        }
        if (MinuteText == null)
        {
            if (((Summaries) (obj)).MinuteText != null)
            {
                return false;
            }
        } else
        if (!MinuteText.equals(((Summaries) (obj)).MinuteText))
        {
            return false;
        }
        if (MinutesText == null)
        {
            if (((Summaries) (obj)).MinutesText != null)
            {
                return false;
            }
        } else
        if (!MinutesText.equals(((Summaries) (obj)).MinutesText))
        {
            return false;
        }
        if (StartMinute != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Summaries) (obj)).StartMinute == null) goto _L1; else goto _L3
_L3:
        return false;
        if (StartMinute.equals(((Summaries) (obj)).StartMinute)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Integer getCountMinute()
    {
        return CountMinute;
    }

    public Integer getEndMinute()
    {
        return EndMinute;
    }

    public String getMinuteText()
    {
        return MinuteText;
    }

    public String getMinutesText()
    {
        return MinutesText;
    }

    public Integer getStartMinute()
    {
        return StartMinute;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (CountMinute == null)
        {
            i = 0;
        } else
        {
            i = CountMinute.hashCode();
        }
        if (EndMinute == null)
        {
            j = 0;
        } else
        {
            j = EndMinute.hashCode();
        }
        if (MinuteText == null)
        {
            k = 0;
        } else
        {
            k = MinuteText.hashCode();
        }
        if (MinutesText == null)
        {
            l = 0;
        } else
        {
            l = MinutesText.hashCode();
        }
        if (StartMinute != null)
        {
            i1 = StartMinute.hashCode();
        }
        return ((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
    }

    public void setCountMinute(Integer integer)
    {
        CountMinute = integer;
    }

    public void setEndMinute(Integer integer)
    {
        EndMinute = integer;
    }

    public void setMinuteText(String s)
    {
        MinuteText = s;
    }

    public void setMinutesText(String s)
    {
        MinutesText = s;
    }

    public void setStartMinute(Integer integer)
    {
        StartMinute = integer;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Summaries [StartMinute=").append(StartMinute).append(", EndMinute=").append(EndMinute).append(", CountMinute=").append(CountMinute).append(", MinuteText=").append(MinuteText).append(", MinutesText=").append(MinutesText).append("]").toString();
    }
}
