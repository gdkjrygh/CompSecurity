// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfoEntity

public final class MostRecentGameInfoEntityCreator
    implements android.os.Parcelable.Creator
{

    public MostRecentGameInfoEntityCreator()
    {
    }

    static void writeToParcel(MostRecentGameInfoEntity mostrecentgameinfoentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, mostrecentgameinfoentity.mGameId, false);
        SafeParcelWriter.writeInt(parcel, 1000, mostrecentgameinfoentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, mostrecentgameinfoentity.mGameName, false);
        SafeParcelWriter.writeLong(parcel, 3, mostrecentgameinfoentity.mActivityTimestampMillis);
        SafeParcelWriter.writeParcelable(parcel, 4, mostrecentgameinfoentity.mGameIconImageUri, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, mostrecentgameinfoentity.mGameHiResImageUri, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, mostrecentgameinfoentity.mGameFeaturedImageUri, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        Uri uri1 = null;
        Uri uri2 = null;
        String s = null;
        String s1 = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 4: // '\004'
                    uri2 = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    uri1 = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 6: // '\006'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MostRecentGameInfoEntity(i, s1, s, l, uri2, uri1, uri);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MostRecentGameInfoEntity[i];
    }
}
