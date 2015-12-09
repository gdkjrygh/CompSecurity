// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ConflictEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ac

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ac();
    final int ES;
    final ChangeEvent FH;
    final ConflictEvent FI;
    final int xH;

    OnEventResponse(int i, int j, ChangeEvent changeevent, ConflictEvent conflictevent)
    {
        xH = i;
        ES = j;
        FH = changeevent;
        FI = conflictevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public ChangeEvent fL()
    {
        return FH;
    }

    public ConflictEvent fM()
    {
        return FI;
    }

    public int getEventType()
    {
        return ES;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ac.a(this, parcel, i);
    }

}
