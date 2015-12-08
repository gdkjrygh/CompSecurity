// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ow, jx, jv

public class ov
    implements SafeParcelable
{

    public static final ow CREATOR = new ow();
    public final int ang;
    public final int anh;
    public final String ani;
    public final String anj;
    public final boolean ank;
    public final String anl;
    public final String packageName;
    public final int versionCode;

    public ov(int i, String s, int j, int k, String s1, String s2, boolean flag, 
            String s3)
    {
        versionCode = i;
        packageName = s;
        ang = j;
        anh = k;
        ani = s1;
        anj = s2;
        ank = flag;
        anl = s3;
    }

    public ov(String s, int i, int j, String s1, String s2, boolean flag)
    {
        versionCode = 1;
        packageName = (String)jx.i(s);
        ang = i;
        anh = j;
        anl = null;
        ani = s1;
        anj = s2;
        ank = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof ov)
            {
                if (!packageName.equals(((ov) (obj = (ov)obj)).packageName) || ang != ((ov) (obj)).ang || anh != ((ov) (obj)).anh || !jv.equal(anl, ((ov) (obj)).anl) || !jv.equal(ani, ((ov) (obj)).ani) || !jv.equal(anj, ((ov) (obj)).anj) || ank != ((ov) (obj)).ank)
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
        return jv.hashCode(new Object[] {
            packageName, Integer.valueOf(ang), Integer.valueOf(anh), ani, anj, Boolean.valueOf(ank)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("package=").append(packageName).append(',');
        stringbuilder.append("versionCode=").append(versionCode).append(',');
        stringbuilder.append("logSource=").append(anh).append(',');
        stringbuilder.append("logSourceName=").append(anl).append(',');
        stringbuilder.append("uploadAccount=").append(ani).append(',');
        stringbuilder.append("loggingId=").append(anj).append(',');
        stringbuilder.append("logAndroidId=").append(ank);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ow.a(this, parcel, i);
    }

}
