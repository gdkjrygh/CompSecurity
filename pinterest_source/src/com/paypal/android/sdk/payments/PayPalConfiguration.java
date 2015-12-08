// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.paypal.android.sdk.az;
import com.paypal.android.sdk.b;
import com.paypal.android.sdk.d;
import com.paypal.android.sdk.e;

// Referenced classes of package com.paypal.android.sdk.payments:
//            am, PayPalService, l

public final class PayPalConfiguration
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new am();
    private static final String a = com/paypal/android/sdk/payments/PayPalConfiguration.getSimpleName();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private String l;
    private Uri m;
    private Uri n;
    private boolean o;

    public PayPalConfiguration()
    {
        j = true;
        o = true;
    }

    private PayPalConfiguration(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        j = true;
        o = true;
        c = parcel.readString();
        b = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        boolean flag;
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        h = parcel.readString();
        i = parcel.readString();
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        k = parcel.readString();
        l = parcel.readString();
        m = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        n = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        if (parcel.readByte() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o = flag;
    }

    PayPalConfiguration(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static final String a(Context context)
    {
        java.util.concurrent.ExecutorService executorservice = PayPalService.a;
        new l();
        return com.paypal.android.sdk.e.a(executorservice, context, new b(context, "AndroidBasePrefs"), "2.10.0");
    }

    private static void a(boolean flag, String s)
    {
        if (!flag)
        {
            Log.e(a, (new StringBuilder()).append(s).append(" is invalid.  Please see the docs.").toString());
        }
    }

    public final PayPalConfiguration a(Uri uri)
    {
        m = uri;
        return this;
    }

    public final PayPalConfiguration a(String s)
    {
        c = s;
        return this;
    }

    final String a()
    {
        return b;
    }

    public final PayPalConfiguration b(Uri uri)
    {
        n = uri;
        return this;
    }

    public final PayPalConfiguration b(String s)
    {
        k = s;
        return this;
    }

    final String b()
    {
        if (com.paypal.android.sdk.d.a(c))
        {
            c = "live";
            Log.w("paypal.sdk", "defaulting to production environment");
        }
        return c;
    }

    public final PayPalConfiguration c(String s)
    {
        l = s;
        return this;
    }

    final String c()
    {
        return d;
    }

    final String d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    final String e()
    {
        return f;
    }

    final boolean f()
    {
        return g;
    }

    final String g()
    {
        return h;
    }

    final String h()
    {
        return i;
    }

    final boolean i()
    {
        return o;
    }

    final String j()
    {
        return k;
    }

    final String k()
    {
        return l;
    }

    final Uri l()
    {
        return m;
    }

    final Uri m()
    {
        return n;
    }

    final boolean n()
    {
        boolean flag1 = com.paypal.android.sdk.d.a(a, b(), "environment");
        a(flag1, "environment");
        boolean flag;
        if (flag1)
        {
            if (az.a(b()))
            {
                flag = true;
            } else
            {
                flag = com.paypal.android.sdk.d.a(a, k, "clientId");
                a(flag, "clientId");
            }
        } else
        {
            flag = false;
        }
        return flag1 && flag;
    }

    public final String toString()
    {
        return String.format((new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalConfiguration.getSimpleName()).append(": {environment:%s, client_id:%s, languageOrLocale:%s}").toString(), new Object[] {
            c, k, b
        });
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeString(c);
        parcel.writeString(b);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        if (g)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeString(h);
        parcel.writeString(i);
        if (j)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeParcelable(m, 0);
        parcel.writeParcelable(n, 0);
        if (o)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeByte((byte)i1);
    }

}
