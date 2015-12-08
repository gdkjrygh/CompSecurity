// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kl;

// Referenced classes of package com.google.android.gms.location.places:
//            f

public class PlaceReport
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private final String avY;
    private final String awo;
    private final String mTag;
    final int mVersionCode;

    PlaceReport(int i, String s, String s1, String s2)
    {
        mVersionCode = i;
        avY = s;
        mTag = s1;
        awo = s2;
    }

    public int describeContents()
    {
        f f1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlaceReport)
        {
            if (kl.equal(avY, ((PlaceReport) (obj = (PlaceReport)obj)).avY) && kl.equal(mTag, ((PlaceReport) (obj)).mTag) && kl.equal(awo, ((PlaceReport) (obj)).awo))
            {
                return true;
            }
        }
        return false;
    }

    public final String getPlaceId()
    {
        return avY;
    }

    public final String getSource()
    {
        return awo;
    }

    public final String getTag()
    {
        return mTag;
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            avY, mTag, awo
        });
    }

    public String toString()
    {
        return kl.j(this).a("mPlaceId", avY).a("mTag", mTag).a("mSource", awo).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f f1 = CREATOR;
        f.a(this, parcel, i);
    }

}
