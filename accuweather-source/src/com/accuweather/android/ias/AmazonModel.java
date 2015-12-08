// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.ias;

import java.io.Serializable;

public class AmazonModel
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String asin;
    private String price;
    private String title;
    private String url;

    public AmazonModel()
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
        obj = (AmazonModel)obj;
        if (asin == null)
        {
            if (((AmazonModel) (obj)).asin != null)
            {
                return false;
            }
        } else
        if (!asin.equals(((AmazonModel) (obj)).asin))
        {
            return false;
        }
        if (price == null)
        {
            if (((AmazonModel) (obj)).price != null)
            {
                return false;
            }
        } else
        if (!price.equals(((AmazonModel) (obj)).price))
        {
            return false;
        }
        if (title == null)
        {
            if (((AmazonModel) (obj)).title != null)
            {
                return false;
            }
        } else
        if (!title.equals(((AmazonModel) (obj)).title))
        {
            return false;
        }
        if (url != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AmazonModel) (obj)).url == null) goto _L1; else goto _L3
_L3:
        return false;
        if (url.equals(((AmazonModel) (obj)).url)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getAsin()
    {
        return asin;
    }

    public String getPrice()
    {
        return price;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl()
    {
        return url;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (asin == null)
        {
            i = 0;
        } else
        {
            i = asin.hashCode();
        }
        if (price == null)
        {
            j = 0;
        } else
        {
            j = price.hashCode();
        }
        if (title == null)
        {
            k = 0;
        } else
        {
            k = title.hashCode();
        }
        if (url != null)
        {
            l = url.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + k) * 31 + l;
    }

    public void setAsin(String s)
    {
        asin = s;
    }

    public void setPrice(String s)
    {
        price = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AmazonModel [asin=").append(asin).append(", url=").append(url).append(", title=").append(title).append(", price=").append(price).append("]").toString();
    }
}
