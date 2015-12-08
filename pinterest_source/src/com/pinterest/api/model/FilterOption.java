// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            Model

public class FilterOption extends Model
{

    private Date cacheExpirationDate;
    private Integer count;
    private String displayCount;
    private String displayName;
    private String dominantColor;
    private Long id;
    private String largeIconUrl;
    private String smallIconUrl;
    private String typeValue;

    public FilterOption()
    {
        count = Integer.valueOf(0);
    }

    public FilterOption(Long long1)
    {
        count = Integer.valueOf(0);
        id = long1;
    }

    public FilterOption(Long long1, Date date, Integer integer, String s, String s1, String s2, String s3, 
            String s4, String s5)
    {
        count = Integer.valueOf(0);
        id = long1;
        cacheExpirationDate = date;
        count = integer;
        typeValue = s;
        displayCount = s1;
        displayName = s2;
        largeIconUrl = s3;
        smallIconUrl = s4;
        dominantColor = s5;
    }

    public static FilterOption make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true);
    }

    public static FilterOption make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = null;
        } else
        {
            final FilterOption option = (FilterOption)pinterestjsonobject.a(com/pinterest/api/model/FilterOption);
            pinterestjsonobject = option;
            if (flag)
            {
                (new _cls1()).execute();
                return option;
            }
        }
        return pinterestjsonobject;
    }

    public static ArrayList makeAll(PinterestJsonArray pinterestjsonarray)
    {
        if (pinterestjsonarray == null)
        {
            return null;
        }
        final ArrayList values = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            values.add(make(pinterestjsonarray.d(i), false));
        }

        (new _cls2()).execute();
        return values;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public Integer getCount()
    {
        return count;
    }

    public String getDisplayCount()
    {
        return displayCount;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getDominantColor()
    {
        return dominantColor;
    }

    public String getDominantColorWithDefault()
    {
        if (StringUtils.isNotEmpty(dominantColor))
        {
            return dominantColor;
        } else
        {
            return "#32CD32";
        }
    }

    public Long getId()
    {
        return id;
    }

    public String getLargeIconUrl()
    {
        return largeIconUrl;
    }

    public String getSmallIconUrl()
    {
        return smallIconUrl;
    }

    public String getTypeValue()
    {
        return typeValue;
    }

    public String getUid()
    {
        return null;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setCount(Integer integer)
    {
        count = integer;
    }

    public void setDisplayCount(String s)
    {
        displayCount = s;
    }

    public void setDisplayName(String s)
    {
        displayName = s;
    }

    public void setDominantColor(String s)
    {
        dominantColor = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLargeIconUrl(String s)
    {
        largeIconUrl = s;
    }

    public void setSmallIconUrl(String s)
    {
        smallIconUrl = s;
    }

    public void setTypeValue(String s)
    {
        typeValue = s;
    }

    private class _cls1 extends BackgroundTask
    {

        final FilterOption val$option;

        public final void run()
        {
            ModelHelper.setFilterOption(option);
        }

        _cls1()
        {
            option = filteroption;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final ArrayList val$values;

        public final void run()
        {
            ModelHelper.setFilterOptions(values);
        }

        _cls2()
        {
            values = arraylist;
            super();
        }
    }

}
