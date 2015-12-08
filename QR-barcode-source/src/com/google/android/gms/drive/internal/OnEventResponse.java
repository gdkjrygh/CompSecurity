// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            am

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new am();
    final int BR;
    final int Oa;
    final ChangeEvent Ps;
    final CompletionEvent Pt;

    OnEventResponse(int i, int j, ChangeEvent changeevent, CompletionEvent completionevent)
    {
        BR = i;
        Oa = j;
        Ps = changeevent;
        Pt = completionevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveEvent ih()
    {
        switch (Oa)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unexpected event type ").append(Oa).toString());

        case 1: // '\001'
            return Ps;

        case 2: // '\002'
            return Pt;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        am.a(this, parcel, i);
    }

}
