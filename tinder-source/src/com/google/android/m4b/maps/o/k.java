// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.a;
import com.google.android.m4b.maps.k.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.o:
//            i

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    public static i a(Parcel parcel)
    {
        int i1 = com.google.android.m4b.maps.k.a.a(parcel);
        ArrayList arraylist = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.m4b.maps.k.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    int j1 = com.google.android.m4b.maps.k.a.a(parcel, l);
                    int k1 = parcel.dataPosition();
                    if (j1 == 0)
                    {
                        arraylist = null;
                    } else
                    {
                        arraylist = new ArrayList();
                        int l1 = parcel.readInt();
                        for (l = 0; l < l1; l++)
                        {
                            arraylist.add(Integer.valueOf(parcel.readInt()));
                        }

                        parcel.setDataPosition(k1 + j1);
                    }
                    break;

                case 1000: 
                    j = com.google.android.m4b.maps.k.a.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.m4b.maps.k.a.a((new StringBuilder(37)).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new i(j, arraylist);
            }
        } while (true);
    }

    static void a(i j, Parcel parcel)
    {
        int i1 = b.a(parcel, 20293);
        List list = j.b;
        if (list != null)
        {
            int j1 = b.a(parcel, 1);
            int k1 = list.size();
            parcel.writeInt(k1);
            for (int l = 0; l < k1; l++)
            {
                parcel.writeInt(((Integer)list.get(l)).intValue());
            }

            b.b(parcel, j1);
        }
        b.b(parcel, 1000, j.a);
        b.b(parcel, i1);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int j)
    {
        return new i[j];
    }
}
