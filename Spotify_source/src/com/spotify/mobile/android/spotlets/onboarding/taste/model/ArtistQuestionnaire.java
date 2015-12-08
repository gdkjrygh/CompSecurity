// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.onboarding.taste.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.onboarding.taste.model:
//            Question

public class ArtistQuestionnaire
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ArtistQuestionnaire(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ArtistQuestionnaire[i];
        }

    };
    public final String id;
    public final List questions;

    protected ArtistQuestionnaire(Parcel parcel)
    {
        id = parcel.readString();
        questions = parcel.createTypedArrayList(Question.CREATOR);
    }

    public ArtistQuestionnaire(String s, List list)
    {
        id = (String)ctz.a(s);
        questions = (List)Optional.c(list).a(Collections.emptyList());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeTypedList(questions);
    }

}
