// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryDecision

public class RecoveryDecisionCreator
    implements android.os.Parcelable.Creator
{

    public static final int CONTENT_DESCRIPTION = 0;

    public RecoveryDecisionCreator()
    {
    }

    static void a(RecoveryDecision recoverydecision, Parcel parcel, int i)
    {
        int j = b.k(parcel);
        b.c(parcel, 1, recoverydecision.iM);
        b.a(parcel, 2, recoverydecision.recoveryIntent, i, false);
        b.a(parcel, 3, recoverydecision.showRecoveryInterstitial);
        b.a(parcel, 4, recoverydecision.isRecoveryInfoNeeded);
        b.a(parcel, 5, recoverydecision.isRecoveryInterstitialAllowed);
        b.a(parcel, 6, recoverydecision.recoveryIntentWithoutIntro, i, false);
        b.C(parcel, j);
    }

    public RecoveryDecision createFromParcel(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.j(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        PendingIntent pendingintent1 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.i(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.y(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    pendingintent1 = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PendingIntent.CREATOR);
                    break;

                case 3: // '\003'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new RecoveryDecision(i, pendingintent1, flag2, flag1, flag, pendingintent);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public RecoveryDecision[] newArray(int i)
    {
        return new RecoveryDecision[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
