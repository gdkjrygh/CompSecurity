// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.iap.model:
//            Product, RequestId

public class ProductDataResponse
{
    public static final class RequestStatus extends Enum
    {

        private static final RequestStatus $VALUES[];
        public static final RequestStatus FAILED;
        public static final RequestStatus NOT_SUPPORTED;
        public static final RequestStatus SUCCESSFUL;

        public static RequestStatus valueOf(String s)
        {
            return (RequestStatus)Enum.valueOf(com/amazon/device/iap/model/ProductDataResponse$RequestStatus, s);
        }

        public static RequestStatus[] values()
        {
            return (RequestStatus[])$VALUES.clone();
        }

        static 
        {
            SUCCESSFUL = new RequestStatus("SUCCESSFUL", 0);
            FAILED = new RequestStatus("FAILED", 1);
            NOT_SUPPORTED = new RequestStatus("NOT_SUPPORTED", 2);
            $VALUES = (new RequestStatus[] {
                SUCCESSFUL, FAILED, NOT_SUPPORTED
            });
        }

        private RequestStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String PRODUCT_DATA = "productData";
    private static final String REQUEST_ID = "requestId";
    private static final String REQUEST_STATUS = "requestStatus";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)";
    private static final String UNAVAILABLE_SKUS = "UNAVAILABLE_SKUS";
    private final Map productData;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final Set unavailableSkus;

    public ProductDataResponse(ProductDataResponseBuilder productdataresponsebuilder)
    {
        d.a(productdataresponsebuilder.getRequestId(), "requestId");
        d.a(productdataresponsebuilder.getRequestStatus(), "requestStatus");
        if (productdataresponsebuilder.getUnavailableSkus() == null)
        {
            productdataresponsebuilder.setUnavailableSkus(new HashSet());
        }
        if (RequestStatus.SUCCESSFUL == productdataresponsebuilder.getRequestStatus())
        {
            d.a(productdataresponsebuilder.getProductData(), "productData");
        }
        requestId = productdataresponsebuilder.getRequestId();
        requestStatus = productdataresponsebuilder.getRequestStatus();
        unavailableSkus = productdataresponsebuilder.getUnavailableSkus();
        productData = productdataresponsebuilder.getProductData();
    }

    public Map getProductData()
    {
        return productData;
    }

    public RequestId getRequestId()
    {
        return requestId;
    }

    public RequestStatus getRequestStatus()
    {
        return requestStatus;
    }

    public Set getUnavailableSkus()
    {
        return unavailableSkus;
    }

    public JSONObject toJSON()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("requestId", requestId);
        jsonobject.put("UNAVAILABLE_SKUS", unavailableSkus);
        jsonobject.put("requestStatus", requestStatus);
        JSONObject jsonobject1 = new JSONObject();
        if (productData != null)
        {
            String s;
            for (Iterator iterator = productData.keySet().iterator(); iterator.hasNext(); jsonobject1.put(s, ((Product)productData.get(s)).toJSON()))
            {
                s = (String)iterator.next();
            }

        }
        jsonobject.put("productData", jsonobject1);
        return jsonobject;
    }

    public String toString()
    {
        String s3 = super.toString();
        RequestId requestid = requestId;
        String s;
        String s1;
        String s2;
        if (unavailableSkus != null)
        {
            s = unavailableSkus.toString();
        } else
        {
            s = "null";
        }
        if (requestStatus != null)
        {
            s1 = requestStatus.toString();
        } else
        {
            s1 = "null";
        }
        if (productData != null)
        {
            s2 = productData.toString();
        } else
        {
            s2 = "null";
        }
        return String.format("(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)", new Object[] {
            s3, requestid, s, s1, s2
        });
    }
}
