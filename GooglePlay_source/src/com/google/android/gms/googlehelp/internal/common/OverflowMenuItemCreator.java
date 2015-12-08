// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            OverflowMenuItem

public final class OverflowMenuItemCreator
    implements android.os.Parcelable.Creator
{

    public OverflowMenuItemCreator()
    {
    }

    static void writeToParcel(OverflowMenuItem overflowmenuitem, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, overflowmenuitem.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, overflowmenuitem.mId);
        SafeParcelWriter.writeString(parcel, 3, overflowmenuitem.mTitle, false);
        SafeParcelWriter.writeParcelable(parcel, 4, overflowmenuitem.mIntent, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Intent intent = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        int i = 0;
        String s = null;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    intent = (Intent)SafeParcelReader.createParcelable(parcel, l, Intent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OverflowMenuItem(i, j, s, intent);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OverflowMenuItem[i];
    }
}
