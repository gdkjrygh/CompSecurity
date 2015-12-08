// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ai

public class OpenFileIntentSenderRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ai();
    final String EB;
    final DriveId EC;
    final String EQ[];
    final int xH;

    OpenFileIntentSenderRequest(int i, String s, String as[], DriveId driveid)
    {
        xH = i;
        EB = s;
        EQ = as;
        EC = driveid;
    }

    public OpenFileIntentSenderRequest(String s, String as[], DriveId driveid)
    {
        this(1, s, as, driveid);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ai.a(this, parcel, i);
    }

}
