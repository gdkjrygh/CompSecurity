// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;

import java.io.Serializable;

public class Summary
    implements Serializable
{

    private static final long serialVersionUID = 0xdf0a8a6a8cdc305eL;
    private String Phrase;
    private String Phrase_60;

    public Summary()
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
        obj = (Summary)obj;
        if (Phrase == null)
        {
            if (((Summary) (obj)).Phrase != null)
            {
                return false;
            }
        } else
        if (!Phrase.equals(((Summary) (obj)).Phrase))
        {
            return false;
        }
        if (Phrase_60 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Summary) (obj)).Phrase_60 == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Phrase_60.equals(((Summary) (obj)).Phrase_60)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getPhrase()
    {
        return Phrase;
    }

    public String getPhrase_60()
    {
        return Phrase_60;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (Phrase == null)
        {
            i = 0;
        } else
        {
            i = Phrase.hashCode();
        }
        if (Phrase_60 != null)
        {
            j = Phrase_60.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setPhrase(String s)
    {
        Phrase = s;
    }

    public void setPhrase_60(String s)
    {
        Phrase_60 = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Summary [Phrase=").append(Phrase).append(", Phrase_60=").append(Phrase_60).append("]").toString();
    }
}
