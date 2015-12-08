// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.common.images:
//            zzb

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final int a;
    private final Uri b;
    private final int c;
    private final int d;

    WebImage(int i, Uri uri, int j, int k)
    {
        a = i;
        b = uri;
        c = j;
        d = k;
    }

    int a()
    {
        return a;
    }

    public Uri b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof WebImage))
            {
                return false;
            }
            obj = (WebImage)obj;
            if (!zzt.a(b, ((WebImage) (obj)).b) || c != ((WebImage) (obj)).c || d != ((WebImage) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            b, Integer.valueOf(c), Integer.valueOf(d)
        });
    }

    public String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(c), Integer.valueOf(d), b.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.a(this, parcel, i);
    }

}
