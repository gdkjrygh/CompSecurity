// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileRequest

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(CreateFileRequest createfilerequest, Parcel parcel, int i)
    {
        int k = b.D(parcel);
        b.c(parcel, 1, createfilerequest.BR);
        b.a(parcel, 2, createfilerequest.On, i, false);
        b.a(parcel, 3, createfilerequest.Ol, i, false);
        b.a(parcel, 4, createfilerequest.Of, i, false);
        b.a(parcel, 5, createfilerequest.Om, false);
        b.a(parcel, 6, createfilerequest.Oo);
        b.a(parcel, 7, createfilerequest.Nn, false);
        b.c(parcel, 8, createfilerequest.Op);
        b.c(parcel, 9, createfilerequest.Oq);
        b.H(parcel, k);
    }

    public CreateFileRequest ac(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int k = 0;
        boolean flag = false;
        Integer integer = null;
        Contents contents = null;
        MetadataBundle metadatabundle = null;
        DriveId driveid = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    metadatabundle = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, MetadataBundle.CREATOR);
                    break;

                case 4: // '\004'
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Contents.CREATOR);
                    break;

                case 5: // '\005'
                    integer = com.google.android.gms.common.internal.safeparcel.a.h(parcel, j1);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j1);
                    break;

                case 8: // '\b'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new CreateFileRequest(l, driveid, metadatabundle, contents, integer, flag, s, k, i);
            }
        } while (true);
    }

    public CreateFileRequest[] bm(int i)
    {
        return new CreateFileRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return ac(parcel);
    }

    public Object[] newArray(int i)
    {
        return bm(i);
    }
}
