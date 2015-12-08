// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//            aq

public final class PayPalPaymentDetails
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aq();
    private static final String a = com/paypal/android/sdk/payments/PayPalPaymentDetails.getSimpleName();
    private BigDecimal b;
    private BigDecimal c;
    private BigDecimal d;

    private PayPalPaymentDetails(Parcel parcel)
    {
        Object obj;
        Object obj1 = null;
        super();
        try
        {
            obj = parcel.readString();
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException("error unparceling PayPalPaymentDetails");
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L5:
        c = ((BigDecimal) (obj));
        obj = parcel.readString();
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L6:
        b = ((BigDecimal) (obj));
        parcel = parcel.readString();
        if (parcel != null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        parcel = obj1;
_L7:
        d = parcel;
        return;
_L2:
        obj = new BigDecimal(((String) (obj)));
          goto _L5
_L4:
        obj = new BigDecimal(((String) (obj)));
          goto _L6
        parcel = new BigDecimal(parcel);
          goto _L7
    }

    PayPalPaymentDetails(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PayPalPaymentDetails(BigDecimal bigdecimal, BigDecimal bigdecimal1, BigDecimal bigdecimal2)
    {
        c = bigdecimal;
        b = bigdecimal1;
        d = bigdecimal2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean isProcessable()
    {
        return b != null;
    }

    public final JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (c != null)
            {
                jsonobject.put("shipping", c.toPlainString());
            }
            if (b != null)
            {
                jsonobject.put("subtotal", b.toPlainString());
            }
            if (d != null)
            {
                jsonobject.put("tax", d.toPlainString());
            }
        }
        catch (JSONException jsonexception)
        {
            Log.e(a, "error encoding JSON", jsonexception);
            return null;
        }
        return jsonobject;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        String s;
        if (c == null)
        {
            s = null;
        } else
        {
            s = c.toString();
        }
        parcel.writeString(s);
        if (b == null)
        {
            s = null;
        } else
        {
            s = b.toString();
        }
        parcel.writeString(s);
        if (d == null)
        {
            s = obj;
        } else
        {
            s = d.toString();
        }
        parcel.writeString(s);
    }

}
