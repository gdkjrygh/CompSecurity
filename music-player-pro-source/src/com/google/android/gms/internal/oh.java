// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            oi, jv

public class oh
    implements SafeParcelable
{

    public static final oi CREATOR = new oi();
    public static final oh akf;
    public final String akg;
    public final String akh;
    public final String aki;
    public final String akj;
    public final int versionCode;

    public oh(int i, String s, String s1, String s2, String s3)
    {
        versionCode = i;
        akg = s;
        akh = s1;
        aki = s2;
        akj = s3;
    }

    public oh(String s, Locale locale, String s1)
    {
        this(1, s, locale.toString(), s1, null);
    }

    public int describeContents()
    {
        oi oi1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof oh))
            {
                return false;
            }
            obj = (oh)obj;
            if (!akh.equals(((oh) (obj)).akh) || !akg.equals(((oh) (obj)).akg) || !jv.equal(aki, ((oh) (obj)).aki) || !jv.equal(akj, ((oh) (obj)).akj))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            akg, akh, aki
        });
    }

    public String toString()
    {
        return jv.h(this).a("clientPackageName", akg).a("locale", akh).a("accountName", aki).a("gCoreClientName", akj).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        oi oi1 = CREATOR;
        oi.a(this, parcel, i);
    }

    static 
    {
        akf = new oh("com.google.android.gms", Locale.ENGLISH, null);
    }
}
