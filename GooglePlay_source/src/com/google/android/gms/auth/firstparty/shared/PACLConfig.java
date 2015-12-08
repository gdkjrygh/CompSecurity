// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            PACLConfigCreator

public class PACLConfig
    implements SafeParcelable
{

    public static final PACLConfigCreator CREATOR = new PACLConfigCreator();
    String pacl;
    final int version;
    String visibleActions;

    PACLConfig(int i, String s, String s1)
    {
        version = i;
        visibleActions = s;
        pacl = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof PACLConfig)
        {
            obj = (PACLConfig)obj;
            flag = flag1;
            if (TextUtils.equals(visibleActions, ((PACLConfig) (obj)).visibleActions))
            {
                flag = flag1;
                if (TextUtils.equals(pacl, ((PACLConfig) (obj)).pacl))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            visibleActions, pacl
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PACLConfigCreator.writeToParcel$68c3e050(this, parcel);
    }

}
