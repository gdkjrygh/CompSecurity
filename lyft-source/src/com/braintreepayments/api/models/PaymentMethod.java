// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcelable;
import com.braintreepayments.api.Utils;
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
//            Card, PayPalAccount, PaymentMethodOptions

public abstract class PaymentMethod
    implements Parcelable, Serializable
{

    private static final String PAYMENT_METHOD_COLLECTION_KEY = "paymentMethods";
    private static final String PAYMENT_METHOD_TYPE_KEY = "type";
    protected String description;
    protected transient String mSource;
    protected String nonce;
    protected PaymentMethodOptions options;

    public PaymentMethod()
    {
    }

    public static List parsePaymentMethods(String s)
    {
        ArrayList arraylist;
        int i;
        JSONObject jsonobject;
        String s1;
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
            break MISSING_BLOCK_LABEL_129;
        }
        jsonobject = s.getJSONObject(i);
        s1 = jsonobject.getString("type");
        if (s1.equals("CreditCard"))
        {
            arraylist.add(Utils.getGson().a(jsonobject.toString(), com/braintreepayments/api/models/Card));
            break MISSING_BLOCK_LABEL_131;
        }
        if (s1.equals("PayPalAccount"))
        {
            arraylist.add(Utils.getGson().a(jsonobject.toString(), com/braintreepayments/api/models/PayPalAccount));
        }
        break MISSING_BLOCK_LABEL_131;
        return arraylist;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String getDescription()
    {
        return description;
    }

    public String getNonce()
    {
        return nonce;
    }

    public String getSource()
    {
        return mSource;
    }

    public abstract String getTypeLabel();

    protected void setOptions(PaymentMethodOptions paymentmethodoptions)
    {
        options = paymentmethodoptions;
    }

    public void setSource(String s)
    {
        mSource = s;
    }
}
