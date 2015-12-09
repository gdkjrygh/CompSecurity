// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.recentlyplayed;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import fip;
import gen;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.recentlyplayed:
//            RecentlyPlayedItem

public class RecentlyPlayedItems
    implements Parcelable, JacksonModel, fip
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new RecentlyPlayedItems(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new RecentlyPlayedItems[i];
        }

    };
    public List items;
    public int length;
    public boolean loaded;

    public RecentlyPlayedItems(int i, boolean flag, List list)
    {
        length = i;
        loaded = flag;
        items = (List)Optional.c(list).a(new ArrayList());
    }

    private RecentlyPlayedItems(Parcel parcel)
    {
        length = parcel.readInt();
        loaded = gen.a(parcel);
        items = new ArrayList();
        parcel.readTypedList(items, RecentlyPlayedItem.CREATOR);
    }


    public int describeContents()
    {
        return 0;
    }

    public RecentlyPlayedItem[] getItems()
    {
        return (RecentlyPlayedItem[])items.toArray(new RecentlyPlayedItem[items.size()]);
    }

    public volatile Object[] getItems()
    {
        return getItems();
    }

    public int getUnfilteredLength()
    {
        return length;
    }

    public int getUnrangedLength()
    {
        return length;
    }

    public boolean isLoading()
    {
        return !loaded;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(length);
        gen.a(parcel, loaded);
        parcel.writeTypedList(items);
    }

}
