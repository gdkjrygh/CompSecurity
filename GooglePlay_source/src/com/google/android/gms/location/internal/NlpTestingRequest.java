// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.internal:
//            NlpTestingRequestCreator

public class NlpTestingRequest
    implements SafeParcelable
{

    public static final NlpTestingRequestCreator CREATOR = new NlpTestingRequestCreator();
    final long mTriggers;
    final int mVersionCode;

    NlpTestingRequest(int i, long l)
    {
        mVersionCode = i;
        mTriggers = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NlpTestingRequestCreator.writeToParcel$60e4c335(this, parcel);
    }

}
