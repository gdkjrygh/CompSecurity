// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;


// Referenced classes of package com.accuweather.android.services.request:
//            Request

public class LocationCityRequest extends Request
{

    private String langId;
    private String queryText;

    public LocationCityRequest()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!super.equals(obj))
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (LocationCityRequest)obj;
        if (langId == null)
        {
            if (((LocationCityRequest) (obj)).langId != null)
            {
                return false;
            }
        } else
        if (!langId.equals(((LocationCityRequest) (obj)).langId))
        {
            return false;
        }
        if (queryText != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LocationCityRequest) (obj)).queryText == null) goto _L1; else goto _L3
_L3:
        return false;
        if (queryText.equals(((LocationCityRequest) (obj)).queryText)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getLangId()
    {
        return langId;
    }

    public String getQueryText()
    {
        return queryText;
    }

    public int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (langId == null)
        {
            i = 0;
        } else
        {
            i = langId.hashCode();
        }
        if (queryText != null)
        {
            j = queryText.hashCode();
        }
        return (k * 31 + i) * 31 + j;
    }

    public void setLangId(String s)
    {
        langId = s;
    }

    public void setQueryText(String s)
    {
        queryText = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationCityRequest [queryText=").append(queryText).append(", langId=").append(langId).append("]").toString();
    }
}
