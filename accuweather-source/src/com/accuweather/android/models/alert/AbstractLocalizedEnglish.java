// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.alert;

import java.io.Serializable;

public abstract class AbstractLocalizedEnglish
    implements Serializable
{

    private static final long serialVersionUID = 0x7422bce5ceaec047L;
    private String English;
    private String Localized;

    public AbstractLocalizedEnglish()
    {
        Localized = "";
        English = "";
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
        obj = (AbstractLocalizedEnglish)obj;
        if (English == null)
        {
            if (((AbstractLocalizedEnglish) (obj)).English != null)
            {
                return false;
            }
        } else
        if (!English.equals(((AbstractLocalizedEnglish) (obj)).English))
        {
            return false;
        }
        if (Localized != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AbstractLocalizedEnglish) (obj)).Localized == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Localized.equals(((AbstractLocalizedEnglish) (obj)).Localized)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getEnglish()
    {
        return English;
    }

    public String getLocalized()
    {
        return Localized;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (English == null)
        {
            i = 0;
        } else
        {
            i = English.hashCode();
        }
        if (Localized != null)
        {
            j = Localized.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setEnglish(String s)
    {
        English = s;
    }

    public void setLocalized(String s)
    {
        Localized = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AbstractLocalizedEnglish [Localized=").append(Localized).append(", English=").append(English).append("]").toString();
    }
}
