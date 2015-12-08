// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.plus.internal:
//            f

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public static String TAG = "PlusCommonExtras";
    private String Uh;
    private String Ui;
    private final int xH;

    public PlusCommonExtras()
    {
        xH = 1;
        Uh = "";
        Ui = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        xH = i;
        Uh = s;
        Ui = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (xH == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).xH && fo.equal(Uh, ((PlusCommonExtras) (obj)).Uh) && fo.equal(Ui, ((PlusCommonExtras) (obj)).Ui))
            {
                return true;
            }
        }
        return false;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(xH), Uh, Ui
        });
    }

    public String iN()
    {
        return Uh;
    }

    public String iO()
    {
        return Ui;
    }

    public void m(Bundle bundle)
    {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", c.a(this));
    }

    public String toString()
    {
        return fo.e(this).a("versionCode", Integer.valueOf(xH)).a("Gpsrc", Uh).a("ClientCallingPackage", Ui).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
