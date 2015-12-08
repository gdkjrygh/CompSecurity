// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.reporting:
//            ReportingStateCreator

public class ReportingState
    implements SafeParcelable
{
    public static final class Setting
    {

        public static int sanitize(int i)
        {
            int j = i;
            i;
            JVM INSTR tableswitch -2 1: default 32
        //                       -2 45
        //                       -1 45
        //                       0 45
        //                       1 45;
               goto _L1 _L2 _L2 _L2 _L2
_L1:
            if (i > 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0) goto _L4; else goto _L3
_L3:
            j = 99;
_L2:
            return j;
_L4:
            return -3;
        }
    }


    public static final ReportingStateCreator CREATOR = new ReportingStateCreator();
    final boolean mActive;
    final boolean mAllowed;
    final boolean mCanAccessSettings;
    final Integer mDeviceTag;
    final int mExpectedOptInResult;
    final int mExpectedOptInResultAssumingLocationEnabled;
    final int mHistoryEnabled;
    final int mReportingEnabled;
    final int mVersionCode;

    public ReportingState(int i, int j, int k, boolean flag, boolean flag1, int l, int i1, 
            Integer integer, boolean flag2)
    {
        mVersionCode = i;
        mReportingEnabled = j;
        mHistoryEnabled = k;
        mAllowed = flag;
        mActive = flag1;
        mExpectedOptInResult = l;
        mExpectedOptInResultAssumingLocationEnabled = i1;
        mDeviceTag = integer;
        mCanAccessSettings = flag2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ReportingState)
        {
            if (mReportingEnabled == ((ReportingState) (obj = (ReportingState)obj)).mReportingEnabled && mHistoryEnabled == ((ReportingState) (obj)).mHistoryEnabled && mAllowed == ((ReportingState) (obj)).mAllowed && mActive == ((ReportingState) (obj)).mActive && mExpectedOptInResult == ((ReportingState) (obj)).mExpectedOptInResult && mExpectedOptInResultAssumingLocationEnabled == ((ReportingState) (obj)).mExpectedOptInResultAssumingLocationEnabled && Objects.equal(mDeviceTag, ((ReportingState) (obj)).mDeviceTag) && mCanAccessSettings == ((ReportingState) (obj)).mCanAccessSettings)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mReportingEnabled), Integer.valueOf(mHistoryEnabled), Boolean.valueOf(mAllowed), Boolean.valueOf(mActive), Integer.valueOf(mExpectedOptInResult), Integer.valueOf(mExpectedOptInResultAssumingLocationEnabled), mDeviceTag, Boolean.valueOf(mCanAccessSettings)
        });
    }

    public String toString()
    {
        Object obj;
        if (mDeviceTag != null)
        {
            obj = mDeviceTag;
            if (obj == null)
            {
                obj = "(null)";
            } else
            if (Log.isLoggable("GCoreUlr", 2))
            {
                obj = String.valueOf(obj);
            } else
            {
                obj = (new StringBuilder("tag#")).append(((Integer) (obj)).intValue() % 20).toString();
            }
        } else
        {
            obj = "(hidden-from-unauthorized-caller)";
        }
        return (new StringBuilder("ReportingState{mReportingEnabled=")).append(mReportingEnabled).append(", mHistoryEnabled=").append(mHistoryEnabled).append(", mAllowed=").append(mAllowed).append(", mActive=").append(mActive).append(", mExpectedOptInResult=").append(mExpectedOptInResult).append(", mExpectedOptInResultAssumingLocationEnabled=").append(mExpectedOptInResultAssumingLocationEnabled).append(", mVersionCode=").append(mVersionCode).append(", mDeviceTag=").append(((String) (obj))).append(", mCanAccessSettings=").append(mCanAccessSettings).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ReportingStateCreator.writeToParcel$9c64f86(this, parcel);
    }

}
