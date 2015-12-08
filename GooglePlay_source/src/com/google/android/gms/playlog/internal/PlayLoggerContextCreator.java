// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext

public final class PlayLoggerContextCreator
    implements android.os.Parcelable.Creator
{

    public PlayLoggerContextCreator()
    {
    }

    public static PlayLoggerContext createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        String s3 = null;
        int k = 0;
        int j = 0;
        String s2 = null;
        String s1 = null;
        boolean flag1 = true;
        String s = null;
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 7: // '\007'
                    flag1 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 9: // '\t'
                    flag = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 10: // '\n'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new PlayLoggerContext(l, s3, k, j, s2, s1, flag1, s, flag, i);
            }
        } while (true);
    }

    static void writeToParcel$495264e0(PlayLoggerContext playloggercontext, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, playloggercontext.versionCode);
        SafeParcelWriter.writeString(parcel, 2, playloggercontext.packageName, false);
        SafeParcelWriter.writeInt(parcel, 3, playloggercontext.packageVersionCode);
        SafeParcelWriter.writeInt(parcel, 4, playloggercontext.logSource);
        SafeParcelWriter.writeString(parcel, 5, playloggercontext.uploadAccountName, false);
        SafeParcelWriter.writeString(parcel, 6, playloggercontext.loggingId, false);
        SafeParcelWriter.writeBoolean(parcel, 7, playloggercontext.logAndroidId);
        SafeParcelWriter.writeString(parcel, 8, playloggercontext.logSourceName, false);
        SafeParcelWriter.writeBoolean(parcel, 9, playloggercontext.isAnonymous);
        SafeParcelWriter.writeInt(parcel, 10, playloggercontext.qosTier);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlayLoggerContext[i];
    }
}
