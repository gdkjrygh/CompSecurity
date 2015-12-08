// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupLocationInfoParcelableCreator

public final class PopupLocationInfoParcelable
    implements SafeParcelable
{

    public static final PopupLocationInfoParcelableCreator CREATOR = new PopupLocationInfoParcelableCreator();
    public final Bundle mInfoBundle;
    final int mVersionCode;
    public final IBinder mWindowToken;

    PopupLocationInfoParcelable(int i, Bundle bundle, IBinder ibinder)
    {
        mVersionCode = i;
        mInfoBundle = bundle;
        mWindowToken = ibinder;
    }

    public PopupLocationInfoParcelable(PopupManager.PopupLocationInfo popuplocationinfo)
    {
        mVersionCode = 1;
        mInfoBundle = popuplocationinfo.getInfoBundle();
        mWindowToken = popuplocationinfo.windowToken;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PopupLocationInfoParcelableCreator.writeToParcel$37c3114a(this, parcel);
    }

}
