// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternalCreator

public class LocationRequestInternal
    implements SafeParcelable
{

    public static final LocationRequestInternalCreator CREATOR = new LocationRequestInternalCreator();
    static final List DEFAULT_CLIENTS = Collections.emptyList();
    List mClients;
    boolean mHideFromAppOps;
    LocationRequest mLocationRequest;
    boolean mRequestNlpDebugInfo;
    boolean mRestorePendingIntentListeners;
    String mTag;
    boolean mTriggerUpdate;
    final int mVersionCode;

    LocationRequestInternal(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s, 
            boolean flag3)
    {
        mVersionCode = i;
        mLocationRequest = locationrequest;
        mRequestNlpDebugInfo = flag;
        mRestorePendingIntentListeners = flag1;
        mTriggerUpdate = flag2;
        mClients = list;
        mTag = s;
        mHideFromAppOps = flag3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof LocationRequestInternal)
        {
            if (Objects.equal(mLocationRequest, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).mLocationRequest) && mRequestNlpDebugInfo == ((LocationRequestInternal) (obj)).mRequestNlpDebugInfo && mRestorePendingIntentListeners == ((LocationRequestInternal) (obj)).mRestorePendingIntentListeners && mTriggerUpdate == ((LocationRequestInternal) (obj)).mTriggerUpdate && mHideFromAppOps == ((LocationRequestInternal) (obj)).mHideFromAppOps && Objects.equal(mClients, ((LocationRequestInternal) (obj)).mClients))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return mLocationRequest.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(mLocationRequest.toString());
        if (mTag != null)
        {
            stringbuilder.append(" tag=").append(mTag);
        }
        stringbuilder.append(" nlpDebug=").append(mRequestNlpDebugInfo);
        stringbuilder.append(" trigger=").append(mTriggerUpdate);
        stringbuilder.append(" restorePIListeners=").append(mRestorePendingIntentListeners);
        stringbuilder.append(" hideAppOps=").append(mHideFromAppOps);
        stringbuilder.append(" clients=").append(mClients);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationRequestInternalCreator.writeToParcel(this, parcel, i);
    }

}
