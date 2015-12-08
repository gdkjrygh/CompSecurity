// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import btj;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ctj;
import java.util.Arrays;

public class Asset
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ctj();
    public final int a;
    public byte b[];
    public String c;
    public ParcelFileDescriptor d;
    public Uri e;

    public Asset(int i, byte abyte0[], String s, ParcelFileDescriptor parcelfiledescriptor, Uri uri)
    {
        a = i;
        b = abyte0;
        c = s;
        d = parcelfiledescriptor;
        e = uri;
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
            if (!btj.a(b, ((Asset) (obj)).b) || !btj.a(c, ((Asset) (obj)).c) || !btj.a(d, ((Asset) (obj)).d) || !btj.a(e, ((Asset) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, e
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Asset[@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (c == null)
        {
            stringbuilder.append(", nodigest");
        } else
        {
            stringbuilder.append(", ");
            stringbuilder.append(c);
        }
        if (b != null)
        {
            stringbuilder.append(", size=");
            stringbuilder.append(b.length);
        }
        if (d != null)
        {
            stringbuilder.append(", fd=");
            stringbuilder.append(d);
        }
        if (e != null)
        {
            stringbuilder.append(", uri=");
            stringbuilder.append(e);
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ctj.a(this, parcel, i | 1);
    }

}
