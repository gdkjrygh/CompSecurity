// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            jn, gq, gr

public class id
    implements SafeParcelable
{

    public static final jn a = new jn();
    public final int b;
    public final String c;
    public final String d;

    public id(int i, String s, String s1)
    {
        b = i;
        c = s;
        d = s1;
    }

    public int describeContents()
    {
        jn jn1 = a;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof id))
            {
                return false;
            }
            obj = (id)obj;
            if (!d.equals(((id) (obj)).d) || !c.equals(((id) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d
        });
    }

    public String toString()
    {
        return gq.a(this).a("clientPackageName", c).a("locale", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jn jn1 = a;
        jn.a(this, parcel);
    }

}
