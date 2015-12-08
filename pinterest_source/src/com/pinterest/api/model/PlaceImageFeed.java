// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, PlaceImage

public class PlaceImageFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "PlaceImageFeed";

    public PlaceImageFeed()
    {
        super(null, null);
    }

    public PlaceImageFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public PlaceImageFeed(PinterestJsonObject pinterestjsonobject)
    {
        super(pinterestjsonobject, null);
        if (pinterestjsonobject == null)
        {
            return;
        }
        pinterestjsonobject = pinterestjsonobject.e("data");
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < pinterestjsonobject.a(); i++)
        {
            PlaceImage placeimage = new PlaceImage(pinterestjsonobject.d(i));
            if (placeimage.isThumbValid())
            {
                arraylist.add(placeimage);
            }
        }

        setItems(arraylist);
        setData(null);
    }

    protected List getPersistedItems()
    {
        return Collections.emptyList();
    }

    public void onStop()
    {
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PlaceImageFeed createFromParcel(Parcel parcel)
        {
            return new PlaceImageFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlaceImageFeed[] newArray(int i)
        {
            return new PlaceImageFeed[i];
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
