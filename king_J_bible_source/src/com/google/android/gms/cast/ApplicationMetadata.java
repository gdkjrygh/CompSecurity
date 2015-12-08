// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            a

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    String mName;
    private final int xH;
    String xI;
    List xJ;
    List xK;
    String xL;
    Uri xM;

    private ApplicationMetadata()
    {
        xH = 1;
        xJ = new ArrayList();
        xK = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        xH = i;
        xI = s;
        mName = s1;
        xJ = list;
        xK = list1;
        xL = s2;
        xM = uri;
    }

    public boolean areNamespacesSupported(List list)
    {
        return xK != null && xK.containsAll(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri dz()
    {
        return xM;
    }

    public String getApplicationId()
    {
        return xI;
    }

    public List getImages()
    {
        return xJ;
    }

    public String getName()
    {
        return mName;
    }

    public String getSenderAppIdentifier()
    {
        return xL;
    }

    int getVersionCode()
    {
        return xH;
    }

    public boolean isNamespaceSupported(String s)
    {
        return xK != null && xK.contains(s);
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
