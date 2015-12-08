// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

// Referenced classes of package com.google.android.gms.games:
//            PlayerEntity, PlayerLevelInfo

public class PlayerEntityCreator
    implements android.os.Parcelable.Creator
{

    public PlayerEntityCreator()
    {
    }

    static void a(PlayerEntity playerentity, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, playerentity.getPlayerId(), false);
        b.a(parcel, 2, playerentity.getDisplayName(), false);
        b.a(parcel, 3, playerentity.getIconImageUri(), i, false);
        b.a(parcel, 4, playerentity.getHiResImageUri(), i, false);
        b.a(parcel, 5, playerentity.getRetrievedTimestamp());
        b.c(parcel, 6, playerentity.gS());
        b.a(parcel, 7, playerentity.getLastPlayedWithTimestamp());
        b.a(parcel, 8, playerentity.getIconImageUrl(), false);
        b.a(parcel, 9, playerentity.getHiResImageUrl(), false);
        b.a(parcel, 14, playerentity.getTitle(), false);
        b.a(parcel, 15, playerentity.gU(), i, false);
        b.a(parcel, 17, playerentity.gT());
        b.a(parcel, 16, playerentity.getLevelInfo(), i, false);
        b.c(parcel, 1000, playerentity.getVersionCode());
        b.G(parcel, j);
    }

    public PlayerEntity be(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int j = 0;
        String s4 = null;
        String s3 = null;
        Uri uri1 = null;
        Uri uri = null;
        long l2 = 0L;
        int i = 0;
        long l1 = 0L;
        String s2 = null;
        String s1 = null;
        String s = null;
        MostRecentGameInfoEntity mostrecentgameinfoentity = null;
        PlayerLevelInfo playerlevelinfo = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 7: // '\007'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 14: // '\016'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 15: // '\017'
                    mostrecentgameinfoentity = (MostRecentGameInfoEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MostRecentGameInfoEntity.CREATOR);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 16: // '\020'
                    playerlevelinfo = (PlayerLevelInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, PlayerLevelInfo.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlayerEntity(j, s4, s3, uri1, uri, l2, i, l1, s2, s1, s, mostrecentgameinfoentity, playerlevelinfo, flag);
            }
        } while (true);
    }

    public PlayerEntity[] cc(int i)
    {
        return new PlayerEntity[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return be(parcel);
    }

    public Object[] newArray(int i)
    {
        return cc(i);
    }
}
