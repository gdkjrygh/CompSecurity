// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zze

public class PlayLoggerContext
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public PlayLoggerContext(int j, String s, int k, int l, String s1, String s2, boolean flag, 
            String s3, boolean flag1)
    {
        a = j;
        b = s;
        c = k;
        d = l;
        e = s1;
        f = s2;
        g = flag;
        h = s3;
        i = flag1;
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
                if (a != ((PlayLoggerContext) (obj = (PlayLoggerContext)obj)).a || !b.equals(((PlayLoggerContext) (obj)).b) || c != ((PlayLoggerContext) (obj)).c || d != ((PlayLoggerContext) (obj)).d || !zzt.a(h, ((PlayLoggerContext) (obj)).h) || !zzt.a(e, ((PlayLoggerContext) (obj)).e) || !zzt.a(f, ((PlayLoggerContext) (obj)).f) || g != ((PlayLoggerContext) (obj)).g || i != ((PlayLoggerContext) (obj)).i)
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
        return zzt.a(new Object[] {
            Integer.valueOf(a), b, Integer.valueOf(c), Integer.valueOf(d), h, e, f, Boolean.valueOf(g), Boolean.valueOf(i)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("versionCode=").append(a).append(',');
        stringbuilder.append("package=").append(b).append(',');
        stringbuilder.append("packageVersionCode=").append(c).append(',');
        stringbuilder.append("logSource=").append(d).append(',');
        stringbuilder.append("logSourceName=").append(h).append(',');
        stringbuilder.append("uploadAccount=").append(e).append(',');
        stringbuilder.append("loggingId=").append(f).append(',');
        stringbuilder.append("logAndroidId=").append(g).append(',');
        stringbuilder.append("isAnonymous=").append(i);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        zze.a(this, parcel, j);
    }

}
