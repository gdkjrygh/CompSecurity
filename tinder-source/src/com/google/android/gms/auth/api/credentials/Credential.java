// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
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
    final String b;
    final String c;
    final Uri d;
    final List e;
    final String f;
    final String g;
    final String h;
    final String i;

    Credential(int j, String s, String s1, Uri uri, List list, String s2, String s3, 
            String s4, String s5)
    {
        a = j;
        b = (String)u.a(s);
        c = s1;
        d = uri;
        if (list == null)
        {
            s = Collections.emptyList();
        } else
        {
            s = Collections.unmodifiableList(list);
        }
        e = s;
        f = s2;
        g = s3;
        h = s4;
        i = s5;
    }

    public int describeContents()
    {
        return 0;
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
            if (!TextUtils.equals(b, ((Credential) (obj)).b) || !TextUtils.equals(c, ((Credential) (obj)).c) || !t.a(d, ((Credential) (obj)).d) || !TextUtils.equals(f, ((Credential) (obj)).f) || !TextUtils.equals(g, ((Credential) (obj)).g) || !TextUtils.equals(h, ((Credential) (obj)).h))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, f, g, h
        });
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.auth.api.credentials.a.a(this, parcel, j);
    }

}
