// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.cast.internal:
//            a, j

public class ApplicationStatus
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    String b;

    public ApplicationStatus()
    {
        this(1, null);
    }

    ApplicationStatus(int i, String s)
    {
        a = i;
        b = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ApplicationStatus))
        {
            return false;
        } else
        {
            obj = (ApplicationStatus)obj;
            return j.a(b, ((ApplicationStatus) (obj)).b);
        }
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            b
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.cast.internal.a.a(this, parcel);
    }

}
