// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.images:
//            WebImageCreator

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new WebImageCreator();
    final int mHeight;
    final Uri mUrl;
    final int mVersionCode;
    final int mWidth;

    WebImage(int i, Uri uri, int j, int k)
    {
        mVersionCode = i;
        mUrl = uri;
        mWidth = j;
        mHeight = k;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof WebImage))
            {
                return false;
            }
            obj = (WebImage)obj;
            if (!Objects.equal(mUrl, ((WebImage) (obj)).mUrl) || mWidth != ((WebImage) (obj)).mWidth || mHeight != ((WebImage) (obj)).mHeight)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mUrl, Integer.valueOf(mWidth), Integer.valueOf(mHeight)
        });
    }

    public final String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(mWidth), Integer.valueOf(mHeight), mUrl.toString()
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        WebImageCreator.writeToParcel(this, parcel, i);
    }

}
