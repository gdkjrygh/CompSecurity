// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadgeEntity

public class GameBadgeEntityCreator
    implements android.os.Parcelable.Creator
{

    public GameBadgeEntityCreator()
    {
    }

    static void writeToParcel(GameBadgeEntity gamebadgeentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, gamebadgeentity.mType);
        SafeParcelWriter.writeInt(parcel, 1000, gamebadgeentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, gamebadgeentity.mTitle, false);
        SafeParcelWriter.writeString(parcel, 3, gamebadgeentity.mDescription, false);
        SafeParcelWriter.writeParcelable(parcel, 4, gamebadgeentity.mIconImageUri, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public GameBadgeEntity createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        int i = 0;
        String s1 = null;
        String s = null;
        Uri uri = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, l, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GameBadgeEntity(j, i, s1, s, uri);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return new GameBadgeEntity[i];
    }
}
