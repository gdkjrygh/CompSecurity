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
    final boolean Lh;
    final boolean Li;
    final String Lj;
    final String Lk;
    final String Ll;
    final String Lm;
    final String rO;
    final int xJ;

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        xJ = i;
        Lh = flag;
        Li = flag1;
        rO = s;
        Lj = s1;
        Lk = s2;
        Ll = s3;
        Lm = s4;
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
            return rO.equals(((ParcelableCollaborator) (obj)).rO);
        }
    }

    public int hashCode()
    {
        return rO.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Collaborator [isMe=").append(Lh).append(", isAnonymous=").append(Li).append(", sessionId=").append(rO).append(", userId=").append(Lj).append(", displayName=").append(Lk).append(", color=").append(Ll).append(", photoUrl=").append(Lm).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
