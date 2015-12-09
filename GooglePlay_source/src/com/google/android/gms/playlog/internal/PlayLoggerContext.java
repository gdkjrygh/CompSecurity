// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContextCreator

public class PlayLoggerContext
    implements SafeParcelable
{

    public static final PlayLoggerContextCreator CREATOR = new PlayLoggerContextCreator();
    public final boolean isAnonymous;
    public final boolean logAndroidId;
    public final int logSource;
    public final String logSourceName;
    public final String loggingId;
    public final String packageName;
    public final int packageVersionCode;
    public final int qosTier;
    public final String uploadAccountName;
    public final int versionCode;

    public PlayLoggerContext(int i, String s, int j, int k, String s1, String s2, boolean flag, 
            String s3, boolean flag1, int l)
    {
        versionCode = i;
        packageName = s;
        packageVersionCode = j;
        logSource = k;
        uploadAccountName = s1;
        loggingId = s2;
        logAndroidId = flag;
        logSourceName = s3;
        isAnonymous = flag1;
        qosTier = l;
    }

    public PlayLoggerContext(String s, int i, int j, String s1, String s2, String s3, boolean flag, 
            int k)
    {
        versionCode = 1;
        packageName = (String)Preconditions.checkNotNull(s);
        packageVersionCode = i;
        logSource = j;
        logSourceName = s1;
        uploadAccountName = s2;
        loggingId = s3;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        logAndroidId = flag1;
        isAnonymous = flag;
        qosTier = k;
    }

    public PlayLoggerContext(String s, int i, int j, String s1, String s2, boolean flag)
    {
        versionCode = 1;
        packageName = (String)Preconditions.checkNotNull(s);
        packageVersionCode = i;
        logSource = j;
        logSourceName = null;
        uploadAccountName = s1;
        loggingId = s2;
        logAndroidId = flag;
        isAnonymous = false;
        qosTier = 0;
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
                if (versionCode != ((PlayLoggerContext) (obj = (PlayLoggerContext)obj)).versionCode || !packageName.equals(((PlayLoggerContext) (obj)).packageName) || packageVersionCode != ((PlayLoggerContext) (obj)).packageVersionCode || logSource != ((PlayLoggerContext) (obj)).logSource || !Objects.equal(logSourceName, ((PlayLoggerContext) (obj)).logSourceName) || !Objects.equal(uploadAccountName, ((PlayLoggerContext) (obj)).uploadAccountName) || !Objects.equal(loggingId, ((PlayLoggerContext) (obj)).loggingId) || logAndroidId != ((PlayLoggerContext) (obj)).logAndroidId || isAnonymous != ((PlayLoggerContext) (obj)).isAnonymous || qosTier != ((PlayLoggerContext) (obj)).qosTier)
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
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(versionCode), packageName, Integer.valueOf(packageVersionCode), Integer.valueOf(logSource), logSourceName, uploadAccountName, loggingId, Boolean.valueOf(logAndroidId), Boolean.valueOf(isAnonymous), Integer.valueOf(qosTier)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("versionCode=").append(versionCode).append(',');
        stringbuilder.append("package=").append(packageName).append(',');
        stringbuilder.append("packageVersionCode=").append(packageVersionCode).append(',');
        stringbuilder.append("logSource=").append(logSource).append(',');
        stringbuilder.append("logSourceName=").append(logSourceName).append(',');
        stringbuilder.append("uploadAccount=").append(uploadAccountName).append(',');
        stringbuilder.append("loggingId=").append(loggingId).append(',');
        stringbuilder.append("logAndroidId=").append(logAndroidId).append(',');
        stringbuilder.append("isAnonymous=").append(isAnonymous).append(',');
        stringbuilder.append("qosTier=").append(qosTier);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayLoggerContextCreator.writeToParcel$495264e0(this, parcel);
    }

}
