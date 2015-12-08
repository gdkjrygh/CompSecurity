// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            my

public class mx
    implements SafeParcelable
{

    public static final my CREATOR = new my();
    public final String Dv;
    public final String aij;
    public final String aik;
    public final int versionCode;

    public mx(int i, String s, String s1, String s2)
    {
        versionCode = i;
        aij = s;
        aik = s1;
        Dv = s2;
    }

    public mx(String s, Locale locale, String s1)
    {
        versionCode = 0;
        aij = s;
        aik = locale.toString();
        Dv = s1;
    }

    public int describeContents()
    {
        my my1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof mx))
            {
                return false;
            }
            obj = (mx)obj;
            if (!aik.equals(((mx) (obj)).aik) || !aij.equals(((mx) (obj)).aij) || !n.equal(Dv, ((mx) (obj)).Dv))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            aij, aik, Dv
        });
    }

    public String toString()
    {
        return n.h(this).a("clientPackageName", aij).a("locale", aik).a("accountName", Dv).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        my my1 = CREATOR;
        my.a(this, parcel, i);
    }

}
