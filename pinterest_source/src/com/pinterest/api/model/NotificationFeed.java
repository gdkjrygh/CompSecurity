// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Notification, ModelHelper, Model

public class NotificationFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "NotificationFeed";

    public NotificationFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public NotificationFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setItems(Notification.makeAll(pinterestjsonobject.e("data")));
            setData(null);
            return;
        }
    }

    protected volatile String getItemId(Model model)
    {
        return getItemId((Notification)model);
    }

    protected String getItemId(Notification notification)
    {
        return notification.getUid();
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getNotifications(_ids);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final NotificationFeed createFromParcel(Parcel parcel)
        {
            return new NotificationFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final NotificationFeed[] newArray(int i)
        {
            return new NotificationFeed[i];
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
