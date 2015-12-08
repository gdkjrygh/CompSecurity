// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            zza

public class Credential
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;
    private final List g;
    private final String h;
    private final String i;

    Credential(int j, String s, String s1, String s2, String s3, Uri uri, List list, 
            String s4, String s5)
    {
        a = j;
        b = s;
        c = s1;
        d = (String)zzu.a(s2);
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
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return f;
    }

    public List f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public String h()
    {
        return i;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        zza.a(this, parcel, j);
    }

}
