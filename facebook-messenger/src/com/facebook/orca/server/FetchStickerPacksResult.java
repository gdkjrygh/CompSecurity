// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.orca.stickers.Sticker;
import com.facebook.orca.stickers.StickerPack;
import com.google.common.a.es;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.orca.server:
//            w

public class FetchStickerPacksResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new w();
    private final es a;
    private final es b;

    private FetchStickerPacksResult(Parcel parcel)
    {
        super(parcel);
        a = es.a(parcel.readArrayList(com/facebook/orca/stickers/StickerPack.getClassLoader()));
        b = es.a(parcel.readArrayList(com/facebook/orca/stickers/Sticker.getClassLoader()));
    }

    FetchStickerPacksResult(Parcel parcel, w w1)
    {
        this(parcel);
    }

    public FetchStickerPacksResult(b b1, List list, long l)
    {
        this(b1, list, null, l);
    }

    public FetchStickerPacksResult(b b1, List list, List list1, long l)
    {
        super(b1, l);
        a = es.a(list);
        if (list1 == null)
        {
            list1 = new ArrayList();
        }
        b = es.a(list1);
    }

    public es a()
    {
        return a;
    }

    public es b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeList(a);
        parcel.writeList(b);
    }

}
