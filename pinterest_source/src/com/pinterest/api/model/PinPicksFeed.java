// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, PinPicksSections, ModelHelper

public class PinPicksFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "PinPicksFeed";

    public PinPicksFeed()
    {
        super(null, null);
    }

    public PinPicksFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public PinPicksFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        if (pinterestjsonobject == null)
        {
            return;
        }
        pinterestjsonobject = pinterestjsonobject.c("data");
        if (pinterestjsonobject != null)
        {
            pinterestjsonobject = pinterestjsonobject.e("sections");
        } else
        {
            pinterestjsonobject = null;
        }
        s = pinterestjsonobject;
        if (pinterestjsonobject == null)
        {
            if (getData() instanceof PinterestJsonArray)
            {
                s = (PinterestJsonArray)getData();
            } else
            {
                s = new PinterestJsonArray();
            }
        }
        setItems(PinPicksSections.makeAll(s));
        setData(null);
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getPinPicksItems();
    }

    public FeedApiResponseHandler newApiHandler()
    {
        return new com.pinterest.api.remote.PinPicksApi.PinPickFeedApiResponseHandler();
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PinPicksFeed createFromParcel(Parcel parcel)
        {
            return new PinPicksFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PinPicksFeed[] newArray(int i)
        {
            return new PinPicksFeed[i];
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
