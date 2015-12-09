// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordAction

final class nderable
    implements Function
{

    private static PurchaseRecordAction apply(com.google.checkout.commonui.purchaserecord.proto.able able)
    {
        return new PurchaseRecordAction(able.text, able.linkUri);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.checkout.commonui.purchaserecord.proto.able)obj);
    }

    nderable()
    {
    }
}
