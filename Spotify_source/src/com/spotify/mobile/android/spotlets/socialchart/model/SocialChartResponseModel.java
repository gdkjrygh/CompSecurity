// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

// Referenced classes of package com.spotify.mobile.android.spotlets.socialchart.model:
//            UserModel, SuggestionModel

public class SocialChartResponseModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SocialChartResponseModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SocialChartResponseModel[i];
        }

    };
    private SuggestionModel mSuggestionModel;
    private UserModel mUserModel;

    public SocialChartResponseModel(Parcel parcel)
    {
        mUserModel = (UserModel)parcel.readParcelable(com/spotify/mobile/android/spotlets/socialchart/model/UserModel.getClassLoader());
        mSuggestionModel = (SuggestionModel)parcel.readParcelable(com/spotify/mobile/android/spotlets/socialchart/model/SuggestionModel.getClassLoader());
    }

    public SocialChartResponseModel(UserModel usermodel, SuggestionModel suggestionmodel)
    {
        ctz.a(usermodel);
        ctz.a(suggestionmodel);
        mUserModel = usermodel;
        mSuggestionModel = suggestionmodel;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SocialChartResponseModel)obj;
            if (!mSuggestionModel.equals(((SocialChartResponseModel) (obj)).mSuggestionModel))
            {
                return false;
            }
            if (!mUserModel.equals(((SocialChartResponseModel) (obj)).mUserModel))
            {
                return false;
            }
        }
        return true;
    }

    public SuggestionModel getSuggestionModel()
    {
        return mSuggestionModel;
    }

    public UserModel getUserModel()
    {
        return mUserModel;
    }

    public int hashCode()
    {
        return mUserModel.hashCode() * 31 + mSuggestionModel.hashCode();
    }

    public boolean isEmpty()
    {
        return mUserModel.getTrackModels().length == 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mUserModel, 0);
        parcel.writeParcelable(mSuggestionModel, 0);
    }

}
