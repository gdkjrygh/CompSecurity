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
//            aq

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aq();
    final int CK;
    final int Pm;
    final ChangeEvent QO;
    final CompletionEvent QP;

    OnEventResponse(int i, int j, ChangeEvent changeevent, CompletionEvent completionevent)
    {
        CK = i;
        Pm = j;
        QO = changeevent;
        QP = completionevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveEvent iQ()
    {
        switch (Pm)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unexpected event type ").append(Pm).toString());

        case 1: // '\001'
            return QO;

        case 2: // '\002'
            return QP;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aq.a(this, parcel, i);
    }

}
