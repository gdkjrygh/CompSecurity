// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            le

public class zztj
    implements SafeParcelable
{

    public static final le CREATOR = new le();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;

    public zztj(int i, String s, int j, int k, String s1, String s2, boolean flag, 
            String s3)
    {
        a = i;
        b = s;
        c = j;
        d = k;
        e = s1;
        f = s2;
        g = flag;
        h = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof zztj)
            {
                if (!b.equals(((zztj) (obj = (zztj)obj)).b) || c != ((zztj) (obj)).c || d != ((zztj) (obj)).d || !an.a(h, ((zztj) (obj)).h) || !an.a(e, ((zztj) (obj)).e) || !an.a(f, ((zztj) (obj)).f) || g != ((zztj) (obj)).g)
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
            b, Integer.valueOf(c), Integer.valueOf(d), e, f, Boolean.valueOf(g)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("package=").append(b).append(',');
        stringbuilder.append("versionCode=").append(a).append(',');
        stringbuilder.append("logSource=").append(d).append(',');
        stringbuilder.append("logSourceName=").append(h).append(',');
        stringbuilder.append("uploadAccount=").append(e).append(',');
        stringbuilder.append("loggingId=").append(f).append(',');
        stringbuilder.append("logAndroidId=").append(g);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        le.a(this, parcel);
    }

}
