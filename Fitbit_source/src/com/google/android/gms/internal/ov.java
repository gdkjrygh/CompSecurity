// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            db, am, ak

public class ov
    implements SafeParcelable
{

    public static final db CREATOR = new db();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;

    public ov(int i, String s, int j, int k, String s1, String s2, boolean flag, 
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

    public ov(String s, int i, int j, String s1, String s2, boolean flag)
    {
        a = 1;
        b = (String)am.a(s);
        c = i;
        d = j;
        h = null;
        e = s1;
        f = s2;
        g = flag;
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
                if (!b.equals(((ov) (obj = (ov)obj)).b) || c != ((ov) (obj)).c || d != ((ov) (obj)).d || !ak.a(h, ((ov) (obj)).h) || !ak.a(e, ((ov) (obj)).e) || !ak.a(f, ((ov) (obj)).f) || g != ((ov) (obj)).g)
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
        return ak.a(new Object[] {
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
        db.a(this, parcel, i);
    }

}
