// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zze

public class PlayLoggerContext
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    public final String packageName;
    public final int versionCode;
    public final int zzayB;
    public final int zzayC;
    public final String zzayD;
    public final String zzayE;
    public final boolean zzayF;
    public final String zzayG;
    public final boolean zzayH;

    public PlayLoggerContext(int i, String s, int j, int k, String s1, String s2, boolean flag, 
            String s3, boolean flag1)
    {
        versionCode = i;
        packageName = s;
        zzayB = j;
        zzayC = k;
        zzayD = s1;
        zzayE = s2;
        zzayF = flag;
        zzayG = s3;
        zzayH = flag1;
    }

    public PlayLoggerContext(String s, int i, int j, String s1, String s2, boolean flag)
    {
        versionCode = 1;
        packageName = (String)zzv.zzr(s);
        zzayB = i;
        zzayC = j;
        zzayG = null;
        zzayD = s1;
        zzayE = s2;
        zzayF = flag;
        zzayH = false;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof PlayLoggerContext)
            {
                if (!packageName.equals(((PlayLoggerContext) (obj = (PlayLoggerContext)obj)).packageName) || zzayB != ((PlayLoggerContext) (obj)).zzayB || zzayC != ((PlayLoggerContext) (obj)).zzayC || !zzu.equal(zzayG, ((PlayLoggerContext) (obj)).zzayG) || !zzu.equal(zzayD, ((PlayLoggerContext) (obj)).zzayD) || !zzu.equal(zzayE, ((PlayLoggerContext) (obj)).zzayE) || zzayF != ((PlayLoggerContext) (obj)).zzayF || zzayH != ((PlayLoggerContext) (obj)).zzayH)
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
        return zzu.hashCode(new Object[] {
            packageName, Integer.valueOf(zzayB), Integer.valueOf(zzayC), zzayG, zzayD, zzayE, Boolean.valueOf(zzayF), Boolean.valueOf(zzayH)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("package=").append(packageName).append(',');
        stringbuilder.append("versionCode=").append(versionCode).append(',');
        stringbuilder.append("logSource=").append(zzayC).append(',');
        stringbuilder.append("logSourceName=").append(zzayG).append(',');
        stringbuilder.append("uploadAccount=").append(zzayD).append(',');
        stringbuilder.append("loggingId=").append(zzayE).append(',');
        stringbuilder.append("logAndroidId=").append(zzayF).append(',');
        stringbuilder.append("isAnonymous=").append(zzayH);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
