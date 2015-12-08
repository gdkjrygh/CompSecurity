// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            CustomPropertyKeyCreator

public class CustomPropertyKey
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CustomPropertyKeyCreator();
    private static final Pattern PROPERTY_KEY_PATTERN = Pattern.compile("[\\w.!@$%^&*()/-]+");
    public final String mKey;
    final int mVersionCode;
    final int mVisibility;

    CustomPropertyKey(int i, String s, int j)
    {
        boolean flag1 = true;
        super();
        Preconditions.checkNotNull(s, "key");
        Preconditions.checkArgument(PROPERTY_KEY_PATTERN.matcher(s).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        boolean flag = flag1;
        if (j != 0)
        {
            if (j == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        Preconditions.checkArgument(flag, "visibility must be either PUBLIC or PRIVATE");
        mVersionCode = i;
        mKey = s;
        mVisibility = j;
    }

    public CustomPropertyKey(String s, int i)
    {
        this(1, s, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj instanceof CustomPropertyKey)
            {
                obj = (CustomPropertyKey)obj;
                if (((CustomPropertyKey) (obj)).mKey.equals(mKey) && ((CustomPropertyKey) (obj)).mVisibility == mVisibility)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (new StringBuilder()).append(mKey).append(mVisibility).toString().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("CustomPropertyKey(")).append(mKey).append(",").append(mVisibility).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CustomPropertyKeyCreator.writeToParcel$6e1cf3c6(this, parcel);
    }

}
