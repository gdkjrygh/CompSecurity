// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnStartStreamSessionCreator

public class OnStartStreamSession
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new OnStartStreamSessionCreator();
    final IBinder mCloseToken;
    final ParcelFileDescriptor mPfd;
    final String mSignature;
    final int mVersionCode;

    OnStartStreamSession(int i, ParcelFileDescriptor parcelfiledescriptor, IBinder ibinder, String s)
    {
        mVersionCode = i;
        mPfd = parcelfiledescriptor;
        mCloseToken = ibinder;
        mSignature = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        OnStartStreamSessionCreator.writeToParcel(this, parcel, i | 1);
    }

}
