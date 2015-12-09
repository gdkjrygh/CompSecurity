// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHcePaymentEvent

final class WalletHceServiceWorkerOperation
{

    private final Object data;
    private final int type;

    private WalletHceServiceWorkerOperation(int i, Object obj)
    {
        boolean flag;
        if (i == 1 || i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Unrecognized type: %s", new Object[] {
            Integer.valueOf(i)
        });
        type = i;
        data = obj;
    }

    static WalletHceServiceWorkerOperation newIncrementAtcOperation(Long long1)
    {
        return new WalletHceServiceWorkerOperation(1, long1);
    }

    static WalletHceServiceWorkerOperation newPaymentEventOperation(WalletHcePaymentEvent wallethcepaymentevent)
    {
        return new WalletHceServiceWorkerOperation(3, wallethcepaymentevent);
    }

    final WalletHcePaymentEvent getPaymentEvent()
    {
        boolean flag;
        if (type == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected type: %s", new Object[] {
            Integer.valueOf(type)
        });
        return (WalletHcePaymentEvent)data;
    }

    final Long getPpmsRowId()
    {
        boolean flag;
        if (type == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Unexpected type: %s", new Object[] {
            Integer.valueOf(type)
        });
        return (Long)data;
    }

    final int getType()
    {
        return type;
    }
}
