// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.stats:
//            ConnectionEvent

public final class ConnectionEventCreator
    implements android.os.Parcelable.Creator
{

    public ConnectionEventCreator()
    {
    }

    static void writeToParcel$151b04f0(ConnectionEvent connectionevent, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, connectionevent.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, connectionevent.mTimeMillis);
        SafeParcelWriter.writeString(parcel, 4, connectionevent.mCallingProcess, false);
        SafeParcelWriter.writeString(parcel, 5, connectionevent.mCallingService, false);
        SafeParcelWriter.writeString(parcel, 6, connectionevent.mTargetProcess, false);
        SafeParcelWriter.writeString(parcel, 7, connectionevent.mTargetService, false);
        SafeParcelWriter.writeString(parcel, 8, connectionevent.mStackTrace, false);
        SafeParcelWriter.writeLong(parcel, 10, connectionevent.mElapsedRealtime);
        SafeParcelWriter.writeLong(parcel, 11, connectionevent.mHeapAlloc);
        SafeParcelWriter.writeInt(parcel, 12, connectionevent.mEventType);
        SafeParcelWriter.writeString(parcel, 13, connectionevent.mConnKey, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        long l3 = 0L;
        int i = 0;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 3: // '\003'
                case 9: // '\t'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    l3 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    s5 = SafeParcelReader.createString(parcel, l);
                    break;

                case 5: // '\005'
                    s4 = SafeParcelReader.createString(parcel, l);
                    break;

                case 6: // '\006'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 7: // '\007'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 8: // '\b'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 10: // '\n'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 11: // '\013'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 12: // '\f'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 13: // '\r'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ConnectionEvent(j, l3, i, s5, s4, s3, s2, s1, s, l2, l1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConnectionEvent[i];
    }
}
