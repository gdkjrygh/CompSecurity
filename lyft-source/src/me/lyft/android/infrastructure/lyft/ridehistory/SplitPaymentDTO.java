// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ridehistory;

import java.util.List;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ridehistory:
//            ReceiptItemDTO

public class SplitPaymentDTO
{

    public final List contributorPhotoUrls;
    public final int contributorsCount;
    public final ReceiptItemDTO subtotal;
    public final String title;

    public SplitPaymentDTO(String s, int i, List list, ReceiptItemDTO receiptitemdto)
    {
        title = s;
        contributorsCount = i;
        contributorPhotoUrls = list;
        subtotal = receiptitemdto;
    }
}
