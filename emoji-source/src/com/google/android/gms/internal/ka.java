// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            kb, hk

public class ka
    implements SafeParcelable
{

    public static final kb CREATOR = new kb();
    public final String YV;
    public final String YW;
    public final int versionCode;

    public ka(int i, String s, String s1)
    {
        versionCode = i;
        YV = s;
        YW = s1;
    }

    public ka(String s, Locale locale)
    {
        versionCode = 0;
        YV = s;
        YW = locale.toString();
    }

    public int describeContents()
    {
        kb kb1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof ka))
            {
                return false;
            }
            obj = (ka)obj;
            if (!YW.equals(((ka) (obj)).YW) || !YV.equals(((ka) (obj)).YV))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            YV, YW
        });
    }

    public String toString()
    {
        return hk.e(this).a("clientPackageName", YV).a("locale", YW).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kb kb1 = CREATOR;
        kb.a(this, parcel, i);
    }

}
