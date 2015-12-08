// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            p

public class ParcelableCollaborator
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    final int CK;
    final String OS;
    final boolean SH;
    final boolean SI;
    final String SJ;
    final String SK;
    final String SL;
    final String vZ;

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        CK = i;
        SH = flag;
        SI = flag1;
        vZ = s;
        SJ = s1;
        OS = s2;
        SK = s3;
        SL = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ParcelableCollaborator))
        {
            return false;
        } else
        {
            obj = (ParcelableCollaborator)obj;
            return vZ.equals(((ParcelableCollaborator) (obj)).vZ);
        }
    }

    public int hashCode()
    {
        return vZ.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Collaborator [isMe=").append(SH).append(", isAnonymous=").append(SI).append(", sessionId=").append(vZ).append(", userId=").append(SJ).append(", displayName=").append(OS).append(", color=").append(SK).append(", photoUrl=").append(SL).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
