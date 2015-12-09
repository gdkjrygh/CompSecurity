// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.signin.internal:
//            CheckServerAuthResultCreator

public class CheckServerAuthResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CheckServerAuthResultCreator();
    final List mAdditionalScopes;
    final boolean mNewAuthCodeRequired;
    final int mVersionCode;

    CheckServerAuthResult(int i, boolean flag, List list)
    {
        mVersionCode = i;
        mNewAuthCodeRequired = flag;
        mAdditionalScopes = list;
    }

    public CheckServerAuthResult(boolean flag, Set set)
    {
        this(1, false, Collections.emptyList());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CheckServerAuthResultCreator.writeToParcel$2809d959(this, parcel);
    }

}
