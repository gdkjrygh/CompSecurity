// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            zza

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    String mName;
    String zzLD;
    List zzLE;
    List zzLF;
    String zzLG;
    Uri zzLH;
    private final int zzzH;

    private ApplicationMetadata()
    {
        zzzH = 1;
        zzLE = new ArrayList();
        zzLF = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        zzzH = i;
        zzLD = s;
        mName = s1;
        zzLE = list;
        zzLF = list1;
        zzLG = s2;
        zzLH = uri;
    }

    public boolean areNamespacesSupported(List list)
    {
        return zzLF != null && zzLF.containsAll(list);
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
            if (!zzf.zza(zzLD, ((ApplicationMetadata) (obj)).zzLD) || !zzf.zza(zzLE, ((ApplicationMetadata) (obj)).zzLE) || !zzf.zza(mName, ((ApplicationMetadata) (obj)).mName) || !zzf.zza(zzLF, ((ApplicationMetadata) (obj)).zzLF) || !zzf.zza(zzLG, ((ApplicationMetadata) (obj)).zzLG) || !zzf.zza(zzLH, ((ApplicationMetadata) (obj)).zzLH))
            {
                return false;
            }
        }
        return true;
    }

    public String getApplicationId()
    {
        return zzLD;
    }

    public List getImages()
    {
        return zzLE;
    }

    public String getName()
    {
        return mName;
    }

    public String getSenderAppIdentifier()
    {
        return zzLG;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzzH), zzLD, mName, zzLE, zzLF, zzLG, zzLH
        });
    }

    public boolean isNamespaceSupported(String s)
    {
        return zzLF != null && zzLF.contains(s);
    }

    public String toString()
    {
        boolean flag = false;
        StringBuilder stringbuilder = (new StringBuilder()).append("applicationId: ").append(zzLD).append(", name: ").append(mName).append(", images.count: ");
        int i;
        if (zzLE == null)
        {
            i = 0;
        } else
        {
            i = zzLE.size();
        }
        stringbuilder = stringbuilder.append(i).append(", namespaces.count: ");
        if (zzLF == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = zzLF.size();
        }
        return stringbuilder.append(i).append(", senderAppIdentifier: ").append(zzLG).append(", senderAppLaunchUrl: ").append(zzLH).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public Uri zzjR()
    {
        return zzLH;
    }

}
