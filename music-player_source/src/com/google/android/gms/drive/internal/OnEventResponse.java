// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ConflictEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            d

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int a;
    final int b;
    final ChangeEvent c;
    final ConflictEvent d;

    OnEventResponse(int i, int j, ChangeEvent changeevent, ConflictEvent conflictevent)
    {
        a = i;
        b = j;
        c = changeevent;
        d = conflictevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.internal.d.a(this, parcel, i);
    }

}
