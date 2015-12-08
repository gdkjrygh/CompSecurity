// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.drive.metadata:
//            c

public class CustomPropertyKey
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private static final Pattern PF = Pattern.compile("[\\w.!@$%^&*()/-]+");
    final int BR;
    final String JO;
    final int mVisibility;

    CustomPropertyKey(int i, String s, int j)
    {
        boolean flag1 = true;
        super();
        o.b(s, "key");
        o.b(PF.matcher(s).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
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
        o.b(flag, "visibility must be either PUBLIC or PRIVATE");
        BR = i;
        JO = s;
        mVisibility = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (obj != null)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj instanceof CustomPropertyKey)
            {
                obj = (CustomPropertyKey)obj;
                if (!((CustomPropertyKey) (obj)).getKey().equals(JO) || ((CustomPropertyKey) (obj)).getVisibility() != mVisibility)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public String getKey()
    {
        return JO;
    }

    public int getVisibility()
    {
        return mVisibility;
    }

    public int hashCode()
    {
        return (new StringBuilder()).append(JO).append(mVisibility).toString().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("CustomPropertyKey(").append(JO).append(",").append(mVisibility).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
