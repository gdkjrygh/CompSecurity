// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            AppContentReceivedResultCreator

public class AppContentReceivedResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AppContentReceivedResultCreator();
    Uri destinationUri;
    int statusCode;
    final int versionCode;

    private AppContentReceivedResult()
    {
        versionCode = 1;
    }

    AppContentReceivedResult(int i, Uri uri, int j)
    {
        versionCode = i;
        destinationUri = uri;
        statusCode = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AppContentReceivedResult))
            {
                return false;
            }
            obj = (AppContentReceivedResult)obj;
            if (!Objects.equal(destinationUri, ((AppContentReceivedResult) (obj)).destinationUri) || !Objects.equal(Integer.valueOf(statusCode), Integer.valueOf(((AppContentReceivedResult) (obj)).statusCode)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            destinationUri, Integer.valueOf(statusCode)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentReceivedResultCreator.writeToParcel(this, parcel, i);
    }

}
