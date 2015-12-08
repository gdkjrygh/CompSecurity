// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            CheckoutUpdated, PurchaseStatus

final class 
    implements f
{

    public final PurchaseStatus call(CheckoutUpdated checkoutupdated)
    {
        byte byte0;
        checkoutupdated = checkoutupdated.state;
        byte0 = -1;
        checkoutupdated.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   -1281977283: 104
    //                   -733631846: 90
    //                   -682587753: 76;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_104;
_L5:
        switch (byte0)
        {
        default:
            return PurchaseStatus.NONE;

        case 0: // '\0'
            return PurchaseStatus.PENDING;

        case 1: // '\001'
            return PurchaseStatus.SUCCESS;

        case 2: // '\002'
            return PurchaseStatus.VERIFY_FAIL;
        }
_L4:
        if (checkoutupdated.equals("pending"))
        {
            byte0 = 0;
        }
          goto _L5
_L3:
        if (checkoutupdated.equals("successful"))
        {
            byte0 = 1;
        }
          goto _L5
        if (checkoutupdated.equals("failed"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public final volatile Object call(Object obj)
    {
        return call((CheckoutUpdated)obj);
    }

    ()
    {
    }
}
