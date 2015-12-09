// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            PlusCommonExtrasCreator

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final PlusCommonExtrasCreator CREATOR = new PlusCommonExtrasCreator();
    String mClientCallingPackage;
    String mGpsrc;
    final int mVersionCode;

    public PlusCommonExtras()
    {
        mVersionCode = 1;
        mGpsrc = "";
        mClientCallingPackage = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        mVersionCode = i;
        mGpsrc = s;
        mClientCallingPackage = s1;
    }

    public static PlusCommonExtras extractFromBundle(Bundle bundle)
    {
        if (bundle == null)
        {
            bundle = null;
        } else
        {
            bundle = bundle.getByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
        }
        if (bundle == null)
        {
            bundle = new PlusCommonExtras();
        } else
        {
            PlusCommonExtras pluscommonextras = (PlusCommonExtras)SafeParcelableSerializer.deserializeFromBytes(bundle, CREATOR);
            bundle = pluscommonextras;
            if (pluscommonextras == null)
            {
                return new PlusCommonExtras();
            }
        }
        return bundle;
    }

    public static PlusCommonExtras extractFromIntent(Intent intent)
    {
        if (intent == null)
        {
            intent = new PlusCommonExtras();
        } else
        {
            Object obj = CREATOR;
            intent = intent.getByteArrayExtra("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = SafeParcelableSerializer.deserializeFromBytes(intent, ((android.os.Parcelable.Creator) (obj)));
            }
            obj = (PlusCommonExtras)intent;
            intent = ((Intent) (obj));
            if (obj == null)
            {
                return new PlusCommonExtras();
            }
        }
        return intent;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (mVersionCode == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).mVersionCode && Objects.equal(mGpsrc, ((PlusCommonExtras) (obj)).mGpsrc) && Objects.equal(mClientCallingPackage, ((PlusCommonExtras) (obj)).mClientCallingPackage))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mVersionCode), mGpsrc, mClientCallingPackage
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("versionCode", Integer.valueOf(mVersionCode)).add("Gpsrc", mGpsrc).add("ClientCallingPackage", mClientCallingPackage).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlusCommonExtrasCreator.writeToParcel$7b58ebb3(this, parcel);
    }

}
