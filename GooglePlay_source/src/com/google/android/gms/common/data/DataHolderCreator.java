// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public final class DataHolderCreator
    implements android.os.Parcelable.Creator
{

    public DataHolderCreator()
    {
    }

    public static DataHolder createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String as[] = null;
        CursorWindow acursorwindow[] = null;
        int i = 0;
        android.os.Bundle bundle = null;
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
                    as = SafeParcelReader.createStringArray(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    acursorwindow = (CursorWindow[])SafeParcelReader.createTypedArray(parcel, l, CursorWindow.CREATOR);
                    break;

                case 3: // '\003'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                parcel = new DataHolder(j, as, acursorwindow, i, bundle);
                parcel.validateContents();
                return parcel;
            }
        } while (true);
    }

    static void writeToParcel(DataHolder dataholder, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeStringArray(parcel, 1, dataholder.mColumns, false);
        SafeParcelWriter.writeInt(parcel, 1000, dataholder.mVersionCode);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 2, dataholder.mWindows, i);
        SafeParcelWriter.writeInt(parcel, 3, dataholder.mStatusCode);
        SafeParcelWriter.writeBundle(parcel, 4, dataholder.mMetadata, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DataHolder[i];
    }
}
