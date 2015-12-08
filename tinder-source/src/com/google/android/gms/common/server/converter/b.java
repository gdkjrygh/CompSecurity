// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            StringToIntConverter

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(StringToIntConverter stringtointconverter, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, stringtointconverter.a);
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = stringtointconverter.b.keySet().iterator(); iterator.hasNext(); arraylist.add(new StringToIntConverter.Entry(s, ((Integer)stringtointconverter.b.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 2, arraylist);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        int i = 0;
        ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = zza.c(parcel, k, StringToIntConverter.Entry.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StringToIntConverter(i, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new StringToIntConverter[i];
    }
}
