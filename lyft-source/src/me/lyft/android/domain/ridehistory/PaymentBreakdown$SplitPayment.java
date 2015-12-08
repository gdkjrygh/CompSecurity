// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ridehistory;

import java.util.List;

public class contributorPhotoUrls
{

    private List contributorPhotoUrls;
    private subtotalReceiptItem splitPayment;
    private subtotalReceiptItem subtotalReceiptItem;

    public List getContributorPhotoUrls()
    {
        return contributorPhotoUrls;
    }

    public contributorPhotoUrls getSplitPaymentReceiptItem()
    {
        return splitPayment;
    }

    public splitPayment getSubtotalReceiptItem()
    {
        return subtotalReceiptItem;
    }

    public ( ,  1, List list)
    {
        splitPayment = ;
        subtotalReceiptItem = 1;
        contributorPhotoUrls = list;
    }
}
