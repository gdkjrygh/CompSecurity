// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.cast:
//            a

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    String a;
    String b;
    List c;
    List d;
    String e;
    Uri f;
    private final int g;

    private ApplicationMetadata()
    {
        g = 1;
        c = new ArrayList();
        d = new ArrayList();
    }

    ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        g = i;
        a = s;
        b = s1;
        c = list;
        d = list1;
        e = s2;
        f = uri;
    }

    final int a()
    {
        return g;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public final String d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Uri e()
    {
        return f;
    }

    public final List f()
    {
        return c;
    }

    public final String toString()
    {
        return b;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.cast.a.a(this, parcel, i);
    }

}
