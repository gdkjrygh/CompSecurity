// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.s;

// Referenced classes of package com.facebook.orca.server:
//            u, v

public class FetchStickerPacksParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new u();
    private final v a;
    private final boolean b;
    private final s c;

    private FetchStickerPacksParams(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = v.valueOf(parcel.readString());
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        b = flag;
        c = s.valueOf(parcel.readString());
    }

    FetchStickerPacksParams(Parcel parcel, u u1)
    {
        this(parcel);
    }

    public FetchStickerPacksParams(v v1, s s1)
    {
        this(v1, false, s1);
    }

    public FetchStickerPacksParams(v v1, boolean flag, s s1)
    {
        a = v1;
        b = flag;
        c = s1;
    }

    public v a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public s c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(c.toString());
    }

}
