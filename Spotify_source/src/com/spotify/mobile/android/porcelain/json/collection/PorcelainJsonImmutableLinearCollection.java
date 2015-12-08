// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.collection;

import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonItem;
import cuq;
import dps;
import drl;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.collection:
//            PorcelainBaseJsonCollection

public class PorcelainJsonImmutableLinearCollection extends PorcelainBaseJsonCollection
{

    public static final android.os.Parcelable.Creator CREATOR = new drl() {

        public final PorcelainBaseJsonCollection a(String s, Parcel parcel)
        {
            LinkedList linkedlist = new LinkedList();
            parcel.readList(linkedlist, com/spotify/mobile/android/porcelain/json/item/PorcelainJsonItem.getClassLoader());
            return new PorcelainJsonImmutableLinearCollection(s, linkedlist);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PorcelainJsonImmutableLinearCollection[i];
        }

    };
    public static final PorcelainJsonImmutableLinearCollection EMPTY = new PorcelainJsonImmutableLinearCollection("empty", ImmutableList.d());

    public PorcelainJsonImmutableLinearCollection(String s, List list)
    {
        super(s, list);
    }

    public PorcelainJsonImmutableLinearCollection append(PorcelainJsonImmutableLinearCollection porcelainjsonimmutablelinearcollection)
    {
        return new PorcelainJsonImmutableLinearCollection(getId(), ImmutableList.h().b(getItems()).b(porcelainjsonimmutablelinearcollection.getItems()).a());
    }

    public volatile dps append(dps dps)
    {
        return append((PorcelainJsonImmutableLinearCollection)dps);
    }

    public volatile int describeContents()
    {
        return super.describeContents();
    }

    public int getType()
    {
        return 0x7f1100eb;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeList(getItems());
    }

}
