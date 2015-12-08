// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            Model, FilterOption

public class SearchFilter extends Model
{

    private int _selectedOption;
    private Date cacheExpirationDate;
    private String displayImageUrl;
    private String displayName;
    private Long id;
    private String mainOptionsTitle;
    private ArrayList options;
    private ArrayList topOptions;
    private String topOptionsTitle;
    private String type;
    private String typeValue;

    public SearchFilter()
    {
        _selectedOption = 0;
    }

    public SearchFilter(Long long1)
    {
        _selectedOption = 0;
        id = long1;
    }

    public SearchFilter(Long long1, Date date, String s, String s1, String s2, String s3, String s4, 
            String s5)
    {
        _selectedOption = 0;
        id = long1;
        cacheExpirationDate = date;
        type = s;
        displayName = s1;
        typeValue = s2;
        mainOptionsTitle = s3;
        topOptionsTitle = s4;
        displayImageUrl = s5;
    }

    public static SearchFilter make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true);
    }

    public static SearchFilter make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = null;
        } else
        {
            final SearchFilter filter = (SearchFilter)pinterestjsonobject.a(com/pinterest/api/model/SearchFilter);
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("display_image");
            if (pinterestjsonobject1 != null)
            {
                filter.setDisplayImageUrl(pinterestjsonobject1.a("android_phone_blurred_url", ""));
            }
            filter.options = FilterOption.makeAll(pinterestjsonobject.e("options"));
            filter.topOptions = FilterOption.makeAll(pinterestjsonobject.e("top_options"));
            pinterestjsonobject = filter;
            if (flag)
            {
                (new _cls1()).execute();
                return filter;
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

    public String getDisplayImageUrl()
    {
        return displayImageUrl;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getDominantColorWithDefault()
    {
        return "#bd081c";
    }

    public ArrayList getFilterOptions()
    {
        return options;
    }

    public Long getId()
    {
        return id;
    }

    public String getMainOptionsTitle()
    {
        return mainOptionsTitle;
    }

    public ArrayList getTopFilterOptions()
    {
        return topOptions;
    }

    public String getTopOptionsTitle()
    {
        return topOptionsTitle;
    }

    public String getType()
    {
        return type;
    }

    public String getTypeValue()
    {
        return typeValue;
    }

    public String getTypeValueOrOption()
    {
        if (typeValue != null)
        {
            return typeValue;
        }
        if (options.size() > _selectedOption)
        {
            return ((FilterOption)options.get(_selectedOption)).getTypeValue();
        } else
        {
            return "";
        }
    }

    public String getUid()
    {
        return null;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setDisplayImageUrl(String s)
    {
        displayImageUrl = s;
    }

    public void setDisplayName(String s)
    {
        displayName = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setMainOptionsTitle(String s)
    {
        mainOptionsTitle = s;
    }

    public void setTopOptionsTitle(String s)
    {
        topOptionsTitle = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setTypeValue(String s)
    {
        typeValue = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(getDisplayName());
        stringbuilder.append((new StringBuilder(" type:")).append(getType()).toString());
        if (options != null)
        {
            stringbuilder.append((new StringBuilder(" options:")).append(options.size()).toString());
        }
        if (topOptions != null)
        {
            stringbuilder.append((new StringBuilder(" top_options:")).append(topOptions.size()).toString());
        }
        return stringbuilder.toString();
    }

    private class _cls1 extends BackgroundTask
    {

        final SearchFilter val$filter;

        public final void run()
        {
            ModelHelper.setSearchFilter(filter);
        }

        _cls1()
        {
            filter = searchfilter;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final ArrayList val$values;

        public final void run()
        {
            ModelHelper.setSearchFilters(values);
        }

        _cls2()
        {
            values = arraylist;
            super();
        }
    }

}
