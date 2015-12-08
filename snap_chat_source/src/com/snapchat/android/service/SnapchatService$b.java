// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.service;

import CU;
import LB;
import android.os.Handler;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;
import lO;

// Referenced classes of package com.snapchat.android.service:
//            SnapchatService

final class a
    implements Runnable
{

    private final CU a;
    private SnapchatService b;

    public final void run()
    {
        lO lo;
        try
        {
            a.process(SnapchatService.a(b));
            SnapchatService.a().post(new <init>(b, a));
            return;
        }
        catch (Exception exception)
        {
            lo = new lO(a.toString(), exception);
        }
        Timber.e("SnapchatService", (new StringBuilder("ProcessRunnable halted ")).append(lo).toString(), new Object[0]);
        if (ReleaseManager.f())
        {
            SnapchatService.a().post(new Runnable(lo) {

                private RuntimeException a;

                public final void run()
                {
                    throw a;
                }

            
            {
                a = runtimeexception;
                super();
            }
            });
        }
        SnapchatService.b(b).a(lo);
    }

    public _cls1.a(SnapchatService snapchatservice, CU cu)
    {
        b = snapchatservice;
        super();
        a = cu;
    }
}
