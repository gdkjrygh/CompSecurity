// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Interest, ModelHelper

public class InterestsFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "InterestsFeed";

    public InterestsFeed()
    {
        super(null, null);
    }

    public InterestsFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public InterestsFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        if (pinterestjsonobject == null)
        {
            return;
        }
        if (_data instanceof PinterestJsonArray)
        {
            setItems(Interest.makeAll((PinterestJsonArray)_data));
        } else
        {
            setItems(new ArrayList());
        }
        setData(null);
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getInterests(_ids);
    }

    public FeedApiResponseHandler newApiHandler()
    {
        return new com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse();
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final InterestsFeed createFromParcel(Parcel parcel)
        {
            return new InterestsFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final InterestsFeed[] newArray(int i)
        {
            return new InterestsFeed[i];
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
