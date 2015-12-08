// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.current;

import java.io.Serializable;

public class PressureTendency
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public String Code;
    public String LocalizedText;

    public PressureTendency()
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
        obj = (PressureTendency)obj;
        if (Code == null)
        {
            if (((PressureTendency) (obj)).Code != null)
            {
                return false;
            }
        } else
        if (!Code.equals(((PressureTendency) (obj)).Code))
        {
            return false;
        }
        if (LocalizedText != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((PressureTendency) (obj)).LocalizedText == null) goto _L1; else goto _L3
_L3:
        return false;
        if (LocalizedText.equals(((PressureTendency) (obj)).LocalizedText)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getCode()
    {
        return Code;
    }

    public String getLocalizedText()
    {
        return LocalizedText;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (Code == null)
        {
            i = 0;
        } else
        {
            i = Code.hashCode();
        }
        if (LocalizedText != null)
        {
            j = LocalizedText.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setCode(String s)
    {
        Code = s;
    }

    public void setLocalizedText(String s)
    {
        LocalizedText = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PressureTendency [LocalizedText=").append(LocalizedText).append(", Code=").append(Code).append("]").toString();
    }
}
