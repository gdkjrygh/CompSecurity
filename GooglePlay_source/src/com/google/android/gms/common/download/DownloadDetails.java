// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.download;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.download:
//            DownloadDetailsCreator

public final class DownloadDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new DownloadDetailsCreator();
    public final String destination;
    public final String filename;
    public final int maxVersion;
    public final int minVersion;
    public final String sha1;
    public final long sizeBytes;
    public final String url;
    final int versionCode;

    DownloadDetails(int i, String s, String s1, long l, String s2, String s3, 
            int j, int k)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (j <= k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, (new StringBuilder("The minVersion (")).append(j).append(") must be less than or equal to the maxVersion (").append(k).append(").").toString());
        if (l > 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, (new StringBuilder("sizeBytes (")).append(l).append(") must be greater than zero").toString());
        versionCode = i;
        filename = (String)Preconditions.checkNotNull(s);
        url = (String)Preconditions.checkNotNull(s1);
        sizeBytes = l;
        sha1 = (String)Preconditions.checkNotNull(s2);
        destination = s3;
        minVersion = j;
        maxVersion = k;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof DownloadDetails)
        {
            obj = (DownloadDetails)obj;
            if (filename.equals(((DownloadDetails) (obj)).filename) && url.equals(((DownloadDetails) (obj)).url) && sizeBytes == ((DownloadDetails) (obj)).sizeBytes && sha1.equals(((DownloadDetails) (obj)).sha1) && (destination == null && ((DownloadDetails) (obj)).destination == null || destination.equals(((DownloadDetails) (obj)).destination)) && minVersion == ((DownloadDetails) (obj)).minVersion && maxVersion == ((DownloadDetails) (obj)).maxVersion)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            filename, url, Long.valueOf(sizeBytes), sha1, destination, Integer.valueOf(minVersion), Integer.valueOf(maxVersion)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DownloadDetailsCreator.writeToParcel$401a9d73(this, parcel);
    }

}
