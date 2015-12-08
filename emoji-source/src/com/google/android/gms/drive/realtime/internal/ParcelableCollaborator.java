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
    final boolean Lk;
    final boolean Ll;
    final String Lm;
    final String Ln;
    final String Lo;
    final String Lp;
    final String rR;
    final int xM;

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        xM = i;
        Lk = flag;
        Ll = flag1;
        rR = s;
        Lm = s1;
        Ln = s2;
        Lo = s3;
        Lp = s4;
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
            return rR.equals(((ParcelableCollaborator) (obj)).rR);
        }
    }

    public int hashCode()
    {
        return rR.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Collaborator [isMe=").append(Lk).append(", isAnonymous=").append(Ll).append(", sessionId=").append(rR).append(", userId=").append(Lm).append(", displayName=").append(Ln).append(", color=").append(Lo).append(", photoUrl=").append(Lp).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
