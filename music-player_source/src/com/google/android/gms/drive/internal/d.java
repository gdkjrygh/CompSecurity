// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ConflictEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnEventResponse

public final class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(OnEventResponse oneventresponse, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, oneventresponse.a);
        c.a(parcel, 2, oneventresponse.b);
        c.a(parcel, 3, oneventresponse.c, i, false);
        c.a(parcel, 4, oneventresponse.d, i, false);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        ChangeEvent changeevent = null;
        int j = 0;
        int i = 0;
        ConflictEvent conflictevent = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 3: // '\003'
                    changeevent = (ChangeEvent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ChangeEvent.CREATOR);
                    break;

                case 4: // '\004'
                    conflictevent = (ConflictEvent)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ConflictEvent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OnEventResponse(i, j, changeevent, conflictevent);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new OnEventResponse[i];
    }
}
