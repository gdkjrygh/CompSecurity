// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DeleteCustomPropertyRequest

public class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    static void a(DeleteCustomPropertyRequest deletecustompropertyrequest, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, deletecustompropertyrequest.xM);
        b.a(parcel, 2, deletecustompropertyrequest.Hz, i, false);
        b.a(parcel, 3, deletecustompropertyrequest.IJ, i, false);
        b.G(parcel, j);
    }

    public DeleteCustomPropertyRequest[] aW(int i)
    {
        return new DeleteCustomPropertyRequest[i];
    }

    public DeleteCustomPropertyRequest aa(Parcel parcel)
    {
        CustomPropertyKey custompropertykey = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        DriveId driveid = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    custompropertykey = (CustomPropertyKey)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, CustomPropertyKey.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DeleteCustomPropertyRequest(i, driveid, custompropertykey);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aa(parcel);
    }

    public Object[] newArray(int i)
    {
        return aW(i);
    }
}
