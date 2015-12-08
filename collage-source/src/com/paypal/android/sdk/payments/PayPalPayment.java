// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.paypal.android.sdk.dd;
import com.paypal.android.sdk.gd;
import java.math.BigDecimal;

// Referenced classes of package com.paypal.android.sdk.payments:
//            cc, PayPalPaymentDetails, PayPalItem, ShippingAddress

public final class PayPalPayment
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cc();
    private static final String a = com/paypal/android/sdk/payments/PayPalPayment.getSimpleName();
    private BigDecimal b;
    private String c;
    private String d;
    private String e;
    private PayPalPaymentDetails f;
    private String g;
    private PayPalItem h[];
    private boolean i;
    private ShippingAddress j;
    private String k;
    private String l;
    private String m;

    private PayPalPayment(Parcel parcel)
    {
        c = parcel.readString();
        int i1;
        boolean flag;
        try
        {
            b = new BigDecimal(parcel.readString());
        }
        catch (NumberFormatException numberformatexception) { }
        d = parcel.readString();
        g = parcel.readString();
        e = parcel.readString();
        f = (PayPalPaymentDetails)parcel.readParcelable(com/paypal/android/sdk/payments/PayPalPaymentDetails.getClassLoader());
        i1 = parcel.readInt();
        if (i1 > 0)
        {
            h = new PayPalItem[i1];
            parcel.readTypedArray(h, PayPalItem.CREATOR);
        }
        j = (ShippingAddress)parcel.readParcelable(com/paypal/android/sdk/payments/ShippingAddress.getClassLoader());
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        k = parcel.readString();
        l = parcel.readString();
        m = parcel.readString();
    }

    PayPalPayment(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PayPalPayment(BigDecimal bigdecimal, String s, String s1, String s2)
    {
        b = bigdecimal;
        c = s;
        d = s1;
        g = s2;
        f = null;
        e = null;
        toString();
    }

    private static void a(boolean flag, String s)
    {
        if (!flag)
        {
            Log.e("paypal.sdk", (new StringBuilder()).append(s).append(" is invalid.  Please see the docs.").toString());
        }
    }

    private static boolean a(String s, String s1, int i1)
    {
        if (gd.d(s) && s.length() > i1)
        {
            Log.e("paypal.sdk", (new StringBuilder()).append(s1).append(" is too long (max ").append(i1).append(")").toString());
            return false;
        } else
        {
            return true;
        }
    }

    public final boolean a()
    {
        boolean flag;
        boolean flag4 = dd.a(c);
        boolean flag5 = dd.a(b, c, true);
        boolean flag6 = gd.b(d);
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (gd.d(g) && (g.equals("sale") || g.equals("authorize") || g.equals("order")))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (f == null)
        {
            flag2 = true;
        } else
        {
            flag2 = f.a();
        }
        if (gd.c(e))
        {
            flag3 = true;
        } else
        {
            flag3 = gd.c(e);
        }
        if (h != null && h.length != 0) goto _L2; else goto _L1
_L1:
        flag = true;
_L3:
        PayPalItem apaypalitem[];
        int i1;
        int j1;
        if (!a(k, "invoiceNumber", 256))
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (!a(l, "custom", 256))
        {
            i1 = 0;
        }
        if (!a(m, "softDescriptor", 22))
        {
            i1 = 0;
        }
        a(flag4, "currencyCode");
        a(flag5, "amount");
        a(flag6, "shortDescription");
        a(flag1, "paymentIntent");
        a(flag2, "details");
        a(flag3, "bnCode");
        a(flag, "items");
        return flag4 && flag5 && flag6 && flag2 && flag1 && flag3 && flag && i1 != 0;
_L2:
        apaypalitem = h;
        j1 = apaypalitem.length;
        i1 = 0;
_L4:
label0:
        {
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_329;
            }
            if (apaypalitem[i1].f())
            {
                break label0;
            }
            flag = false;
        }
          goto _L3
        i1++;
          goto _L4
        flag = true;
          goto _L3
    }

    protected final BigDecimal b()
    {
        return b;
    }

    protected final String c()
    {
        return d;
    }

    protected final String d()
    {
        return g;
    }

    public final int describeContents()
    {
        return 0;
    }

    protected final String e()
    {
        return c;
    }

    protected final String f()
    {
        return e;
    }

    protected final PayPalPaymentDetails g()
    {
        return f;
    }

    protected final PayPalItem[] h()
    {
        return h;
    }

    protected final String i()
    {
        return k;
    }

    protected final String j()
    {
        return l;
    }

    protected final String k()
    {
        return m;
    }

    public final boolean l()
    {
        return i;
    }

    public final ShippingAddress m()
    {
        return j;
    }

    public final String toString()
    {
        String s1 = d;
        String s;
        if (b != null)
        {
            s = b.toString();
        } else
        {
            s = null;
        }
        return String.format("PayPalPayment: {%s: $%s %s, %s}", new Object[] {
            s1, s, c, g
        });
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        i1 = 0;
        parcel.writeString(c);
        parcel.writeString(b.toString());
        parcel.writeString(d);
        parcel.writeString(g);
        parcel.writeString(e);
        parcel.writeParcelable(f, 0);
        if (h != null)
        {
            parcel.writeInt(h.length);
            parcel.writeTypedArray(h, 0);
        } else
        {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(j, 0);
        if (i)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeString(m);
    }

}
