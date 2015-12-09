// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            ScopeDetail, FACLData

public final class ScopeDetailCreator
    implements android.os.Parcelable.Creator
{

    public ScopeDetailCreator()
    {
    }

    static void writeToParcel(ScopeDetail scopedetail, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, scopedetail.version);
        SafeParcelWriter.writeString(parcel, 2, scopedetail.description, false);
        SafeParcelWriter.writeString(parcel, 3, scopedetail.detail, false);
        SafeParcelWriter.writeString(parcel, 4, scopedetail.iconBase64, false);
        SafeParcelWriter.writeString(parcel, 5, scopedetail.paclPickerDataBase64, false);
        SafeParcelWriter.writeString(parcel, 6, scopedetail.service, false);
        SafeParcelWriter.writeStringList(parcel, 7, scopedetail.warnings, false);
        SafeParcelWriter.writeParcelable(parcel, 8, scopedetail.friendPickerData, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        FACLData facldata = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ArrayList arraylist = new ArrayList();
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 8: // '\b'
                    facldata = (FACLData)SafeParcelReader.createParcelable(parcel, k, FACLData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ScopeDetail(i, s4, s3, s2, s1, s, arraylist, facldata);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ScopeDetail[i];
    }
}
