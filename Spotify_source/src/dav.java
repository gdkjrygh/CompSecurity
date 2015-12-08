// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.sony.snei.np.android.account.oauth.hide.DelegateStateId;

public final class dav
    implements daq
{

    public dav()
    {
    }

    public final DelegateStateId a()
    {
        return DelegateStateId.a;
    }

    public final void a(dar dar1, Bundle bundle)
    {
        if (bundle != null && bundle.getBoolean("qOm"))
        {
            Bundle bundle1 = new Bundle();
            bundle = bundle.getBundle("D7o");
            if (bundle != null)
            {
                bundle1.putAll(bundle);
            }
            dar1.a.a(com.sony.snei.np.android.account.oauth.NpAccountManager.SsoEventType.a, bundle1);
        }
    }
}
