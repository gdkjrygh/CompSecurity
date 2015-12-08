// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

// Referenced classes of package com.google.android.gms.clearcut:
//            LogEventParcelable

public final class LogEventParcelableCreator
    implements android.os.Parcelable.Creator
{

    public LogEventParcelableCreator()
    {
    }

    public static LogEventParcelable createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        PlayLoggerContext playloggercontext = null;
        byte abyte0[] = null;
        int ai[] = null;
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
                    playloggercontext = (PlayLoggerContext)SafeParcelReader.createParcelable(parcel, k, PlayLoggerContext.CREATOR);
                    break;

                case 3: // '\003'
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 4: // '\004'
                    ai = SafeParcelReader.createIntArray(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LogEventParcelable(i, playloggercontext, abyte0, ai);
            }
        } while (true);
    }

    static void writeToParcel(LogEventParcelable logeventparcelable, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, logeventparcelable.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, logeventparcelable.playLoggerContext, i, false);
        SafeParcelWriter.writeByteArray(parcel, 3, logeventparcelable.logEventBytes, false);
        SafeParcelWriter.writeIntArray(parcel, 4, logeventparcelable.testCodes, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LogEventParcelable[i];
    }
}
