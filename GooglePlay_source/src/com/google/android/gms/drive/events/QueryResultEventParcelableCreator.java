// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.events:
//            QueryResultEventParcelable

public final class QueryResultEventParcelableCreator
    implements android.os.Parcelable.Creator
{

    public QueryResultEventParcelableCreator()
    {
    }

    static void writeToParcel(QueryResultEventParcelable queryresulteventparcelable, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, queryresulteventparcelable.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, queryresulteventparcelable.mDataHolder, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, queryresulteventparcelable.mIsStatusChanged);
        SafeParcelWriter.writeInt(parcel, 4, queryresulteventparcelable.mQueryStatus);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag = false;
        DataHolder dataholder = null;
        int i = 0;
        int j = 0;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    dataholder = (DataHolder)SafeParcelReader.createParcelable(parcel, l, DataHolder.CREATOR);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new QueryResultEventParcelable(i, dataholder, flag, j);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new QueryResultEventParcelable[i];
    }
}
