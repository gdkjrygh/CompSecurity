// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.zero.rewrite.ZeroUrlRewriteRule;
import com.google.common.a.es;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.zero.server:
//            b

public class FetchZeroTokenResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final String b;
    private final es c;
    private final es d;

    public FetchZeroTokenResult(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = es.a(parcel.createStringArrayList());
        d = es.a(parcel.createTypedArrayList(ZeroUrlRewriteRule.CREATOR));
    }

    public FetchZeroTokenResult(String s, String s1, es es1, es es2)
    {
        a = s;
        b = s1;
        c = es1;
        d = es2;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public es c()
    {
        return d;
    }

    public es d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof FetchZeroTokenResult)
        {
            if (Objects.equal(a, ((FetchZeroTokenResult) (obj = (FetchZeroTokenResult)obj)).a()) && Objects.equal(b, ((FetchZeroTokenResult) (obj)).b()) && Objects.equal(c, ((FetchZeroTokenResult) (obj)).d()) && Objects.equal(d, ((FetchZeroTokenResult) (obj)).c()))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b, c, d
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("campaignId", a).add("status", b).add("enabledUiFeatures", c).add("rewriteRules", d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeStringList(c);
        parcel.writeTypedList(d);
    }

}
