// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import bpp;
import bqd;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ApplicationMetadata
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bqd();
    public final int a;
    public String b;
    public String c;
    public List d;
    public List e;
    public String f;
    public Uri g;

    private ApplicationMetadata()
    {
        a = 1;
        d = new ArrayList();
        e = new ArrayList();
    }

    public ApplicationMetadata(int i, String s, String s1, List list, List list1, String s2, Uri uri)
    {
        a = i;
        b = s;
        c = s1;
        d = list;
        e = list1;
        f = s2;
        g = uri;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ApplicationMetadata))
            {
                return false;
            }
            obj = (ApplicationMetadata)obj;
            if (!bpp.a(b, ((ApplicationMetadata) (obj)).b) || !bpp.a(d, ((ApplicationMetadata) (obj)).d) || !bpp.a(c, ((ApplicationMetadata) (obj)).c) || !bpp.a(e, ((ApplicationMetadata) (obj)).e) || !bpp.a(f, ((ApplicationMetadata) (obj)).f) || !bpp.a(g, ((ApplicationMetadata) (obj)).g))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, d, e, f, g
        });
    }

    public final String toString()
    {
        boolean flag = false;
        StringBuilder stringbuilder = (new StringBuilder("applicationId: ")).append(b).append(", name: ").append(c).append(", images.count: ");
        int i;
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.size();
        }
        stringbuilder = stringbuilder.append(i).append(", namespaces.count: ");
        if (e == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = e.size();
        }
        return stringbuilder.append(i).append(", senderAppIdentifier: ").append(f).append(", senderAppLaunchUrl: ").append(g).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bqd.a(this, parcel, i);
    }

}
