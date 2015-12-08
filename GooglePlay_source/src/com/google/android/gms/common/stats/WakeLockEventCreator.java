// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.stats:
//            WakeLockEvent

public final class WakeLockEventCreator
    implements android.os.Parcelable.Creator
{

    public WakeLockEventCreator()
    {
    }

    static void writeToParcel$7ab08521(WakeLockEvent wakelockevent, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, wakelockevent.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, wakelockevent.mTimeMillis);
        SafeParcelWriter.writeString(parcel, 4, wakelockevent.mWakeLockName, false);
        SafeParcelWriter.writeInt(parcel, 5, wakelockevent.mWakeLockType);
        SafeParcelWriter.writeStringList(parcel, 6, wakelockevent.mCallingPackages, false);
        SafeParcelWriter.writeLong(parcel, 8, wakelockevent.mElapsedRealtime);
        SafeParcelWriter.writeString(parcel, 10, wakelockevent.mSecondaryWakeLockName, false);
        SafeParcelWriter.writeInt(parcel, 11, wakelockevent.mEventType);
        SafeParcelWriter.writeString(parcel, 12, wakelockevent.mEventKey, false);
        SafeParcelWriter.writeString(parcel, 13, wakelockevent.mHostPackageName, false);
        SafeParcelWriter.writeInt(parcel, 14, wakelockevent.mDeviceState);
        SafeParcelWriter.writeFloat(parcel, 15, wakelockevent.mBeginPowerPercentage);
        SafeParcelWriter.writeLong(parcel, 16, wakelockevent.mTimeout);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        long l3 = 0L;
        int k = 0;
        String s3 = null;
        int j = 0;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        long l2 = 0L;
        int i = 0;
        String s1 = null;
        String s = null;
        float f = 0.0F;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                case 3: // '\003'
                case 7: // '\007'
                case 9: // '\t'
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    l3 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 4: // '\004'
                    s3 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 5: // '\005'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 6: // '\006'
                    arraylist = SafeParcelReader.createStringList(parcel, j1);
                    break;

                case 8: // '\b'
                    l2 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 10: // '\n'
                    s1 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 11: // '\013'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 12: // '\f'
                    s2 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 13: // '\r'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 14: // '\016'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 15: // '\017'
                    f = SafeParcelReader.readFloat(parcel, j1);
                    break;

                case 16: // '\020'
                    l1 = SafeParcelReader.readLong(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new WakeLockEvent(l, l3, k, s3, j, arraylist, s2, l2, i, s1, s, f, l1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new WakeLockEvent[i];
    }
}
