// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetEnqueueRequestCreator

public final class LargeAssetEnqueueRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LargeAssetEnqueueRequestCreator();
    public final boolean allowedOverMetered;
    public final boolean allowedWithLowBattery;
    public final boolean append;
    public final String destinationCanonicalPath;
    public final Uri destinationUri;
    final int mVersionCode;
    public final String nodeId;
    public final String path;

    LargeAssetEnqueueRequest(int i, String s, String s1, Uri uri, String s2, boolean flag, boolean flag1, 
            boolean flag2)
    {
        mVersionCode = i;
        nodeId = (String)Preconditions.checkNotNull(s);
        path = (String)Preconditions.checkNotNull(s1);
        destinationUri = (Uri)Preconditions.checkNotNull(uri);
        destinationCanonicalPath = (String)Preconditions.checkNotNull(s2);
        append = flag;
        allowedOverMetered = flag1;
        allowedWithLowBattery = flag2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LargeAssetEnqueueRequest))
            {
                return false;
            }
            obj = (LargeAssetEnqueueRequest)obj;
            if (mVersionCode != ((LargeAssetEnqueueRequest) (obj)).mVersionCode || !nodeId.equals(((LargeAssetEnqueueRequest) (obj)).nodeId) || !path.equals(((LargeAssetEnqueueRequest) (obj)).path) || !destinationUri.equals(((LargeAssetEnqueueRequest) (obj)).destinationUri) || !destinationCanonicalPath.equals(((LargeAssetEnqueueRequest) (obj)).destinationCanonicalPath) || append != ((LargeAssetEnqueueRequest) (obj)).append || allowedOverMetered != ((LargeAssetEnqueueRequest) (obj)).allowedOverMetered || allowedWithLowBattery != ((LargeAssetEnqueueRequest) (obj)).allowedWithLowBattery)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k = 1;
        int l = mVersionCode;
        int i1 = nodeId.hashCode();
        int j1 = path.hashCode();
        int k1 = destinationUri.hashCode();
        int l1 = destinationCanonicalPath.hashCode();
        int i;
        int j;
        if (append)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (allowedOverMetered)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!allowedWithLowBattery)
        {
            k = 0;
        }
        return ((((((l * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i) * 31 + j) * 31 + k;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("LargeAssetEnqueueRequest{, nodeId='")).append(nodeId).append("', path='").append(path).append("', destinationUri='").append(destinationUri).append("', destinationCanonicalPath='").append(destinationCanonicalPath).append("', append=").append(append);
        String s;
        if (allowedOverMetered)
        {
            s = ", allowedOverMetered=true";
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (allowedWithLowBattery)
        {
            s = ", allowedWithLowBattery=true";
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LargeAssetEnqueueRequestCreator.writeToParcel(this, parcel, i);
    }

}
