// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.sony.snei.np.android.account.oauth.hide.DelegateStateId;

public final class dat
    implements daq
{

    public dat()
    {
    }

    public final DelegateStateId a()
    {
        return DelegateStateId.c;
    }

    public final void a(dar dar1, Bundle bundle)
    {
        Bundle bundle1 = new Bundle();
        if (bundle != null)
        {
            bundle = bundle.getBundle("D7o");
            if (bundle != null)
            {
                bundle1.putAll(bundle);
            }
        }
        dar1.a.a(com.sony.snei.np.android.account.oauth.NpAccountManager.SsoEventType.b, bundle1);
    }
}
