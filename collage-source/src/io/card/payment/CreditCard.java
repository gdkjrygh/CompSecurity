// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.UUID;

// Referenced classes of package io.card.payment:
//            d, b, k

public class CreditCard
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private static final String j = io/card/payment/CreditCard.getSimpleName();
    public String a;
    public int b;
    public int c;
    public String d;
    public String e;
    String f;
    boolean g;
    int h;
    int i[];

    public CreditCard()
    {
        b = 0;
        c = 0;
        g = false;
        i = new int[16];
        f = UUID.randomUUID().toString();
    }

    private CreditCard(Parcel parcel)
    {
        b = 0;
        c = 0;
        g = false;
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        h = parcel.readInt();
        i = parcel.createIntArray();
    }

    CreditCard(Parcel parcel, d d1)
    {
        this(parcel);
    }

    public CreditCard(String s, int l, int i1, String s1, String s2)
    {
        b = 0;
        c = 0;
        g = false;
        a = s;
        b = l;
        c = i1;
        d = s1;
        e = s2;
    }

    public String a()
    {
        if (a != null)
        {
            int l = Math.min(4, a.length());
            return a.substring(a.length() - l);
        } else
        {
            return "";
        }
    }

    public String b()
    {
        if (a != null)
        {
            String s = "";
            if (a.length() > 4)
            {
                s = (new StringBuilder()).append("").append(String.format((new StringBuilder("%")).append(a.length() - 4).append("s").toString(), new Object[] {
                    ""
                }).replace(' ', '\u2022')).toString();
            }
            return k.a((new StringBuilder()).append(s).append(a()).toString(), false, io.card.payment.b.b(a));
        } else
        {
            return "";
        }
    }

    public b c()
    {
        return io.card.payment.b.b(a);
    }

    public boolean d()
    {
        int l = b;
        int i1 = c;
        if (l > 0 && 12 >= l)
        {
            Calendar calendar = Calendar.getInstance();
            int j1 = calendar.get(1);
            int k1 = calendar.get(2);
            if (i1 >= j1 && (i1 != j1 || l >= k1 + 1) && i1 <= j1 + 15)
            {
                return true;
            }
        }
        return false;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Object obj;
label0:
        {
            String s = (new StringBuilder("{")).append(c()).append(": ").append(b()).toString();
            if (b <= 0)
            {
                obj = s;
                if (c <= 0)
                {
                    break label0;
                }
            }
            obj = (new StringBuilder()).append(s).append("  expiry:").append(b).append("/").append(c).toString();
        }
        String s1 = ((String) (obj));
        if (e != null)
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append("  postalCode:").append(e).toString();
        }
        obj = s1;
        if (d != null)
        {
            obj = (new StringBuilder()).append(s1).append("  cvvLength:");
            int l;
            if (d != null)
            {
                l = d.length();
            } else
            {
                l = 0;
            }
            obj = ((StringBuilder) (obj)).append(l).toString();
        }
        return (new StringBuilder()).append(((String) (obj))).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeInt(h);
        parcel.writeIntArray(i);
    }

}
