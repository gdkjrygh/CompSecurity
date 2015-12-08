// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyResponseCreator

public class ProxyResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ProxyResponseCreator();
    public final byte body[];
    public final int googlePlayServicesStatusCode;
    final Bundle headers;
    public final PendingIntent recoveryAction;
    public final int statusCode;
    final int versionCode;

    ProxyResponse(int i, int j, PendingIntent pendingintent, int k, Bundle bundle, byte abyte0[])
    {
        versionCode = i;
        googlePlayServicesStatusCode = j;
        statusCode = k;
        headers = bundle;
        body = abyte0;
        recoveryAction = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ProxyResponseCreator.writeToParcel(this, parcel, i);
    }

}
