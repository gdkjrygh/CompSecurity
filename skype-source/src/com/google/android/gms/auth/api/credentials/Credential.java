// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            a

public class Credential
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;
    private final List g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;

    Credential(int l, String s, String s1, String s2, String s3, Uri uri, List list, 
            String s4, String s5, String s6, String s7)
    {
        a = l;
        b = s;
        c = s1;
        d = (String)y.a(s2);
        e = s3;
        f = uri;
        if (list == null)
        {
            s = Collections.emptyList();
        } else
        {
            s = Collections.unmodifiableList(list);
        }
        g = s;
        h = s4;
        i = s5;
        j = s6;
        k = s7;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Uri e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Credential))
            {
                return false;
            }
            obj = (Credential)obj;
            if (!TextUtils.equals(d, ((Credential) (obj)).d) || !TextUtils.equals(e, ((Credential) (obj)).e) || !x.a(f, ((Credential) (obj)).f) || !TextUtils.equals(h, ((Credential) (obj)).h) || !TextUtils.equals(i, ((Credential) (obj)).i) || !TextUtils.equals(j, ((Credential) (obj)).j))
            {
                return false;
            }
        }
        return true;
    }

    public final List f()
    {
        return g;
    }

    public final String g()
    {
        return h;
    }

    public final String h()
    {
        return j;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            d, e, f, h, i, j
        });
    }

    public final String i()
    {
        return i;
    }

    public final String j()
    {
        return k;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.auth.api.credentials.a.a(this, parcel, l);
    }

}
