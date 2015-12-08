// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            OrderDetails

public class TransactionDetail
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String date;
    private String eventType;
    private String id;
    private OrderDetails orderDetails;
    private String pointsEarned;
    private String storeNumber;
    private String title;
    private String transactionTitle;

    public TransactionDetail()
    {
    }

    public String getDate()
    {
        return date;
    }

    public String getEventType()
    {
        if (eventType == null)
        {
            return "";
        } else
        {
            return eventType;
        }
    }

    public String getId()
    {
        return id;
    }

    public OrderDetails getOrderDetails()
    {
        return orderDetails;
    }

    public String getPointsEarned()
    {
        return pointsEarned;
    }

    public String getStoreName()
    {
        return storeNumber;
    }

    public String getTitle()
    {
        if (!getEventType().equals("Purchase")) goto _L2; else goto _L1
_L1:
        setTitle("Purchase");
_L4:
        return title;
_L2:
        if (getEventType().equals("Expire"))
        {
            setTitle("Expired Points");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getTransactionTitle()
    {
        if (!getEventType().equals("Purchase")) goto _L2; else goto _L1
_L1:
        setTransactionTitle("Purchase");
_L4:
        return transactionTitle;
_L2:
        if (getEventType().equals("Return"))
        {
            setTransactionTitle("Return");
        } else
        if (getEventType().equals("Expire"))
        {
            setTransactionTitle("Expired Points Details");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setDate(String s)
    {
        date = s;
    }

    public void setEventType(String s)
    {
        eventType = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setOrderDetails(OrderDetails orderdetails)
    {
        orderDetails = orderdetails;
    }

    public void setPointsEarned(String s)
    {
        pointsEarned = s;
    }

    public void setStoreName(String s)
    {
        storeNumber = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setTransactionTitle(String s)
    {
        transactionTitle = s;
    }
}
