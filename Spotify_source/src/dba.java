// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;

public final class dba
{

    final dal a;
    private final Handler b;

    public dba(dal dal1, Handler handler)
    {
        a = dal1;
        b = handler;
    }

    public final void a(com.sony.snei.np.android.account.oauth.NpAccountManager.SsoEventType ssoeventtype, Bundle bundle)
    {
        if (a == null)
        {
            return;
        }
        if (b != null)
        {
            b.post(new Runnable(ssoeventtype, bundle) {

                private com.sony.snei.np.android.account.oauth.NpAccountManager.SsoEventType a;
                private Bundle b;
                private dba c;

                public final void run()
                {
                    c.a.a(a, b);
                }

            
            {
                c = dba.this;
                a = ssoeventtype;
                b = bundle;
                super();
            }
            });
            return;
        } else
        {
            a.a(ssoeventtype, bundle);
            return;
        }
    }
}
