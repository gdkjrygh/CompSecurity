// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable:
//            ConnectionConfiguration

public final class ConnectionConfigurationCreator
    implements android.os.Parcelable.Creator
{

    public ConnectionConfigurationCreator()
    {
    }

    static void writeToParcel$3e41336a(ConnectionConfiguration connectionconfiguration, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, connectionconfiguration.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, connectionconfiguration.mName, false);
        SafeParcelWriter.writeString(parcel, 3, connectionconfiguration.mAddress, false);
        SafeParcelWriter.writeInt(parcel, 4, connectionconfiguration.mType);
        SafeParcelWriter.writeInt(parcel, 5, connectionconfiguration.mRole);
        SafeParcelWriter.writeBoolean(parcel, 6, connectionconfiguration.mConnectionEnabled);
        SafeParcelWriter.writeBoolean(parcel, 7, connectionconfiguration.mIsConnected);
        SafeParcelWriter.writeString(parcel, 8, connectionconfiguration.mPeerNodeId, false);
        SafeParcelWriter.writeBoolean(parcel, 9, connectionconfiguration.mBtlePriority);
        SafeParcelWriter.writeString(parcel, 10, connectionconfiguration.mNodeId, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        int j = 0;
        String s2 = null;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 6: // '\006'
                    flag2 = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 7: // '\007'
                    flag1 = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 8: // '\b'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 10: // '\n'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ConnectionConfiguration(k, s3, s2, j, i, flag2, flag1, s1, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConnectionConfiguration[i];
    }
}
