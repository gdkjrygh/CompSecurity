// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cua;
import cuv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.findfriends.model:
//            ResultModel

public class FindFriendsModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new FindFriendsModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new FindFriendsModel[i];
        }

    };
    private static final cua PREDICATE = new cua() {

        public final boolean a(Object obj)
        {
            obj = (ResultModel)obj;
            return obj == null || TextUtils.isEmpty(((ResultModel) (obj)).getUri());
        }

    };
    private final List mResults;

    public FindFriendsModel(Parcel parcel)
    {
        mResults = parcel.createTypedArrayList(ResultModel.CREATOR);
    }

    public FindFriendsModel(ResultModel aresultmodel[])
    {
        if (aresultmodel == null)
        {
            aresultmodel = new ArrayList();
        } else
        {
            aresultmodel = new ArrayList(Arrays.asList(aresultmodel));
        }
        mResults = aresultmodel;
        cuv.a(mResults, PREDICATE);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (FindFriendsModel)obj;
            return mResults.equals(((FindFriendsModel) (obj)).mResults);
        }
    }

    public List getResults()
    {
        return mResults;
    }

    public int hashCode()
    {
        return mResults.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(mResults);
    }

}
