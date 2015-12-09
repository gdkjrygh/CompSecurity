// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gs, zzit

public class zziz
    implements SafeParcelable
{

    public static final gs CREATOR = new gs();
    final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final String g;
    public final zzit h[];
    final int i[];
    public final String j;

    zziz(int k, String s, String s1, boolean flag, int l, boolean flag1, String s2, 
            zzit azzit[], int ai[], String s3)
    {
        a = k;
        b = s;
        c = s1;
        d = flag;
        e = l;
        f = flag1;
        g = s2;
        h = azzit;
        i = ai;
        j = s3;
    }

    zziz(String s, String s1, boolean flag, int k, boolean flag1, String s2, zzit azzit[], 
            int ai[], String s3)
    {
        this(2, s, s1, flag, k, flag1, s2, azzit, ai, s3);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof zziz)
        {
            obj = (zziz)obj;
            flag = flag1;
            if (b.equals(((zziz) (obj)).b))
            {
                flag = flag1;
                if (c.equals(((zziz) (obj)).c))
                {
                    flag = flag1;
                    if (d == ((zziz) (obj)).d)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        gs.a(this, parcel, k);
    }

}
