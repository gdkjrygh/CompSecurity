// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            PinFeed, SearchFilter, DynamicStory

public class GuidedPinFeed extends PinFeed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "GuidedPinFeed";
    private static final String STORY_FOLLOW_PINNER_HERO = "follow_pinner_hero";
    protected List _filters;
    protected List _relatedQueries;
    protected List _searchStories;

    public GuidedPinFeed()
    {
        super(null, null);
        _relatedQueries = new ArrayList();
        _filters = new ArrayList();
    }

    public GuidedPinFeed(Parcel parcel)
    {
        super(null, null);
        _relatedQueries = new ArrayList();
        _filters = new ArrayList();
        readFromParcel(parcel);
    }

    public GuidedPinFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        boolean flag = false;
        super(pinterestjsonobject, s);
        _relatedQueries = new ArrayList();
        _filters = new ArrayList();
        if (pinterestjsonobject != null)
        {
            s = pinterestjsonobject.e("terms");
            for (int i = 0; i < s.a(); i++)
            {
                RelatedQueryItem relatedqueryitem = new RelatedQueryItem();
                relatedqueryitem.setItem(s.c(i));
                _relatedQueries.add(relatedqueryitem);
            }

            s = pinterestjsonobject.c("filter_data");
            if (s != null)
            {
                _filters = SearchFilter.makeAll(s.e("filters"));
            }
            s = pinterestjsonobject.e("stories");
            _searchStories = new ArrayList(s.a());
            for (int j = 0; j < s.a(); j++)
            {
                DynamicStory dynamicstory = DynamicStory.make(s.c(j), false);
                _searchStories.add(dynamicstory);
            }

            pinterestjsonobject = pinterestjsonobject.e("price_buckets");
            int l = pinterestjsonobject.a();
            if (l > 0)
            {
                s = new StringBuilder();
                for (int k = ((flag) ? 1 : 0); k < l; k++)
                {
                    s.append(pinterestjsonobject.a(k));
                    if (k != l - 1)
                    {
                        s.append(",");
                    }
                }

                Preferences.user().set("PRICE_BUCKET", s.toString());
                return;
            }
        }
    }

    public List getRelatedQueries()
    {
        return _relatedQueries;
    }

    public List getSearchFilters()
    {
        return _filters;
    }

    public DynamicStory getSearchPinnerStory(int i)
    {
        Object obj = null;
        DynamicStory dynamicstory = obj;
        if (_searchStories != null)
        {
            dynamicstory = obj;
            if (i < _searchStories.size())
            {
                DynamicStory dynamicstory1 = (DynamicStory)_searchStories.get(i);
                dynamicstory = dynamicstory1;
                if (!dynamicstory1.getStoryType().equalsIgnoreCase("follow_pinner_hero"));
            }
        }
        return dynamicstory;
    }

    public DynamicStory getSearchStory(int i)
    {
        if (_searchStories != null && i < _searchStories.size())
        {
            return (DynamicStory)_searchStories.get(i);
        } else
        {
            return null;
        }
    }

    public boolean hasStories()
    {
        return _searchStories != null && _searchStories.size() > 0;
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final GuidedPinFeed createFromParcel(Parcel parcel)
        {
            return new GuidedPinFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final GuidedPinFeed[] newArray(int i)
        {
            return new GuidedPinFeed[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
