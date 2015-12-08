// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class ang.Object
    implements Runnable
{

    private com.sony.snei.np.android.account.oauth.untManager.SsoEventType a;
    private Bundle b;
    private dba c;

    public final void run()
    {
        c.a.a(a, b);
    }

    (dba dba1, com.sony.snei.np.android.account.oauth.untManager.SsoEventType ssoeventtype, Bundle bundle)
    {
        c = dba1;
        a = ssoeventtype;
        b = bundle;
        super();
    }
}
