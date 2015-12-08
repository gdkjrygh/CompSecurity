// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ik;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            a

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int BR;
    List EA;
    List EB;
    String EC;
    Uri ED;
    String Ez;
    String mName;

    private ApplicationMetadata()
    {
        BR = 1;
        EA = new ArrayList();
        EB = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        BR = i;
        Ez = s;
        mName = s1;
        EA = list;
        EB = list1;
        EC = s2;
        ED = uri;
    }

    public boolean areNamespacesSupported(List list)
    {
        return EB != null && EB.containsAll(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ApplicationMetadata))
            {
                return false;
            }
            obj = (ApplicationMetadata)obj;
            if (!ik.a(Ez, ((ApplicationMetadata) (obj)).Ez) || !ik.a(EA, ((ApplicationMetadata) (obj)).EA) || !ik.a(mName, ((ApplicationMetadata) (obj)).mName) || !ik.a(EB, ((ApplicationMetadata) (obj)).EB) || !ik.a(EC, ((ApplicationMetadata) (obj)).EC) || !ik.a(ED, ((ApplicationMetadata) (obj)).ED))
            {
                return false;
            }
        }
        return true;
    }

    public Uri fu()
    {
        return ED;
    }

    public String getApplicationId()
    {
        return Ez;
    }

    public List getImages()
    {
        return EA;
    }

    public String getName()
    {
        return mName;
    }

    public String getSenderAppIdentifier()
    {
        return EC;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(BR), Ez, mName, EA, EB, EC, ED
        });
    }

    public boolean isNamespaceSupported(String s)
    {
        return EB != null && EB.contains(s);
    }

    public String toString()
    {
        return mName;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
