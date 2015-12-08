// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            BoardFeed

public class GuidedBoardFeed extends BoardFeed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "GuidedBoardFeed";
    protected List _relatedQueries;

    public GuidedBoardFeed()
    {
        super(null, null);
        _relatedQueries = new ArrayList();
    }

    public GuidedBoardFeed(Parcel parcel)
    {
        super(null, null);
        _relatedQueries = new ArrayList();
        readFromParcel(parcel);
    }

    public GuidedBoardFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        _relatedQueries = new ArrayList();
        if (pinterestjsonobject != null)
        {
            pinterestjsonobject = pinterestjsonobject.e("terms");
            int i = 0;
            while (i < pinterestjsonobject.a()) 
            {
                s = new RelatedQueryItem();
                s.setItem(pinterestjsonobject.c(i));
                _relatedQueries.add(s);
                i++;
            }
        }
    }

    public List getRelatedQueries()
    {
        return _relatedQueries;
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final GuidedBoardFeed createFromParcel(Parcel parcel)
        {
            return new GuidedBoardFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final GuidedBoardFeed[] newArray(int i)
        {
            return new GuidedBoardFeed[i];
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
