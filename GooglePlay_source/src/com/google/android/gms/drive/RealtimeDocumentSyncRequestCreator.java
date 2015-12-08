// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive:
//            RealtimeDocumentSyncRequest

public final class RealtimeDocumentSyncRequestCreator
    implements android.os.Parcelable.Creator
{

    public RealtimeDocumentSyncRequestCreator()
    {
    }

    static void writeToParcel$60887365(RealtimeDocumentSyncRequest realtimedocumentsyncrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, realtimedocumentsyncrequest.mVersionCode);
        SafeParcelWriter.writeStringList(parcel, 2, realtimedocumentsyncrequest.mDocumentsToSync, false);
        SafeParcelWriter.writeStringList(parcel, 3, realtimedocumentsyncrequest.mDocumentsToDeleteCache, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist1 = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.util.ArrayList arraylist = null;
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
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist1 = SafeParcelReader.createStringList(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RealtimeDocumentSyncRequest(i, arraylist, arraylist1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RealtimeDocumentSyncRequest[i];
    }
}
