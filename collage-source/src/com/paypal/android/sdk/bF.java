// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

// Referenced classes of package com.paypal.android.sdk:
//            cr, cs, ct, cn, 
//            fk, gd

public final class bF extends cr
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cs();
    private String b;
    private Date c;
    private String d;
    private ct e;
    private int f;
    private int g;

    public bF()
    {
    }

    private bF(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        d = parcel.readString();
        c = (Date)parcel.readSerializable();
        e = (ct)parcel.readSerializable();
        f = parcel.readInt();
        g = parcel.readInt();
    }

    bF(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public bF(cn cn1, String s, String s1, Date date, String s2, String s3, int i, 
            int j)
    {
        a = cn1.b(s1);
        b = s;
        c = date;
        b(s2);
        c(s3);
        f = i;
        g = j;
    }

    public bF(String s, String s1, String s2, String s3, String s4, int i, int j)
    {
        a = s1;
        b = s;
        c = fk.a(s2);
        b(s3);
        c(s4);
        f = i;
        g = j;
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder("x-")).append(s.substring(s.length() - 4)).toString();
        }
    }

    private void b(String s)
    {
        if (s != null)
        {
            d = s.substring(s.length() - 4);
            return;
        } else
        {
            d = null;
            return;
        }
    }

    private void c(String s)
    {
        e = ct.a(s);
    }

    public final boolean b()
    {
        return !gd.a(b) && !gd.a(d) && !gd.a(a) && c != null && !c.before(new Date()) && e != null && e != ct.a && f > 0 && f <= 12 && g >= 0 && g <= 9999;
    }

    public final Date c()
    {
        return c;
    }

    public final String d()
    {
        return a(d);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return b;
    }

    public final int f()
    {
        return f;
    }

    public final int g()
    {
        return g;
    }

    public final ct h()
    {
        return e;
    }

    public final String toString()
    {
        return (new StringBuilder("TokenizedCreditCard(token=")).append(b).append(",lastFourDigits=").append(d).append(",payerId=").append(a).append(",tokenValidUntil=").append(c).append(",cardType=").append(e).append(",expiryMonth/year=").append(f).append("/").append(g).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(d);
        parcel.writeSerializable(c);
        parcel.writeSerializable(e);
        parcel.writeInt(f);
        parcel.writeInt(g);
    }

}
