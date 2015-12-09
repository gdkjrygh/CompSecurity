// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.collection;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonItem;
import drl;
import java.util.LinkedList;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.collection:
//            PorcelainJsonImmutableLinearCollection, PorcelainBaseJsonCollection

final class  extends drl
{

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

    ()
    {
    }
}
