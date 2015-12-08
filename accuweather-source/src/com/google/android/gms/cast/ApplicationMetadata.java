// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.hl;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            a

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    String mName;
    private final int xJ;
    String zM;
    List zN;
    List zO;
    String zP;
    Uri zQ;

    private ApplicationMetadata()
    {
        xJ = 1;
        zN = new ArrayList();
        zO = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        xJ = i;
        zM = s;
        mName = s1;
        zN = list;
        zO = list1;
        zP = s2;
        zQ = uri;
    }

    public boolean areNamespacesSupported(List list)
    {
        return zO != null && zO.containsAll(list);
    }

    public Uri dS()
    {
        return zQ;
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
            if (!gj.a(zM, ((ApplicationMetadata) (obj)).zM) || !gj.a(zN, ((ApplicationMetadata) (obj)).zN) || !gj.a(mName, ((ApplicationMetadata) (obj)).mName) || !gj.a(zO, ((ApplicationMetadata) (obj)).zO) || !gj.a(zP, ((ApplicationMetadata) (obj)).zP) || !gj.a(zQ, ((ApplicationMetadata) (obj)).zQ))
            {
                return false;
            }
        }
        return true;
    }

    public String getApplicationId()
    {
        return zM;
    }

    public List getImages()
    {
        return zN;
    }

    public String getName()
    {
        return mName;
    }

    public String getSenderAppIdentifier()
    {
        return zP;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(xJ), zM, mName, zN, zO, zP, zQ
        });
    }

    public boolean isNamespaceSupported(String s)
    {
        return zO != null && zO.contains(s);
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
