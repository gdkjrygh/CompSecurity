// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            a

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    String mName;
    private final int xM;
    String zP;
    List zQ;
    List zR;
    String zS;
    Uri zT;

    private ApplicationMetadata()
    {
        xM = 1;
        zQ = new ArrayList();
        zR = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        xM = i;
        zP = s;
        mName = s1;
        zQ = list;
        zR = list1;
        zS = s2;
        zT = uri;
    }

    public boolean areNamespacesSupported(List list)
    {
        return zR != null && zR.containsAll(list);
    }

    public Uri dX()
    {
        return zT;
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
            if (!gi.a(zP, ((ApplicationMetadata) (obj)).zP) || !gi.a(zQ, ((ApplicationMetadata) (obj)).zQ) || !gi.a(mName, ((ApplicationMetadata) (obj)).mName) || !gi.a(zR, ((ApplicationMetadata) (obj)).zR) || !gi.a(zS, ((ApplicationMetadata) (obj)).zS) || !gi.a(zT, ((ApplicationMetadata) (obj)).zT))
            {
                return false;
            }
        }
        return true;
    }

    public String getApplicationId()
    {
        return zP;
    }

    public List getImages()
    {
        return zQ;
    }

    public String getName()
    {
        return mName;
    }

    public String getSenderAppIdentifier()
    {
        return zS;
    }

    int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(xM), zP, mName, zQ, zR, zS, zT
        });
    }

    public boolean isNamespaceSupported(String s)
    {
        return zR != null && zR.contains(s);
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
