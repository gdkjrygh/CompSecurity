// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;


// Referenced classes of package com.accuweather.android.models.location:
//            DMA

public class Details
{

    private String CanonicalLocationKey;
    private String CanonicalPostalCode;
    private DMA DMA;
    private String Key;
    private String VideoCode;

    public Details()
    {
        Key = "";
        VideoCode = "";
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
        obj = (Details)obj;
        if (CanonicalLocationKey == null)
        {
            if (((Details) (obj)).CanonicalLocationKey != null)
            {
                return false;
            }
        } else
        if (!CanonicalLocationKey.equals(((Details) (obj)).CanonicalLocationKey))
        {
            return false;
        }
        if (CanonicalPostalCode == null)
        {
            if (((Details) (obj)).CanonicalPostalCode != null)
            {
                return false;
            }
        } else
        if (!CanonicalPostalCode.equals(((Details) (obj)).CanonicalPostalCode))
        {
            return false;
        }
        if (DMA == null)
        {
            if (((Details) (obj)).DMA != null)
            {
                return false;
            }
        } else
        if (!DMA.equals(((Details) (obj)).DMA))
        {
            return false;
        }
        if (Key == null)
        {
            if (((Details) (obj)).Key != null)
            {
                return false;
            }
        } else
        if (!Key.equals(((Details) (obj)).Key))
        {
            return false;
        }
        if (VideoCode != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Details) (obj)).VideoCode == null) goto _L1; else goto _L3
_L3:
        return false;
        if (VideoCode.equals(((Details) (obj)).VideoCode)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getCanonicalLocationKey()
    {
        return CanonicalLocationKey;
    }

    public String getCanonicalPostalCode()
    {
        return CanonicalPostalCode;
    }

    public DMA getDMA()
    {
        return DMA;
    }

    public String getKey()
    {
        return Key;
    }

    public String getVideoCode()
    {
        return VideoCode;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (CanonicalLocationKey == null)
        {
            i = 0;
        } else
        {
            i = CanonicalLocationKey.hashCode();
        }
        if (CanonicalPostalCode == null)
        {
            j = 0;
        } else
        {
            j = CanonicalPostalCode.hashCode();
        }
        if (DMA == null)
        {
            k = 0;
        } else
        {
            k = DMA.hashCode();
        }
        if (Key == null)
        {
            l = 0;
        } else
        {
            l = Key.hashCode();
        }
        if (VideoCode != null)
        {
            i1 = VideoCode.hashCode();
        }
        return ((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
    }

    public void setCanonicalLocationKey(String s)
    {
        CanonicalLocationKey = s;
    }

    public void setCanonicalPostalCode(String s)
    {
        CanonicalPostalCode = s;
    }

    public void setDMA(DMA dma)
    {
        DMA = dma;
    }

    public void setKey(String s)
    {
        Key = s;
    }

    public void setVideoCode(String s)
    {
        VideoCode = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Details [Key=").append(Key).append(", CanonicalLocationKey=").append(CanonicalLocationKey).append(", CanonicalPostalCode=").append(CanonicalPostalCode).append(", VideoCode=").append(VideoCode).append(", DMA=").append(DMA).append("]").toString();
    }
}
