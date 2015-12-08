// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.reporting:
//            ReportingState, OptInResult

public final class ReportingStateCreator
    implements android.os.Parcelable.Creator
{

    public ReportingStateCreator()
    {
    }

    static void writeToParcel$9c64f86(ReportingState reportingstate, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, reportingstate.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, ReportingState.Setting.sanitize(reportingstate.mReportingEnabled));
        SafeParcelWriter.writeInt(parcel, 3, ReportingState.Setting.sanitize(reportingstate.mHistoryEnabled));
        SafeParcelWriter.writeBoolean(parcel, 4, reportingstate.mAllowed);
        SafeParcelWriter.writeBoolean(parcel, 5, reportingstate.mActive);
        SafeParcelWriter.writeInt(parcel, 7, OptInResult.sanitize(reportingstate.mExpectedOptInResult));
        SafeParcelWriter.writeIntegerObject$1ed7098(parcel, 8, reportingstate.mDeviceTag);
        SafeParcelWriter.writeInt(parcel, 9, OptInResult.sanitize(reportingstate.mExpectedOptInResultAssumingLocationEnabled));
        SafeParcelWriter.writeBoolean(parcel, 10, reportingstate.mCanAccessSettings);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j1 = SafeParcelReader.validateObjectHeader(parcel);
        Integer integer = null;
        int i = 0;
        int j = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        int k = 0;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                case 6: // '\006'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k1);
                    break;

                case 1: // '\001'
                    i1 = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 2: // '\002'
                    l = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 4: // '\004'
                    flag2 = SafeParcelReader.readBoolean(parcel, k1);
                    break;

                case 5: // '\005'
                    flag1 = SafeParcelReader.readBoolean(parcel, k1);
                    break;

                case 7: // '\007'
                    j = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 8: // '\b'
                    integer = SafeParcelReader.readIntegerObject(parcel, k1);
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 10: // '\n'
                    flag = SafeParcelReader.readBoolean(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new ReportingState(i1, l, k, flag2, flag1, j, i, integer, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ReportingState[i];
    }
}
