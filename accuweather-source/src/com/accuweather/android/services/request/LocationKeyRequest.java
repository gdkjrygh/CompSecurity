// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;


// Referenced classes of package com.accuweather.android.services.request:
//            Request

public class LocationKeyRequest extends Request
{

    private String langId;
    private String locationKey;

    public LocationKeyRequest()
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
        obj = (LocationKeyRequest)obj;
        if (langId == null)
        {
            if (((LocationKeyRequest) (obj)).langId != null)
            {
                return false;
            }
        } else
        if (!langId.equals(((LocationKeyRequest) (obj)).langId))
        {
            return false;
        }
        if (locationKey != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LocationKeyRequest) (obj)).locationKey == null) goto _L1; else goto _L3
_L3:
        return false;
        if (locationKey.equals(((LocationKeyRequest) (obj)).locationKey)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getLangId()
    {
        return langId;
    }

    public String getLocationKey()
    {
        return locationKey;
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
        if (locationKey != null)
        {
            j = locationKey.hashCode();
        }
        return (k * 31 + i) * 31 + j;
    }

    public void setLangId(String s)
    {
        langId = s;
    }

    public void setLocationKey(String s)
    {
        locationKey = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationKeyRequest [locationKey=").append(locationKey).append(", langId=").append(langId).append("]").toString();
    }
}
