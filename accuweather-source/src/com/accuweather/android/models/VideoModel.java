// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models:
//            ExpirableModel

public class VideoModel extends ExpirableModel
    implements Serializable
{

    private static final int EXPIRATION_TIME_MINUTES = 30;
    private String date;
    private String description;
    private String name;
    private String thumbnail_url;
    private String url;

    public VideoModel()
    {
        name = "";
        url = "";
        thumbnail_url = "";
        date = "";
        description = "";
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
        obj = (VideoModel)obj;
        if (date == null)
        {
            if (((VideoModel) (obj)).date != null)
            {
                return false;
            }
        } else
        if (!date.equals(((VideoModel) (obj)).date))
        {
            return false;
        }
        if (description == null)
        {
            if (((VideoModel) (obj)).description != null)
            {
                return false;
            }
        } else
        if (!description.equals(((VideoModel) (obj)).description))
        {
            return false;
        }
        if (name == null)
        {
            if (((VideoModel) (obj)).name != null)
            {
                return false;
            }
        } else
        if (!name.equals(((VideoModel) (obj)).name))
        {
            return false;
        }
        if (thumbnail_url == null)
        {
            if (((VideoModel) (obj)).thumbnail_url != null)
            {
                return false;
            }
        } else
        if (!thumbnail_url.equals(((VideoModel) (obj)).thumbnail_url))
        {
            return false;
        }
        if (url != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((VideoModel) (obj)).url == null) goto _L1; else goto _L3
_L3:
        return false;
        if (url.equals(((VideoModel) (obj)).url)) goto _L1; else goto _L4
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

    public String getName()
    {
        return name;
    }

    public String getThumbnailUrl()
    {
        return thumbnail_url;
    }

    public String getUrl()
    {
        return url;
    }

    public int hashCode()
    {
        int i1 = 0;
        int j1 = super.hashCode();
        int i;
        int j;
        int k;
        int l;
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
        if (name == null)
        {
            k = 0;
        } else
        {
            k = name.hashCode();
        }
        if (thumbnail_url == null)
        {
            l = 0;
        } else
        {
            l = thumbnail_url.hashCode();
        }
        if (url != null)
        {
            i1 = url.hashCode();
        }
        return ((((j1 * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
    }

    public void setDate(String s)
    {
        date = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setThumbnailUrl(String s)
    {
        thumbnail_url = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("VideoModel [name=").append(name).append(", url=").append(url).append(", thumbnail_url=").append(thumbnail_url).append(", date=").append(date).append(", description=").append(description).append("]").toString();
    }
}
