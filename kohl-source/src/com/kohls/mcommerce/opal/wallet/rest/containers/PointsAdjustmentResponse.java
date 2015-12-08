// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import android.graphics.Bitmap;
import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.rest.containers:
//            WalletBaseResponse

public class PointsAdjustmentResponse extends WalletBaseResponse
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String destinationLoyaltyId;
    private String destinationPointBalance;
    private Bitmap imgBitmap;
    private String message;
    private String sourceLoyaltyId;
    private String sourcePointBalance;

    public PointsAdjustmentResponse()
    {
    }

    public String getDestinationLoyaltyId()
    {
        return destinationLoyaltyId;
    }

    public String getDestinationPointBalance()
    {
        return destinationPointBalance;
    }

    public Bitmap getImgBitmap()
    {
        return imgBitmap;
    }

    public String getMessage()
    {
        return message;
    }

    public String getSourceLoyaltyId()
    {
        return sourceLoyaltyId;
    }

    public String getSourcePointBalance()
    {
        return sourcePointBalance;
    }

    public void setDestinationLoyaltyId(String s)
    {
        destinationLoyaltyId = s;
    }

    public void setDestinationPointBalance(String s)
    {
        destinationPointBalance = s;
    }

    public void setImgBitmap(Bitmap bitmap)
    {
        imgBitmap = bitmap;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setSourceLoyaltyId(String s)
    {
        sourceLoyaltyId = s;
    }

    public void setSourcePointBalance(String s)
    {
        sourcePointBalance = s;
    }
}
