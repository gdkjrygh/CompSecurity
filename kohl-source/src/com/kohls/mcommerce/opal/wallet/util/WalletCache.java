// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.content.Context;
import com.kohls.mcommerce.opal.wallet.rest.containers.WalletResponse;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.util:
//            AbstractCache

public class WalletCache extends AbstractCache
{

    public WalletCache()
    {
    }

    public static void clear(Context context, String s)
    {
        AbstractCache.clear(context, s);
    }

    public static void commit(Context context, String s, Object obj)
    {
        AbstractCache.commit(context, s, obj);
    }

    public static WalletResponse get(Context context, String s)
    {
        return (WalletResponse)get(context, s, com/kohls/mcommerce/opal/wallet/rest/containers/WalletResponse);
    }
}
