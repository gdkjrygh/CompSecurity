// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Conversation

public class ConversationFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();

    public ConversationFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public ConversationFeed(PinterestJsonArray pinterestjsonarray, String s)
    {
        setBaseUrl(s);
        if (pinterestjsonarray != null)
        {
            setData(pinterestjsonarray);
            setItems(Conversation.makeAll(pinterestjsonarray));
        }
    }

    public ConversationFeed(List list)
    {
        setItems(list);
    }

    protected List getPersistedItems()
    {
        return null;
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ConversationFeed createFromParcel(Parcel parcel)
        {
            return new ConversationFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ConversationFeed[] newArray(int i)
        {
            return new ConversationFeed[i];
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
