// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.l;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            z

public class zzao
    implements SafeParcelable, l
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    final int a;
    private final String b;
    private final String c;

    zzao(int i, String s, String s1)
    {
        a = i;
        b = s;
        c = s1;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzao)
        {
            if (((zzao) (obj = (zzao)obj)).b.equals(b) && ((zzao) (obj)).c.equals(c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (b.hashCode() + 629) * 37 + c.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("NodeParcelable{")).append(b).append(",").append(c).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        z.a(this, parcel);
    }

}
