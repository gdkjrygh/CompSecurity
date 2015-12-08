// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.onboarding.taste.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import gdw;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.onboarding.taste.model:
//            Question

public class GenreQuestionnaire
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new GenreQuestionnaire(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new GenreQuestionnaire[i];
        }

    };
    public final String id;
    public final List questions;

    protected GenreQuestionnaire(Parcel parcel)
    {
        id = parcel.readString();
        questions = parcel.createTypedArrayList(Question.CREATOR);
    }

    public GenreQuestionnaire(String s, List list)
    {
        id = (String)ctz.a(s);
        questions = gdw.a(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeList(questions);
    }

}
