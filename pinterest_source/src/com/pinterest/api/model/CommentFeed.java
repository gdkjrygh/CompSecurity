// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Comment, ModelHelper

public class CommentFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "CommentFeed";

    public CommentFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public CommentFeed(CommentFeed commentfeed)
    {
        super(commentfeed);
    }

    public CommentFeed(String s, PinterestJsonObject pinterestjsonobject, String s1)
    {
        super(pinterestjsonobject, s1);
        if (pinterestjsonobject == null)
        {
            return;
        }
        pinterestjsonobject = new PinterestJsonArray();
        if (_data instanceof PinterestJsonArray)
        {
            pinterestjsonobject = (PinterestJsonArray)_data;
        }
        setItems(Comment.makeAll(s, pinterestjsonobject));
        setData(null);
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getComments(_ids);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CommentFeed createFromParcel(Parcel parcel)
        {
            return new CommentFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CommentFeed[] newArray(int i)
        {
            return new CommentFeed[i];
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
