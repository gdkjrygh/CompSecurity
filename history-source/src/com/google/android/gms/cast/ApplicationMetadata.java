// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            a

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int CK;
    String Fo;
    List Fp;
    List Fq;
    String Fr;
    Uri Fs;
    String mName;

    private ApplicationMetadata()
    {
        CK = 1;
        Fp = new ArrayList();
        Fq = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        CK = i;
        Fo = s;
        mName = s1;
        Fp = list;
        Fq = list1;
        Fr = s2;
        Fs = uri;
    }

    public boolean areNamespacesSupported(List list)
    {
        return Fq != null && Fq.containsAll(list);
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
            if (!in.a(Fo, ((ApplicationMetadata) (obj)).Fo) || !in.a(Fp, ((ApplicationMetadata) (obj)).Fp) || !in.a(mName, ((ApplicationMetadata) (obj)).mName) || !in.a(Fq, ((ApplicationMetadata) (obj)).Fq) || !in.a(Fr, ((ApplicationMetadata) (obj)).Fr) || !in.a(Fs, ((ApplicationMetadata) (obj)).Fs))
            {
                return false;
            }
        }
        return true;
    }

    public Uri fP()
    {
        return Fs;
    }

    public String getApplicationId()
    {
        return Fo;
    }

    public List getImages()
    {
        return Fp;
    }

    public String getName()
    {
        return mName;
    }

    public String getSenderAppIdentifier()
    {
        return Fr;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(CK), Fo, mName, Fp, Fq, Fr, Fs
        });
    }

    public boolean isNamespaceSupported(String s)
    {
        return Fq != null && Fq.contains(s);
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
