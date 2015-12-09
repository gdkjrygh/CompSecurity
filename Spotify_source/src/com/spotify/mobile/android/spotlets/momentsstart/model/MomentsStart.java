// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import cty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.model:
//            Moment, MomentFlags

public class MomentsStart
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MomentsStart(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MomentsStart[i];
        }

    };
    public final MomentFlags flags;
    private final String mSuggestedMomentId;
    public final List moments;
    public final int suggestedMomentItem;

    private MomentsStart(Parcel parcel)
    {
        mSuggestedMomentId = parcel.readString();
        moments = parcel.createTypedArrayList(Moment.CREATOR);
        suggestedMomentItem = findSuggestedMomentItem(mSuggestedMomentId);
        flags = (MomentFlags)parcel.readParcelable(com/spotify/mobile/android/spotlets/momentsstart/model/MomentFlags.getClassLoader());
    }


    public MomentsStart(String s, List list, MomentFlags momentflags)
    {
        mSuggestedMomentId = s;
        moments = (List)Optional.c(list).a(new ArrayList());
        flags = (MomentFlags)Optional.c(momentflags).a(new MomentFlags(false, false, false));
        suggestedMomentItem = findSuggestedMomentItem(mSuggestedMomentId);
    }

    private int findSuggestedMomentItem(String s)
    {
        s = findMomentById(s);
        if (s == null)
        {
            return 0;
        } else
        {
            return moments.indexOf(s);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof MomentsStart)
            {
                if (!cty.a(Integer.valueOf(suggestedMomentItem), Integer.valueOf(((MomentsStart) (obj = (MomentsStart)obj)).suggestedMomentItem)) || !cty.a(moments, ((MomentsStart) (obj)).moments) || !cty.a(flags, ((MomentsStart) (obj)).flags))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public Moment findMomentById(String s)
    {
        for (Iterator iterator = moments.iterator(); iterator.hasNext();)
        {
            Moment moment = (Moment)iterator.next();
            if (TextUtils.equals(moment.id, s))
            {
                return moment;
            }
        }

        return null;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(suggestedMomentItem), moments, flags
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mSuggestedMomentId);
        parcel.writeTypedList(moments);
        parcel.writeParcelable(flags, i);
    }

}
