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
    final int BR;
    final String NH;
    final boolean Rk;
    final boolean Rl;
    final String Rm;
    final String Rn;
    final String Ro;
    final String vL;

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        BR = i;
        Rk = flag;
        Rl = flag1;
        vL = s;
        Rm = s1;
        NH = s2;
        Rn = s3;
        Ro = s4;
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
            return vL.equals(((ParcelableCollaborator) (obj)).vL);
        }
    }

    public int hashCode()
    {
        return vL.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Collaborator [isMe=").append(Rk).append(", isAnonymous=").append(Rl).append(", sessionId=").append(vL).append(", userId=").append(Rm).append(", displayName=").append(NH).append(", color=").append(Rn).append(", photoUrl=").append(Ro).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
