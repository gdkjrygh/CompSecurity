// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            SharedContent, ViewableItem, LocalContent

public final class SharedContentCreator
    implements android.os.Parcelable.Creator
{

    public SharedContentCreator()
    {
    }

    static void writeToParcel(SharedContent sharedcontent, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, sharedcontent.versionCode);
        SafeParcelWriter.writeString(parcel, 3, sharedcontent.uri, false);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 8, sharedcontent.viewableItems, i);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 9, sharedcontent.localContents, i);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        ViewableItem aviewableitem[] = null;
        String s = null;
        int i = 0;
        LocalContent alocalcontent[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 2: // '\002'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    aviewableitem = (ViewableItem[])SafeParcelReader.createTypedArray(parcel, k, ViewableItem.CREATOR);
                    break;

                case 9: // '\t'
                    alocalcontent = (LocalContent[])SafeParcelReader.createTypedArray(parcel, k, LocalContent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SharedContent(i, s, aviewableitem, alocalcontent);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SharedContent[i];
    }
}
