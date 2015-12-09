// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            CustomPropertyCreator

public class CustomProperty
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CustomPropertyCreator();
    public final CustomPropertyKey mKey;
    final String mValue;
    final int mVersionCode;

    CustomProperty(int i, CustomPropertyKey custompropertykey, String s)
    {
        mVersionCode = i;
        Preconditions.checkNotNull(custompropertykey, "key");
        mKey = custompropertykey;
        mValue = s;
    }

    public CustomProperty(CustomPropertyKey custompropertykey, String s)
    {
        this(1, custompropertykey, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            obj = (CustomProperty)obj;
            if (!Objects.equal(mKey, ((CustomProperty) (obj)).mKey) || !Objects.equal(mValue, ((CustomProperty) (obj)).mValue))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mKey, mValue
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CustomPropertyCreator.writeToParcel(this, parcel, i);
    }

}
