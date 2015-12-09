// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.internal:
//            ClientIdentityCreator

public class ClientIdentity
    implements SafeParcelable
{

    public static final ClientIdentityCreator CREATOR = new ClientIdentityCreator();
    final int mVersionCode;
    public final String packageName;
    public final int uid;

    ClientIdentity(int i, int j, String s)
    {
        mVersionCode = i;
        uid = j;
        packageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || !(obj instanceof ClientIdentity))
            {
                return false;
            }
            obj = (ClientIdentity)obj;
            if (((ClientIdentity) (obj)).uid != uid || !Objects.equal(((ClientIdentity) (obj)).packageName, packageName))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return uid;
    }

    public String toString()
    {
        return String.format("%d:%s", new Object[] {
            Integer.valueOf(uid), packageName
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ClientIdentityCreator.writeToParcel$4b230169(this, parcel);
    }

}
