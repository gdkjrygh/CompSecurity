// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            a

public class FACLConfig
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    final int a;
    boolean b;
    String c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;

    FACLConfig(int i, boolean flag, String s, boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        a = i;
        b = flag;
        c = s;
        d = flag1;
        e = flag2;
        f = flag3;
        g = flag4;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof FACLConfig)
        {
            obj = (FACLConfig)obj;
            flag = flag1;
            if (b == ((FACLConfig) (obj)).b)
            {
                flag = flag1;
                if (TextUtils.equals(c, ((FACLConfig) (obj)).c))
                {
                    flag = flag1;
                    if (d == ((FACLConfig) (obj)).d)
                    {
                        flag = flag1;
                        if (e == ((FACLConfig) (obj)).e)
                        {
                            flag = flag1;
                            if (f == ((FACLConfig) (obj)).f)
                            {
                                flag = flag1;
                                if (g == ((FACLConfig) (obj)).g)
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Boolean.valueOf(b), c, Boolean.valueOf(d), Boolean.valueOf(e), Boolean.valueOf(f), Boolean.valueOf(g)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.firstparty.shared.a.a(this, parcel);
    }

}
