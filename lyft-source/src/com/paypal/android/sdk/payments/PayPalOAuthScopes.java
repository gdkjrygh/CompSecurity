// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.paypal.android.sdk.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ap

public final class PayPalOAuthScopes
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ap();
    public static final String PAYPAL_SCOPE_ADDRESS;
    public static final String PAYPAL_SCOPE_EMAIL;
    public static final String PAYPAL_SCOPE_FUTURE_PAYMENTS;
    public static final String PAYPAL_SCOPE_OPENID;
    public static final String PAYPAL_SCOPE_PAYPAL_ATTRIBUTES;
    public static final String PAYPAL_SCOPE_PHONE;
    public static final String PAYPAL_SCOPE_PROFILE;
    private List a;

    public PayPalOAuthScopes()
    {
        a = new ArrayList();
    }

    private PayPalOAuthScopes(Parcel parcel)
    {
        a = new ArrayList();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            a.add(parcel.readString());
        }

    }

    PayPalOAuthScopes(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PayPalOAuthScopes(Set set)
    {
        this();
        String s;
        for (set = set.iterator(); set.hasNext(); a.add(s))
        {
            s = (String)set.next();
        }

    }

    final List a()
    {
        return a;
    }

    final String b()
    {
        return TextUtils.join(" ", a);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format((new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalOAuthScopes.getSimpleName()).append(": {%s}").toString(), new Object[] {
            a
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.size());
        for (i = 0; i < a.size(); i++)
        {
            parcel.writeString((String)a.get(i));
        }

    }

    static 
    {
        PAYPAL_SCOPE_FUTURE_PAYMENTS = L.a.a();
        PAYPAL_SCOPE_PROFILE = L.b.a();
        PAYPAL_SCOPE_PAYPAL_ATTRIBUTES = L.c.a();
        PAYPAL_SCOPE_EMAIL = L.e.a();
        PAYPAL_SCOPE_ADDRESS = L.f.a();
        PAYPAL_SCOPE_PHONE = L.g.a();
        PAYPAL_SCOPE_OPENID = L.d.a();
    }
}
