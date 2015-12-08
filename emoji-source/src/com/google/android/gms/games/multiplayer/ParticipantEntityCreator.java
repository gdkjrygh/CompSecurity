// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantEntity, ParticipantResult

public class ParticipantEntityCreator
    implements android.os.Parcelable.Creator
{

    public ParticipantEntityCreator()
    {
    }

    static void a(ParticipantEntity participantentity, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, participantentity.getParticipantId(), false);
        b.c(parcel, 1000, participantentity.getVersionCode());
        b.a(parcel, 2, participantentity.getDisplayName(), false);
        b.a(parcel, 3, participantentity.getIconImageUri(), i, false);
        b.a(parcel, 4, participantentity.getHiResImageUri(), i, false);
        b.c(parcel, 5, participantentity.getStatus());
        b.a(parcel, 6, participantentity.gW(), false);
        b.a(parcel, 7, participantentity.isConnectedToRoom());
        b.a(parcel, 8, participantentity.getPlayer(), i, false);
        b.c(parcel, 9, participantentity.getCapabilities());
        b.a(parcel, 10, participantentity.getResult(), i, false);
        b.a(parcel, 11, participantentity.getIconImageUrl(), false);
        b.a(parcel, 12, participantentity.getHiResImageUrl(), false);
        b.G(parcel, j);
    }

    public ParticipantEntity bm(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int k = 0;
        String s4 = null;
        String s3 = null;
        Uri uri1 = null;
        Uri uri = null;
        int j = 0;
        String s2 = null;
        boolean flag = false;
        PlayerEntity playerentity = null;
        int i = 0;
        ParticipantResult participantresult = null;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 10: // '\n'
                    participantresult = (ParticipantResult)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ParticipantResult.CREATOR);
                    break;

                case 11: // '\013'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;

                case 12: // '\f'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new ParticipantEntity(k, s4, s3, uri1, uri, j, s2, flag, playerentity, i, participantresult, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bm(parcel);
    }

    public ParticipantEntity[] cy(int i)
    {
        return new ParticipantEntity[i];
    }

    public Object[] newArray(int i)
    {
        return cy(i);
    }
}
