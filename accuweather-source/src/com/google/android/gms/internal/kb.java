// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            kc, hl

public class kb
    implements SafeParcelable
{

    public static final kc CREATOR = new kc();
    public final String YS;
    public final String YT;
    public final int versionCode;

    public kb(int i, String s, String s1)
    {
        versionCode = i;
        YS = s;
        YT = s1;
    }

    public kb(String s, Locale locale)
    {
        versionCode = 0;
        YS = s;
        YT = locale.toString();
    }

    public int describeContents()
    {
        kc kc1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof kb))
            {
                return false;
            }
            obj = (kb)obj;
            if (!YT.equals(((kb) (obj)).YT) || !YS.equals(((kb) (obj)).YS))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            YS, YT
        });
    }

    public String toString()
    {
        return hl.e(this).a("clientPackageName", YS).a("locale", YT).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kc kc1 = CREATOR;
        kc.a(this, parcel, i);
    }

}
