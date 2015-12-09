// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.collection;

import android.os.Parcel;
import dpp;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.collection:
//            PorcelainJsonCollection

public abstract class PorcelainBaseJsonCollection extends dpp
    implements PorcelainJsonCollection
{

    protected static final String KEY_ITEMS = "items";

    protected PorcelainBaseJsonCollection(String s, List list)
    {
        super(s, list);
    }

    public int describeContents()
    {
        return 0;
    }

    protected List getItems()
    {
        return super.getItems();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getId());
    }
}
