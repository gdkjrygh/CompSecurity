// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.sharing.SharedContent;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            ProvideContentRequest, INearbySharingCallback, IContentProvider

public final class ProvideContentRequestCreator
    implements android.os.Parcelable.Creator
{

    public ProvideContentRequestCreator()
    {
    }

    static void writeToParcel$7643f57c(ProvideContentRequest providecontentrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, providecontentrequest.versionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, providecontentrequest.clientBinder);
        android.os.IBinder ibinder;
        if (providecontentrequest.contentProvider == null)
        {
            ibinder = null;
        } else
        {
            ibinder = providecontentrequest.contentProvider.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, ibinder);
        SafeParcelWriter.writeTypedList(parcel, 4, providecontentrequest.content, false);
        SafeParcelWriter.writeLong(parcel, 5, providecontentrequest.activityId);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 6, providecontentrequest.callback.asBinder());
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        java.util.ArrayList arraylist = null;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
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
                    ibinder2 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, SharedContent.CREATOR);
                    break;

                case 5: // '\005'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ProvideContentRequest(i, ibinder2, ibinder1, arraylist, l, ibinder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ProvideContentRequest[i];
    }
}
