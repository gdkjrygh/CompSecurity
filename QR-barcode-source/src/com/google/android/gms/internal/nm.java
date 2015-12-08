// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            nn

public class nm
    implements SafeParcelable
{

    public static final nn CREATOR = new nn();
    public final int akR;
    public final int akS;
    public final String akT;
    public final String akU;
    public final boolean akV;
    public final String packageName;
    public final int versionCode;

    public nm(int i, String s, int j, int k, String s1, String s2, boolean flag)
    {
        versionCode = i;
        packageName = s;
        akR = j;
        akS = k;
        akT = s1;
        akU = s2;
        akV = flag;
    }

    public nm(String s, int i, int j, String s1, String s2, boolean flag)
    {
        versionCode = 1;
        packageName = (String)o.i(s);
        akR = i;
        akS = j;
        akT = s1;
        akU = s2;
        akV = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof nm)
            {
                if (!packageName.equals(((nm) (obj = (nm)obj)).packageName) || akR != ((nm) (obj)).akR || akS != ((nm) (obj)).akS || !n.equal(akT, ((nm) (obj)).akT) || !n.equal(akU, ((nm) (obj)).akU) || akV != ((nm) (obj)).akV)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            packageName, Integer.valueOf(akR), Integer.valueOf(akS), akT, akU, Boolean.valueOf(akV)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("package=").append(packageName).append(',');
        stringbuilder.append("versionCode=").append(versionCode).append(',');
        stringbuilder.append("logSource=").append(akS).append(',');
        stringbuilder.append("uploadAccount=").append(akT).append(',');
        stringbuilder.append("loggingId=").append(akU).append(',');
        stringbuilder.append("logAndroidId=").append(akV);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nn.a(this, parcel, i);
    }

}
