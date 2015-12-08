// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryDecision

public final class RecoveryDecisionCreator
    implements android.os.Parcelable.Creator
{

    public RecoveryDecisionCreator()
    {
    }

    static void writeToParcel(RecoveryDecision recoverydecision, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, recoverydecision.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, recoverydecision.recoveryIntent, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, recoverydecision.showRecoveryInterstitial);
        SafeParcelWriter.writeBoolean(parcel, 4, recoverydecision.isRecoveryInfoNeeded);
        SafeParcelWriter.writeBoolean(parcel, 5, recoverydecision.isRecoveryInterstitialAllowed);
        SafeParcelWriter.writeParcelable(parcel, 6, recoverydecision.recoveryIntentWithoutIntro, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        PendingIntent pendingintent1 = null;
        int i = 0;
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
                    pendingintent1 = (PendingIntent)SafeParcelReader.createParcelable(parcel, k, PendingIntent.CREATOR);
                    break;

                case 3: // '\003'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, k, PendingIntent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecoveryDecision(i, pendingintent1, flag2, flag1, flag, pendingintent);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RecoveryDecision[i];
    }
}
