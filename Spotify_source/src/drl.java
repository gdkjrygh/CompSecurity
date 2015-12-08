// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainBaseJsonCollection;

public abstract class drl
    implements android.os.Parcelable.Creator
{

    public drl()
    {
    }

    public abstract PorcelainBaseJsonCollection a(String s, Parcel parcel);

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel.readString(), parcel);
    }
}
