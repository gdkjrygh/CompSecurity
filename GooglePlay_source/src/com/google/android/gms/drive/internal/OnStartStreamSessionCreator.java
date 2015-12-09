// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnStartStreamSession

public final class OnStartStreamSessionCreator
    implements android.os.Parcelable.Creator
{

    public OnStartStreamSessionCreator()
    {
    }

    static void writeToParcel(OnStartStreamSession onstartstreamsession, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, onstartstreamsession.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, onstartstreamsession.mPfd, i, false);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, onstartstreamsession.mCloseToken);
        SafeParcelWriter.writeString(parcel, 4, onstartstreamsession.mSignature, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        android.os.IBinder ibinder = null;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int i = 0;
        String s = null;
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
                    parcelfiledescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OnStartStreamSession(i, parcelfiledescriptor, ibinder, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OnStartStreamSession[i];
    }
}
