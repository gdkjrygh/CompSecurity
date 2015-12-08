// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import java.util.Arrays;

public class PaymentState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new PaymentState(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new PaymentState[i];
        }

    };
    private final String a[];

    private PaymentState(Parcel parcel)
    {
        a = parcel.createStringArray();
    }

    PaymentState(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PaymentState(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            a = s.split(";");
            f();
            return;
        } else
        {
            a = new String[0];
            return;
        }
    }

    private void f()
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = a[i].trim();
        }

    }

    public final boolean a()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (a.length == 2 && "creditcard_funds".equals(a[0]))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                if (a.length == 2 && "creditcard_refused".equals(a[0]))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    if (a.length == 2 && "paypal_refused".equals(a[0]))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public final int b()
    {
        String s;
        if (!a() || a.length < 2)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        s = a[1];
        int i = Integer.parseInt(s);
        return i;
        NumberFormatException numberformatexception;
        numberformatexception;
        Assertion.a((new StringBuilder("Failed to parse retry number of '")).append(toString()).append("'").toString(), numberformatexception);
        return -1;
    }

    public final boolean c()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a.length == 3)
        {
            flag = flag1;
            if ("opt-in-trial".equals(a[0]))
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int d()
    {
        if (!c())
        {
            return -1;
        }
        int i;
        try
        {
            i = Math.round((float)Integer.parseInt(a[1]) / 3600F);
        }
        catch (NumberFormatException numberformatexception)
        {
            Assertion.a("Caught a NumberFormatException when parsing trial length", numberformatexception);
            return -1;
        }
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public final long e()
    {
        if (!c())
        {
            return -1L;
        }
        long l;
        try
        {
            l = Long.parseLong(a[2]);
        }
        catch (NumberFormatException numberformatexception)
        {
            Assertion.a("Caught a NumberFormatException when parsing trial expiry", numberformatexception);
            return -1L;
        }
        return l;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PaymentState))
        {
            return false;
        } else
        {
            obj = (PaymentState)obj;
            return Arrays.equals(a, ((PaymentState) (obj)).a);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(a);
    }

    public String toString()
    {
        return TextUtils.join(";", a);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringArray(a);
    }

}
