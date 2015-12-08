// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            LogEvent

public final class LogEventCreator
    implements android.os.Parcelable.Creator
{

    public LogEventCreator()
    {
    }

    public static LogEvent createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l1 = 0L;
        long l = 0L;
        String s = null;
        byte abyte0[] = null;
        android.os.Bundle bundle = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 6: // '\006'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogEvent(i, l1, l, s, abyte0, bundle);
            }
        } while (true);
    }

    static void writeToParcel$298c9f3b(LogEvent logevent, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, logevent.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, logevent.eventTime);
        SafeParcelWriter.writeString(parcel, 3, logevent.tag, false);
        SafeParcelWriter.writeByteArray(parcel, 4, logevent.sourceExtensionBytes, false);
        SafeParcelWriter.writeBundle(parcel, 5, logevent.keyValuePairs, false);
        SafeParcelWriter.writeLong(parcel, 6, logevent.eventUptime);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LogEvent[i];
    }
}
