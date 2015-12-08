// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;

// Referenced classes of package com.google.android.gms.wearable:
//            a

public class Asset
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private byte TC[];
    private String ald;
    public ParcelFileDescriptor ale;
    public Uri uri;
    final int xJ;

    Asset(int i, byte abyte0[], String s, ParcelFileDescriptor parcelfiledescriptor, Uri uri1)
    {
        xJ = i;
        TC = abyte0;
        ald = s;
        ale = parcelfiledescriptor;
        uri = uri1;
    }

    public static Asset createFromBytes(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Asset data cannot be null");
        } else
        {
            return new Asset(1, abyte0, null, null, null);
        }
    }

    public static Asset createFromFd(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            throw new IllegalArgumentException("Asset fd cannot be null");
        } else
        {
            return new Asset(1, null, null, parcelfiledescriptor, null);
        }
    }

    public static Asset createFromRef(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Asset digest cannot be null");
        } else
        {
            return new Asset(1, null, s, null, null);
        }
    }

    public static Asset createFromUri(Uri uri1)
    {
        if (uri1 == null)
        {
            throw new IllegalArgumentException("Asset uri cannot be null");
        } else
        {
            return new Asset(1, null, null, null, uri1);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Asset))
            {
                return false;
            }
            obj = (Asset)obj;
            if (!hl.equal(TC, ((Asset) (obj)).TC) || !hl.equal(ald, ((Asset) (obj)).ald) || !hl.equal(ale, ((Asset) (obj)).ale) || !hl.equal(uri, ((Asset) (obj)).uri))
            {
                return false;
            }
        }
        return true;
    }

    public byte[] getData()
    {
        return TC;
    }

    public String getDigest()
    {
        return ald;
    }

    public ParcelFileDescriptor getFd()
    {
        return ale;
    }

    public Uri getUri()
    {
        return uri;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            TC, ald, ale, uri
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Asset[@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (ald == null)
        {
            stringbuilder.append(", nodigest");
        } else
        {
            stringbuilder.append(", ");
            stringbuilder.append(ald);
        }
        if (TC != null)
        {
            stringbuilder.append(", size=");
            stringbuilder.append(TC.length);
        }
        if (ale != null)
        {
            stringbuilder.append(", fd=");
            stringbuilder.append(ale);
        }
        if (uri != null)
        {
            stringbuilder.append(", uri=");
            stringbuilder.append(uri);
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i | 1);
    }

}
