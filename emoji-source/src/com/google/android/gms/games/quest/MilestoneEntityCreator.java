// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.games.quest:
//            MilestoneEntity

public class MilestoneEntityCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public MilestoneEntityCreator()
    {
    }

    static void a(MilestoneEntity milestoneentity, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.a(parcel, 1, milestoneentity.getMilestoneId(), false);
        b.c(parcel, 1000, milestoneentity.getVersionCode());
        b.a(parcel, 2, milestoneentity.getCurrentProgress());
        b.a(parcel, 3, milestoneentity.getTargetProgress());
        b.a(parcel, 4, milestoneentity.getCompletionRewardData(), false);
        b.c(parcel, 5, milestoneentity.getState());
        b.a(parcel, 6, milestoneentity.getEventId(), false);
        b.G(parcel, i);
    }

    public MilestoneEntity createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        byte abyte0[] = null;
        long l2 = 0L;
        String s1 = null;
        int j = 0;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.r(parcel, l);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new MilestoneEntity(j, s1, l2, l1, abyte0, i, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public MilestoneEntity[] newArray(int i)
    {
        return new MilestoneEntity[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
