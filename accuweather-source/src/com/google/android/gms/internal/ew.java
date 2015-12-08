// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ex

public final class ew
    implements SafeParcelable
{

    public static final ex CREATOR = new ex();
    public String st;
    public int su;
    public int sv;
    public boolean sw;
    public final int versionCode;

    public ew(int i, int j, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("afma-sdk-a-v").append(i).append(".").append(j).append(".");
        String s;
        if (flag)
        {
            s = "0";
        } else
        {
            s = "1";
        }
        this(1, stringbuilder.append(s).toString(), i, j, flag);
    }

    ew(int i, String s, int j, int k, boolean flag)
    {
        versionCode = i;
        st = s;
        su = j;
        sv = k;
        sw = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ex.a(this, parcel, i);
    }

}
