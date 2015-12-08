// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.signin.internal:
//            AuthAccountResultCreator

public class AuthAccountResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AuthAccountResultCreator();
    int mConnectionResultCode;
    Intent mRawAuthResultionIntent;
    final int mVersionCode;

    public AuthAccountResult()
    {
        this(0);
    }

    public AuthAccountResult(int i)
    {
        this(2, i, null);
    }

    AuthAccountResult(int i, int j, Intent intent)
    {
        mVersionCode = i;
        mConnectionResultCode = j;
        mRawAuthResultionIntent = intent;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Status getStatus()
    {
        if (mConnectionResultCode == 0)
        {
            return Status.RESULT_SUCCESS;
        } else
        {
            return Status.RESULT_CANCELED;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AuthAccountResultCreator.writeToParcel(this, parcel, i);
    }

}
