// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Story, ModelHelper, Model

public class StoryFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "StoryFeed";

    public StoryFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public StoryFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setItems(Story.makeAll(pinterestjsonobject.e("data")));
            setData(null);
            return;
        }
    }

    protected volatile String getItemId(Model model)
    {
        return getItemId((Story)model);
    }

    protected String getItemId(Story story)
    {
        return story.getUid();
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getStories(_ids);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final StoryFeed createFromParcel(Parcel parcel)
        {
            return new StoryFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final StoryFeed[] newArray(int i)
        {
            return new StoryFeed[i];
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
