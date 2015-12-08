// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable:
//            r

public class Asset
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    final int a;
    public ParcelFileDescriptor b;
    public Uri c;
    private byte d[];
    private String e;

    Asset(int i, byte abyte0[], String s, ParcelFileDescriptor parcelfiledescriptor, Uri uri)
    {
        a = i;
        d = abyte0;
        e = s;
        b = parcelfiledescriptor;
        c = uri;
    }

    public static Asset a(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            throw new IllegalArgumentException("Asset fd cannot be null");
        } else
        {
            return new Asset(1, null, null, parcelfiledescriptor, null);
        }
    }

    public static Asset a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Asset digest cannot be null");
        } else
        {
            return new Asset(1, null, s, null, null);
        }
    }

    public static Asset a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("Asset data cannot be null");
        } else
        {
            return new Asset(1, abyte0, null, null, null);
        }
    }

    public final byte[] a()
    {
        return d;
    }

    public final String b()
    {
        return e;
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
            if (!x.a(d, ((Asset) (obj)).d) || !x.a(e, ((Asset) (obj)).e) || !x.a(b, ((Asset) (obj)).b) || !x.a(c, ((Asset) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            d, e, b, c
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Asset[@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (e == null)
        {
            stringbuilder.append(", nodigest");
        } else
        {
            stringbuilder.append(", ");
            stringbuilder.append(e);
        }
        if (d != null)
        {
            stringbuilder.append(", size=");
            stringbuilder.append(d.length);
        }
        if (b != null)
        {
            stringbuilder.append(", fd=");
            stringbuilder.append(b);
        }
        if (c != null)
        {
            stringbuilder.append(", uri=");
            stringbuilder.append(c);
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        r.a(this, parcel, i | 1);
    }

}
