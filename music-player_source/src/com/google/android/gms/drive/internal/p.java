// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CloseContentsRequest

public final class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(CloseContentsRequest closecontentsrequest, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, closecontentsrequest.a);
        c.a(parcel, 2, closecontentsrequest.b, i, false);
        c.a(parcel, closecontentsrequest.c);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        Boolean boolean1 = null;
        Contents contents = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    contents = (Contents)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Contents.CREATOR);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, k);
                    if (k == 0)
                    {
                        boolean1 = null;
                    } else
                    {
                        if (k != 4)
                        {
                            throw new b((new StringBuilder("Expected size 4 got ")).append(k).append(" (0x").append(Integer.toHexString(k)).append(")").toString(), parcel);
                        }
                        boolean flag;
                        if (parcel.readInt() != 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        boolean1 = Boolean.valueOf(flag);
                    }
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new CloseContentsRequest(i, contents, boolean1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CloseContentsRequest[i];
    }
}
