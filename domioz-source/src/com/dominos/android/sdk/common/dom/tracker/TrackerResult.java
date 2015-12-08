// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;

import android.os.Parcel;
import android.os.Parcelable;
import com.dominos.android.sdk.common.core.ListNode;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Xml;
import com.google.a.b.ar;
import com.google.a.b.at;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.common.dom.tracker:
//            TrackerOrderStatus

public class TrackerResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final ar orderStatuses;

    public TrackerResult(Parcel parcel)
    {
        orderStatuses = ar.a((TrackerOrderStatus[])parcel.createTypedArray(TrackerOrderStatus.CREATOR));
    }

    private TrackerResult(ar ar1)
    {
        orderStatuses = ar1;
    }

    TrackerResult(ar ar1, _cls1 _pcls1)
    {
        this(ar1);
    }

    public static TrackerResult from(String s)
    {
        return from((new MapNode(Xml.parse(s))).get("Envelope").get("Body").get("GetTrackerDataResponse").asMap());
    }

    public static TrackerResult from(Map map)
    {
        Object obj = new MapNode(map);
        map = ar.g();
        for (obj = ((MapNode) (obj)).get("OrderStatuses").getList("OrderStatus").iterator(); ((Iterator) (obj)).hasNext(); map.c(TrackerOrderStatus.from(((MapNode)((Iterator) (obj)).next()).asMap()))) { }
        return (new Builder()).setOrderStatuses(map.a()).build();
    }

    public int describeContents()
    {
        return 0;
    }

    public ar getOrderStatuses()
    {
        return orderStatuses;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray((Parcelable[])orderStatuses.toArray(new TrackerOrderStatus[orderStatuses.size()]), i);
    }


    private class Builder
    {

        private ar orderStatuses;

        public TrackerResult build()
        {
            return new TrackerResult(orderStatuses, null);
        }

        public Builder setOrderStatuses(ar ar1)
        {
            orderStatuses = ar1;
            return this;
        }

        public Builder()
        {
            orderStatuses = ar.d();
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final TrackerResult createFromParcel(Parcel parcel)
        {
            return new TrackerResult(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final TrackerResult[] newArray(int i)
        {
            return new TrackerResult[i];
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
