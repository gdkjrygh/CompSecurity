// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class ghz
    implements Runnable
{

    private ghs a;

    ghz(ghs ghs1)
    {
        a = ghs1;
        super();
    }

    public final void run()
    {
        ghs.f(a).b("onboarding_prepare_accounts");
        Intent intent = new Intent();
        intent.putExtra("timed_out", true);
        a.O_().setResult(-1, intent);
        a.O_().finish();
    }
}
