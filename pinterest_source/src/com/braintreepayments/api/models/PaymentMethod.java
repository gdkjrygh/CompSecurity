// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcelable;
import com.braintreepayments.api.exceptions.ServerException;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, PayPalAccount, CoinbaseAccount, AndroidPayCard, 
//            PaymentMethodOptions

public abstract class PaymentMethod
    implements Parcelable, Serializable
{

    protected String a;
    protected String b;
    protected PaymentMethodOptions c;
    protected transient String d;

    public PaymentMethod()
    {
    }

    public static List g(String s)
    {
        ArrayList arraylist;
        JSONObject jsonobject;
        String s1;
        int i;
        try
        {
            s = (new JSONObject(s)).getJSONArray("paymentMethods");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ServerException("Parsing server response failed");
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        return Collections.emptyList();
        arraylist = new ArrayList();
        i = 0;
_L2:
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        jsonobject = s.getJSONObject(i);
        s1 = jsonobject.getString("type");
        if (s1.equals("CreditCard"))
        {
            arraylist.add((new Gson()).fromJson(jsonobject.toString(), com/braintreepayments/api/models/Card));
            break MISSING_BLOCK_LABEL_209;
        }
        if (s1.equals("PayPalAccount"))
        {
            arraylist.add((new Gson()).fromJson(jsonobject.toString(), com/braintreepayments/api/models/PayPalAccount));
            break MISSING_BLOCK_LABEL_209;
        }
        if (s1.equals("CoinbaseAccount"))
        {
            arraylist.add((new Gson()).fromJson(jsonobject.toString(), com/braintreepayments/api/models/CoinbaseAccount));
            break MISSING_BLOCK_LABEL_209;
        }
        if (s1.equals("AndroidPayCard"))
        {
            arraylist.add((new Gson()).fromJson(jsonobject.toString(), com/braintreepayments/api/models/AndroidPayCard));
        }
        break MISSING_BLOCK_LABEL_209;
        return arraylist;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public abstract String a();

    protected final void a(PaymentMethodOptions paymentmethodoptions)
    {
        c = paymentmethodoptions;
    }

    public String b()
    {
        return b;
    }

    public final String c()
    {
        return a;
    }

    public final String d()
    {
        return d;
    }

    public final void f(String s)
    {
        d = s;
    }
}
