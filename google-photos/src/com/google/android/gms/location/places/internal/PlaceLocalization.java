// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import kct;
import lht;

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final lht CREATOR = new lht();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLocalization))
            {
                return false;
            }
            obj = (PlaceLocalization)obj;
            if (!c.b(b, ((PlaceLocalization) (obj)).b) || !c.b(c, ((PlaceLocalization) (obj)).c) || !c.b(d, ((PlaceLocalization) (obj)).d) || !c.b(e, ((PlaceLocalization) (obj)).e) || !c.b(f, ((PlaceLocalization) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, e
        });
    }

    public final String toString()
    {
        return c.b(this).a("name", b).a("address", c).a("internationalPhoneNumber", d).a("regularOpenHours", e).a("attributions", f).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lht.a(this, parcel);
    }

}
