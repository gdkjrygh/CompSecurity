// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

// Referenced classes of package com.google.android.gms.location.places:
//            UserDataTypeCreator

public final class UserDataType
    implements SafeParcelable
{

    public static final UserDataType ALIASES;
    public static final UserDataTypeCreator CREATOR = new UserDataTypeCreator();
    public static final UserDataType HERE_CONTENT;
    public static final UserDataType TEST_TYPE;
    public static final Set VALUES;
    final int mEnumValue;
    final String mType;
    final int mVersionCode;

    UserDataType(int i, String s, int j)
    {
        Preconditions.checkNotEmpty(s);
        mVersionCode = i;
        mType = s;
        mEnumValue = j;
    }

    private static UserDataType create(String s, int i)
    {
        return new UserDataType(0, s, i);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UserDataType))
            {
                return false;
            }
            obj = (UserDataType)obj;
            if (!mType.equals(((UserDataType) (obj)).mType) || mEnumValue != ((UserDataType) (obj)).mEnumValue)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return mType.hashCode();
    }

    public final String toString()
    {
        return mType;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        UserDataTypeCreator.writeToParcel$90649e0(this, parcel);
    }

    static 
    {
        TEST_TYPE = create("test_type", 1);
        ALIASES = create("labeled_place", 6);
        HERE_CONTENT = create("here_content", 7);
        VALUES = CollectionUtils.setOf(TEST_TYPE, ALIASES, HERE_CONTENT);
    }
}
