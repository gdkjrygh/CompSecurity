// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupLocationInfoParcelable

public final class PopupLocationInfoParcelableCreator
    implements android.os.Parcelable.Creator
{

    public PopupLocationInfoParcelableCreator()
    {
    }

    public static PopupLocationInfoParcelable createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        android.os.Bundle bundle = null;
        android.os.IBinder ibinder = null;
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
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PopupLocationInfoParcelable(i, bundle, ibinder);
            }
        } while (true);
    }

    static void writeToParcel$37c3114a(PopupLocationInfoParcelable popuplocationinfoparcelable, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeBundle(parcel, 1, popuplocationinfoparcelable.mInfoBundle, false);
        SafeParcelWriter.writeInt(parcel, 1000, popuplocationinfoparcelable.mVersionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, popuplocationinfoparcelable.mWindowToken);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PopupLocationInfoParcelable[i];
    }
}
