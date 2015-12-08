// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.util.d;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.model:
//            ProductType

public final class Receipt
{

    private static final String CANCEL_DATE = "endDate";
    private static final Date DATE_CANCELED = new Date(1L);
    private static final String PRODUCT_TYPE = "itemType";
    private static final String PURCHASE_DATE = "purchaseDate";
    private static final String RECEIPT_ID = "receiptId";
    private static final String SKU = "sku";
    private final Date cancelDate;
    private final ProductType productType;
    private final Date purchaseDate;
    private final String receiptId;
    private final String sku;

    public Receipt(ReceiptBuilder receiptbuilder)
    {
        d.a(receiptbuilder.getSku(), "sku");
        d.a(receiptbuilder.getProductType(), "productType");
        if (ProductType.SUBSCRIPTION == receiptbuilder.getProductType())
        {
            d.a(receiptbuilder.getPurchaseDate(), "purchaseDate");
        }
        receiptId = receiptbuilder.getReceiptId();
        sku = receiptbuilder.getSku();
        productType = receiptbuilder.getProductType();
        purchaseDate = receiptbuilder.getPurchaseDate();
        cancelDate = receiptbuilder.getCancelDate();
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Receipt)obj;
        if (cancelDate == null)
        {
            if (((Receipt) (obj)).cancelDate != null)
            {
                return false;
            }
        } else
        if (!cancelDate.equals(((Receipt) (obj)).cancelDate))
        {
            return false;
        }
        if (productType != ((Receipt) (obj)).productType)
        {
            return false;
        }
        if (purchaseDate == null)
        {
            if (((Receipt) (obj)).purchaseDate != null)
            {
                return false;
            }
        } else
        if (!purchaseDate.equals(((Receipt) (obj)).purchaseDate))
        {
            return false;
        }
        if (receiptId == null)
        {
            if (((Receipt) (obj)).receiptId != null)
            {
                return false;
            }
        } else
        if (!receiptId.equals(((Receipt) (obj)).receiptId))
        {
            return false;
        }
        if (sku != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Receipt) (obj)).sku == null) goto _L1; else goto _L3
_L3:
        return false;
        if (sku.equals(((Receipt) (obj)).sku)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Date getCancelDate()
    {
        return cancelDate;
    }

    public ProductType getProductType()
    {
        return productType;
    }

    public Date getPurchaseDate()
    {
        return purchaseDate;
    }

    public String getReceiptId()
    {
        return receiptId;
    }

    public String getSku()
    {
        return sku;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (cancelDate == null)
        {
            i = 0;
        } else
        {
            i = cancelDate.hashCode();
        }
        if (productType == null)
        {
            j = 0;
        } else
        {
            j = productType.hashCode();
        }
        if (purchaseDate == null)
        {
            k = 0;
        } else
        {
            k = purchaseDate.hashCode();
        }
        if (receiptId == null)
        {
            l = 0;
        } else
        {
            l = receiptId.hashCode();
        }
        if (sku != null)
        {
            i1 = sku.hashCode();
        }
        return (l + (k + (j + (i + 31) * 31) * 31) * 31) * 31 + i1;
    }

    public boolean isCanceled()
    {
        return cancelDate != null;
    }

    public JSONObject toJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("receiptId", receiptId);
            jsonobject.put("sku", sku);
            jsonobject.put("itemType", productType);
            jsonobject.put("purchaseDate", purchaseDate);
            jsonobject.put("endDate", cancelDate);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public String toString()
    {
        String s;
        try
        {
            s = toJSON().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

}
