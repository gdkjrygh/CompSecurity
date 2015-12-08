// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.util;

import com.amazon.android.Kiwi;
import com.amazon.device.iap.internal.b.d;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.internal.util:
//            c, d, e, MetricsHelper

public class a
{

    private static final String a = com/amazon/device/iap/internal/util/a.getSimpleName();

    public a()
    {
    }

    private static Receipt a(JSONObject jsonobject)
        throws JSONException
    {
        Object obj1 = null;
        String s = jsonobject.optString("token");
        String s1 = jsonobject.getString("sku");
        ProductType producttype = ProductType.valueOf(jsonobject.getString("itemType").toUpperCase());
        Object obj = jsonobject.optString("startDate");
        if (a(((String) (obj))))
        {
            obj = null;
        } else
        {
            obj = b(((String) (obj)));
        }
        jsonobject = jsonobject.optString("endDate");
        if (a(((String) (jsonobject))))
        {
            jsonobject = obj1;
        } else
        {
            jsonobject = b(jsonobject);
        }
        return (new ReceiptBuilder()).setReceiptId(s).setSku(s1).setProductType(producttype).setPurchaseDate(((Date) (obj))).setCancelDate(jsonobject).build();
    }

    public static Receipt a(JSONObject jsonobject, String s, String s1)
        throws com.amazon.device.iap.internal.b.a, d, IllegalArgumentException
    {
        c c1 = b(jsonobject);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.amazon.device.iap.internal.util.c.a().length];
                try
                {
                    a[c.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[c.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[c.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[c1.ordinal()])
        {
        default:
            return d(jsonobject, s, s1);

        case 1: // '\001'
            return c(jsonobject, s, s1);

        case 2: // '\002'
            return b(jsonobject, s, s1);
        }
    }

    protected static boolean a(String s)
    {
        return s == null || s.trim().length() == 0;
    }

    private static c b(JSONObject jsonobject)
    {
        String s = jsonobject.optString("DeviceId");
        if (!com.amazon.device.iap.internal.util.d.a(jsonobject.optString("receiptId")))
        {
            return c.c;
        }
        if (com.amazon.device.iap.internal.util.d.a(s))
        {
            return c.a;
        } else
        {
            return c.b;
        }
    }

    private static Receipt b(JSONObject jsonobject, String s, String s1)
        throws com.amazon.device.iap.internal.b.a, d
    {
        String s2 = jsonobject.optString("signature");
        if (com.amazon.device.iap.internal.util.d.a(s2))
        {
            e.b(a, (new StringBuilder()).append("a signature was not found in the receipt for request ID ").append(s1).toString());
            MetricsHelper.submitReceiptVerificationFailureMetrics(s1, "NO Signature found", s2);
            throw new d(s1, null, s2);
        }
        Receipt receipt;
        boolean flag;
        try
        {
            receipt = a(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new com.amazon.device.iap.internal.b.a(s1, jsonobject.toString(), s);
        }
        jsonobject = (new StringBuilder()).append(s).append("-").append(receipt.getReceiptId()).toString();
        flag = Kiwi.isSignedByKiwi(jsonobject, s2);
        e.a(a, (new StringBuilder()).append("stringToVerify/legacy:\n").append(jsonobject).append("\nsignature:\n").append(s2).toString());
        if (!flag)
        {
            MetricsHelper.submitReceiptVerificationFailureMetrics(s1, jsonobject, s2);
            throw new d(s1, jsonobject, s2);
        } else
        {
            return receipt;
        }
    }

    protected static Date b(String s)
        throws JSONException
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        long l;
        try
        {
            s = simpledateformat.parse(s);
            l = s.getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException(s.getMessage());
        }
        if (0L == l)
        {
            s = null;
        }
        return s;
    }

    private static Receipt c(JSONObject jsonobject, String s, String s1)
        throws com.amazon.device.iap.internal.b.a, d
    {
        Date date = null;
        String s3 = jsonobject.optString("DeviceId");
        String s2 = jsonobject.optString("signature");
        if (com.amazon.device.iap.internal.util.d.a(s2))
        {
            e.b(a, (new StringBuilder()).append("a signature was not found in the receipt for request ID ").append(s1).toString());
            MetricsHelper.submitReceiptVerificationFailureMetrics(s1, "NO Signature found", s2);
            throw new d(s1, null, s2);
        }
        Receipt receipt;
        ProductType producttype;
        String s4;
        String s5;
        try
        {
            receipt = a(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new com.amazon.device.iap.internal.b.a(s1, jsonobject.toString(), s);
        }
        producttype = receipt.getProductType();
        s4 = receipt.getSku();
        s5 = receipt.getReceiptId();
        if (ProductType.SUBSCRIPTION == receipt.getProductType())
        {
            jsonobject = receipt.getPurchaseDate();
        } else
        {
            jsonobject = null;
        }
        if (ProductType.SUBSCRIPTION == receipt.getProductType())
        {
            date = receipt.getCancelDate();
        }
        jsonobject = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", new Object[] {
            "2.0.61.0", s, s3, producttype, s4, s5, s1, jsonobject, date
        });
        e.a(a, (new StringBuilder()).append("stringToVerify/v1:\n").append(jsonobject).append("\nsignature:\n").append(s2).toString());
        if (!Kiwi.isSignedByKiwi(jsonobject, s2))
        {
            MetricsHelper.submitReceiptVerificationFailureMetrics(s1, jsonobject, s2);
            throw new d(s1, jsonobject, s2);
        } else
        {
            return receipt;
        }
    }

    private static Receipt d(JSONObject jsonobject, String s, String s1)
        throws com.amazon.device.iap.internal.b.a, d
    {
        Date date;
        String s2;
        String s3;
        date = null;
        s3 = jsonobject.optString("DeviceId");
        s2 = jsonobject.optString("signature");
        if (com.amazon.device.iap.internal.util.d.a(s2))
        {
            e.b(a, (new StringBuilder()).append("a signature was not found in the receipt for request ID ").append(s1).toString());
            MetricsHelper.submitReceiptVerificationFailureMetrics(s1, "NO Signature found", s2);
            throw new d(s1, null, s2);
        }
        Object obj;
        String s4;
        String s5;
        ProductType producttype;
        s4 = jsonobject.getString("receiptId");
        s5 = jsonobject.getString("sku");
        producttype = ProductType.valueOf(jsonobject.getString("itemType").toUpperCase());
        obj = jsonobject.optString("purchaseDate");
        String s6;
        if (a(((String) (obj))))
        {
            obj = null;
        } else
        {
            try
            {
                obj = b(((String) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new com.amazon.device.iap.internal.b.a(s1, jsonobject.toString(), s);
            }
        }
        s6 = jsonobject.optString("cancelDate");
        if (!a(s6))
        {
            break MISSING_BLOCK_LABEL_296;
        }
_L1:
        obj = (new ReceiptBuilder()).setReceiptId(s4).setSku(s5).setProductType(producttype).setPurchaseDate(((Date) (obj))).setCancelDate(date).build();
        jsonobject = String.format("%s|%s|%s|%s|%s|%tQ|%tQ", new Object[] {
            s, s3, ((Receipt) (obj)).getProductType(), ((Receipt) (obj)).getSku(), ((Receipt) (obj)).getReceiptId(), ((Receipt) (obj)).getPurchaseDate(), ((Receipt) (obj)).getCancelDate()
        });
        e.a(a, (new StringBuilder()).append("stringToVerify/v2:\n").append(jsonobject).append("\nsignature:\n").append(s2).toString());
        if (!Kiwi.isSignedByKiwi(jsonobject, s2))
        {
            MetricsHelper.submitReceiptVerificationFailureMetrics(s1, jsonobject, s2);
            throw new d(s1, jsonobject, s2);
        } else
        {
            return ((Receipt) (obj));
        }
        date = b(s6);
          goto _L1
    }

}
