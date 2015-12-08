// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            ht, fo

public class hs
    implements SafeParcelable
{

    public static final ht CREATOR = new ht();
    public final String Rl;
    public final String Rm;
    public final int versionCode;

    public hs(int i, String s, String s1)
    {
        versionCode = i;
        Rl = s;
        Rm = s1;
    }

    public hs(String s, Locale locale)
    {
        versionCode = 0;
        Rl = s;
        Rm = locale.toString();
    }

    public int describeContents()
    {
        ht ht1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof hs))
            {
                return false;
            }
            obj = (hs)obj;
            if (!Rm.equals(((hs) (obj)).Rm) || !Rl.equals(((hs) (obj)).Rl))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Rl, Rm
        });
    }

    public String toString()
    {
        return fo.e(this).a("clientPackageName", Rl).a("locale", Rm).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ht ht1 = CREATOR;
        ht.a(this, parcel, i);
    }

}
