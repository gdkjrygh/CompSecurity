// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.news;

import android.content.Context;
import com.accuweather.android.models.ExpirableModel;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.Utilities;
import java.io.Serializable;

public class NewsModel extends ExpirableModel
    implements Serializable
{

    private static final int EXPIRATION_TIME_MINUTES = 30;
    private static final long serialVersionUID = 0xc79029a9e0aced60L;
    private String date;
    private String description;
    private String img_url;
    private String mobile_url;
    private String title;
    private String url;

    public NewsModel()
    {
        title = "";
        url = "";
        img_url = "";
        description = "";
        date = "";
        mobile_url = "";
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
        obj = (NewsModel)obj;
        if (date == null)
        {
            if (((NewsModel) (obj)).date != null)
            {
                return false;
            }
        } else
        if (!date.equals(((NewsModel) (obj)).date))
        {
            return false;
        }
        if (description == null)
        {
            if (((NewsModel) (obj)).description != null)
            {
                return false;
            }
        } else
        if (!description.equals(((NewsModel) (obj)).description))
        {
            return false;
        }
        if (img_url == null)
        {
            if (((NewsModel) (obj)).img_url != null)
            {
                return false;
            }
        } else
        if (!img_url.equals(((NewsModel) (obj)).img_url))
        {
            return false;
        }
        if (mobile_url == null)
        {
            if (((NewsModel) (obj)).mobile_url != null)
            {
                return false;
            }
        } else
        if (!mobile_url.equals(((NewsModel) (obj)).mobile_url))
        {
            return false;
        }
        if (title == null)
        {
            if (((NewsModel) (obj)).title != null)
            {
                return false;
            }
        } else
        if (!title.equals(((NewsModel) (obj)).title))
        {
            return false;
        }
        if (url != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((NewsModel) (obj)).url == null) goto _L1; else goto _L3
_L3:
        return false;
        if (url.equals(((NewsModel) (obj)).url)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getDate()
    {
        return date;
    }

    public String getDescription()
    {
        return description;
    }

    protected int getExpirationTimeInMinutes()
    {
        return 30;
    }

    public String getFormattedNewsUrl(Context context)
    {
        if (Utilities.isScreenSizeLargeOrGreater(context))
        {
            return (new StringBuilder()).append(getUrl()).append("?partner=").append(PartnerCoding.getPartnerCodeFromSharedPreferences(context)).toString();
        } else
        {
            return (new StringBuilder()).append(getMobileUrl()).append("?p=").append(PartnerCoding.getPartnerCodeFromSharedPreferences(context)).toString();
        }
    }

    public String getImageUrl()
    {
        return img_url;
    }

    public String getMobileUrl()
    {
        return mobile_url;
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
        int j1 = 0;
        int k1 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (date == null)
        {
            i = 0;
        } else
        {
            i = date.hashCode();
        }
        if (description == null)
        {
            j = 0;
        } else
        {
            j = description.hashCode();
        }
        if (img_url == null)
        {
            k = 0;
        } else
        {
            k = img_url.hashCode();
        }
        if (mobile_url == null)
        {
            l = 0;
        } else
        {
            l = mobile_url.hashCode();
        }
        if (title == null)
        {
            i1 = 0;
        } else
        {
            i1 = title.hashCode();
        }
        if (url != null)
        {
            j1 = url.hashCode();
        }
        return (((((k1 * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1;
    }

    public void setDate(String s)
    {
        date = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setImageUrl(String s)
    {
        img_url = s;
    }

    public void setMobileUrl(String s)
    {
        mobile_url = s;
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
        return (new StringBuilder()).append("NewsModel [title=").append(title).append(", url=").append(url).append(", img_url=").append(img_url).append(", description=").append(description).append(", date=").append(date).append(", mobile_url=").append(mobile_url).append("]").toString();
    }
}
