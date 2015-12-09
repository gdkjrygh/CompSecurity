// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLinkCreator

public class StreetViewPanoramaLink
    implements SafeParcelable
{

    public static final StreetViewPanoramaLinkCreator CREATOR = new StreetViewPanoramaLinkCreator();
    public final float bearing;
    final int mVersionCode;
    public final String panoId;

    StreetViewPanoramaLink(int i, String s, float f)
    {
        mVersionCode = i;
        panoId = s;
        float f1 = f;
        if ((double)f <= 0.0D)
        {
            f1 = f % 360F + 360F;
        }
        bearing = f1 % 360F;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StreetViewPanoramaLink))
            {
                return false;
            }
            obj = (StreetViewPanoramaLink)obj;
            if (!panoId.equals(((StreetViewPanoramaLink) (obj)).panoId) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaLink) (obj)).bearing))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            panoId, Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("panoId", panoId).add("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        StreetViewPanoramaLinkCreator.writeToParcel$7cf702f(this, parcel);
    }

}
