// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            SaveRequestCreator

public final class SaveRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SaveRequestCreator();
    final Credential mCredential;
    final int mVersionCode;

    SaveRequest(int i, Credential credential)
    {
        mVersionCode = i;
        mCredential = credential;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        SaveRequestCreator.writeToParcel(this, parcel, i);
    }

}
