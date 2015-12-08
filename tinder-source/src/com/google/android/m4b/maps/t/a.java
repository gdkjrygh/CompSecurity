// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.t;

import android.os.Parcel;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.k.c;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.t:
//            b

public final class a
    implements c
{

    public static final b CREATOR = new b();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public a(int j, String s, int k, int l, String s1, String s2, boolean flag, 
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

    public a(String s, int j, int k, String s1, String s2, String s3, boolean flag)
    {
        a = 1;
        b = (String)x.a(s);
        c = j;
        d = k;
        h = s1;
        e = s2;
        f = s3;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g = flag1;
        i = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof a)
            {
                if (a != ((a) (obj = (a)obj)).a || !b.equals(((a) (obj)).b) || c != ((a) (obj)).c || d != ((a) (obj)).d || !v.a(h, ((a) (obj)).h) || !v.a(e, ((a) (obj)).e) || !v.a(f, ((a) (obj)).f) || g != ((a) (obj)).g || i != ((a) (obj)).i)
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

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, Integer.valueOf(c), Integer.valueOf(d), h, e, f, Boolean.valueOf(g), Boolean.valueOf(i)
        });
    }

    public final String toString()
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

    public final void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.m4b.maps.t.b.a(this, parcel);
    }

}
