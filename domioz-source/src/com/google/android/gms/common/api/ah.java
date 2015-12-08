// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            aq, aa

final class ah extends aq
{

    final aa a;

    ah(aa aa1)
    {
        a = aa1;
        super(aa1, (byte)0);
    }

    public final void onConnected(Bundle bundle)
    {
        aa.a(a).lock();
        boolean flag = a.g();
        if (!flag)
        {
            aa.a(a).unlock();
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        aa.b(a).putAll(bundle);
        aa.c(a);
        aa.a(a).unlock();
        return;
        bundle;
        aa.a(a).unlock();
        throw bundle;
    }
}
