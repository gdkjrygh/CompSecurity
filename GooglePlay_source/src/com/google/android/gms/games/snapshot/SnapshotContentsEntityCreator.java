// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotContentsEntity

public final class SnapshotContentsEntityCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotContentsEntityCreator()
    {
    }

    static void writeToParcel(SnapshotContentsEntity snapshotcontentsentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, snapshotcontentsentity.mContents, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, snapshotcontentsentity.mVersionCode);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Contents contents = null;
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
                    contents = (Contents)SafeParcelReader.createParcelable(parcel, k, Contents.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SnapshotContentsEntity(i, contents);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SnapshotContentsEntity[i];
    }
}
