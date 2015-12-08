// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IBackground

public class PurchasableBackground
    implements IBackground
{

    private final PurchasableStickerBundle mBundle;

    public PurchasableBackground(PurchasableStickerBundle purchasablestickerbundle)
    {
        mBundle = purchasablestickerbundle;
    }

    public String getPath()
    {
        return mBundle.e();
    }

    public PurchasableStickerBundle getPurchaseInfo()
    {
        return mBundle;
    }

    public String getThumbnailPath()
    {
        return mBundle.e();
    }
}
