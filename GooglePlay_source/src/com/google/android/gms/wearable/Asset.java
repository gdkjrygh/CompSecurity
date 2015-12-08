// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable:
//            AssetCreator

public class Asset
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AssetCreator();
    public ParcelFileDescriptor fd;
    byte mData[];
    String mDigest;
    final int mVersionCode;
    public Uri uri;

    Asset(int i, byte abyte0[], String s, ParcelFileDescriptor parcelfiledescriptor, Uri uri1)
    {
        mVersionCode = i;
        mData = abyte0;
        mDigest = s;
        fd = parcelfiledescriptor;
        uri = uri1;
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
            if (!Objects.equal(mData, ((Asset) (obj)).mData) || !Objects.equal(mDigest, ((Asset) (obj)).mDigest) || !Objects.equal(fd, ((Asset) (obj)).fd) || !Objects.equal(uri, ((Asset) (obj)).uri))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mData, mDigest, fd, uri
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Asset[@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (mDigest == null)
        {
            stringbuilder.append(", nodigest");
        } else
        {
            stringbuilder.append(", ");
            stringbuilder.append(mDigest);
        }
        if (mData != null)
        {
            stringbuilder.append(", size=");
            stringbuilder.append(mData.length);
        }
        if (fd != null)
        {
            stringbuilder.append(", fd=");
            stringbuilder.append(fd);
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
        AssetCreator.writeToParcel(this, parcel, i | 1);
    }

}
