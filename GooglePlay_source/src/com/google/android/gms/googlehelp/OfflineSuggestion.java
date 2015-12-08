// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.googlehelp:
//            OfflineSuggestionCreator

public final class OfflineSuggestion
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OfflineSuggestionCreator();
    final String mBody;
    final String mBrowseUrl;
    final String mId;
    final String mTitle;
    final int mVersionCode;

    OfflineSuggestion(int i, String s, String s1, String s2, String s3)
    {
        mVersionCode = i;
        mId = s;
        mTitle = s1;
        mBody = s2;
        mBrowseUrl = s3;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        OfflineSuggestionCreator.writeToParcel$15961926(this, parcel);
    }

}
