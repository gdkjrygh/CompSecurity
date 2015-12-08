// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.FileConflictEvent;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aj

public class OnEventResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aj();
    final int In;
    final ChangeEvent Jv;
    final FileConflictEvent Jw;
    final int xJ;

    OnEventResponse(int i, int j, ChangeEvent changeevent, FileConflictEvent fileconflictevent)
    {
        xJ = i;
        In = j;
        Jv = changeevent;
        Jw = fileconflictevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getEventType()
    {
        return In;
    }

    public ChangeEvent gr()
    {
        return Jv;
    }

    public FileConflictEvent gs()
    {
        return Jw;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aj.a(this, parcel, i);
    }

}
