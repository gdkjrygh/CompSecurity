// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.os.Parcel;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            FeedAccessorFactory

private static class <init> extends <init>
{

    public static final android.os..FeedAccessorFactory.SimpleAccessor CREATOR = new android.os.Parcelable.Creator() {

        public FeedAccessorFactory.SimpleAccessor a(Parcel parcel)
        {
            return new FeedAccessorFactory.SimpleAccessor(parcel, null);
        }

        public FeedAccessorFactory.SimpleAccessor[] a(int i)
        {
            return new FeedAccessorFactory.SimpleAccessor[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };

    public CBCollagesResponse a()
        throws Exception
    {
        return null;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
    }

    _cls1(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }
}
