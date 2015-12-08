// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions, LatLng

public final class PolygonOptionsCreator
    implements android.os.Parcelable.Creator
{

    public PolygonOptionsCreator()
    {
    }

    static void writeToParcel$4c96f4fe(PolygonOptions polygonoptions, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, polygonoptions.mVersionCode);
        SafeParcelWriter.writeTypedList(parcel, 2, polygonoptions.mPoints, false);
        java.util.List list = polygonoptions.mHoles;
        if (list != null)
        {
            int j = SafeParcelWriter.beginVariableData(parcel, 3);
            parcel.writeList(list);
            SafeParcelWriter.finishVariableData(parcel, j);
        }
        SafeParcelWriter.writeFloat(parcel, 4, polygonoptions.mStrokeWidth);
        SafeParcelWriter.writeInt(parcel, 5, polygonoptions.mStrokeColor);
        SafeParcelWriter.writeInt(parcel, 6, polygonoptions.mFillColor);
        SafeParcelWriter.writeFloat(parcel, 7, polygonoptions.mZIndex);
        SafeParcelWriter.writeBoolean(parcel, 8, polygonoptions.mVisible);
        SafeParcelWriter.writeBoolean(parcel, 9, polygonoptions.mGeodesic);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() >= l)
            {
                break;
            }
            int i1 = parcel.readInt();
            switch (0xffff & i1)
            {
            default:
                SafeParcelReader.skipUnknownField(parcel, i1);
                break;

            case 1: // '\001'
                k = SafeParcelReader.readInt(parcel, i1);
                break;

            case 2: // '\002'
                arraylist = SafeParcelReader.createTypedList(parcel, i1, LatLng.CREATOR);
                break;

            case 3: // '\003'
                ClassLoader classloader = getClass().getClassLoader();
                i1 = SafeParcelReader.readSize(parcel, i1);
                int j1 = parcel.dataPosition();
                if (i1 != 0)
                {
                    parcel.readList(arraylist1, classloader);
                    parcel.setDataPosition(i1 + j1);
                }
                break;

            case 4: // '\004'
                f1 = SafeParcelReader.readFloat(parcel, i1);
                break;

            case 5: // '\005'
                j = SafeParcelReader.readInt(parcel, i1);
                break;

            case 6: // '\006'
                i = SafeParcelReader.readInt(parcel, i1);
                break;

            case 7: // '\007'
                f = SafeParcelReader.readFloat(parcel, i1);
                break;

            case 8: // '\b'
                flag1 = SafeParcelReader.readBoolean(parcel, i1);
                break;

            case 9: // '\t'
                flag = SafeParcelReader.readBoolean(parcel, i1);
                break;
            }
        } while (true);
        if (parcel.dataPosition() != l)
        {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
        } else
        {
            return new PolygonOptions(k, arraylist, arraylist1, f1, j, i, f, flag1, flag);
        }
    }

    public final volatile Object[] newArray(int i)
    {
        return new PolygonOptions[i];
    }
}
