// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            ps, kl

public class pr
    implements SafeParcelable
{

    public static final ps CREATOR = new ps();
    public static final pr axv;
    public final String accountName;
    public final String awt;
    public final String axw;
    public final String localeString;
    public final int versionCode;

    public pr(int i, String s, String s1, String s2, String s3)
    {
        versionCode = i;
        axw = s;
        localeString = s1;
        accountName = s2;
        awt = s3;
    }

    private pr(String s, Locale locale, String s1)
    {
        this(1, s, locale.toString(), s1, null);
    }

    public int describeContents()
    {
        ps ps1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof pr))
            {
                return false;
            }
            obj = (pr)obj;
            if (!localeString.equals(((pr) (obj)).localeString) || !axw.equals(((pr) (obj)).axw) || !kl.equal(accountName, ((pr) (obj)).accountName) || !kl.equal(awt, ((pr) (obj)).awt))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            axw, localeString, accountName
        });
    }

    public String toString()
    {
        return kl.j(this).a("clientPackageName", axw).a("locale", localeString).a("accountName", accountName).a("gCoreClientName", awt).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ps ps1 = CREATOR;
        ps.a(this, parcel, i);
    }

    static 
    {
        axv = new pr("com.google.android.gms", Locale.ENGLISH, null);
    }
}
